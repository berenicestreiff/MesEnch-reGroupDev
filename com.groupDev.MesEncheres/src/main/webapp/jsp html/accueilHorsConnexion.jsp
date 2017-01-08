<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    
    <title>Site d'enchères Ménestrelle</title>
    <meta name="description" content="Un template de site web raffinÃ© avec une touche de luxe. TÃ©lÃ©chargez des photos et ajoutez votre texte pour prÃ©senter votre ligne de produits hauts-de-gamme. Les clients pourront dÃ©couvrir les images et les descriptions des articles, parcourir la FAQ et sÃ©lectionner les articles quâils souhaitent acheter.">
    <meta name="author" content="Wixpress">
    <meta http-equiv="content-language" content= "fr","en"/>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="//E:\CAPGEMINI\FIL ROUGE\jsp html\general.css"/>
	<!--<script type="text/javascript" src="//E:\CAPGEMINI\FIL ROUGE\jsp html\general.js"></script>-->
</head>
<body>
	<div id="menu">
    			<dl>
    				<dt><a href="./liste.jsp">Meubles</a></dt>
    				<dd><ul>
    					<li><a href="./liste.jsp">Baldaquins</a></li>
    					<li><a href="./liste.jsp">Coffres</a></li>
    					<li><a href="./liste.jsp">Tables</a></li>
    					<li><a href="./liste.jsp">Sièges</a></li>
    				</ul></dd>
    			</dl>
    			<dl>
    				<dt><a href="./liste.jsp">Oeuvres d'art</a></dt>
    				<dd><ul>
    					<li><a href="./liste.jsp">Retables</a></li>
    					<li><a href="./liste.jsp">Peintures</a></li>
    					<li><a href="./liste.jsp">Dessins</a></li>
    					<li><a href="./liste.jsp">Gravures</a></li>
    					<li><a href="./liste.jsp">Sculptures</a></li>
    				</ul></dd>
    			</dl>
    			<dl>
    				<dt><a href="./liste.jsp">Armure</a></dt>
    				<dd><ul>
    					<li><a href="./liste.jsp">Casque</a></li>
    					<li><a href="/liste.jsp">Côte de maille</a></li>
    					<li><a href="./liste.jsp">Armure de bataille</a></li>
    					<li><a href="./liste.jsp">Armure de reître</a></li>
    					<li><a href="./liste.jsp">Armures légères de chevaux</a></li>
    					<li><a href="./liste.jsp">Armures de cuirassier</a></li>
    					<li><a href="./liste.jsp">Armures de tournoi</a></li>
    				</ul></dd>
    			</dl>
          	<dl>
    				<dt><a href="/liste.jsp">Décoration</a></dt>
    				<dd><ul>
    					<li><a href="./liste.jsp">Tentures</a></li>
    					<li><a href="./liste.jsp">Tapis</a></li>
    					<li><a href="./liste.jsp/">Etoffes</a></li>
    					<li><a href="./liste.jsp">Céramiques</a></li>
    					<li><a href="./liste.jsp">Emaux</a></li>
    					<li><a href="./liste.jsp">Verres soufflés</a></li>
    					<li><a href="./liste.jsp">Porcelaines</a></li>
    				</ul></dd>
    			</dl>
              	<dl>
    				<dt><a href="./liste.jsp">Instruments de musique</a></dt>
    				<dd><ul>
    					<li><a href="/liste.jsp">Lyres</a></li>
    					<li><a href="./liste.jsp">Cymbales</a></li>
    					<li><a href="./liste.jsp">Pipeaux</a></li>
    					<li><a href="./liste.jsp">Flûtes</a></li>
    					<li><a href="./liste.jsp">Cyrhares</a></li>
    					<li><a href="./liste.jsp">Tambourins</a></li>
    				</ul></dd>
    			</dl>
              	<dl>
    				<dt><a href="./liste.jsp">Ouvrages</a></dt>
    				<dd><ul>
    					<li><a href="./liste.jsp">Manuscrits</a></li>
    					<li><a href="./liste.jsp">Livres d'heures</a></li>
    					<li><a href="./liste.jsp">Livres de prières</a></li>
    					<li><a href="./liste.jsp">Correspondances</a></li>
    				</ul></dd>
    			</dl>
    			<script type="text/javascript">
    			<!--
    				//Utile pour ne pas voir les �l�ments dd appara�tre au chargement de la page
    				var oDd=document.getElementsByTagName('dd'),i=oDd.length-1;for(i;i>=0;i=i-1)oDd.style.display='none';
    			//-->
    			</script>
    			
    			
    			<article>
    			
    			<div class="row">
  <div class="col-sm-6 col-md-4">
	      <div class="thumbnail">
      <img src="data:image/jpeg;base64,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" alt="">
      <div class="caption">
        <h2>Meubles</h2>
        <p>Sed placerat mauris quis risusm, sed egestas neque felis eget enim. </p>
      </div>
    <div class="thumbnail">
      <img src="data:image/jpeg;base64,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" alt="">
      <div class="caption" alt="">
      <div class="caption">
        <h2>Décoration</h2>
        <p>Sed placerat maurisortor mollis quam, sed egestas neque felis eget enim. </p>
      </div>
       <div class="thumbnail">
      <img src="data:image/jpeg;base64,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" alt="">
      <div class="caption">
        <h2>Instruments de musique</h2>
        <p>Sed placerat mauris tortor mollis quam, sed egestas neque felis eget enim. </p>
      
      </div>
       <div class="thumbnail">
      <img src="data:image/jpeg;base64,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" alt="">
      <div class="caption">
        <h2>Ouvrages</h2>
        <p>Sed placerat mauris quis risus consequat commodo. Etiam ltortor mollis quam, sed egestas neque felis eget enim. </p>
</div>
      
       <div class="thumbnail">
      <img src="data:image/jpeg;base64,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" alt="">
      <div class="caption">
        <h2>Armures</h2>
        <p>Sed placerat mauris quis risus consequat commodo. Etiam lorem leo, tincidunt a nisi ut, rutrum sodales dolor. Nunc scelerisque nulla vitae eleifend lacinia. Fusce maximus velit eu erat porta, sed consequat quam accumsan. Pellentesque nec ex vel sem tincidunt blandit ut ut ex. Fusce sed magna nibh. Duis mauri </div>
     
  </div>
      </div>
       <div class="thumbnail">
      <img src="data:image/jpeg;base64,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" alt="">
      <div class="caption">
        <h2>Ventes d'exception</h2>
        <p>Sed placerat mauris quis risus consequat commodo. Etiam lorem leo, tincidunt a nisi ut, rutrum sodales dolor. Nunc scelerisque nulla vitae eleifend lacinia. Fusce maximus velit eu erat porta, sed consequat quam accumsan. Pellentesque nec ex vel sem tincidunt blandit ut ut ex. Fusce sed magna nibh.get enim. </p>
     
  </div>
</div>
    			</article>
    			
    			<footer>
    			<a href="./modalites_de_vente.jsp">Modalités de vente</a>
    			<a href="./credits.jsp">Crédits</a>
    			<a href="./contacts.jsp">Contacts</a>
    			<a href="./faq.jsp">FAQ</a>
    			<a href="./cmt_ca-marche.jsp">Comment ça marche ?</a>
    			<a href="./accesibilite.jsp">Accessibilité</a>
    			
    			</footer>
</body>
</html>