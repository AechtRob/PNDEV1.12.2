package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonCaviramus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer hips_r1;
    private final AdvancedModelRenderer hips_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck11_r1;
    private final AdvancedModelRenderer neck12_r1;
    private final AdvancedModelRenderer neck11_r2;
    private final AdvancedModelRenderer neck10_r1;
    private final AdvancedModelRenderer neck10_r2;
    private final AdvancedModelRenderer neck11_r3;
    private final AdvancedModelRenderer neck10_r3;
    private final AdvancedModelRenderer chest_r1;
    private final AdvancedModelRenderer neck9_r1;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer chest_r2;
    private final AdvancedModelRenderer chest_r3;
    private final AdvancedModelRenderer chest_r4;
    private final AdvancedModelRenderer chest_r5;
    private final AdvancedModelRenderer chest_r6;
    private final AdvancedModelRenderer chest_r7;
    private final AdvancedModelRenderer chest_r8;
    private final AdvancedModelRenderer neck10_r4;
    private final AdvancedModelRenderer neck9_r2;
    private final AdvancedModelRenderer neck8_r1;
    private final AdvancedModelRenderer neck9_r3;
    private final AdvancedModelRenderer neck10_r5;
    private final AdvancedModelRenderer neck9_r4;
    private final AdvancedModelRenderer neck8_r2;
    private final AdvancedModelRenderer neck7_r1;
    private final AdvancedModelRenderer neck8_r3;
    private final AdvancedModelRenderer neck7_r2;
    private final AdvancedModelRenderer neck6_r1;
    private final AdvancedModelRenderer neck7_r3;
    private final AdvancedModelRenderer neck8_r4;
    private final AdvancedModelRenderer neck9_r5;
    private final AdvancedModelRenderer neck8_r5;
    private final AdvancedModelRenderer neck9_r6;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck6_r2;
    private final AdvancedModelRenderer neck5_r1;
    private final AdvancedModelRenderer neck4_r1;
    private final AdvancedModelRenderer neck5_r2;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck4_r2;
    private final AdvancedModelRenderer neck3_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw_r1;
    private final AdvancedModelRenderer jaw_r2;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerjawfronttip;
    private final AdvancedModelRenderer Chinkeel;
    private final AdvancedModelRenderer Leftlowerteeth;
    private final AdvancedModelRenderer Rightlowerteeth;
    private final AdvancedModelRenderer Lowerjawteeth;
    private final AdvancedModelRenderer Upperjawback;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Headslopefront;
    private final AdvancedModelRenderer Crest;
    private final AdvancedModelRenderer Leftupperteeth;
    private final AdvancedModelRenderer Rightupperteeth;
    private final AdvancedModelRenderer Headslopeback;
    private final AdvancedModelRenderer Upperjawteeth;
    private final AdvancedModelRenderer wing1R;
    private final AdvancedModelRenderer wing2R;
    private final AdvancedModelRenderer wing3R;
    private final AdvancedModelRenderer wing4R;
    private final AdvancedModelRenderer wing4R_r1;
    private final AdvancedModelRenderer handR;
    private final AdvancedModelRenderer handR_r1;
    private final AdvancedModelRenderer wing1R2;
    private final AdvancedModelRenderer wing2R2;
    private final AdvancedModelRenderer wing3R2;
    private final AdvancedModelRenderer wing4R2;
    private final AdvancedModelRenderer wing4R_r2;
    private final AdvancedModelRenderer handR2;
    private final AdvancedModelRenderer handR_r2;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer Rudder;
    private final AdvancedModelRenderer upperlegR;
    private final AdvancedModelRenderer lowerlegR;
    private final AdvancedModelRenderer footR;
    private final AdvancedModelRenderer upperlegR2;
    private final AdvancedModelRenderer lowerlegR2;
    private final AdvancedModelRenderer footR2;

    public ModelSkeletonCaviramus() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 10.1F, -1.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, 0.163F, -0.1131F, 0.6016F);
        this.hips.cubeList.add(new ModelBox(hips, 47, 28, 0.1773F, -0.0327F, 3.3827F, 1, 1, 5, 0.0F, false));

        this.hips_r1 = new AdvancedModelRenderer(this);
        this.hips_r1.setRotationPoint(0.0773F, -0.1327F, 5.5827F);
        this.hips.addChild(hips_r1);
        this.setRotateAngle(hips_r1, 0.0F, 0.0F, -0.1309F);
        this.hips_r1.cubeList.add(new ModelBox(hips_r1, 39, 12, -1.0F, 0.1F, -3.2F, 1, 1, 6, 0.0F, true));
        this.hips_r1.cubeList.add(new ModelBox(hips_r1, 37, 54, -1.0F, 1.1F, -1.2F, 1, 3, 3, 0.0F, true));

        this.hips_r2 = new AdvancedModelRenderer(this);
        this.hips_r2.setRotationPoint(1.2773F, -0.1327F, 5.5827F);
        this.hips.addChild(hips_r2);
        this.setRotateAngle(hips_r2, 0.0F, 0.0F, 0.1309F);
        this.hips_r2.cubeList.add(new ModelBox(hips_r2, 37, 54, 0.0F, 1.1F, -1.2F, 1, 3, 3, 0.0F, false));
        this.hips_r2.cubeList.add(new ModelBox(hips_r2, 39, 12, 0.0F, 0.1F, -3.2F, 1, 1, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.6773F, 0.2673F, 4.3827F);
        this.hips.addChild(body);
        this.setRotateAngle(body, -0.0966F, -0.1225F, 0.0988F);
        this.body.cubeList.add(new ModelBox(body, 37, 39, -0.5F, -0.2033F, -5.9556F, 1, 1, 6, 0.001F, false));

        this.neck11_r1 = new AdvancedModelRenderer(this);
        this.neck11_r1.setRotationPoint(-0.5F, 0.6012F, -4.3314F);
        this.body.addChild(neck11_r1);
        this.setRotateAngle(neck11_r1, 0.0302F, -0.0354F, 0.1566F);
        this.neck11_r1.cubeList.add(new ModelBox(neck11_r1, 7, 0, -2.0253F, 0.7433F, -0.4821F, 0, 2, 1, 0.0F, true));

        this.neck12_r1 = new AdvancedModelRenderer(this);
        this.neck12_r1.setRotationPoint(-0.5F, 0.3053F, -2.3534F);
        this.body.addChild(neck12_r1);
        this.setRotateAngle(neck12_r1, 0.1165F, -0.0488F, 0.1529F);
        this.neck12_r1.cubeList.add(new ModelBox(neck12_r1, 0, 12, -1.9614F, 1.135F, -0.4283F, 0, 1, 1, 0.0F, true));

        this.neck11_r2 = new AdvancedModelRenderer(this);
        this.neck11_r2.setRotationPoint(-0.5F, 0.3053F, -2.3534F);
        this.body.addChild(neck11_r2);
        this.setRotateAngle(neck11_r2, 0.0159F, -0.1253F, 1.202F);
        this.neck11_r2.cubeList.add(new ModelBox(neck11_r2, 0, 0, 0.0527F, -0.6702F, -0.4257F, 0, 3, 1, 0.0F, true));

        this.neck10_r1 = new AdvancedModelRenderer(this);
        this.neck10_r1.setRotationPoint(-0.5F, 0.6012F, -4.3314F);
        this.body.addChild(neck10_r1);
        this.setRotateAngle(neck10_r1, -0.0156F, -0.0438F, 1.2046F);
        this.neck10_r1.cubeList.add(new ModelBox(neck10_r1, 3, 0, -0.3189F, -0.8111F, -0.4709F, 0, 3, 1, 0.0F, true));

        this.neck10_r2 = new AdvancedModelRenderer(this);
        this.neck10_r2.setRotationPoint(0.5F, 0.3053F, -2.3534F);
        this.body.addChild(neck10_r2);
        this.setRotateAngle(neck10_r2, 0.0159F, 0.1253F, -1.202F);
        this.neck10_r2.cubeList.add(new ModelBox(neck10_r2, 0, 0, -0.0527F, -0.6702F, -0.4257F, 0, 3, 1, 0.0F, false));

        this.neck11_r3 = new AdvancedModelRenderer(this);
        this.neck11_r3.setRotationPoint(0.5F, 0.3053F, -2.3534F);
        this.body.addChild(neck11_r3);
        this.setRotateAngle(neck11_r3, 0.1165F, 0.0488F, -0.1529F);
        this.neck11_r3.cubeList.add(new ModelBox(neck11_r3, 0, 12, 1.9614F, 1.135F, -0.4283F, 0, 1, 1, 0.0F, false));

        this.neck10_r3 = new AdvancedModelRenderer(this);
        this.neck10_r3.setRotationPoint(0.5F, 0.6012F, -4.3314F);
        this.body.addChild(neck10_r3);
        this.setRotateAngle(neck10_r3, 0.0302F, 0.0354F, -0.1566F);
        this.neck10_r3.cubeList.add(new ModelBox(neck10_r3, 7, 0, 2.0253F, 0.7433F, -0.4821F, 0, 2, 1, 0.0F, false));

        this.chest_r1 = new AdvancedModelRenderer(this);
        this.chest_r1.setRotationPoint(0.0F, 5.0713F, -4.1199F);
        this.body.addChild(chest_r1);
        this.setRotateAngle(chest_r1, 0.1745F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 20, 13, -2.0F, 0.3095F, 2.8101F, 4, 0, 1, 0.0F, false));
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 34, 12, -2.0F, 0.3095F, 0.8101F, 4, 0, 1, 0.0F, false));

        this.neck9_r1 = new AdvancedModelRenderer(this);
        this.neck9_r1.setRotationPoint(0.5F, 0.6012F, -4.3314F);
        this.body.addChild(neck9_r1);
        this.setRotateAngle(neck9_r1, -0.0156F, 0.0438F, -1.2046F);
        this.neck9_r1.cubeList.add(new ModelBox(neck9_r1, 3, 0, 0.3189F, -0.8111F, -0.4709F, 0, 3, 1, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.3F, -5.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1263F, -0.0166F, 0.1299F);


        this.chest_r2 = new AdvancedModelRenderer(this);
        this.chest_r2.setRotationPoint(-2.0F, 0.4681F, -6.5192F);
        this.chest.addChild(chest_r2);
        this.setRotateAngle(chest_r2, 1.2402F, -0.4968F, 0.128F);
        this.chest_r2.cubeList.add(new ModelBox(chest_r2, 0, 55, -0.5553F, -0.533F, -3.5686F, 1, 2, 3, 0.0F, true));

        this.chest_r3 = new AdvancedModelRenderer(this);
        this.chest_r3.setRotationPoint(-2.0F, -0.1319F, -6.6192F);
        this.chest.addChild(chest_r3);
        this.setRotateAngle(chest_r3, 0.1498F, 0.0247F, 0.7851F);
        this.chest_r3.cubeList.add(new ModelBox(chest_r3, 0, 23, 0.243F, 0.233F, -0.2795F, 1, 2, 5, 0.0F, true));

        this.chest_r4 = new AdvancedModelRenderer(this);
        this.chest_r4.setRotationPoint(2.0F, 0.4681F, -6.5192F);
        this.chest.addChild(chest_r4);
        this.setRotateAngle(chest_r4, 1.2402F, 0.4968F, -0.128F);
        this.chest_r4.cubeList.add(new ModelBox(chest_r4, 0, 55, -0.4447F, -0.533F, -3.5686F, 1, 2, 3, 0.0F, false));

        this.chest_r5 = new AdvancedModelRenderer(this);
        this.chest_r5.setRotationPoint(2.0F, -0.1319F, -6.6192F);
        this.chest.addChild(chest_r5);
        this.setRotateAngle(chest_r5, 0.1498F, -0.0247F, -0.7851F);
        this.chest_r5.cubeList.add(new ModelBox(chest_r5, 0, 23, -1.243F, 0.233F, -0.2795F, 1, 2, 5, 0.0F, false));

        this.chest_r6 = new AdvancedModelRenderer(this);
        this.chest_r6.setRotationPoint(0.0F, 0.0681F, -6.615F);
        this.chest.addChild(chest_r6);
        this.setRotateAngle(chest_r6, -0.0349F, 0.0F, 0.0F);
        this.chest_r6.cubeList.add(new ModelBox(chest_r6, 15, 38, -0.5F, -0.2793F, -0.179F, 1, 1, 6, 0.0F, false));

        this.chest_r7 = new AdvancedModelRenderer(this);
        this.chest_r7.setRotationPoint(0.0F, 5.3713F, -4.1199F);
        this.chest.addChild(chest_r7);
        this.setRotateAngle(chest_r7, 0.0436F, 0.0F, 0.0F);
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 41, 20, -2.0F, 0.5276F, 3.1053F, 4, 0, 1, 0.0F, false));
        this.chest_r7.cubeList.add(new ModelBox(chest_r7, 55, 23, -2.0F, 0.5276F, 1.1053F, 4, 0, 1, 0.0F, false));

        this.chest_r8 = new AdvancedModelRenderer(this);
        this.chest_r8.setRotationPoint(0.0F, 4.5713F, -6.7199F);
        this.chest.addChild(chest_r8);
        this.setRotateAngle(chest_r8, -0.4363F, 0.0F, 0.0F);
        this.chest_r8.cubeList.add(new ModelBox(chest_r8, 0, 42, -2.0F, -0.8461F, -1.2002F, 4, 1, 4, 0.0F, false));

        this.neck10_r4 = new AdvancedModelRenderer(this);
        this.neck10_r4.setRotationPoint(-1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck10_r4);
        this.setRotateAngle(neck10_r4, 0.1133F, -0.0409F, -0.9156F);
        this.neck10_r4.cubeList.add(new ModelBox(neck10_r4, 12, 0, -5.5499F, 1.5419F, -0.5735F, 0, 2, 1, 0.0F, true));

        this.neck9_r2 = new AdvancedModelRenderer(this);
        this.neck9_r2.setRotationPoint(-1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck9_r2);
        this.setRotateAngle(neck9_r2, 0.1931F, 0.0629F, -0.9147F);
        this.neck9_r2.cubeList.add(new ModelBox(neck9_r2, 27, 9, -5.5341F, 1.2054F, -2.7975F, 0, 2, 1, 0.0F, true));

        this.neck8_r1 = new AdvancedModelRenderer(this);
        this.neck8_r1.setRotationPoint(-1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck8_r1);
        this.setRotateAngle(neck8_r1, 0.1462F, -0.1413F, 0.1596F);
        this.neck8_r1.cubeList.add(new ModelBox(neck8_r1, 47, 28, -1.5043F, 2.4906F, -2.7975F, 0, 3, 1, 0.0F, true));

        this.neck9_r3 = new AdvancedModelRenderer(this);
        this.neck9_r3.setRotationPoint(-1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck9_r3);
        this.setRotateAngle(neck9_r3, 0.016F, -0.1194F, 0.1766F);
        this.neck9_r3.cubeList.add(new ModelBox(neck9_r3, 8, 23, -1.2131F, 2.66F, -0.5735F, 0, 3, 1, 0.0F, true));

        this.neck10_r5 = new AdvancedModelRenderer(this);
        this.neck10_r5.setRotationPoint(-1.0F, 0.6623F, -1.2186F);
        this.chest.addChild(neck10_r5);
        this.setRotateAngle(neck10_r5, -0.0272F, -0.1116F, 0.1816F);
        this.neck10_r5.cubeList.add(new ModelBox(neck10_r5, 13, 6, -1.5171F, 0.9572F, -0.5286F, 0, 3, 1, 0.0F, true));

        this.neck9_r4 = new AdvancedModelRenderer(this);
        this.neck9_r4.setRotationPoint(-1.0F, 0.6623F, -1.2186F);
        this.chest.addChild(neck9_r4);
        this.setRotateAngle(neck9_r4, -0.1103F, -0.0323F, 1.229F);
        this.neck9_r4.cubeList.add(new ModelBox(neck9_r4, 0, 23, 0.1217F, -1.1461F, -0.5259F, 0, 3, 1, 0.0F, true));

        this.neck8_r2 = new AdvancedModelRenderer(this);
        this.neck8_r2.setRotationPoint(-1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck8_r2);
        this.setRotateAngle(neck8_r2, -0.0956F, -0.0734F, 1.2282F);
        this.neck8_r2.cubeList.add(new ModelBox(neck8_r2, 27, 4, 1.6542F, -0.5914F, -0.5735F, 0, 3, 1, 0.0F, true));

        this.neck7_r1 = new AdvancedModelRenderer(this);
        this.neck7_r1.setRotationPoint(-1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck7_r1);
        this.setRotateAngle(neck7_r1, -0.0509F, -0.1966F, 1.2222F);
        this.neck7_r1.cubeList.add(new ModelBox(neck7_r1, 44, 47, 1.3618F, -0.424F, -2.7975F, 0, 3, 1, 0.0F, true));

        this.neck8_r3 = new AdvancedModelRenderer(this);
        this.neck8_r3.setRotationPoint(1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck8_r3);
        this.setRotateAngle(neck8_r3, 0.1931F, -0.0629F, 0.9147F);
        this.neck8_r3.cubeList.add(new ModelBox(neck8_r3, 27, 9, 5.5341F, 1.2054F, -2.7975F, 0, 2, 1, 0.0F, false));

        this.neck7_r2 = new AdvancedModelRenderer(this);
        this.neck7_r2.setRotationPoint(1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck7_r2);
        this.setRotateAngle(neck7_r2, 0.1462F, 0.1413F, -0.1596F);
        this.neck7_r2.cubeList.add(new ModelBox(neck7_r2, 47, 28, 1.5043F, 2.4906F, -2.7975F, 0, 3, 1, 0.0F, false));

        this.neck6_r1 = new AdvancedModelRenderer(this);
        this.neck6_r1.setRotationPoint(1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck6_r1);
        this.setRotateAngle(neck6_r1, -0.0509F, 0.1966F, -1.2222F);
        this.neck6_r1.cubeList.add(new ModelBox(neck6_r1, 44, 47, -1.3618F, -0.424F, -2.7975F, 0, 3, 1, 0.0F, false));

        this.neck7_r3 = new AdvancedModelRenderer(this);
        this.neck7_r3.setRotationPoint(1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck7_r3);
        this.setRotateAngle(neck7_r3, -0.0956F, 0.0734F, -1.2282F);
        this.neck7_r3.cubeList.add(new ModelBox(neck7_r3, 27, 4, -1.6542F, -0.5914F, -0.5735F, 0, 3, 1, 0.0F, false));

        this.neck8_r4 = new AdvancedModelRenderer(this);
        this.neck8_r4.setRotationPoint(1.0F, 0.6623F, -1.2186F);
        this.chest.addChild(neck8_r4);
        this.setRotateAngle(neck8_r4, -0.1103F, 0.0323F, -1.229F);
        this.neck8_r4.cubeList.add(new ModelBox(neck8_r4, 0, 23, -0.1217F, -1.1461F, -0.5259F, 0, 3, 1, 0.0F, false));

        this.neck9_r5 = new AdvancedModelRenderer(this);
        this.neck9_r5.setRotationPoint(1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck9_r5);
        this.setRotateAngle(neck9_r5, 0.1133F, 0.0409F, 0.9156F);
        this.neck9_r5.cubeList.add(new ModelBox(neck9_r5, 12, 0, 5.5499F, 1.5419F, -0.5735F, 0, 2, 1, 0.0F, false));

        this.neck8_r5 = new AdvancedModelRenderer(this);
        this.neck8_r5.setRotationPoint(1.0F, -1.195F, -3.2582F);
        this.chest.addChild(neck8_r5);
        this.setRotateAngle(neck8_r5, 0.016F, 0.1194F, -0.1766F);
        this.neck8_r5.cubeList.add(new ModelBox(neck8_r5, 8, 23, 1.2131F, 2.66F, -0.5735F, 0, 3, 1, 0.0F, false));

        this.neck9_r6 = new AdvancedModelRenderer(this);
        this.neck9_r6.setRotationPoint(1.0F, 0.6623F, -1.2186F);
        this.chest.addChild(neck9_r6);
        this.setRotateAngle(neck9_r6, -0.0272F, 0.1116F, -0.1816F);
        this.neck9_r6.cubeList.add(new ModelBox(neck9_r6, 13, 6, 1.5171F, 0.9572F, -0.5286F, 0, 3, 1, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, 0.6F, -5.5F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.1274F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 47, 45, -0.5F, -0.6945F, -5.074F, 1, 1, 5, 0.001F, false));

        this.neck6_r2 = new AdvancedModelRenderer(this);
        this.neck6_r2.setRotationPoint(-1.0F, 0.4314F, -2.4031F);
        this.neck1.addChild(neck6_r2);
        this.setRotateAngle(neck6_r2, 1.4243F, -0.5609F, 0.1167F);
        this.neck6_r2.cubeList.add(new ModelBox(neck6_r2, 0, 42, 0.4564F, -0.3334F, -0.1964F, 0, 2, 1, 0.0F, true));

        this.neck5_r1 = new AdvancedModelRenderer(this);
        this.neck5_r1.setRotationPoint(-1.0F, 0.3F, -6.0F);
        this.neck1.addChild(neck5_r1);
        this.setRotateAngle(neck5_r1, 1.2061F, -0.5609F, 0.1167F);
        this.neck5_r1.cubeList.add(new ModelBox(neck5_r1, 0, 31, 1.158F, 0.7414F, 0.2612F, 0, 1, 1, 0.0F, true));

        this.neck4_r1 = new AdvancedModelRenderer(this);
        this.neck4_r1.setRotationPoint(1.0F, 0.3F, -6.0F);
        this.neck1.addChild(neck4_r1);
        this.setRotateAngle(neck4_r1, 1.2061F, 0.5609F, -0.1167F);
        this.neck4_r1.cubeList.add(new ModelBox(neck4_r1, 0, 31, -1.158F, 0.7414F, 0.2612F, 0, 1, 1, 0.0F, false));

        this.neck5_r2 = new AdvancedModelRenderer(this);
        this.neck5_r2.setRotationPoint(1.0F, 0.4314F, -2.4031F);
        this.neck1.addChild(neck5_r2);
        this.setRotateAngle(neck5_r2, 1.4243F, 0.5609F, -0.1167F);
        this.neck5_r2.cubeList.add(new ModelBox(neck5_r2, 0, 42, -0.4564F, -0.3334F, -0.1964F, 0, 2, 1, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(-0.2F, 0.1F, -4.7F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.4106F, -0.4213F, 0.1169F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 48, -0.5F, -0.6599F, -5.1962F, 1, 1, 5, 0.0F, false));

        this.neck4_r2 = new AdvancedModelRenderer(this);
        this.neck4_r2.setRotationPoint(-1.0F, 0.2F, -2.0F);
        this.neck2.addChild(neck4_r2);
        this.setRotateAngle(neck4_r2, 1.2061F, -0.5609F, 0.1167F);
        this.neck4_r2.cubeList.add(new ModelBox(neck4_r2, 8, 31, 0.2109F, -0.5355F, -0.5072F, 0, 1, 1, 0.0F, true));

        this.neck3_r1 = new AdvancedModelRenderer(this);
        this.neck3_r1.setRotationPoint(1.0F, 0.2F, -2.0F);
        this.neck2.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 1.2061F, 0.5609F, -0.1167F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 8, 31, -0.2109F, -0.5355F, -0.5072F, 0, 1, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -3.5F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, -0.2371F, -0.0529F, -0.064F);
        this.head.cubeList.add(new ModelBox(head, 24, 35, -2.0F, -1.0F, -5.0F, 4, 3, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.6981F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 20, 1.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 47, 20, -2.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F, true));

        this.jaw_r1 = new AdvancedModelRenderer(this);
        this.jaw_r1.setRotationPoint(-1.0F, 3.0F, -0.1F);
        this.jaw.addChild(jaw_r1);
        this.setRotateAngle(jaw_r1, -0.2182F, -0.2182F, 0.0F);
        this.jaw_r1.cubeList.add(new ModelBox(jaw_r1, 7, 0, 0.0F, -1.0F, -4.9F, 0, 1, 4, 0.0F, true));

        this.jaw_r2 = new AdvancedModelRenderer(this);
        this.jaw_r2.setRotationPoint(1.0F, 3.0F, -0.1F);
        this.jaw.addChild(jaw_r2);
        this.setRotateAngle(jaw_r2, -0.2182F, 0.2182F, 0.0F);
        this.jaw_r2.cubeList.add(new ModelBox(jaw_r2, 7, 0, 0.0F, -1.0F, -4.9F, 0, 1, 4, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.jaw.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1485F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 18, 55, 0.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 18, 55, -1.5F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -2.6F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.1274F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 55, 28, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Lowerjawfronttip = new AdvancedModelRenderer(this);
        this.Lowerjawfronttip.setRotationPoint(-0.01F, 2.2F, -2.0F);
        this.Lowerjawfront.addChild(Lowerjawfronttip);
        this.setRotateAngle(Lowerjawfronttip, 0.4671F, 0.0F, 0.0F);
        this.Lowerjawfronttip.cubeList.add(new ModelBox(Lowerjawfronttip, 0, 61, -1.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

        this.Chinkeel = new AdvancedModelRenderer(this);
        this.Chinkeel.setRotationPoint(0.0F, 2.6F, -1.9F);
        this.Lowerjawfront.addChild(Chinkeel);
        this.setRotateAngle(Chinkeel, 0.1698F, 0.0F, 0.0F);
        this.Chinkeel.cubeList.add(new ModelBox(Chinkeel, 55, 45, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.Leftlowerteeth = new AdvancedModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-0.1F, 0.2F, -2.6F);
        this.Lowerjawfront.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.0637F, 0.0F, -0.4245F);
        this.Leftlowerteeth.cubeList.add(new ModelBox(Leftlowerteeth, 59, 59, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Rightlowerteeth = new AdvancedModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.1F, 0.2F, -2.6F);
        this.Lowerjawfront.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0637F, 0.0F, 0.4245F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 58, 33, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Lowerjawteeth = new AdvancedModelRenderer(this);
        this.Lowerjawteeth.setRotationPoint(-0.01F, 0.5F, -3.0F);
        this.Lowerjawmiddle.addChild(Lowerjawteeth);
        this.setRotateAngle(Lowerjawteeth, -0.1061F, 0.0F, 0.0F);
        this.Lowerjawteeth.cubeList.add(new ModelBox(Lowerjawteeth, 48, 12, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.Upperjawback = new AdvancedModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.1485F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 26, 44, -1.5F, 0.0F, -3.5F, 3, 2, 4, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.7F, -3.1F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.0637F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 0, 31, -1.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.Headslopefront = new AdvancedModelRenderer(this);
        this.Headslopefront.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.Upperjawfront.addChild(Headslopefront);
        this.setRotateAngle(Headslopefront, 0.0424F, 0.0F, 0.0F);
        this.Headslopefront.cubeList.add(new ModelBox(Headslopefront, 55, 18, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Crest = new AdvancedModelRenderer(this);
        this.Crest.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.Headslopefront.addChild(Crest);
        this.setRotateAngle(Crest, -0.0848F, 0.0F, 0.0F);
        this.Crest.cubeList.add(new ModelBox(Crest, 0, 0, 0.0F, -5.0F, 0.0F, 0, 5, 6, 0.0F, false));

        this.Leftupperteeth = new AdvancedModelRenderer(this);
        this.Leftupperteeth.setRotationPoint(-1.0F, 0.6F, -3.0F);
        this.Upperjawfront.addChild(Leftupperteeth);
        this.setRotateAngle(Leftupperteeth, -0.0848F, 0.0F, 0.2335F);
        this.Leftupperteeth.cubeList.add(new ModelBox(Leftupperteeth, 57, 37, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Rightupperteeth = new AdvancedModelRenderer(this);
        this.Rightupperteeth.setRotationPoint(1.0F, 0.6F, -3.0F);
        this.Upperjawfront.addChild(Rightupperteeth);
        this.setRotateAngle(Rightupperteeth, -0.0848F, 0.0F, -0.2335F);
        this.Rightupperteeth.cubeList.add(new ModelBox(Rightupperteeth, 57, 12, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Headslopeback = new AdvancedModelRenderer(this);
        this.Headslopeback.setRotationPoint(0.0F, -1.0F, 0.3F);
        this.Upperjawback.addChild(Headslopeback);
        this.setRotateAngle(Headslopeback, 0.2546F, 0.0F, 0.0F);
        this.Headslopeback.cubeList.add(new ModelBox(Headslopeback, 24, 51, -1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Upperjawteeth = new AdvancedModelRenderer(this);
        this.Upperjawteeth.setRotationPoint(0.0F, 1.4F, -3.2F);
        this.Upperjawback.addChild(Upperjawteeth);
        this.Upperjawteeth.cubeList.add(new ModelBox(Upperjawteeth, 0, 12, -1.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

        this.wing1R = new AdvancedModelRenderer(this);
        this.wing1R.setRotationPoint(2.5F, 2.0F, -4.5F);
        this.chest.addChild(wing1R);
        this.setRotateAngle(wing1R, -0.0722F, -0.2748F, 0.0386F);
        this.wing1R.cubeList.add(new ModelBox(wing1R, 38, 35, 0.0244F, -0.0422F, -1.0012F, 8, 1, 2, 0.0F, false));

        this.wing2R = new AdvancedModelRenderer(this);
        this.wing2R.setRotationPoint(7.2539F, -0.3379F, 0.3626F);
        this.wing1R.addChild(wing2R);
        this.setRotateAngle(wing2R, -0.144F, 0.6831F, -0.2895F);
        this.wing2R.cubeList.add(new ModelBox(wing2R, 20, 0, -0.1627F, 0.2822F, -1.0418F, 18, 1, 2, 0.0F, false));

        this.wing3R = new AdvancedModelRenderer(this);
        this.wing3R.setRotationPoint(17.6981F, 0.8221F, -0.9589F);
        this.wing2R.addChild(wing3R);
        this.setRotateAngle(wing3R, 0.0158F, -0.3463F, 0.0173F);
        this.wing3R.cubeList.add(new ModelBox(wing3R, 34, 8, 0.0F, -0.5F, 0.0F, 12, 1, 2, 0.0F, false));

        this.wing4R = new AdvancedModelRenderer(this);
        this.wing4R.setRotationPoint(12.0F, -0.09F, 0.5F);
        this.wing3R.addChild(wing4R);
        this.setRotateAngle(wing4R, -0.0295F, -0.3254F, 0.1769F);
        this.wing4R.cubeList.add(new ModelBox(wing4R, 16, 29, 0.0563F, -0.4153F, 0.3198F, 14, 1, 1, 0.0F, false));

        this.wing4R_r1 = new AdvancedModelRenderer(this);
        this.wing4R_r1.setRotationPoint(13.0563F, 0.2647F, 0.8198F);
        this.wing4R.addChild(wing4R_r1);
        this.setRotateAngle(wing4R_r1, 0.0F, -0.3927F, 0.0F);
        this.wing4R_r1.cubeList.add(new ModelBox(wing4R_r1, 16, 32, 0.0F, -0.68F, -0.5F, 14, 1, 1, 0.0F, false));

        this.handR = new AdvancedModelRenderer(this);
        this.handR.setRotationPoint(17.5F, 0.0F, 0.0F);
        this.wing2R.addChild(handR);
        this.setRotateAngle(handR, -0.1061F, -0.4671F, 0.0F);
        this.handR.cubeList.add(new ModelBox(handR, 8, 48, -4.5417F, 0.4908F, -1.1928F, 3, 1, 1, 0.0F, false));

        this.handR_r1 = new AdvancedModelRenderer(this);
        this.handR_r1.setRotationPoint(0.0F, 1.2F, -0.5F);
        this.handR.addChild(handR_r1);
        this.setRotateAngle(handR_r1, 0.1841F, -0.7769F, 0.0011F);
        this.handR_r1.cubeList.add(new ModelBox(handR_r1, 13, 47, -1.5F, -0.8F, -3.0F, 3, 1, 4, 0.0F, false));

        this.wing1R2 = new AdvancedModelRenderer(this);
        this.wing1R2.setRotationPoint(-2.5F, 2.0F, -4.5F);
        this.chest.addChild(wing1R2);
        this.setRotateAngle(wing1R2, 0.0785F, 0.2731F, 0.5058F);
        this.wing1R2.cubeList.add(new ModelBox(wing1R2, 0, 38, -8.0244F, -0.0422F, -1.0012F, 8, 1, 2, 0.0F, false));

        this.wing2R2 = new AdvancedModelRenderer(this);
        this.wing2R2.setRotationPoint(-7.2539F, -0.3379F, 0.3626F);
        this.wing1R2.addChild(wing2R2);
        this.setRotateAngle(wing2R2, -0.144F, -0.6831F, 0.2895F);
        this.wing2R2.cubeList.add(new ModelBox(wing2R2, 0, 19, -17.8373F, 0.2822F, -1.0418F, 18, 1, 2, 0.0F, false));

        this.wing3R2 = new AdvancedModelRenderer(this);
        this.wing3R2.setRotationPoint(-17.6981F, 0.8221F, -0.9589F);
        this.wing2R2.addChild(wing3R2);
        this.setRotateAngle(wing3R2, 0.0315F, 0.3452F, 0.029F);
        this.wing3R2.cubeList.add(new ModelBox(wing3R2, 34, 4, -12.0F, -0.5F, 0.0F, 12, 1, 2, 0.0F, false));

        this.wing4R2 = new AdvancedModelRenderer(this);
        this.wing4R2.setRotationPoint(-12.0F, -0.09F, 0.5F);
        this.wing3R2.addChild(wing4R2);
        this.setRotateAngle(wing4R2, -0.0148F, 0.3264F, -0.1309F);
        this.wing4R2.cubeList.add(new ModelBox(wing4R2, 16, 23, -14.0563F, -0.4153F, 0.3198F, 14, 1, 1, 0.0F, false));

        this.wing4R_r2 = new AdvancedModelRenderer(this);
        this.wing4R_r2.setRotationPoint(-13.0563F, 0.2647F, 0.8198F);
        this.wing4R2.addChild(wing4R_r2);
        this.setRotateAngle(wing4R_r2, 0.0F, 0.3927F, 0.0F);
        this.wing4R_r2.cubeList.add(new ModelBox(wing4R_r2, 16, 26, -14.0F, -0.68F, -0.5F, 14, 1, 1, 0.0F, false));

        this.handR2 = new AdvancedModelRenderer(this);
        this.handR2.setRotationPoint(-17.5F, 0.0F, 0.0F);
        this.wing2R2.addChild(handR2);
        this.setRotateAngle(handR2, -0.1061F, 0.4671F, 0.0F);
        this.handR2.cubeList.add(new ModelBox(handR2, 8, 12, 1.5417F, 0.4908F, -1.1928F, 3, 1, 1, 0.0F, false));

        this.handR_r2 = new AdvancedModelRenderer(this);
        this.handR_r2.setRotationPoint(0.0F, 1.2F, -0.5F);
        this.handR2.addChild(handR_r2);
        this.setRotateAngle(handR_r2, 0.1841F, 0.7769F, -0.0011F);
        this.handR_r2.cubeList.add(new ModelBox(handR_r2, 46, 39, -1.5F, -0.8F, -3.0F, 3, 1, 4, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.6773F, 0.6673F, 7.8827F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0848F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 36, 47, -0.5F, -0.7F, 0.4F, 1, 1, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 5.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.2147F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 20, 4, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.01F, 0.01F, 10.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.086F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 23, -0.5F, -0.5F, 0.0F, 1, 1, 13, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.01F, -0.01F, 12.5F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0424F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 17, 0.0F, false));

        this.Rudder = new AdvancedModelRenderer(this);
        this.Rudder.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail4.addChild(Rudder);


        this.upperlegR = new AdvancedModelRenderer(this);
        this.upperlegR.setRotationPoint(2.2773F, 2.6673F, 6.9827F);
        this.hips.addChild(upperlegR);
        this.setRotateAngle(upperlegR, 0.5321F, -0.3125F, -1.327F);
        this.upperlegR.cubeList.add(new ModelBox(upperlegR, 32, 58, 0.5F, -1.0F, -1.5F, 1, 7, 1, 0.0F, false));

        this.lowerlegR = new AdvancedModelRenderer(this);
        this.lowerlegR.setRotationPoint(1.0F, 5.5F, -1.0F);
        this.upperlegR.addChild(lowerlegR);
        this.setRotateAngle(lowerlegR, 0.9823F, 0.0848F, -0.0213F);
        this.lowerlegR.cubeList.add(new ModelBox(lowerlegR, 13, 53, -0.5F, 0.0F, -0.5F, 1, 10, 1, 0.0F, false));

        this.footR = new AdvancedModelRenderer(this);
        this.footR.setRotationPoint(-0.01F, 9.9F, 0.0F);
        this.lowerlegR.addChild(footR);
        this.setRotateAngle(footR, -0.4564F, 0.0F, 0.0F);
        this.footR.cubeList.add(new ModelBox(footR, 54, 52, -1.0F, 0.0F, -0.5F, 2, 7, 1, 0.0F, false));

        this.upperlegR2 = new AdvancedModelRenderer(this);
        this.upperlegR2.setRotationPoint(-0.9227F, 2.6673F, 6.9827F);
        this.hips.addChild(upperlegR2);
        this.setRotateAngle(upperlegR2, 0.1373F, 0.1267F, 1.7669F);
        this.upperlegR2.cubeList.add(new ModelBox(upperlegR2, 27, 58, -1.5F, -1.0F, -1.5F, 1, 7, 1, 0.0F, false));

        this.lowerlegR2 = new AdvancedModelRenderer(this);
        this.lowerlegR2.setRotationPoint(-0.9F, 5.5F, -1.0F);
        this.upperlegR2.addChild(lowerlegR2);
        this.setRotateAngle(lowerlegR2, 0.7641F, -0.0848F, 0.0213F);
        this.lowerlegR2.cubeList.add(new ModelBox(lowerlegR2, 49, 52, -0.5F, 0.0F, -0.5F, 1, 10, 1, 0.0F, false));

        this.footR2 = new AdvancedModelRenderer(this);
        this.footR2.setRotationPoint(0.01F, 9.9F, 0.0F);
        this.lowerlegR2.addChild(footR2);
        this.setRotateAngle(footR2, -0.151F, 0.0F, 0.0F);
        this.footR2.cubeList.add(new ModelBox(footR2, 20, 4, -1.0F, 0.0F, -0.5F, 2, 7, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
