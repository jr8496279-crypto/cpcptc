import { Link } from "react-router-dom";
import "../App.css";

const Navigation = () => {
  return (
    <div className="navbar">
      <Link className="my-link" to="/">Home</Link>
      <Link className="my-link" to="/about">About</Link>
      <Link className="my-link" to="/contact">Contact</Link>
    </div>
  );
};

export default Navigation;
