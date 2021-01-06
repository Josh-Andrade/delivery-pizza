import './styles.css'
import {ReactComponent as Logo} from './Logo.svg'
import { Link } from 'react-router-dom';

function NavBar(){
    return(
        <nav className="main-navbar">
            <Logo/>
            <Link to="/" className="logo-text">Pizza Delivery</Link>
        </nav>
    )
}

export default NavBar;