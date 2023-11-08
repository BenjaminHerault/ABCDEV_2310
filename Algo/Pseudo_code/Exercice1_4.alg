<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="interet_compose PREND_LA_VALEUR SommeS*(pow(1+interetI/100,anneesN))" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" arrondiAuto="vrai" totalBoucles="5000000" epaisseurPoint="2" nbDecimales="8" maxBoucle="500000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#SommeS" algoitem="SommeS EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#interetI" algoitem="interetI EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneesN" algoitem="anneesN EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#interet_simple" algoitem="interet_simple EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#interet_compose" algoitem="interet_compose EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir la somme S#0" algoitem="AFFICHER &quot;Saisir la somme S&quot;"/>
        <item code="2#SommeS#pasliste" algoitem="LIRE SommeS"/>
        <item code="4#Saisir l'intert#0" algoitem="AFFICHER &quot;Saisir l'intert&quot;"/>
        <item code="2#interetI#pasliste" algoitem="LIRE interetI"/>
        <item code="4#Annees N#0" algoitem="AFFICHER &quot;Annees N&quot;"/>
        <item code="2#anneesN#pasliste" algoitem="LIRE anneesN"/>
        <item code="4#un interet simple =    #0" algoitem="AFFICHER &quot;un interet simple =    &quot;"/>
        <item code="5#interet_simple#SommeS*(1+anneesN*interetI/100)#pasliste" algoitem="interet_simple PREND_LA_VALEUR SommeS*(1+anneesN*interetI/100)"/>
        <item code="3#interet_simple#0#pasliste" algoitem="AFFICHER interet_simple"/>
        <item code="4#               interet compose =    #0" algoitem="AFFICHER &quot;               interet compose =    &quot;"/>
        <item code="5#interet_compose#SommeS*(pow(1+interetI/100,anneesN))#pasliste" algoitem="interet_compose PREND_LA_VALEUR SommeS*(pow(1+interetI/100,anneesN))"/>
        <item code="3#interet_compose#0#pasliste" algoitem="AFFICHER interet_compose"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
