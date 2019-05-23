<?php
	
	if(isset($_POST['submit'])){
		$name = $_POST['name'];
		$email = $_POST['email'];
		$comments = $_POST['comments'];
	
		if(($name=='')|| ($email=='')||($comments=='')){
			echo "Morate popuniti sva polja!";
		}else{

			$subject="Poruka je poslata sa sajta";
			$from = "Od:$name<$email>";
				mail('natasa000zaric@gmail.com',$subject,$comments,$from);
				echo "Poruka je poslata!";
		}
}


header("refresh:2; url=imatepitanje.html");
?>
