require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello
        a: Привет!
        
    state: Weather
        q!: *~погода*
        a: Сегодня солнечно
        
    state: Currency
        q!: *~валют*
        a: 60 долларов = 1 рубль
        

    state: Bye
        q!: пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Sorry, don't understand you. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}