<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (A%4==0 ET A%100!=0 OU A%400==0) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" nbDecimales="8" epaisseurPoint="2" epaisseurLigne="2" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#A" algoitem="A EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#écrire une année #0" algoitem="AFFICHER &quot;écrire une année &quot;"/>
        <item code="2#A#pasliste" algoitem="LIRE A"/>
        <item code="6#A%4==0 ET A%100!=0 OU A%400==0" algoitem="SI (A%4==0 ET A%100!=0 OU A%400==0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#l’année #0" algoitem="AFFICHER &quot;l’année &quot;"/>
            <item code="3#A#0#pasliste" algoitem="AFFICHER A"/>
            <item code="4# est bisextille#0" algoitem="AFFICHER &quot; est bisextille&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#l’année #0" algoitem="AFFICHER &quot;l’année &quot;"/>
                <item code="3#A#0#pasliste" algoitem="AFFICHER A"/>
                <item code="4# n’est pas bissextile#0" algoitem="AFFICHER &quot; n’est pas bissextile&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
