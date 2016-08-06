$ (function(){
	
	var uploadDrop = $('#upload-drop');
	var containerFoto = $('.js-container-foto');
	
	var settings = {
		type: 'json',
		filelimit: 1,
		allow: '*.(jpg|jpeg|png)',
		action: '/fotos/' + uploadDrop.data('codigo'),
		complete: function(foto){
			uploadDrop.addClass('hidden');
			containerFoto.prepend('<img src="' + foto.url + '"class="img-responsive" style="margin: auto;"/>');
		}
	};
	
	UIkit.uploadSelect($('#upload-select'), settings);
	UIkit.uploadDrop(uploadDrop, settings);
	
}); 