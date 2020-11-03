# Projet Compteur | Réveils
###### Module : Algorithmie - Prog OBJ
###### Professeur : Mme. Salima HASSAS
---
Dans le cadre du module de **Programmation OBJ** nous avons été ammenés à réaliser le développement d'une solution permettant initialement à l'utilisateur de créer une chaîne de compteur.

> Par exemple sous la forme **hh:mm:ss** *(nous prennons cette exemple pour simplifier nos propos)*

De cette solution nous avons implémenter une montre reprenant le même format horaire que mentionné précédemment.

Puis, à partir de cette dernière solution de base, il nous a été demandé d'y apporter des améliorations. Nous pouvons dès lors les lister :
> - Implémenter la possibilité de créer un réveil utilisant notre solution "compteur"
> - Implémenter différents types de réveils : Radio Réveil; Réveil Classique; Cafetière réveil
>   - Mettre en place un héritage multiple pour les réveils
>
>  *[cf. représentation UML de la solution proposée](#uml-solution)*

Suite à cela, moi même Yann TRICOT avec mon binôme Alexandre CHEVREAUD nous sommes concertés. Une fois ces différentes améliorations nécessaires identifiés nous avons donc pu réaliser un UML sommaire reprenant les axes d'améliorations en compte et l'implémentaion choisie.

> *à noter que l'UML de la solution a été réalisé collectivement en cours avec notre enseigant afin d'avoir une base commune à toutes les équipes pour le développement à proposer*

Puis une fois cet UML réalisé nous savions les tâches nécessaires à réaliser pour développer cette solution et obtenir le résultat escompté. 

### UML Solution
![alt text](https://raw.githubusercontent.com/Yann-Tricot/yann-tricot.github.io/master/img/COURSES/UML%20-%20TP_Compteur.png?token=AQJOHT7BLZNMIYDXX6K4JZ27VGLKG)

De part le fait que ce développement fut préparé en amont nous avons pu réaliser la solution principale rapidement. Cela nous a donc permis de nous intéresser par conséquent à la ***forme*** de la solution et non plus à son ***fond***.

Nous nous sommes donc penchés sur l'ajout de fonctionnalités supplémentaire afin de rendre l'expérience utilisateur plus agréable :
> - Implémentation d'une interface utilisateur 
>   - Saisie de l'heure du réveil ***(hh:mm:ss)***
>   - Sélection du réveil désiré
>   - Activation du réveil combiné avec un SMS
>   - Visualisation du réveil ***(hh:mm:ss)***
> - Ajout de sons (.wav) pour simuler le réveil ***[sonnerie; cafetière; musique]***
> - Implémentation de tests unitaires

Pour l'implémentation de de la fonctionnalité d'envoi d'un SMS lors du réveil nous nous sommes appuyé sur une API java [https://www.smsmode.com/](https://www.smsmode.com/). Cette dernière est donc une plateforme de messageries mobiles nous permettant, dans notre cas, d'envoyer un SMS à un numéro de téléphone donné. 

Finnalement, nous pouvons représenter le process de notre solution sous le logigramme suivant :


### Logigramme solution Réveil
![alt text](https://raw.githubusercontent.com/Yann-Tricot/yann-tricot.github.io/master/img/COURSES/Logigramme%20-%20TP_Compteur.png?token=AQJOHT3JUYRY22HY5UWLJAC7VGBI4)

> 📈 ***Logigramme réalisé par Yann TRICOT***

---
###### Projet réalisé par : Yann TRICOT & Alexandre CHEVREAUD
###### SEMESTRE 5 - OCTOBRE/NOVEMBRE 2020

    🚀 2020 README wrote by Yann TRICOT - none specific licenses 🚀