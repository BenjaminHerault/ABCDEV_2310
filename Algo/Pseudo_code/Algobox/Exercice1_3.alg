<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER aire_du_secteur_circulaire"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2lignes="" F2defaut="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai" epaisseurLigne="2" totalBoucles="5000000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="RayonR EST_DU_TYPE NOMBRE" code="1#NOMBRE#RayonR"/>
        <item algoitem="AngleA_en_degres EST_DU_TYPE NOMBRE" code="1#NOMBRE#AngleA_en_degres"/>
        <item algoitem="aire_du_secteur_circulaire EST_DU_TYPE NOMBRE" code="1#NOMBRE#aire_du_secteur_circulaire"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir le rayonR&quot;" code="4#saisir le rayonR#0"/>
        <item algoitem="LIRE RayonR" code="2#RayonR#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir le AngleA en degres &quot;" code="4#Saisir le AngleA en degres #0"/>
        <item algoitem="LIRE AngleA_en_degres" code="2#AngleA_en_degres#pasliste"/>
        <item algoitem="AFFICHER &quot;l'aire du secteur circulaire=&quot;" code="4#l'aire du secteur circulaire=#0"/>
        <item algoitem="aire_du_secteur_circulaire PREND_LA_VALEUR (Math.PI*pow(RayonR,2)*AngleA_en_degres)/360" code="5#aire_du_secteur_circulaire#(Math.PI*pow(RayonR,2)*AngleA_en_degres)/360#pasliste"/>
        <item algoitem="AFFICHER aire_du_secteur_circulaire" code="3#aire_du_secteur_circulaire#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
