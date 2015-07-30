# Bug using iOS and iPhone 4

To reproduce, from the project folder:

```
lein cljsbuild once
python -m SimpleHTTPServer 9000
```

Open the page using an iphone, without using the safari web inspector.

Before and After should be the same, but is not.

Now open the page again using the safari web inspector, and it will work.

Good luck!

# Tips

Can use a tunnel tool like ngrok to make the local server available on the net:

```
ngrok 9000
```
