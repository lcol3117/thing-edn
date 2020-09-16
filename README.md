# thing-edn
Extensible Data Notation for the Internet of Things

Tags:

`#t-edn/thing`    represents a thing connected to the network
`#t-edn/intent`   represents an intent for another `#t-edn/thing`
`#t-edn/result`   represents a succesful execution of a `#t-edn/intent`
`#t-edn/failure`  represents an unsuccesful execution of a `#t-edn/intent`

Requirements:

| Tag              | Required Key(s)                           | spec                                                  |
|------------------|-------------------------------------------|-------------------------------------------------------|
| `#t-edn/thing`   | `:identity` or (`:class` and `:location`) | `thing-spec`: `id-thing-spec` or `located-thing-spec` |
| `#t-edn/intent`  | `:target` and `:task`                     | `intent-spec`                                         |
| `#t-edn/result`  | `:data`                                   | `return-spec`                                         |
| `#t-edn/failure` | `:data`                                   | `return-spec`                                         |
