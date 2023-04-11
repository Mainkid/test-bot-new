require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока

    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}
        
    state: /hello
        q!: * (привет*/здравствуй*/здоров*/хай) *
        a: Приветствую Вас!
        
    state: /weather
        q!: * (ккаккакак*) *
        a: Сегодня отвратительная погода!
        
    state: /currency
        q!: * (курс*/рубл*/валют*/доллар*) *
        a: Все очень плохо
        
    

    state: Match
        event!: match
        a: {{$context.intent.answer}}