package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelScheenstia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodyend;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailfin;
    private final AdvancedModelRenderer Tailendflesh;
    private final AdvancedModelRenderer Tailbaseslope;
    private final AdvancedModelRenderer Dorsalfinend;
    private final AdvancedModelRenderer Tailbaseunderside;
    private final AdvancedModelRenderer Analfin;
    private final AdvancedModelRenderer Bodyendslope;
    private final AdvancedModelRenderer Dorsalfinstart;
    private final AdvancedModelRenderer Bodyendunderside;
    private final AdvancedModelRenderer Bodymiddlehump;
    private final AdvancedModelRenderer Bodymiddleslope;
    private final AdvancedModelRenderer Bodymiddleslope_r1;
    private final AdvancedModelRenderer Rightpelvicfin;
    private final AdvancedModelRenderer Rightpelvicfin2;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Browslope;
    private final AdvancedModelRenderer Browslope_r1;
    private final AdvancedModelRenderer Noseslope;
    private final AdvancedModelRenderer Noseslope_r1;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Upperteeth;
    private final AdvancedModelRenderer Leftupperlip;
    private final AdvancedModelRenderer Rightupperlip;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Chin;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Lowerteeth;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Lefteyepupil;
    private final AdvancedModelRenderer Lefteyewhite1;
    private final AdvancedModelRenderer Lefteyewhite2;
    private final AdvancedModelRenderer Lefteyewhite3;
    private final AdvancedModelRenderer Lefteyewhite4;
    private final AdvancedModelRenderer Righteyepupil;
    private final AdvancedModelRenderer Righteyewhite1;
    private final AdvancedModelRenderer Righteyewhite2;
    private final AdvancedModelRenderer Righteyewhite3;
    private final AdvancedModelRenderer Righteyewhite4;
    private final AdvancedModelRenderer Bellyfront;
    private final AdvancedModelRenderer Bodyfrontslope;
    private final AdvancedModelRenderer Bodyfrontslope_r1;
    private final AdvancedModelRenderer Bodyfrontslope2;
    private final AdvancedModelRenderer Bodyfrontslope_r2;
    private final AdvancedModelRenderer Rightpectoralfin;
    private final AdvancedModelRenderer Leftpectoralfin;

    public ModelScheenstia() {
        this.textureWidth = 75;
        this.textureHeight = 70;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 26.0F, 1.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -11.0F, -3.7F);
        this.root.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 20, 14, -2.0F, -2.5F, -6.0F, 4, 10, 6, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.25F, -0.8F);
        this.Bodyfront.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -2.5F, -3.0F, 0.0F, 5, 12, 8, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, 1.0F, 7.0F);
        this.Bodymiddle.addChild(Bodyend);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 14, 30, -2.0F, -2.5F, 0.0F, 4, 10, 6, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 2.0F, 5.5F);
        this.Bodyend.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 34, 30, -1.5F, -3.0F, 0.0F, 3, 6, 5, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.1F, 4.5F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 23, 53, -1.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.01F, -0.01F, 2.5F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 0, 54, -1.01F, -2.49F, 0.0F, 2, 5, 3, 0.01F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -2.8F, 2.1F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.4245F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 44, 35, -0.5F, 0.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.Tailfin = new AdvancedModelRenderer(this);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend.addChild(Tailfin);
        this.setRotateAngle(Tailfin, -0.4245F, 0.0F, 0.0F);
        this.Tailfin.cubeList.add(new ModelBox(Tailfin, 0, 10, 0.0F, -4.0F, 0.0F, 0, 12, 10, 0.0F, false));

        this.Tailendflesh = new AdvancedModelRenderer(this);
        this.Tailendflesh.setRotationPoint(-0.01F, 2.0F, 3.6F);
        this.Tailend.addChild(Tailendflesh);
        this.setRotateAngle(Tailendflesh, 0.5732F, 0.0F, 0.0F);
        this.Tailendflesh.cubeList.add(new ModelBox(Tailendflesh, 12, 46, -0.5F, -2.0F, -6.0F, 1, 2, 6, 0.0F, false));

        this.Tailbaseslope = new AdvancedModelRenderer(this);
        this.Tailbaseslope.setRotationPoint(0.0F, -4.5F, 0.1F);
        this.Tailbase.addChild(Tailbaseslope);
        this.setRotateAngle(Tailbaseslope, -0.306F, 0.0F, 0.0F);
        this.Tailbaseslope.cubeList.add(new ModelBox(Tailbaseslope, 37, 50, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Dorsalfinend = new AdvancedModelRenderer(this);
        this.Dorsalfinend.setRotationPoint(0.0F, 1.4F, 0.5F);
        this.Tailbaseslope.addChild(Dorsalfinend);
        this.setRotateAngle(Dorsalfinend, 0.306F, 0.0F, 0.0F);
        this.Dorsalfinend.cubeList.add(new ModelBox(Dorsalfinend, 0, 42, 0.0F, -6.0F, 0.0F, 0, 6, 6, 0.0F, false));

        this.Tailbaseunderside = new AdvancedModelRenderer(this);
        this.Tailbaseunderside.setRotationPoint(0.0F, 3.0F, 4.6F);
        this.Tailbase.addChild(Tailbaseunderside);
        this.setRotateAngle(Tailbaseunderside, 0.5095F, 0.0F, 0.0F);
        this.Tailbaseunderside.cubeList.add(new ModelBox(Tailbaseunderside, 45, 25, -1.0F, -3.0F, -5.0F, 2, 3, 5, 0.0F, false));

        this.Analfin = new AdvancedModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Tailbaseunderside.addChild(Analfin);
        this.setRotateAngle(Analfin, -0.8702F, 0.0F, 0.0F);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 0, 25, 0.0F, -5.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.Bodyendslope = new AdvancedModelRenderer(this);
        this.Bodyendslope.setRotationPoint(0.0F, -4.1F, 0.1F);
        this.Bodyend.addChild(Bodyendslope);
        this.setRotateAngle(Bodyendslope, -0.2721F, 0.0F, 0.0F);
        this.Bodyendslope.cubeList.add(new ModelBox(Bodyendslope, 0, 40, -1.5F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.Dorsalfinstart = new AdvancedModelRenderer(this);
        this.Dorsalfinstart.setRotationPoint(0.0F, 0.3F, 2.35F);
        this.Bodyendslope.addChild(Dorsalfinstart);
        this.setRotateAngle(Dorsalfinstart, 0.2721F, 0.0F, 0.0F);
        this.Dorsalfinstart.cubeList.add(new ModelBox(Dorsalfinstart, 0, 0, -0.01F, -2.2F, 0.0F, 0, 4, 4, 0.0F, false));

        this.Bodyendunderside = new AdvancedModelRenderer(this);
        this.Bodyendunderside.setRotationPoint(0.0F, 7.5F, 6.0F);
        this.Bodyend.addChild(Bodyendunderside);
        this.setRotateAngle(Bodyendunderside, 0.0834F, 0.0F, 0.0F);
        this.Bodyendunderside.cubeList.add(new ModelBox(Bodyendunderside, 44, 0, -1.5F, -1.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.Bodymiddlehump = new AdvancedModelRenderer(this);
        this.Bodymiddlehump.setRotationPoint(0.0F, -4.0F, 0.01F);
        this.Bodymiddle.addChild(Bodymiddlehump);
        this.Bodymiddlehump.cubeList.add(new ModelBox(Bodymiddlehump, 52, 33, -2.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.Bodymiddleslope = new AdvancedModelRenderer(this);
        this.Bodymiddleslope.setRotationPoint(0.01F, 0.0F, 4.0F);
        this.Bodymiddlehump.addChild(Bodymiddleslope);
        this.setRotateAngle(Bodymiddleslope, -0.2546F, 0.0F, 0.0F);


        this.Bodymiddleslope_r1 = new AdvancedModelRenderer(this);
        this.Bodymiddleslope_r1.setRotationPoint(-0.01F, 0.0F, 4.2F);
        this.Bodymiddleslope.addChild(Bodymiddleslope_r1);
        this.setRotateAngle(Bodymiddleslope_r1, 0.0567F, 0.0F, 0.0F);
        this.Bodymiddleslope_r1.cubeList.add(new ModelBox(Bodymiddleslope_r1, 42, 43, -2.0F, 0.0F, -5.2F, 4, 2, 5, 0.01F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(-0.9F, 8.5F, 5.0F);
        this.Bodymiddle.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, -0.1911F, 0.0848F, 0.7641F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 18, 0, 0.0F, -0.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Rightpelvicfin2 = new AdvancedModelRenderer(this);
        this.Rightpelvicfin2.setRotationPoint(0.9F, 8.5F, 5.0F);
        this.Bodymiddle.addChild(Rightpelvicfin2);
        this.setRotateAngle(Rightpelvicfin2, -0.1911F, -0.0848F, -0.7641F);
        this.Rightpelvicfin2.cubeList.add(new ModelBox(Rightpelvicfin2, 18, 0, 0.0F, -0.5F, 0.0F, 0, 3, 4, 0.0F, true));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.5F, -5.3F);
        this.Bodyfront.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 26, 0, -2.5F, -2.0F, -4.5F, 5, 6, 4, 0.0F, false));

        this.Browslope = new AdvancedModelRenderer(this);
        this.Browslope.setRotationPoint(0.0F, -2.0F, -4.5F);
        this.Head.addChild(Browslope);
        this.setRotateAngle(Browslope, 0.5519F, 0.0F, 0.0F);


        this.Browslope_r1 = new AdvancedModelRenderer(this);
        this.Browslope_r1.setRotationPoint(0.0F, 2.0F, -1.0F);
        this.Browslope.addChild(Browslope_r1);
        this.setRotateAngle(Browslope_r1, 0.1745F, 0.0F, 0.0F);
        this.Browslope_r1.cubeList.add(new ModelBox(Browslope_r1, 53, 15, -2.0F, -1.8F, -0.875F, 4, 4, 2, 0.0F, false));

        this.Noseslope = new AdvancedModelRenderer(this);
        this.Noseslope.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.Browslope.addChild(Noseslope);
        this.setRotateAngle(Noseslope, 0.4245F, 0.0F, 0.0F);


        this.Noseslope_r1 = new AdvancedModelRenderer(this);
        this.Noseslope_r1.setRotationPoint(0.0F, 0.2672F, -1.7669F);
        this.Noseslope.addChild(Noseslope_r1);
        this.setRotateAngle(Noseslope_r1, -0.0873F, 0.0F, 0.0F);
        this.Noseslope_r1.cubeList.add(new ModelBox(Noseslope_r1, 20, 46, -1.5F, -0.0178F, 0.0348F, 3, 4, 2, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.01F, 2.0F, -4.125F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, -0.1274F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 26, 48, -2.0F, -1.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.Upperteeth = new AdvancedModelRenderer(this);
        this.Upperteeth.setRotationPoint(0.0F, -0.97F, -2.7F);
        this.Upperjaw.addChild(Upperteeth);
        this.Upperteeth.cubeList.add(new ModelBox(Upperteeth, 40, 0, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Leftupperlip = new AdvancedModelRenderer(this);
        this.Leftupperlip.setRotationPoint(-1.65F, 0.0F, -2.6F);
        this.Upperjaw.addChild(Leftupperlip);
        this.setRotateAngle(Leftupperlip, -0.7854F, -0.1274F, -0.1274F);
        this.Leftupperlip.cubeList.add(new ModelBox(Leftupperlip, 4, 0, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Rightupperlip = new AdvancedModelRenderer(this);
        this.Rightupperlip.setRotationPoint(1.61F, 0.0F, -2.6F);
        this.Upperjaw.addChild(Rightupperlip);
        this.setRotateAngle(Rightupperlip, -0.7854F, 0.1274F, 0.1274F);
        this.Rightupperlip.cubeList.add(new ModelBox(Rightupperlip, 0, 0, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.0F, -4.1F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, 0.3927F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 48, 7, -2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.Chin = new AdvancedModelRenderer(this);
        this.Chin.setRotationPoint(-0.01F, 1.0F, -2.5F);
        this.Lowerjaw.addChild(Chin);
        this.setRotateAngle(Chin, -0.3396F, 0.0F, 0.0F);
        this.Chin.cubeList.add(new ModelBox(Chin, 26, 10, -1.99F, -1.0F, 0.0F, 4, 1, 3, -0.01F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.0F, -1.1F);
        this.Lowerjaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.4671F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 0, 37, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Lowerteeth = new AdvancedModelRenderer(this);
        this.Lowerteeth.setRotationPoint(0.0F, 0.97F, -2.7F);
        this.Lowerjaw.addChild(Lowerteeth);
        this.Lowerteeth.cubeList.add(new ModelBox(Lowerteeth, 34, 17, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -2.0F, -4.49F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.4245F, 0.0F, 0.0F);


        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, 1.5F, 2.475F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.0131F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 40, 17, -1.99F, -1.5F, -2.725F, 4, 3, 5, -0.01F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.01F, 4.0F, -4.5F);
        this.Head.addChild(Throat);
        this.setRotateAngle(Throat, -0.4245F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 29, 41, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.Lefteyepupil = new AdvancedModelRenderer(this);
        this.Lefteyepupil.setRotationPoint(-1.6F, 0.0F, -3.7F);
        this.Head.addChild(Lefteyepupil);
        this.Lefteyepupil.cubeList.add(new ModelBox(Lefteyepupil, 0, 0, -1.0F, -0.5F, -0.25F, 1, 1, 1, 0.0F, false));

        this.Lefteyewhite1 = new AdvancedModelRenderer(this);
        this.Lefteyewhite1.setRotationPoint(0.05F, -0.25F, 0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite1);


        this.Lefteyewhite2 = new AdvancedModelRenderer(this);
        this.Lefteyewhite2.setRotationPoint(0.05F, -0.25F, -0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite2);
        this.setRotateAngle(Lefteyewhite2, 0.0F, 0.0F, 0.0017F);


        this.Lefteyewhite3 = new AdvancedModelRenderer(this);
        this.Lefteyewhite3.setRotationPoint(0.05F, 0.25F, -0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite3);
        this.setRotateAngle(Lefteyewhite3, 0.0F, 0.0017F, 0.0F);


        this.Lefteyewhite4 = new AdvancedModelRenderer(this);
        this.Lefteyewhite4.setRotationPoint(0.05F, 0.25F, 0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite4);
        this.setRotateAngle(Lefteyewhite4, 0.0F, 0.0017F, 0.0F);


        this.Righteyepupil = new AdvancedModelRenderer(this);
        this.Righteyepupil.setRotationPoint(1.6F, 0.0F, -3.7F);
        this.Head.addChild(Righteyepupil);
        this.Righteyepupil.cubeList.add(new ModelBox(Righteyepupil, 0, 0, 0.0F, -0.5F, -0.25F, 1, 1, 1, 0.0F, true));

        this.Righteyewhite1 = new AdvancedModelRenderer(this);
        this.Righteyewhite1.setRotationPoint(-0.05F, -0.25F, 0.25F);
        this.Righteyepupil.addChild(Righteyewhite1);


        this.Righteyewhite2 = new AdvancedModelRenderer(this);
        this.Righteyewhite2.setRotationPoint(-0.05F, -0.25F, -0.25F);
        this.Righteyepupil.addChild(Righteyewhite2);
        this.setRotateAngle(Righteyewhite2, 0.0F, 0.0F, 0.0017F);


        this.Righteyewhite3 = new AdvancedModelRenderer(this);
        this.Righteyewhite3.setRotationPoint(-0.05F, 0.25F, -0.25F);
        this.Righteyepupil.addChild(Righteyewhite3);
        this.setRotateAngle(Righteyewhite3, 0.0F, 0.0017F, 0.0F);


        this.Righteyewhite4 = new AdvancedModelRenderer(this);
        this.Righteyewhite4.setRotationPoint(-0.05F, 0.25F, 0.25F);
        this.Righteyepupil.addChild(Righteyewhite4);
        this.setRotateAngle(Righteyewhite4, 0.0F, 0.0017F, 0.0F);


        this.Bellyfront = new AdvancedModelRenderer(this);
        this.Bellyfront.setRotationPoint(-0.01F, 7.5F, -6.0F);
        this.Bodyfront.addChild(Bellyfront);
        this.setRotateAngle(Bellyfront, -0.1911F, 0.0F, 0.0F);
        this.Bellyfront.cubeList.add(new ModelBox(Bellyfront, 34, 10, -1.99F, -1.0F, 0.0F, 4, 1, 6, -0.01F, false));

        this.Bodyfrontslope = new AdvancedModelRenderer(this);
        this.Bodyfrontslope.setRotationPoint(0.0F, -4.2F, -0.2F);
        this.Bodyfront.addChild(Bodyfrontslope);
        this.setRotateAngle(Bodyfrontslope, 0.2972F, 0.0F, 0.0F);


        this.Bodyfrontslope_r1 = new AdvancedModelRenderer(this);
        this.Bodyfrontslope_r1.setRotationPoint(0.0F, 1.0F, -3.0F);
        this.Bodyfrontslope.addChild(Bodyfrontslope_r1);
        this.setRotateAngle(Bodyfrontslope_r1, 0.096F, 0.0F, 0.0F);
        this.Bodyfrontslope_r1.cubeList.add(new ModelBox(Bodyfrontslope_r1, 51, 50, -1.5F, -1.3F, -3.375F, 3, 2, 4, -0.01F, false));

        this.Bodyfrontslope2 = new AdvancedModelRenderer(this);
        this.Bodyfrontslope2.setRotationPoint(0.0F, -3.0531F, -1.5028F);
        this.Bodyfront.addChild(Bodyfrontslope2);
        this.setRotateAngle(Bodyfrontslope2, 0.1745F, 0.0F, 0.0F);


        this.Bodyfrontslope_r2 = new AdvancedModelRenderer(this);
        this.Bodyfrontslope_r2.setRotationPoint(0.0F, 0.0531F, 0.5028F);
        this.Bodyfrontslope2.addChild(Bodyfrontslope_r2);
        this.setRotateAngle(Bodyfrontslope_r2, 0.0436F, 0.0F, 0.0F);
        this.Bodyfrontslope_r2.cubeList.add(new ModelBox(Bodyfrontslope_r2, 18, 0, -1.5F, -1.075F, -1.5F, 3, 2, 2, 0.0F, false));

        this.Rightpectoralfin = new AdvancedModelRenderer(this);
        this.Rightpectoralfin.setRotationPoint(-2.0F, 5.5F, -5.0F);
        this.Bodyfront.addChild(Rightpectoralfin);
        this.setRotateAngle(Rightpectoralfin, -0.2759F, -0.3609F, 0.1485F);
        this.Rightpectoralfin.cubeList.add(new ModelBox(Rightpectoralfin, 28, 25, 0.0F, -2.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Leftpectoralfin = new AdvancedModelRenderer(this);
        this.Leftpectoralfin.setRotationPoint(2.0F, 5.5F, -5.0F);
        this.Bodyfront.addChild(Leftpectoralfin);
        this.setRotateAngle(Leftpectoralfin, -0.2759F, 0.3609F, -0.1485F);
        this.Leftpectoralfin.cubeList.add(new ModelBox(Leftpectoralfin, 28, 25, 0.0F, -2.0F, 0.0F, 0, 5, 5, 0.0F, true));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5);
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.8F;
        this.root.offsetX = 0.0F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Bodyend, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, -0.6F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(Lowerjaw, 0.05F, 0.0F, 0.0F);
        this.root.offsetY = -0.17F;
        this.root.offsetX = -0.03F;
        this.root.offsetZ = -0.1F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Bodyend, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Tailbase, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(Tailmiddlebase, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(Tailend, 0.0F, -0.6F, 0.0F);
        this.root.offsetY = -0.14F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        this.Bodyfront.offsetY = 1.4F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodyend, this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.6F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.15F, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);

            this.walk(Rightpelvicfin2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpelvicfin2, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Bodyfront, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 2.1F;
                this.bob(Bodyfront, -speed*0.8F, 5F, false, f2, 1);
            }
        }
    }
}
