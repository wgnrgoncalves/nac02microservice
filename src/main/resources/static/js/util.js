
var states = [
  {"UF":  'AC', "Nome": 'Acre' },
  {"UF":  'AL', "Nome": 'Alagoas' },
  {"UF":  'AP', "Nome": 'Amapá' },
  {"UF":  'AM', "Nome": 'Amazonas' },
  {"UF":  'BA', "Nome": 'Bahia' },
  {"UF":  'CE', "Nome": 'Ceará' },
  {"UF":  'DF', "Nome": 'Distrito Federal' },
  {"UF":  'ES', "Nome": 'Espírito Santo' },
  {"UF":  'GO', "Nome": 'Goías' },
  {"UF":  'MA', "Nome": 'Maranhão' },
  {"UF":  'MT', "Nome": 'Mato Grosso' },
  {"UF":  'MS', "Nome": 'Mato Grosso do Sul' },
  {"UF":  'MG', "Nome": 'Minas Gerais' },
  {"UF":  'PA', "Nome": 'Pará' },
  {"UF":  'PB', "Nome": 'Paraíba' },
  {"UF":  'PR', "Nome": 'Paraná' },
  {"UF":  'PE', "Nome": 'Pernambuco' },
  {"UF":  'PI', "Nome": 'Piauí' },
  {"UF":  'RJ', "Nome": 'Rio de Janeiro' },
  {"UF":  'RN', "Nome": 'Rio Grande do Norte' },
  {"UF":  'RS', "Nome": 'Rio Grande do Sul' },
  {"UF":  'RO', "Nome": 'Rondônia' },
  {"UF":  'RR', "Nome": 'Roraíma' },
  {"UF":  'SC', "Nome": 'Santa Catarina' },
  {"UF":  'SP', "Nome": 'São Paulo' },
  {"UF":  'SE', "Nome": 'Sergipe' },
  {"UF":  'TO', "Nome": 'Tocantins' },
]; 
$(document).ready(function(){
	states.forEach(function(item){
		
		$('#estado').append(`<option value="${item.UF}">
                                       ${item.Nome}
                                  </option>`);
	});
	$('#cpf').mask('000.000.000-00', {reverse: true});
	$('#cep').mask('00000-000');
	$('.money2').mask("###0.00", {reverse: true});
	$('#telefone').mask('(00)0000-0000');
	$('#celular').mask('(00)90000-0000');
	$('.input-group.date').datepicker({
        language: "pt-BR",
        autoclose: true
    });
	
});