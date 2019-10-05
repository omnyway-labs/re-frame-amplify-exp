# re-frame-amplify-exp

A [re-frame](https://github.com/Day8/re-frame) application designed to show how to integrate generic AWS Amplify with a focus on Cognito.

The starting point was using this leinigin scaffold:

```
lein new re-frame re-frame-amplify-exp +10x +cider +test +breaking-point +garden
```



## Development Mode

### Start Cider from Emacs:

Refer to the [shadow-cljs Emacs / CIDER documentation](https://shadow-cljs.github.io/docs/UsersGuide.html#cider).

The mentioned `dir-local.el` file has been created.

### Compile css:

Compile css file once.

```
lein garden once
```

Automatically recompile css file on change.

```
lein garden auto
```

### Run application:

```
lein clean
lein dev
```

shadow-cljs will automatically push cljs changes to the browser.

Wait a bit, then browse to [http://localhost:8280](http://localhost:8280).

### Run tests:

Install karma and headless chrome

```
npm install -g karma-cli
```

And then run your tests

```
lein clean
lein run -m shadow.cljs.devtools.cli compile karma-test
karma start --single-run --reporters junit,dots
```

## Production Build

