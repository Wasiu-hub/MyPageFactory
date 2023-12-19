// tagName[@att= 'attVal']

//button[@id='onetrust-accept-btn-handler']-- custom locator for accept cookies button

================
//*[@id="header-big-screen-search-box"] -- search box from dom (legacy way)
//input[@id='header-big-screen-search-box']- search box from chropath
//input[@id='header-big-screen-search-box'] - search box from customized locator

===============
//*[@id="header-search-form"]/button/img- circle space to click from dom (legacy way)

//header/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]/img[1] - circle space to click from chropath

//img[@alt='Search Icon']- circle space from customized xpath - using alt attrib (has 2 search options)

//img[@src='/static-content/icons/header/next/v1/vision/search-input-button.svg']- circle space from customized xpath - using src attribute (better because has 1 search option) - A

=============
//*[@id="plp-results-title-container"]/div/h1/span - search for "Jeans" from legacy way

//body/main[@id='next-plp-entrypoint']/div[@id='platform_modernisation_plp']/div[@id='plp']/div[2]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1] - from chropath

//span[@data-testid= 'plp-product-title-text']

======= using parent element to get the circle space button

//*[@id="header-search-form"]/button/img

//button[@data-testid='header-search-bar-button']/img --- customized (better) - B

-- You can use either A or B

