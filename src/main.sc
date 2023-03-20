require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello
        a: Welcome!
        
    state: Weather
        intent!: /weather
        a: Sunny weather for today!
        
    state: Currency
        intent!: /currency
        a: 1 rub = 60$
        

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Sorry, don't understand you. You said: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}