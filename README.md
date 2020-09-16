# thing-edn
Extensible Data Notation for the Internet of Things

Tags:

`#t-edn/thing`    represents a thing connected to the network
`#t-edn/intent`   represents an intent for another `#t-edn/thing`
`#t-edn/result`   represents a succesful execution of a `#t-edn/intent`
`#t-edn/failure`  represents an unsuccesful execution of a `#t-edn/intent`

Requirements:

Tags and possible required keys | Name of spec
--------------------------------|-------------------------------
- `#t-edn/thing`                |(`thing-spec`)
  - `:identity`                 |(`identified-thing-spec`)
  - `:class` and `:location`    |(`intersection-thing-spec`)
- `#t-edn/intent`               |(`intent-spec`)
  - `:task` and `:thing`        |(`intent-spec`)
- `#t-edn/result`               |(`result-spec`)
  - `:data`                     |(`result-spec`)
- `#t-edn/failure`              |(`failure-spec`)
  - `:reason`                   |(`failure-spec`)
