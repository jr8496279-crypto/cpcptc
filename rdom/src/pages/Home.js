import Navigation from "../components/Navigation";

const Home = () => {
  return (
    <>
      <Navigation />
      <div className="content">
        <h1>Home</h1>
        <p>Welcome to the home page</p>

        <img
          className="home-img"
          src="https://media.istockphoto.com/id/1312128591/vector/home-icon-vector-house-sign.jpg?s=612x612&w=0&k=20&c=jxUT546g8Cfgv1SiAfh2Eos46XI3DqYvPLhxGFaobpE="
          alt="Home"
        />
      </div>
    </>
  );
};

export default Home;
