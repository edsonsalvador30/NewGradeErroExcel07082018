window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.MostraValorBarra = window.blockly.js.blockly.MostraValorBarra
		|| {};

/**
 * MostraValorBarra
 */
window.blockly.js.blockly.MostraValorBarra.Executar = function() {

	var item;
	item = this.cronapi.screen.getValueOfField("vars.model2611");
	window.alert(item);
}
