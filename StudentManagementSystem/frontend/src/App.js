
import './App.css';
import { Component } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Login from './Login';

class App extends Component{
  render(){
    return(
      <div>
        
       
        <Router>
          <Switch>
          <Route path='/' exact={true} component={Login}/>
          </Switch>
          </Router>
          
      </div>
    );
  }
}
         

export default App;
