<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="utf-8"%>
<!doctype html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Publier une enchère</title>
</head>
<body>
	<h1>Publier une enchère</h1>
	<form method="post" action="post">
		<label for="designation">Désignation :</label>
     <input type="text"	name="designation" id="designation" />
			 <label for="description">Description:</label> 
			 <input type="text" name="description" id="description" /> 
			 <label for="dimensions">Dimensions :</label> 
			 <input type="text" name="dimensions" id="dimensions" />
			  <label for="base_price">Prix de base :</label> 
			<input type="number" name="base_price" id="base_price" />
		<label for="currency">Devise</label>
		<br /> <select name="currency"
			id="currency">
			<option value="pound" label="pound">£</option>
			<option value="dollar" label="dollar">$</option>
			<option value="euros" label="euros">€</option>
		</select> <input title="Format de la date: 11/02/2016" type="date"
			name="start_date" id="start_date" /> 
			<label for="start_date">Date d'ouverture de l'enchère :</label> 
			<input title="Format de la date: 11/02/2016" type="date" name="end_date"
			id="end_date" />
			 <label for="end_date">Date de fermeture de l'enchère :</label> 
			<input type="text" title ="Choisissez une catégorie pour
			votre enchère" name="category_name" id="category_name" />
			 <label for="category_name">Catégorie :</label>
			 <select>
			<option value="Meubles" label="Meubles">Meubles</option>
			<option value="Musique" label="Musique">Instruments de musique</option>
			<option value="Oeuvres d'art" label="Oeuvres d'art">Oeuvres d'art</option>
			<option value="Costumes" label="Costumes">Costumes</option>
			<option value="Armoirie" label="Armoirie">Armures</option>
			<option value="Décoration" label="Décoration">Décoration</option>
			<option value="Instrument de musique" label="Instrument de musique">Instrument de musique</option>
			<option value="Ouvrages" label="Ouvrages">Ouvrages</option>
		</select>
		 <label for="tag_name">Mots-clefs :</label>
			 	<input type="text" title ="Séparez vos mots-clefs par des virgules" name="tag_name" id="tag_name" />
				 <label for="title">Titre de l'image :</label>
			<input type="text" name="title" id="title" />
			 <label for="legend">Légende de l'image :</label>
          <input type="text" name="legend" id="legend" />	
		  
	 <label for="files">Téléchargez une image :</label>
<input type="file" id="files" name="files[]" multiple />
<script>
  function handleFileSelect(evt) {
    var files = evt.target.files; // FileList object
   for (var i = 0, f; f = files[i]; i++) {
     if (!f.type.match('image.*')) {
       continue;
	 }
     var reader = new FileReader();
     reader.onload = (function(theFile) {
       return function(e) {
          var span = document.createElement('span');
          span.innerHTML = ['<img class="thumb" src="', e.target.result,
                        '" title="', escape(theFile.name), '"/>'].join('');
          document.getElementById('list').insertBefore(span, null);
    };
      })(f);
      reader.readAsDataURL(f);
    }
  }
  document.getElementById('files').addEventListener('change', handleFileSelect, false);
 </script>	
		<button type="submit">Publier une enchère</button>
	</form>
</body>
</html>