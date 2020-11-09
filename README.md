# clockzone

Budowanie aplikacji bez klonowania: `docker build https://github.com/MrNanio/clockzone.git`

Automatyczna budowa obrazu na Docker Hub (po wcześniejszych etapach synchronizacji kont i stworzeniu repozytorium oraz jego ustawieniach tak by było automatyczne budowanie obrazów)

- po wykonaniu zmian w obrazie i wrzuceniu ich do repozytorium Docker Hub-a za pomoca polecenia: `docker push pawcziii/clockzone:tagname`
-  po zmianach w kodzie źródłowym aplikacji, wykonaniu commit-a, następnie push-a na główny branch `git push origin master` Docker Hub powinien automatycznie wykryć zmiany na repozytorium github-a i przebudować obraz na Docker Hub-ie.
- by skorzystać z obrazu klient powinien wykonać `docker pull pawcziii/clockzone` 
