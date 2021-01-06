import './styles.css'
import {ReactComponent as Logo} from './Logo.svg'

function NavBar(){
    return(
        <nav className="main-navbar">
            <Logo/>
            <a href="home" className="logo-text">Pizza Delivery</a>
        </nav>
    )
}

export default NavBar;