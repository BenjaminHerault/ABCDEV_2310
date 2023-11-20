<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER np"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" epaisseurPoint="2" maxBoucle="500000" totalBoucles="5000000" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#np" algoitem="np EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#ii" algoitem="ii EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#np#0#pasliste" algoitem="np PREND_LA_VALEUR 0"/>
        <item code="5#ii#0#pasliste" algoitem="ii PREND_LA_VALEUR 0"/>
        <item code="4#Entrez un nombre#0" algoitem="AFFICHER &quot;Entrez un nombre&quot;"/>
        <item code="2#np#pasliste" algoitem="LIRE np"/>
        <item code="15#ii&lt;10" algoitem="TANT_QUE (ii&lt;10) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#np#np+1#pasliste" algoitem="np PREND_LA_VALEUR np+1"/>
            <item code="3#np#1#pasliste" algoitem="AFFICHER np"/>
            <item code="5#ii#ii+1#pasliste" algoitem="ii PREND_LA_VALEUR ii+1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
