<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;Ecrire un nombre &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurPoint="2" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000" nbDecimales="8" totalAffichages="1000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#np" algoitem="np EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#ii" algoitem="ii EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#np#0#pasliste" algoitem="np PREND_LA_VALEUR 0"/>
        <item code="4#Ecrire un nombre #0" algoitem="AFFICHER &quot;Ecrire un nombre &quot;"/>
        <item code="2#np#pasliste" algoitem="LIRE np"/>
        <item code="4#Les valeurs des 10 nombres sont : #1" algoitem="AFFICHER &quot;Les valeurs des 10 nombres sont : &quot;"/>
        <item code="12#ii#1#10" algoitem="POUR ii ALLANT_DE 1 A 10">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#np#np+1#pasliste" algoitem="np PREND_LA_VALEUR np+1"/>
            <item code="3#np#1#pasliste" algoitem="AFFICHER np"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
