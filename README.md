# denisaripiceanu1-Semestre3-JavaTelephone

J'ai développé une application visant à simuler le clavier d'un téléphone mobile ancienne génération lors de la rédaction de messages SMS (Short Message Service). Dans ces anciens téléphones, pour choisir un caractère particulier, l'utilisateur devait appuyer plusieurs fois sur la même touche. Cette action permettait de faire défiler les différents caractères associés à cette touche.

Prenons l'exemple suivant d'un téléphone : 1 2abc 3def 4ghi 5jkl 6mno 7pqrs 8tuv 9wxyz #,;: 0_ *?.

Chaque touche (0..9) est associée à un nombre de caractères différents, variant d'une touche à l'autre. Par exemple, la touche 2 est associée aux caractères '2', 'a', 'b', 'c'. Ainsi, en appuyant 3 fois sur la touche 2, un utilisateur obtiendra un 'b'. Si l'utilisateur appuie 6 fois sur cette même touche, il obtiendra un 'a', car le fonctionnement repose sur une liste circulaire.
