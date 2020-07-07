var app = new Vue({
			el : '#app',
			data() {
				return {
					pessoas: [],
					pessoa: {
						nome : undefined,
						sexo : undefined,
						dataNascimento: undefined,
						endereco: {
							logradouro: undefined,
							numero: undefined,
							cep: undefined,
							municipio: undefined,
							uf: undefined
						}
					}
				}
			},
			methods : {
				cadastrar() {
					this.executePost('pessoa/salvar', this.pessoa);
				},
				selecionarPessoa(p) {
					this.pessoa = p;
				},
				alterar() {
					this.executePost('pessoa/salvar', this.pessoa);
				},
				excluir() {
					this.executePost('pessoa/excluir', this.pessoa);
				},
				limpar() {
					this.pessoa = {
						nome : undefined,
						sexo : undefined,
						dataNascimento: undefined,
						endereco: {
							logradouro: undefined,
							numero: undefined,
							cep: undefined,
							municipio: undefined,
							uf: undefined
						}
					};
				},
				executePost(url, json) {
					axios.post(url, json).then(res => alert('Operação realizada com sucesso!')).catch(err => console.error(err));
				},
				carregaPessoas(pessoas) {
					this.pessoas = pessoas;
				}
			},
			mounted () {
    			axios.get('pessoa/consultar').then(res => this.pessoas = res.data);
  			}
		})