package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLepidotes extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer Rightpelvicfin;
    private final AdvancedModelRenderer Leftpelvicfin;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Browslope;
    private final AdvancedModelRenderer Noseslope;
    private final AdvancedModelRenderer Upperjaw;
    private final AdvancedModelRenderer Upperteeth;
    private final AdvancedModelRenderer Leftupperlip;
    private final AdvancedModelRenderer Rightupperlip;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Chin;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Lowerteeth;
    private final AdvancedModelRenderer Headslope;
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
    private final AdvancedModelRenderer Leftpectoralfin;
    private final AdvancedModelRenderer Rightpectoralfin;

    public ModelLepidotes() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 13.0F, -8.7F);
        this.root.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 0, 15, -2.0F, -2.5F, -6.0F, 4, 10, 6, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -0.25F, -0.8F);
        this.Bodyfront.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 49, -2.5F, -3.0F, 0.0F, 5, 12, 8, 0.0F, false));

        this.Bodyend = new AdvancedModelRenderer(this);
        this.Bodyend.setRotationPoint(0.0F, 1.0F, 7.0F);
        this.Bodymiddle.addChild(Bodyend);
        this.Bodyend.cubeList.add(new ModelBox(Bodyend, 0, 84, -2.0F, -2.5F, 0.0F, 4, 10, 6, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, 2.0F, 5.5F);
        this.Bodyend.addChild(Tailbase);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 19, 45, -1.5F, -3.0F, 0.0F, 3, 6, 5, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, -0.1F, 4.5F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 18, 70, -1.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.01F, -0.01F, 2.5F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 27, 61, -1.0F, -2.5F, 0.0F, 2, 5, 3, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -2.8F, 2.1F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.4245F, 0.0F, 0.0F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 40, 92, -0.5F, 0.0F, -1.0F, 1, 2, 6, 0.0F, false));

        this.Tailfin = new AdvancedModelRenderer(this);
        this.Tailfin.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Tailend.addChild(Tailfin);
        this.setRotateAngle(Tailfin, -0.4245F, 0.0F, 0.0F);
        this.Tailfin.cubeList.add(new ModelBox(Tailfin, 44, 20, 0.0F, -4.0F, 0.0F, 0, 12, 10, 0.0F, false));

        this.Tailendflesh = new AdvancedModelRenderer(this);
        this.Tailendflesh.setRotationPoint(-0.01F, 2.0F, 3.6F);
        this.Tailend.addChild(Tailendflesh);
        this.setRotateAngle(Tailendflesh, 0.5732F, 0.0F, 0.0F);
        this.Tailendflesh.cubeList.add(new ModelBox(Tailendflesh, 49, 89, -0.5F, -2.0F, -6.0F, 1, 2, 6, 0.0F, false));

        this.Tailbaseslope = new AdvancedModelRenderer(this);
        this.Tailbaseslope.setRotationPoint(0.0F, -4.5F, 0.1F);
        this.Tailbase.addChild(Tailbaseslope);
        this.setRotateAngle(Tailbaseslope, -0.306F, 0.0F, 0.0F);
        this.Tailbaseslope.cubeList.add(new ModelBox(Tailbaseslope, 20, 37, -1.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.Dorsalfinend = new AdvancedModelRenderer(this);
        this.Dorsalfinend.setRotationPoint(0.0F, 1.4F, 0.5F);
        this.Tailbaseslope.addChild(Dorsalfinend);
        this.setRotateAngle(Dorsalfinend, 0.306F, 0.0F, 0.0F);
        this.Dorsalfinend.cubeList.add(new ModelBox(Dorsalfinend, 31, 17, 0.0F, -6.0F, 0.0F, 0, 6, 6, 0.0F, false));

        this.Tailbaseunderside = new AdvancedModelRenderer(this);
        this.Tailbaseunderside.setRotationPoint(0.0F, 3.0F, 4.6F);
        this.Tailbase.addChild(Tailbaseunderside);
        this.setRotateAngle(Tailbaseunderside, 0.5095F, 0.0F, 0.0F);
        this.Tailbaseunderside.cubeList.add(new ModelBox(Tailbaseunderside, 31, 40, -1.0F, -3.0F, -5.0F, 2, 3, 5, 0.0F, false));

        this.Analfin = new AdvancedModelRenderer(this);
        this.Analfin.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Tailbaseunderside.addChild(Analfin);
        this.setRotateAngle(Analfin, -0.8702F, 0.0F, 0.0F);
        this.Analfin.cubeList.add(new ModelBox(Analfin, 18, 6, 0.0F, -5.0F, 0.0F, 0, 5, 7, 0.0F, false));

        this.Bodyendslope = new AdvancedModelRenderer(this);
        this.Bodyendslope.setRotationPoint(0.0F, -4.1F, 0.1F);
        this.Bodyend.addChild(Bodyendslope);
        this.setRotateAngle(Bodyendslope, -0.2721F, 0.0F, 0.0F);
        this.Bodyendslope.cubeList.add(new ModelBox(Bodyendslope, 21, 92, -1.5F, 0.0F, 0.0F, 3, 2, 6, 0.0F, false));

        this.Dorsalfinstart = new AdvancedModelRenderer(this);
        this.Dorsalfinstart.setRotationPoint(0.0F, 0.3F, 2.35F);
        this.Bodyendslope.addChild(Dorsalfinstart);
        this.setRotateAngle(Dorsalfinstart, 0.2721F, 0.0F, 0.0F);
        this.Dorsalfinstart.cubeList.add(new ModelBox(Dorsalfinstart, 22, 21, -0.01F, -2.2F, 0.0F, 0, 4, 4, 0.0F, false));

        this.Bodyendunderside = new AdvancedModelRenderer(this);
        this.Bodyendunderside.setRotationPoint(0.0F, 7.5F, 6.0F);
        this.Bodyend.addChild(Bodyendunderside);
        this.setRotateAngle(Bodyendunderside, 0.0834F, 0.0F, 0.0F);
        this.Bodyendunderside.cubeList.add(new ModelBox(Bodyendunderside, 21, 84, -1.5F, -1.0F, -6.0F, 3, 1, 6, 0.0F, false));

        this.Bodymiddlehump = new AdvancedModelRenderer(this);
        this.Bodymiddlehump.setRotationPoint(0.0F, -4.0F, 0.01F);
        this.Bodymiddle.addChild(Bodymiddlehump);
        this.Bodymiddlehump.cubeList.add(new ModelBox(Bodymiddlehump, 0, 70, -2.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.Bodymiddleslope = new AdvancedModelRenderer(this);
        this.Bodymiddleslope.setRotationPoint(0.01F, 0.0F, 4.0F);
        this.Bodymiddlehump.addChild(Bodymiddleslope);
        this.setRotateAngle(Bodymiddleslope, -0.2546F, 0.0F, 0.0F);
        this.Bodymiddleslope.cubeList.add(new ModelBox(Bodymiddleslope, 0, 77, -2.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

        this.Rightpelvicfin = new AdvancedModelRenderer(this);
        this.Rightpelvicfin.setRotationPoint(-0.9F, 8.5F, 5.0F);
        this.Bodymiddle.addChild(Rightpelvicfin);
        this.setRotateAngle(Rightpelvicfin, -0.1911F, 0.0848F, 0.7641F);
        this.Rightpelvicfin.cubeList.add(new ModelBox(Rightpelvicfin, 27, 4, 0.0F, -0.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Leftpelvicfin = new AdvancedModelRenderer(this);
        this.Leftpelvicfin.setRotationPoint(0.9F, 8.5F, 5.0F);
        this.Bodymiddle.addChild(Leftpelvicfin);
        this.setRotateAngle(Leftpelvicfin, -0.1911F, -0.0848F, -0.7641F);
        this.Leftpelvicfin.cubeList.add(new ModelBox(Leftpelvicfin, 18, 4, 0.0F, -0.5F, 0.0F, 0, 3, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.5F, -5.8F);
        this.Bodyfront.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 80, 89, -2.5F, -2.0F, -4.5F, 5, 6, 5, 0.0F, false));

        this.Browslope = new AdvancedModelRenderer(this);
        this.Browslope.setRotationPoint(0.0F, -2.0F, -4.5F);
        this.Head.addChild(Browslope);
        this.setRotateAngle(Browslope, 0.5519F, 0.0F, 0.0F);
        this.Browslope.cubeList.add(new ModelBox(Browslope, 88, 82, -2.0F, 0.0F, -2.0F, 4, 4, 2, 0.0F, false));

        this.Noseslope = new AdvancedModelRenderer(this);
        this.Noseslope.setRotationPoint(-0.01F, 0.0F, -2.0F);
        this.Browslope.addChild(Noseslope);
        this.setRotateAngle(Noseslope, 0.4245F, 0.0F, 0.0F);
        this.Noseslope.cubeList.add(new ModelBox(Noseslope, 90, 64, -1.5F, 0.0F, -2.0F, 3, 4, 2, 0.0F, false));

        this.Upperjaw = new AdvancedModelRenderer(this);
        this.Upperjaw.setRotationPoint(0.01F, 2.0F, -4.5F);
        this.Head.addChild(Upperjaw);
        this.setRotateAngle(Upperjaw, -0.1274F, 0.0F, 0.0F);
        this.Upperjaw.cubeList.add(new ModelBox(Upperjaw, 63, 95, -2.0F, -1.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.Upperteeth = new AdvancedModelRenderer(this);
        this.Upperteeth.setRotationPoint(0.0F, -0.97F, -2.7F);
        this.Upperjaw.addChild(Upperteeth);
        this.Upperteeth.cubeList.add(new ModelBox(Upperteeth, 79, 67, -1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Leftupperlip = new AdvancedModelRenderer(this);
        this.Leftupperlip.setRotationPoint(-1.65F, 0.0F, -2.6F);
        this.Upperjaw.addChild(Leftupperlip);
        this.setRotateAngle(Leftupperlip, -0.7854F, -0.1274F, -0.1274F);
        this.Leftupperlip.cubeList.add(new ModelBox(Leftupperlip, 75, 64, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Rightupperlip = new AdvancedModelRenderer(this);
        this.Rightupperlip.setRotationPoint(1.61F, 0.0F, -2.6F);
        this.Upperjaw.addChild(Rightupperlip);
        this.setRotateAngle(Rightupperlip, -0.7854F, 0.1274F, 0.1274F);
        this.Rightupperlip.cubeList.add(new ModelBox(Rightupperlip, 73, 67, 0.0F, -2.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.0F, -4.5F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.1274F, 0.0F, 0.0F);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 84, 76, -2.0F, 0.0F, -3.0F, 4, 1, 4, 0.0F, false));

        this.Chin = new AdvancedModelRenderer(this);
        this.Chin.setRotationPoint(-0.01F, 1.0F, -2.5F);
        this.Lowerjaw.addChild(Chin);
        this.setRotateAngle(Chin, -0.3396F, 0.0F, 0.0F);
        this.Chin.cubeList.add(new ModelBox(Chin, 86, 71, -2.0F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.0F, -1.1F);
        this.Lowerjaw.addChild(Masseter);
        this.setRotateAngle(Masseter, -0.4671F, 0.0F, 0.0F);
        this.Masseter.cubeList.add(new ModelBox(Masseter, 81, 62, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Lowerteeth = new AdvancedModelRenderer(this);
        this.Lowerteeth.setRotationPoint(0.0F, 0.97F, -2.7F);
        this.Lowerjaw.addChild(Lowerteeth);
        this.Lowerteeth.cubeList.add(new ModelBox(Lowerteeth, 75, 71, -1.5F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(-0.01F, -2.0F, -4.49F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.4245F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 66, 85, -2.0F, 0.0F, 0.0F, 4, 3, 5, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.01F, 4.0F, -4.5F);
        this.Head.addChild(Throat);
        this.setRotateAngle(Throat, -0.4245F, 0.0F, 0.0F);
        this.Throat.cubeList.add(new ModelBox(Throat, 70, 77, -2.0F, -2.0F, 0.0F, 4, 2, 5, 0.0F, false));

        this.Lefteyepupil = new AdvancedModelRenderer(this);
        this.Lefteyepupil.setRotationPoint(-1.6F, 0.0F, -3.7F);
        this.Head.addChild(Lefteyepupil);
        this.Lefteyepupil.cubeList.add(new ModelBox(Lefteyepupil, 4, 3, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Lefteyewhite1 = new AdvancedModelRenderer(this);
        this.Lefteyewhite1.setRotationPoint(0.05F, -0.25F, 0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite1);
        this.Lefteyewhite1.cubeList.add(new ModelBox(Lefteyewhite1, 1, 1, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Lefteyewhite2 = new AdvancedModelRenderer(this);
        this.Lefteyewhite2.setRotationPoint(0.05F, -0.25F, -0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite2);
        this.setRotateAngle(Lefteyewhite2, 0.0F, 0.0F, 0.0017F);
        this.Lefteyewhite2.cubeList.add(new ModelBox(Lefteyewhite2, 7, 1, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.01F, false));

        this.Lefteyewhite3 = new AdvancedModelRenderer(this);
        this.Lefteyewhite3.setRotationPoint(0.05F, 0.25F, -0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite3);
        this.setRotateAngle(Lefteyewhite3, 0.0F, 0.0017F, 0.0F);
        this.Lefteyewhite3.cubeList.add(new ModelBox(Lefteyewhite3, 7, 5, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Lefteyewhite4 = new AdvancedModelRenderer(this);
        this.Lefteyewhite4.setRotationPoint(0.05F, 0.25F, 0.25F);
        this.Lefteyepupil.addChild(Lefteyewhite4);
        this.setRotateAngle(Lefteyewhite4, 0.0F, 0.0017F, 0.0F);
        this.Lefteyewhite4.cubeList.add(new ModelBox(Lefteyewhite4, 1, 5, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Righteyepupil = new AdvancedModelRenderer(this);
        this.Righteyepupil.setRotationPoint(1.6F, 0.0F, -3.7F);
        this.Head.addChild(Righteyepupil);
        this.Righteyepupil.cubeList.add(new ModelBox(Righteyepupil, 4, 10, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Righteyewhite1 = new AdvancedModelRenderer(this);
        this.Righteyewhite1.setRotationPoint(-0.05F, -0.25F, 0.25F);
        this.Righteyepupil.addChild(Righteyewhite1);
        this.Righteyewhite1.cubeList.add(new ModelBox(Righteyewhite1, 1, 8, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Righteyewhite2 = new AdvancedModelRenderer(this);
        this.Righteyewhite2.setRotationPoint(-0.05F, -0.25F, -0.25F);
        this.Righteyepupil.addChild(Righteyewhite2);
        this.setRotateAngle(Righteyewhite2, 0.0F, 0.0F, 0.0017F);
        this.Righteyewhite2.cubeList.add(new ModelBox(Righteyewhite2, 7, 8, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.01F, false));

        this.Righteyewhite3 = new AdvancedModelRenderer(this);
        this.Righteyewhite3.setRotationPoint(-0.05F, 0.25F, -0.25F);
        this.Righteyepupil.addChild(Righteyewhite3);
        this.setRotateAngle(Righteyewhite3, 0.0F, 0.0017F, 0.0F);
        this.Righteyewhite3.cubeList.add(new ModelBox(Righteyewhite3, 7, 12, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Righteyewhite4 = new AdvancedModelRenderer(this);
        this.Righteyewhite4.setRotationPoint(-0.05F, 0.25F, 0.25F);
        this.Righteyepupil.addChild(Righteyewhite4);
        this.setRotateAngle(Righteyewhite4, 0.0F, 0.0017F, 0.0F);
        this.Righteyewhite4.cubeList.add(new ModelBox(Righteyewhite4, 1, 12, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.Bellyfront = new AdvancedModelRenderer(this);
        this.Bellyfront.setRotationPoint(-0.01F, 7.5F, -6.0F);
        this.Bodyfront.addChild(Bellyfront);
        this.setRotateAngle(Bellyfront, -0.1911F, 0.0F, 0.0F);
        this.Bellyfront.cubeList.add(new ModelBox(Bellyfront, 0, 32, -2.0F, -1.0F, 0.0F, 4, 1, 6, 0.0F, false));

        this.Bodyfrontslope = new AdvancedModelRenderer(this);
        this.Bodyfrontslope.setRotationPoint(0.0F, -4.2F, -0.2F);
        this.Bodyfront.addChild(Bodyfrontslope);
        this.setRotateAngle(Bodyfrontslope, 0.2972F, 0.0F, 0.0F);
        this.Bodyfrontslope.cubeList.add(new ModelBox(Bodyfrontslope, 0, 40, -1.5F, 0.0F, -6.0F, 3, 2, 6, 0.0F, false));

        this.Leftpectoralfin = new AdvancedModelRenderer(this);
        this.Leftpectoralfin.setRotationPoint(-2.0F, 5.5F, -5.0F);
        this.Bodyfront.addChild(Leftpectoralfin);
        this.setRotateAngle(Leftpectoralfin, -0.2759F, -0.3609F, 0.1485F);
        this.Leftpectoralfin.cubeList.add(new ModelBox(Leftpectoralfin, 37, 8, 0.0F, -2.0F, 0.0F, 0, 5, 5, 0.0F, false));

        this.Rightpectoralfin = new AdvancedModelRenderer(this);
        this.Rightpectoralfin.setRotationPoint(2.0F, 5.5F, -5.0F);
        this.Bodyfront.addChild(Rightpectoralfin);
        this.setRotateAngle(Rightpectoralfin, -0.2759F, 0.3609F, -0.1485F);
        this.Rightpectoralfin.cubeList.add(new ModelBox(Rightpectoralfin, 37, 2, 0.0F, -2.0F, 0.0F, 0, 5, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Bodyfront.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {

    }

    public void renderStaticWall(float f) {
        this.Bodyfront.rotateAngleY = (float) Math.toRadians(90);
        this.Bodyfront.offsetY = -0.13F;
        this.Bodyfront.offsetX = -0.06F;
        this.Bodyfront.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.Lowerjaw.rotateAngleX = (float) Math.toRadians(40.2);
        this.Bodymiddle.rotateAngleY = (float) Math.toRadians(10);
        this.Bodyend.rotateAngleY = (float) Math.toRadians(20);
        this.Tailbase.rotateAngleY = (float) Math.toRadians(12.5);
        this.Tailmiddlebase.rotateAngleY = (float) Math.toRadians(-17.5);
        this.Tailmiddleend.rotateAngleY = (float) Math.toRadians(-20);
        this.Tailend.rotateAngleY = (float) Math.toRadians(-18.2);
        this.setRotateAngle(Bodyfront, 0.7418F, (float) Math.toRadians(90), 0.0F);
        this.Bodyfront.offsetY = -0.2F;
        this.Bodyfront.offsetZ = 0.06F;
        this.Bodyfront.offsetX = -0.06F;
        this.Bodyfront.render(0.01F);
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
        this.Bodyfront.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Bodyend, this.Tailbase, this.Tailmiddlebase, this.Tailmiddleend, this.Tailend};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.15F, 0, f2, 1);
            this.walk(Lowerjaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);

            this.walk(Leftpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Leftpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(Rightpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(Rightpelvicfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Bodyfront, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Bodyfront.offsetY = 0.6F;
                this.bob(Bodyfront, -speed*0.8F, 5F, false, f2, 1);
            }
        }
    }
}
