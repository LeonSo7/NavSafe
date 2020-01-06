# NavSafe - A Safer Way Around

An android application navigation system which finds the safest route based on past vehicle collision data from Seattle GIS open data

**Team Members**
- [Arkin Modi](https://gitlab.cas.mcmaster.ca/modia1)
- [Benson Hall](https://gitlab.cas.mcmaster.ca/hallb8)
- [Leon So](https://gitlab.cas.mcmaster.ca/sol4)
- [Tim Choy](https://gitlab.cas.mcmaster.ca/choyt2)
- [Joy Xiao](https://gitlab.cas.mcmaster.ca/xiaoz18)

## The Problem
- Vehicle collisions
  - Potential result of **injury or death**  
- Many high-risk intersections with flawed designs
    - Factor out of the traveler’s control
    - Mistakes by pedestrian or driver has a higher chance of being fatal in these intersections
- Areas where flawed design could occur:
  - Road width
  - Speed limit
  - Markings and signs
  - Intersection infrastructure such as dividers and shoulders

## The Solution
- Navigation system which focuses on safety
- Mobile (Android) application
- Finds safest route rather than fastest
- Assigns safety weight for each route and intersection based on past collision data and factors
- Routes outputted based on travel conditions and method (e.g. vehicle, foot, bicycle)

## The Dataset
- "Collisions" from Seattle GIS Open Data
- Dataset of collisions at each intersection in Seattle (2004-2018)
- Factors obtained from dataset
  - Number of Collisions
  - Weather, road, and daylight conditions – Type of collision (pedestrian/vehicle)
  - Collision details (left/right turn, etc.)
  - Severity of collision
    - Severity code from 0-2
    - Injury/death
- Data will be needed to assign safety weight to each intersection and route

## Algorithmic Challenges
- Searching and sorting algorithms for extracting data from dataset
- Searching and sorting algorithms for finding and calculating safest route
- Algorithm for calculating the weight of each intersection and route 
  - Balance of safety and efficiency
- Graph to produce route
  - Intersections are vertex, and the roads are edges
  - The safest and shortest route will plotted as polyline and polygons graph
