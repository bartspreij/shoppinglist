import { useState, useEffect } from 'react'

const App = () => {
  const [items, setItems] = useState([])

  useEffect(() => {
    fetch("http://localhost:8080/api/v1/shopping-list-items")
    .then(result => result.json())
    .then(setItems)
  });

  return <><h1>Groceries</h1><ul>{items.map(item => <li key={item}>{item}</li>)}</ul></>
}

export default App
