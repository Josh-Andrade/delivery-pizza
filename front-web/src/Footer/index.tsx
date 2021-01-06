import './styles.css'
import { ReactComponent as YoutubeIcon } from './Youtube.svg'
import { ReactComponent as LinkedinIcon } from './Linkedin.svg'
import { ReactComponent as InstagramIcon } from './Instagram.svg'

function Footer(){
    return(
        <footer className="main-footer">
            App desenvolvido durante a 2ª edição do evento Semana DevSuperior
            <div className="footer-icons">
                <a href="" target="_new">
                    <YoutubeIcon/>
                </a>
                <a href="" target="_new">
                    <InstagramIcon/>
                </a>
                <a href="https://www.linkedin.com/in/joshua-andrade-mota-de-almeida/" target="_new">
                    <LinkedinIcon/>
                </a>
            </div>
        </footer>
    )
}

export default Footer;