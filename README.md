# thing-edn
Extensible Data Notation for the Internet of Things

Tags:

`#t-edn/thing`    represents a thing connected to the network
`#t-edn/intent`   represents an intent for another `#t-edn/thing`
`#t-edn/result`   represents a succesful execution of a `#t-edn/intent`
`#t-edn/failure`  represents an unsuccesful execution of a `#t-edn/intent`

Requirements:

- `#t-edn/thing`
  - `:identity` or (`:class` and `:location`)
- `#t-edn/intent`
  - `:task` and `:thing`
- `#t-edn/result`
  - `:data`
- `#t-edn/failure`
  - `:reason`
