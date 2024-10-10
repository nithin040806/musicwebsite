package com.demo.MusicWebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.MusicWebsite.model.FavouritesModel;
import com.demo.MusicWebsite.model.MusicModel;
import com.demo.MusicWebsite.model.Search;
import com.demo.MusicWebsite.model.UserModel;
import com.demo.MusicWebsite.repository.FavouriteRepository;
import com.demo.MusicWebsite.repository.MusicRepository;
import com.demo.MusicWebsite.repository.UserRepository;
import com.demo.MusicWebsite.service.FavouriteService;
import com.demo.MusicWebsite.service.UserService;
import org.springframework.ui.Model;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	@Autowired
	MusicRepository musicRepository;
	UserModel user;
	@Autowired
	UserRepository userRepository;
	@Autowired
	FavouriteService favouriteService;
	@Autowired
	FavouriteRepository favouriteRepository;
	MusicModel musicModel;
	@GetMapping("/login.html")
	public String getLoginPage(Model model)
	{
		model.addAttribute("loginRequest",new UserModel());
		return "login";
	}
	@GetMapping("/signup.html")
	public String getSignUpPage(Model model)
	{
		model.addAttribute("registerRequest",new UserModel());
		return "signup";
	}
	@PostMapping("/login.html")
	public String regiser(@ModelAttribute UserModel userModel,Model model)
	{
		if(userService.registerUser(userModel.getLogin(),userModel.getPassword()))
		{
			return "login";
		}
		if(userService.authenticate(userModel.getLogin(),userModel.getPassword()))
		{
			return "login";
		}
		return "error";
		
	}
	@PostMapping("/home.html")
	public String signup(@ModelAttribute UserModel userModel,Model model)
	{
		if(userService.authenticate(userModel.getLogin(),userModel.getPassword()))
		{
			user=userRepository.findOneByLoginAndPassword(userModel.getLogin(),userModel.getPassword());
			System.out.println("userid:"+user.getId());
			List<MusicModel> telugumusic=musicRepository.findByLanguage("telugu");
			List<MusicModel> tamilmusic=musicRepository.findByLanguage("tamil");
			List<MusicModel> malayalammusic=musicRepository.findByLanguage("malayalam");
			model.addAttribute("tamilmusic",tamilmusic);
			model.addAttribute("telugumusic",telugumusic);
			model.addAttribute("malayalammusic",malayalammusic);
			return "home";
		}
		return "error";
	}
	@GetMapping("/home.html")
	public String getHomePage(Model model)
	{
		List<MusicModel> telugumusic=musicRepository.findByLanguage("telugu");
		List<MusicModel> tamilmusic=musicRepository.findByLanguage("tamil");
		List<MusicModel> malayalammusic=musicRepository.findByLanguage("malayalam");
		model.addAttribute("telugumusic",telugumusic);
		model.addAttribute("tamilmusic",tamilmusic);
		model.addAttribute("malayalammusic",malayalammusic);
		return "home";
	}
	@GetMapping("/AyudhaPooja")
	public String getAyudhaPooja(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("AyudhaPooja");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Vellake")
	public String getVellake(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Vellake");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Chuttamalle")
	public String getChuttamalle(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Chuttamalle");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/PoVePo")
	public String getPoVePo(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("PoVePo");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Anuvanuvuu")
	public String getOmBheemBush(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Anuvanuvuu");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/GaramGaram")
	public String getGaramGaram(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("GaramGaram");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/SuttamlaSoosi")
	public String getSuttamlaSoosi(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("SuttamlaSoosi");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/OhPriyaPriya")
	public String getOhPriyaPriya(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("OhPriya");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/PushpaPushpa")
	public String getPushpaPushpa(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("PushpaPushpa");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/KurchiMadathapetti")
	public String getKurchiMadathapetti(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("KurchiMadathapetti");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/HunterVantaar")
	public String getHunterVantaar(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("HunterVantaar");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/OrdinaryPerson")
	public String getOrdinaryPerson(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("OrdinaryPerson");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/VaathiComing")
	public String getVaathiComing(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("VaathiComing");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Hukum")
	public String getHukum(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Hukum");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Yaanji")
	public String getYaanji(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Yaanji");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Vikram")
	public String getVikram(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Vikram");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/AasaKooda")
	public String getAasaKooda(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("AasaKooda");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/KatchiSera")
	public String getKatchiSera(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("KatchiSera");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/ThuliThuli")
	public String getThuliThuli(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("ThuliThuli");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Matta")
	public String getMatta(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Matta");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Illuminati")
	public String getIlluminati(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Illuminati");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Darshana")
	public String getDarshana(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Darshana");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Uyire")
	public String getUyire(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Uyire");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/KothaRaja")
	public String getKothaRaja(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("KothaRaja");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Malare")
	public String getMalare(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Malare");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Kiliye")
	public String getKiliye(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Kiliye");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/Kuthanthram")
	public String getKuthanthram(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("Kuthanthram");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/ManavaalanThug")
	public String getManavaalanThug(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("ManavaalanThug");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/PavizhaMazha")
	public String getPavizhaMazha(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("PavizhaMazha");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("/HabibiDrip")
	public String getHabibiDrip(Model model)
	{
		MusicModel music=musicRepository.findByMusicName("HabibiDrip");
		musicModel=music;
		List<MusicModel> telugumusic=musicRepository.findByLanguage(music.getLanguage());
		model.addAttribute("telugumusic",telugumusic );
		model.addAttribute("music",music);
		return "MusicPlay";
	}
	@GetMapping("favourites.html")
	public String favourite(Model model)
	{

		List<FavouritesModel> favourites=favouriteRepository.findByUserId(user.getId());
		model.addAttribute("favourites",favourites);
		return "favourites";
	}
	@GetMapping("favouriteCheck.html")
	public String favouriteCheck(Model model)
	{
		if(favouriteService.isfavourite(user.getId(), musicModel.getMusicid()))
		{
			List<FavouritesModel> favourites=favouriteRepository.findByUserId(user.getId());
			model.addAttribute("favourites",favourites);
		}
		else {
			favouriteService.addFavourite(user.getId(), musicModel.getMusicid(),musicModel.getPostercardurl(),musicModel.getPageurl());
			List<FavouritesModel> favourites=favouriteRepository.findByUserId(user.getId());
			model.addAttribute("favourites",favourites);
		}
		return "favourites";
	}
	@GetMapping("Search.html")
	public String getSearchPage(Model model)
	{
		return "Search";
	}
	@PostMapping("Search.html")
	public String searchResults(@ModelAttribute("search") Search search,Model model)
	{
		List<MusicModel> searchresult=musicRepository.getByMusicNameOrMovieName(search.getInput_search());
		model.addAttribute("searchresult",searchresult);
		return "Search";
	}
	@GetMapping("OldSongs.html")
	public String getOldSongs(Model model)
	{
		List<MusicModel> oldsongsList=musicRepository.getByOldSongs();
		model.addAttribute("oldsongslist",oldsongsList);
		return "Oldsongs";
	}
	@GetMapping("NewSongs.html")
	public String getNewSongs(Model model)
	{
		List<MusicModel> newsongsList=musicRepository.getByNewSongs();
		model.addAttribute("newsongsList",newsongsList);
		return "NewSongs";
	}
}
