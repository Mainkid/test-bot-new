require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello
        a: hellow and welcome
        
    state: weather
        q!: *~погода*
        a: Сегодня солнечно

    state: currency
        q!: *~валют*
        a: Мда ну и курс
        
    state: Bye
        q!: пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Sorry, don't understand you. You said: {{$request.query}}
        
    state: Match
        event!: match
        a: {{$context.intent.answer}}