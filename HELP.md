# Read Me First

для запуска укажите в application.properties бд, логин и пароль

## Rest api
1. GET localhost:8080/organisations/{id}
возвращает данные организации по id

2. GET localhost:8080/organisations?partOfName={partOfName}
если параметер задан то ищет все совпадания по полю fullname, иначе возвращает все записи

