# thing-edn
Extensible Data Notation for the Internet of Things

Tags:

- `#t-edn/thing`    represents a thing connected to the network
- `#t-edn/intent`   represents an intent for another `#t-edn/thing`
- `#t-edn/result`   represents a succesful execution of a `#t-edn/intent`
- `#t-edn/failure`  represents an unsuccesful execution of a `#t-edn/intent`
- `#t-edn/message`  represents a `#t-edn/thing`, `#t-edn/result`, or `#t-edn/failure`

Requirements:

| Tag              | Required Key(s)                | spec                                              |
|------------------|--------------------------------|---------------------------------------------------|
| `#t-edn/thing`   | `:id` or (`:class` and `:loc`) | `thing-spec`: `id-thing-spec` or `loc-thing-spec` |
| `#t-edn/intent`  | `:target` and `:task`          | `intent-spec`                                     |
| `#t-edn/result`  | `:data`                        | `return-spec`                                     |
| `#t-edn/failure` | `:data`                        | `return-spec`                                     |
| `#t-edn/message` | `:contents`                    | `message-spec`                                    |
