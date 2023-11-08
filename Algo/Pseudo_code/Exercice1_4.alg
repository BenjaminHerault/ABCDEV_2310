<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;un interet simple =             &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" totalBoucles="5000000" arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2" maxBoucle="500000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="SommeS EST_DU_TYPE NOMBRE" code="1#NOMBRE#SommeS"/>
        <item algoitem="interetI EST_DU_TYPE NOMBRE" code="1#NOMBRE#interetI"/>
        <item algoitem="anneesN EST_DU_TYPE NOMBRE" code="1#NOMBRE#anneesN"/>
        <item algoitem="interet_simple EST_DU_TYPE NOMBRE" code="1#NOMBRE#interet_simple"/>
        <item algoitem="interet_compose EST_DU_TYPE NOMBRE" code="1#NOMBRE#interet_compose"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir la somme S&quot;" code="4#Saisir la somme S#0"/>
        <item algoitem="LIRE SommeS" code="2#SommeS#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir l'intert&quot;" code="4#Saisir l'intert#0"/>
        <item algoitem="LIRE interetI" code="2#interetI#pasliste"/>
        <item algoitem="AFFICHER &quot;Annees N&quot;" code="4#Annees N#0"/>
        <item algoitem="LIRE anneesN" code="2#anneesN#pasliste"/>
        <item algoitem="AFFICHER &quot;un interet simple =             &quot;" code="4#un interet simple =             #0"/>
        <item algoitem="interet_simple PREND_LA_VALEUR SommeS*(1+anneesN*interetI/100)" code="5#interet_simple#SommeS*(1+anneesN*interetI/100)#pasliste"/>
        <item algoitem="AFFICHER interet_simple" code="3#interet_simple#0#pasliste"/>
        <item algoitem="AFFICHER &quot;               interet compose =          &quot;" code="4#               interet compose =          #0"/>
        <item algoitem="interet_compose PREND_LA_VALEUR SommeS*(pow(1+interetI/100,anneesN))" code="5#interet_compose#SommeS*(pow(1+interetI/100,anneesN))#pasliste"/>
        <item algoitem="AFFICHER interet_compose" code="3#interet_compose#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
