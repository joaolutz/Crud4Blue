function init() {
	let vm = this;
					//carrega as pessoas assim que a tela é carregada completamente
					let xhr = new XMLHttpRequest();
					xhr.open("GET", 'pessoa/consultar');
					xhr.onload = function() {
						if (xhr.status != 200) {
							alert(`Error ${xhr.status}: ${xhr.statusText}`);
						} else {
							vm.pessoas = JSON.parse(xhr.response);
						}
					};
					xhr.onerror = function() {
						alert("Request failed");
					};
					xhr.send();
}

var app = new Vue({
			el : '#app',
			data() {
				return {
					pessoas: [],
					pessoaAlt: undefined,
					nome : undefined,
					sexo : undefined,
					dataNascimento: undefined,
					endereco : undefined,
					numero: undefined,
					cep : undefined,
					municipio : undefined,
					uf : undefined
				}
			},
			methods : {
				cadastrar() {
					let req = {
						nome: this.nome,
						sexo: this.sexo,
						dataNascimento: this.dataNascimento,
						endereco: {
							logradouro: this.endereco,
							numero: this.numero,
							cep: this.cep,
							municipio: this.municipio,
							uf: this.uf
						}
					};
					this.executePost('pessoa/salvar', JSON.stringify(req));
				},
				selecionarPessoa(p) {
					this.pessoaAlt = p;
				},
				alterar(pessoa) {
					let req = {
							id: pessoa.id,
							nome: this.nome,
							sexo: this.sexo,
							dataNascimento: this.dataNascimento,
							endereco: {
								id: pessoa.endereco.id,
								logradouro: this.endereco,
								numero: this.numero,
								cep: this.cep,
								municipio: this.municipio,
								uf: this.uf
							}
						};
					this.executePost('pessoa/salvar', JSON.stringify(req));
				},
				excluir(pessoa) {
					this.executePost('pessoa/excluir', JSON.stringify(pessoa));
				},
				limpar() {
					this.nome = undefined;
					this.sexo = undefined;
					this.dataNascimento = undefined;
					this.endereco = undefined;
					this.numero = undefined;
					this.cep = undefined;
					this.municipio = undefined;
					this.uf = undefined;
					this.pessoaAlt = undefined;
				},
				executePost(url, json) {
					let xhr = new XMLHttpRequest();
					xhr.open("POST", url);
					xhr.setRequestHeader('Content-type', 'application/json; charset=utf-8');
					xhr.send(json);
					xhr.onload = function() {
						if (xhr.status != 200) {
							alert(`Error ${xhr.status}: ${xhr.statusText}`);
						} else {
							alert('Operação realizada com sucesso!');
						}
					};
					xhr.onerror = function() {
						alert("Request failed");
					};
				},
				init
			},
			mounted() {
				init.call(this);
			}
		})