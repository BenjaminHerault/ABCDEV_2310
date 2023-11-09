<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;    Valleur b = &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2" totalAffichages="1000" epaisseurLigne="2" maxBoucle="500000" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="valeur_a EST_DU_TYPE NOMBRE" code="1#NOMBRE#valeur_a"/>
        <item algoitem="valeur_b EST_DU_TYPE NOMBRE" code="1#NOMBRE#valeur_b"/>
        <item algoitem="valeur_c EST_DU_TYPE NOMBRE" code="1#NOMBRE#valeur_c"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;valeur a&quot;" code="4#valeur a#0"/>
        <item algoitem="LIRE valeur_a" code="2#valeur_a#pasliste"/>
        <item algoitem="AFFICHER &quot;valeur b&quot;" code="4#valeur b#0"/>
        <item algoitem="LIRE valeur_b" code="2#valeur_b#pasliste"/>
        <item algoitem="AFFICHER &quot;valeur a = &quot;" code="4#valeur a = #0"/>
        <item algoitem="AFFICHER valeur_a" code="3#valeur_a#0#pasliste"/>
        <item algoitem="AFFICHER &quot;       valeur b = &quot;" code="4#       valeur b = #0"/>
        <item algoitem="AFFICHER valeur_b" code="3#valeur_b#0#pasliste"/>
        <item algoitem="" code="103#commentaire"/>
        <item algoitem="valeur_c PREND_LA_VALEUR valeur_a" code="5#valeur_c#valeur_a#pasliste"/>
        <item algoitem="valeur_a PREND_LA_VALEUR valeur_b" code="5#valeur_a#valeur_b#pasliste"/>
        <item algoitem="valeur_b PREND_LA_VALEUR valeur_c" code="5#valeur_b#valeur_c#pasliste"/>
        <item algoitem="AFFICHER &quot;     Valleur a = &quot;" code="4#     Valleur a = #0"/>
        <item algoitem="AFFICHER valeur_a" code="3#valeur_a#0#pasliste"/>
        <item algoitem="AFFICHER &quot;    Valleur b = &quot;" code="4#    Valleur b = #0"/>
        <item algoitem="AFFICHER valeur_b" code="3#valeur_b#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
