package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeocydippida;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelArchaeocydippida extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer lumitop;
    private final AdvancedModelRenderer lumipix73;
    private final AdvancedModelRenderer lumipix79;
    private final AdvancedModelRenderer lumipix77;
    private final AdvancedModelRenderer lumipix78;
    private final AdvancedModelRenderer lumipix82;
    private final AdvancedModelRenderer lumipix85;
    private final AdvancedModelRenderer lumipix83;
    private final AdvancedModelRenderer lumipix84;
    private final AdvancedModelRenderer lumipix74;
    private final AdvancedModelRenderer lumipix80;
    private final AdvancedModelRenderer lumipix76;
    private final AdvancedModelRenderer lumipix81;
    private final AdvancedModelRenderer lumipix75;
    private final AdvancedModelRenderer lumi;
    private final AdvancedModelRenderer lumipix;
    private final AdvancedModelRenderer lumipix2;
    private final AdvancedModelRenderer lumipix3;
    private final AdvancedModelRenderer lumipix4;
    private final AdvancedModelRenderer lumipix5;
    private final AdvancedModelRenderer lumipix6;
    private final AdvancedModelRenderer lumi5;
    private final AdvancedModelRenderer lumipix37;
    private final AdvancedModelRenderer lumipix38;
    private final AdvancedModelRenderer lumipix39;
    private final AdvancedModelRenderer lumipix40;
    private final AdvancedModelRenderer lumipix41;
    private final AdvancedModelRenderer lumipix42;
    private final AdvancedModelRenderer lumi3;
    private final AdvancedModelRenderer lumipix19;
    private final AdvancedModelRenderer lumipix20;
    private final AdvancedModelRenderer lumipix21;
    private final AdvancedModelRenderer lumipix22;
    private final AdvancedModelRenderer lumipix23;
    private final AdvancedModelRenderer lumipix24;
    private final AdvancedModelRenderer lumi4;
    private final AdvancedModelRenderer lumipix28;
    private final AdvancedModelRenderer lumipix29;
    private final AdvancedModelRenderer lumipix30;
    private final AdvancedModelRenderer lumipix31;
    private final AdvancedModelRenderer lumipix32;
    private final AdvancedModelRenderer lumipix33;
    private final AdvancedModelRenderer lumi2;
    private final AdvancedModelRenderer lumipix10;
    private final AdvancedModelRenderer lumipix11;
    private final AdvancedModelRenderer lumipix12;
    private final AdvancedModelRenderer lumipix13;
    private final AdvancedModelRenderer lumipix14;
    private final AdvancedModelRenderer lumipix15;
    private final AdvancedModelRenderer lumi8;
    private final AdvancedModelRenderer lumipix64;
    private final AdvancedModelRenderer lumipix65;
    private final AdvancedModelRenderer lumipix66;
    private final AdvancedModelRenderer lumipix67;
    private final AdvancedModelRenderer lumipix68;
    private final AdvancedModelRenderer lumipix69;
    private final AdvancedModelRenderer lumi6;
    private final AdvancedModelRenderer lumipix46;
    private final AdvancedModelRenderer lumipix47;
    private final AdvancedModelRenderer lumipix48;
    private final AdvancedModelRenderer lumipix49;
    private final AdvancedModelRenderer lumipix50;
    private final AdvancedModelRenderer lumipix51;
    private final AdvancedModelRenderer lumi7;
    private final AdvancedModelRenderer lumipix55;
    private final AdvancedModelRenderer lumipix56;
    private final AdvancedModelRenderer lumipix57;
    private final AdvancedModelRenderer lumipix58;
    private final AdvancedModelRenderer lumipix59;
    private final AdvancedModelRenderer lumipix60;

    private ModelAnimator animator;

    public ModelArchaeocydippida() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, -4.4937F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -5.5063F, -3.0F, 6, 6, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 9, -1.5F, 0.4937F, 2.0F, 3, 4, 0, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 29, 9, -1.5F, 0.4937F, -2.0F, 3, 4, 0, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -3.0063F, 0.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 35, -1.5F, -1.975F, -1.0F, 3, 5, 2, 0.0F, false));

        this.lumitop = new AdvancedModelRenderer(this);
        this.lumitop.setRotationPoint(0.0F, -5.5063F, 0.0F);
        this.main.addChild(lumitop);


        this.lumipix73 = new AdvancedModelRenderer(this);
        this.lumipix73.setRotationPoint(-2.5F, -0.01F, -1.25F);
        this.lumitop.addChild(lumipix73);
        this.lumipix73.cubeList.add(new ModelBox(lumipix73, 0, 47, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.lumipix79 = new AdvancedModelRenderer(this);
        this.lumipix79.setRotationPoint(2.5F, -0.01F, -1.25F);
        this.lumitop.addChild(lumipix79);
        this.lumipix79.cubeList.add(new ModelBox(lumipix79, 0, 47, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.lumipix77 = new AdvancedModelRenderer(this);
        this.lumipix77.setRotationPoint(-2.5F, -0.01F, 1.25F);
        this.lumitop.addChild(lumipix77);
        this.lumipix77.cubeList.add(new ModelBox(lumipix77, 0, 47, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.lumipix78 = new AdvancedModelRenderer(this);
        this.lumipix78.setRotationPoint(2.5F, -0.01F, 1.25F);
        this.lumitop.addChild(lumipix78);
        this.lumipix78.cubeList.add(new ModelBox(lumipix78, 0, 47, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.lumipix82 = new AdvancedModelRenderer(this);
        this.lumipix82.setRotationPoint(1.75F, -0.5F, 2.5F);
        this.lumitop.addChild(lumipix82);
        this.lumipix82.cubeList.add(new ModelBox(lumipix82, 0, 47, -1.0F, 0.49F, -0.5F, 1, 0, 1, 0.0F, true));

        this.lumipix85 = new AdvancedModelRenderer(this);
        this.lumipix85.setRotationPoint(1.75F, -0.5F, -2.5F);
        this.lumitop.addChild(lumipix85);
        this.lumipix85.cubeList.add(new ModelBox(lumipix85, 0, 47, -1.0F, 0.49F, -0.5F, 1, 0, 1, 0.0F, true));

        this.lumipix83 = new AdvancedModelRenderer(this);
        this.lumipix83.setRotationPoint(-0.75F, -0.5F, 2.5F);
        this.lumitop.addChild(lumipix83);
        this.lumipix83.cubeList.add(new ModelBox(lumipix83, 0, 47, -1.0F, 0.49F, -0.5F, 1, 0, 1, 0.0F, true));

        this.lumipix84 = new AdvancedModelRenderer(this);
        this.lumipix84.setRotationPoint(-0.75F, -0.5F, -2.5F);
        this.lumitop.addChild(lumipix84);
        this.lumipix84.cubeList.add(new ModelBox(lumipix84, 0, 47, -1.0F, 0.49F, -0.5F, 1, 0, 1, 0.0F, true));

        this.lumipix74 = new AdvancedModelRenderer(this);
        this.lumipix74.setRotationPoint(-1.25F, -0.01F, -0.75F);
        this.lumitop.addChild(lumipix74);
        this.lumipix74.cubeList.add(new ModelBox(lumipix74, 0, 45, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.lumipix80 = new AdvancedModelRenderer(this);
        this.lumipix80.setRotationPoint(1.25F, -0.01F, -0.75F);
        this.lumitop.addChild(lumipix80);
        this.lumipix80.cubeList.add(new ModelBox(lumipix80, 0, 45, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.lumipix76 = new AdvancedModelRenderer(this);
        this.lumipix76.setRotationPoint(-1.25F, -0.01F, 1.25F);
        this.lumitop.addChild(lumipix76);
        this.lumipix76.cubeList.add(new ModelBox(lumipix76, 0, 45, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.lumipix81 = new AdvancedModelRenderer(this);
        this.lumipix81.setRotationPoint(1.25F, -0.01F, 1.25F);
        this.lumitop.addChild(lumipix81);
        this.lumipix81.cubeList.add(new ModelBox(lumipix81, 0, 45, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, true));

        this.lumipix75 = new AdvancedModelRenderer(this);
        this.lumipix75.setRotationPoint(0.0F, -0.01F, 0.0F);
        this.lumitop.addChild(lumipix75);
        this.lumipix75.cubeList.add(new ModelBox(lumipix75, -1, 2, -0.5F, 0.0F, -0.5F, 1, 0, 1, 0.0F, false));

        this.lumi = new AdvancedModelRenderer(this);
        this.lumi.setRotationPoint(-3.0F, 0.4937F, 0.75F);
        this.main.addChild(lumi);


        this.lumipix = new AdvancedModelRenderer(this);
        this.lumipix.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.lumi.addChild(lumipix);
        this.lumipix.cubeList.add(new ModelBox(lumipix, 19, 13, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix2 = new AdvancedModelRenderer(this);
        this.lumipix2.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.lumi.addChild(lumipix2);
        this.lumipix2.cubeList.add(new ModelBox(lumipix2, 19, 3, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix3 = new AdvancedModelRenderer(this);
        this.lumipix3.setRotationPoint(0.0F, -2.5F, 0.5F);
        this.lumi.addChild(lumipix3);
        this.lumipix3.cubeList.add(new ModelBox(lumipix3, 19, 0, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix4 = new AdvancedModelRenderer(this);
        this.lumipix4.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.lumi.addChild(lumipix4);
        this.lumipix4.cubeList.add(new ModelBox(lumipix4, 3, 16, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix5 = new AdvancedModelRenderer(this);
        this.lumipix5.setRotationPoint(0.0F, -4.5F, 0.5F);
        this.lumi.addChild(lumipix5);
        this.lumipix5.cubeList.add(new ModelBox(lumipix5, 0, 16, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix6 = new AdvancedModelRenderer(this);
        this.lumipix6.setRotationPoint(0.0F, -5.5F, 0.5F);
        this.lumi.addChild(lumipix6);
        this.lumipix6.cubeList.add(new ModelBox(lumipix6, 3, 13, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumi5 = new AdvancedModelRenderer(this);
        this.lumi5.setRotationPoint(3.0F, 0.4937F, 0.75F);
        this.main.addChild(lumi5);


        this.lumipix37 = new AdvancedModelRenderer(this);
        this.lumipix37.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.lumi5.addChild(lumipix37);
        this.lumipix37.cubeList.add(new ModelBox(lumipix37, 19, 13, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix38 = new AdvancedModelRenderer(this);
        this.lumipix38.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.lumi5.addChild(lumipix38);
        this.lumipix38.cubeList.add(new ModelBox(lumipix38, 19, 3, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix39 = new AdvancedModelRenderer(this);
        this.lumipix39.setRotationPoint(0.0F, -2.5F, 0.5F);
        this.lumi5.addChild(lumipix39);
        this.lumipix39.cubeList.add(new ModelBox(lumipix39, 19, 0, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix40 = new AdvancedModelRenderer(this);
        this.lumipix40.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.lumi5.addChild(lumipix40);
        this.lumipix40.cubeList.add(new ModelBox(lumipix40, 3, 16, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix41 = new AdvancedModelRenderer(this);
        this.lumipix41.setRotationPoint(0.0F, -4.5F, 0.5F);
        this.lumi5.addChild(lumipix41);
        this.lumipix41.cubeList.add(new ModelBox(lumipix41, 0, 16, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix42 = new AdvancedModelRenderer(this);
        this.lumipix42.setRotationPoint(0.0F, -5.5F, 0.5F);
        this.lumi5.addChild(lumipix42);
        this.lumipix42.cubeList.add(new ModelBox(lumipix42, 3, 13, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumi3 = new AdvancedModelRenderer(this);
        this.lumi3.setRotationPoint(-3.0F, 0.4937F, -1.75F);
        this.main.addChild(lumi3);


        this.lumipix19 = new AdvancedModelRenderer(this);
        this.lumipix19.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.lumi3.addChild(lumipix19);
        this.lumipix19.cubeList.add(new ModelBox(lumipix19, 19, 13, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix20 = new AdvancedModelRenderer(this);
        this.lumipix20.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.lumi3.addChild(lumipix20);
        this.lumipix20.cubeList.add(new ModelBox(lumipix20, 19, 3, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix21 = new AdvancedModelRenderer(this);
        this.lumipix21.setRotationPoint(0.0F, -2.5F, 0.5F);
        this.lumi3.addChild(lumipix21);
        this.lumipix21.cubeList.add(new ModelBox(lumipix21, 19, 0, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix22 = new AdvancedModelRenderer(this);
        this.lumipix22.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.lumi3.addChild(lumipix22);
        this.lumipix22.cubeList.add(new ModelBox(lumipix22, 3, 16, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix23 = new AdvancedModelRenderer(this);
        this.lumipix23.setRotationPoint(0.0F, -4.5F, 0.5F);
        this.lumi3.addChild(lumipix23);
        this.lumipix23.cubeList.add(new ModelBox(lumipix23, 0, 16, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumipix24 = new AdvancedModelRenderer(this);
        this.lumipix24.setRotationPoint(0.0F, -5.5F, 0.5F);
        this.lumi3.addChild(lumipix24);
        this.lumipix24.cubeList.add(new ModelBox(lumipix24, 3, 13, -0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lumi4 = new AdvancedModelRenderer(this);
        this.lumi4.setRotationPoint(3.0F, 0.4937F, -1.75F);
        this.main.addChild(lumi4);


        this.lumipix28 = new AdvancedModelRenderer(this);
        this.lumipix28.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.lumi4.addChild(lumipix28);
        this.lumipix28.cubeList.add(new ModelBox(lumipix28, 19, 13, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix29 = new AdvancedModelRenderer(this);
        this.lumipix29.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.lumi4.addChild(lumipix29);
        this.lumipix29.cubeList.add(new ModelBox(lumipix29, 19, 3, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix30 = new AdvancedModelRenderer(this);
        this.lumipix30.setRotationPoint(0.0F, -2.5F, 0.5F);
        this.lumi4.addChild(lumipix30);
        this.lumipix30.cubeList.add(new ModelBox(lumipix30, 19, 0, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix31 = new AdvancedModelRenderer(this);
        this.lumipix31.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.lumi4.addChild(lumipix31);
        this.lumipix31.cubeList.add(new ModelBox(lumipix31, 3, 16, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix32 = new AdvancedModelRenderer(this);
        this.lumipix32.setRotationPoint(0.0F, -4.5F, 0.5F);
        this.lumi4.addChild(lumipix32);
        this.lumipix32.cubeList.add(new ModelBox(lumipix32, 0, 16, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumipix33 = new AdvancedModelRenderer(this);
        this.lumipix33.setRotationPoint(0.0F, -5.5F, 0.5F);
        this.lumi4.addChild(lumipix33);
        this.lumipix33.cubeList.add(new ModelBox(lumipix33, 3, 13, 0.01F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.lumi2 = new AdvancedModelRenderer(this);
        this.lumi2.setRotationPoint(-1.75F, 0.4937F, 2.0F);
        this.main.addChild(lumi2);


        this.lumipix10 = new AdvancedModelRenderer(this);
        this.lumipix10.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.lumi2.addChild(lumipix10);
        this.lumipix10.cubeList.add(new ModelBox(lumipix10, 11, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix11 = new AdvancedModelRenderer(this);
        this.lumipix11.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.lumi2.addChild(lumipix11);
        this.lumipix11.cubeList.add(new ModelBox(lumipix11, 7, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix12 = new AdvancedModelRenderer(this);
        this.lumipix12.setRotationPoint(0.0F, -2.5F, 0.5F);
        this.lumi2.addChild(lumipix12);
        this.lumipix12.cubeList.add(new ModelBox(lumipix12, 4, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix13 = new AdvancedModelRenderer(this);
        this.lumipix13.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.lumi2.addChild(lumipix13);
        this.lumipix13.cubeList.add(new ModelBox(lumipix13, 0, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix14 = new AdvancedModelRenderer(this);
        this.lumipix14.setRotationPoint(0.0F, -4.5F, 0.5F);
        this.lumi2.addChild(lumipix14);
        this.lumipix14.cubeList.add(new ModelBox(lumipix14, 22, 4, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix15 = new AdvancedModelRenderer(this);
        this.lumipix15.setRotationPoint(0.0F, -5.5F, 0.5F);
        this.lumi2.addChild(lumipix15);
        this.lumipix15.cubeList.add(new ModelBox(lumipix15, 22, 2, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumi8 = new AdvancedModelRenderer(this);
        this.lumi8.setRotationPoint(-1.75F, 0.4937F, -2.0F);
        this.main.addChild(lumi8);


        this.lumipix64 = new AdvancedModelRenderer(this);
        this.lumipix64.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.lumi8.addChild(lumipix64);
        this.lumipix64.cubeList.add(new ModelBox(lumipix64, 11, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix65 = new AdvancedModelRenderer(this);
        this.lumipix65.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.lumi8.addChild(lumipix65);
        this.lumipix65.cubeList.add(new ModelBox(lumipix65, 7, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix66 = new AdvancedModelRenderer(this);
        this.lumipix66.setRotationPoint(0.0F, -2.5F, -0.5F);
        this.lumi8.addChild(lumipix66);
        this.lumipix66.cubeList.add(new ModelBox(lumipix66, 4, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix67 = new AdvancedModelRenderer(this);
        this.lumipix67.setRotationPoint(0.0F, -3.5F, -0.5F);
        this.lumi8.addChild(lumipix67);
        this.lumipix67.cubeList.add(new ModelBox(lumipix67, 0, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix68 = new AdvancedModelRenderer(this);
        this.lumipix68.setRotationPoint(0.0F, -4.5F, -0.5F);
        this.lumi8.addChild(lumipix68);
        this.lumipix68.cubeList.add(new ModelBox(lumipix68, 22, 4, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix69 = new AdvancedModelRenderer(this);
        this.lumipix69.setRotationPoint(0.0F, -5.5F, -0.5F);
        this.lumi8.addChild(lumipix69);
        this.lumipix69.cubeList.add(new ModelBox(lumipix69, 22, 2, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumi6 = new AdvancedModelRenderer(this);
        this.lumi6.setRotationPoint(0.75F, 0.4937F, 2.0F);
        this.main.addChild(lumi6);


        this.lumipix46 = new AdvancedModelRenderer(this);
        this.lumipix46.setRotationPoint(0.0F, -0.5F, 0.5F);
        this.lumi6.addChild(lumipix46);
        this.lumipix46.cubeList.add(new ModelBox(lumipix46, 11, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix47 = new AdvancedModelRenderer(this);
        this.lumipix47.setRotationPoint(0.0F, -1.5F, 0.5F);
        this.lumi6.addChild(lumipix47);
        this.lumipix47.cubeList.add(new ModelBox(lumipix47, 7, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix48 = new AdvancedModelRenderer(this);
        this.lumipix48.setRotationPoint(0.0F, -2.5F, 0.5F);
        this.lumi6.addChild(lumipix48);
        this.lumipix48.cubeList.add(new ModelBox(lumipix48, 4, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix49 = new AdvancedModelRenderer(this);
        this.lumipix49.setRotationPoint(0.0F, -3.5F, 0.5F);
        this.lumi6.addChild(lumipix49);
        this.lumipix49.cubeList.add(new ModelBox(lumipix49, 0, 23, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix50 = new AdvancedModelRenderer(this);
        this.lumipix50.setRotationPoint(0.0F, -4.5F, 0.5F);
        this.lumi6.addChild(lumipix50);
        this.lumipix50.cubeList.add(new ModelBox(lumipix50, 22, 4, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix51 = new AdvancedModelRenderer(this);
        this.lumipix51.setRotationPoint(0.0F, -5.5F, 0.5F);
        this.lumi6.addChild(lumipix51);
        this.lumipix51.cubeList.add(new ModelBox(lumipix51, 22, 2, 0.0F, -0.5F, 0.51F, 1, 1, 0, 0.0F, false));

        this.lumi7 = new AdvancedModelRenderer(this);
        this.lumi7.setRotationPoint(0.75F, 0.4937F, -2.0F);
        this.main.addChild(lumi7);


        this.lumipix55 = new AdvancedModelRenderer(this);
        this.lumipix55.setRotationPoint(0.0F, -0.5F, -0.5F);
        this.lumi7.addChild(lumipix55);
        this.lumipix55.cubeList.add(new ModelBox(lumipix55, 11, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix56 = new AdvancedModelRenderer(this);
        this.lumipix56.setRotationPoint(0.0F, -1.5F, -0.5F);
        this.lumi7.addChild(lumipix56);
        this.lumipix56.cubeList.add(new ModelBox(lumipix56, 7, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix57 = new AdvancedModelRenderer(this);
        this.lumipix57.setRotationPoint(0.0F, -2.5F, -0.5F);
        this.lumi7.addChild(lumipix57);
        this.lumipix57.cubeList.add(new ModelBox(lumipix57, 4, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix58 = new AdvancedModelRenderer(this);
        this.lumipix58.setRotationPoint(0.0F, -3.5F, -0.5F);
        this.lumi7.addChild(lumipix58);
        this.lumipix58.cubeList.add(new ModelBox(lumipix58, 0, 23, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix59 = new AdvancedModelRenderer(this);
        this.lumipix59.setRotationPoint(0.0F, -4.5F, -0.5F);
        this.lumi7.addChild(lumipix59);
        this.lumipix59.cubeList.add(new ModelBox(lumipix59, 22, 4, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));

        this.lumipix60 = new AdvancedModelRenderer(this);
        this.lumipix60.setRotationPoint(0.0F, -5.5F, -0.5F);
        this.lumi7.addChild(lumipix60);
        this.lumipix60.cubeList.add(new ModelBox(lumipix60, 22, 2, 0.0F, -0.5F, -0.51F, 1, 1, 0, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = 0.5F;
        this.main.offsetX = 0.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 4.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.2F, 3.5F, 0.0F);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        EntityPrehistoricFloraArchaeocydippida entityArchaeocydippida = (EntityPrehistoricFloraArchaeocydippida) e;
        this.main.offsetY = 1.7F;

        //this.body.offsetZ = this.moveBoxExtended(speed, 1F, false, 3.5F, f2, 1) + offsetZ;


//        this.Armbase.scaleChildren = false;
//        this.Armbase.setScaleY(1.0F);
//        this.Armbase2.scaleChildren = false;
//        this.Armbase2.setScaleY(1.0F);
//        this.Armbase3.scaleChildren = false;
//        this.Armbase3.setScaleY(1.0F);
//        this.Armbase4.scaleChildren = false;
//        this.Armbase4.setScaleY(1.0F);
//        this.Armbase5.scaleChildren = false;
//        this.Armbase5.setScaleY(1.0F);
//
//        if (entityArchaeocydippida.isReallyInWater()) {
//            this.bob(Base, 0.2F, 2.5F, false, f2, 1);
//        }
//        else {
//            this.resetToDefaultPose();
//            //this.Base.rotateAngleZ = (float) Math.toRadians(90);
//            this.Base.offsetY = -0.05F;
//            this.Armbase.scaleChildren = true;
//            this.Armbase.setScaleY(0.1F);
//            this.Armbase2.scaleChildren = true;
//            this.Armbase2.setScaleY(0.1F);
//            this.Armbase3.scaleChildren = true;
//            this.Armbase3.setScaleY(0.1F);
//            this.Armbase4.scaleChildren = true;
//            this.Armbase4.setScaleY(0.1F);
//            this.Armbase5.scaleChildren = true;
//            this.Armbase5.setScaleY(0.1F);
//        }

    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);        this.resetToDefaultPose();
        EntityPrehistoricFloraArchaeocydippida ee = (EntityPrehistoricFloraArchaeocydippida) entitylivingbaseIn;
        this.main.scaleChildren = true;
        if (ee.isReallyInWater()) {
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraArchaeocydippida entity = (EntityPrehistoricFloraArchaeocydippida) entitylivingbaseIn;

        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45-90))*5), main.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5), main.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*-5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45+90))*0.5);
        this.main.setScale((float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.04),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*-0.02),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.04));


        this.lumipix55.rotationPointX = this.lumipix55.rotationPointX + (float)(0);
        this.lumipix55.rotationPointY = this.lumipix55.rotationPointY - (float)(0);
        this.lumipix55.rotationPointZ = this.lumipix55.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.08);


        this.lumipix56.rotationPointX = this.lumipix56.rotationPointX + (float)(0);
        this.lumipix56.rotationPointY = this.lumipix56.rotationPointY - (float)(0);
        this.lumipix56.rotationPointZ = this.lumipix56.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.08);


        this.lumipix57.rotationPointX = this.lumipix57.rotationPointX + (float)(0);
        this.lumipix57.rotationPointY = this.lumipix57.rotationPointY - (float)(0);
        this.lumipix57.rotationPointZ = this.lumipix57.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.08);


        this.lumipix58.rotationPointX = this.lumipix58.rotationPointX + (float)(0);
        this.lumipix58.rotationPointY = this.lumipix58.rotationPointY - (float)(0);
        this.lumipix58.rotationPointZ = this.lumipix58.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.08);


        this.lumipix59.rotationPointX = this.lumipix59.rotationPointX + (float)(0);
        this.lumipix59.rotationPointY = this.lumipix59.rotationPointY - (float)(0);
        this.lumipix59.rotationPointZ = this.lumipix59.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.08);


        this.lumipix60.rotationPointX = this.lumipix60.rotationPointX + (float)(0);
        this.lumipix60.rotationPointY = this.lumipix60.rotationPointY - (float)(0);
        this.lumipix60.rotationPointZ = this.lumipix60.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.08);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 0) / 15) * (2.8858+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 0) / 15) * (-5.4023+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-0.7759-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 33) {
            xx = 2.8858+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 15) / 18) * (1.164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(2.8858+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = -5.4023+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 15) / 18) * (-3.3884+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(-5.4023+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-0.7759 + (((tickAnim - 15) / 18) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-0.2153-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-0.7759)));
        }
        else if (tickAnim >= 33 && tickAnim < 48) {
            xx = 1.164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 33) / 15) * (-1.5984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(1.164+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = -3.3884+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 33) / 15) * (2.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(-3.3884+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-0.2153 + (((tickAnim - 33) / 15) * (-0.0078+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*0.0099-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*-0.2153)));
        }
        else if (tickAnim >= 48 && tickAnim < 64) {
            xx = -1.5984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 48) / 16) * (-3.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(-1.5984+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = 2.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 48) / 16) * (4.6972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(2.6976+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -0.0078+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*0.0099 + (((tickAnim - 48) / 16) * (0.0258+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*0.0099-(-0.0078+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*0.0099)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = -3.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 64) / 16) * (-5.2495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(-3.599+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = 4.6972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 64) / 16) * (0.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(4.6972+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = 0.0258+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*0.0099 + (((tickAnim - 64) / 16) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*4.9324-(0.0258+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*0.0099)));
        }
        else if (tickAnim >= 80 && tickAnim < 92) {
            xx = -5.2495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 80) / 12) * (-5.3167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(-5.2495+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = 0.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 80) / 12) * (-4.0409+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(0.2471+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*4.9324 + (((tickAnim - 80) / 12) * (5.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*12.6473-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*4.9324)));
        }
        else if (tickAnim >= 92 && tickAnim < 101) {
            xx = -5.3167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 92) / 9) * (-3.5019+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(-5.3167+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = -4.0409+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 92) / 9) * (-4.523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(-4.0409+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = 5.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*12.6473 + (((tickAnim - 92) / 9) * (11.5197+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*16.3-(5.0225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*12.6473)));
        }
        else if (tickAnim >= 101 && tickAnim < 108) {
            xx = -3.5019+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 101) / 7) * (-0.02886-(-3.5019+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = -4.523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 101) / 7) * (1.19914-(-4.523+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = 11.5197+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*16.3 + (((tickAnim - 101) / 7) * (0.02949-(11.5197+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*16.3)));
        }
        else if (tickAnim >= 108 && tickAnim < 124) {
            xx = -0.02886 + (((tickAnim - 108) / 16) * (0.5637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(-0.02886)));
            yy = 1.19914 + (((tickAnim - 108) / 16) * (1.3459+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(1.19914)));
            zz = 0.02949 + (((tickAnim - 108) / 16) * (5.2588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*4.9204-(0.02949)));
        }
        else if (tickAnim >= 124 && tickAnim < 141) {
            xx = 0.5637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 124) / 17) * (3.5068+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(0.5637+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = 1.3459+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 124) / 17) * (5.9591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(1.3459+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = 5.2588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*4.9204 + (((tickAnim - 124) / 17) * (13.5002+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*19.3294-(5.2588+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*4.9204)));
        }
        else if (tickAnim >= 141 && tickAnim < 151) {
            xx = 3.5068+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 141) / 10) * (4.9055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(3.5068+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = 5.9591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 141) / 10) * (4.7955+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(5.9591+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = 13.5002+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*19.3294 + (((tickAnim - 141) / 10) * (4.6623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*13.8427-(13.5002+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*19.3294)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 4.9055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5 + (((tickAnim - 151) / 9) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5-(4.9055+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45-90))*5)));
            yy = 4.7955+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 151) / 9) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(4.7955+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = 4.6623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*13.8427 + (((tickAnim - 151) / 9) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*5-(4.6623+Math.sin((Math.PI/180)*(((double)tickAnim/20)*45))*13.8427)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lumitop, lumitop.rotateAngleX + (float) Math.toRadians(xx), lumitop.rotateAngleY + (float) Math.toRadians(yy), lumitop.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 0) / 48) * (0-(0)));
            yy = 0.025 + (((tickAnim - 0) / 48) * (0.135-(0.025)));
            zz = 0 + (((tickAnim - 0) / 48) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 48) / 16) * (0-(0)));
            yy = 0.135 + (((tickAnim - 48) / 16) * (0.085-(0.135)));
            zz = 0 + (((tickAnim - 48) / 16) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 64) / 16) * (0-(0)));
            yy = 0.085 + (((tickAnim - 64) / 16) * (0.08-(0.085)));
            zz = 0 + (((tickAnim - 64) / 16) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 80) / 21) * (0-(0)));
            yy = 0.08 + (((tickAnim - 80) / 21) * (0.105-(0.08)));
            zz = 0 + (((tickAnim - 80) / 21) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 101) / 23) * (0-(0)));
            yy = 0.105 + (((tickAnim - 101) / 23) * (0.08-(0.105)));
            zz = 0 + (((tickAnim - 101) / 23) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 151) {
            xx = 0 + (((tickAnim - 124) / 27) * (0-(0)));
            yy = 0.08 + (((tickAnim - 124) / 27) * (0.065-(0.08)));
            zz = 0 + (((tickAnim - 124) / 27) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 151) / 9) * (0-(0)));
            yy = 0.065 + (((tickAnim - 151) / 9) * (0.025-(0.065)));
            zz = 0 + (((tickAnim - 151) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lumitop.rotationPointX = this.lumitop.rotationPointX + (float)(xx);
        this.lumitop.rotationPointY = this.lumitop.rotationPointY - (float)(yy);
        this.lumitop.rotationPointZ = this.lumitop.rotationPointZ + (float)(zz);



        this.lumipix37.rotationPointX = this.lumipix37.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*-0.08);
        this.lumipix37.rotationPointY = this.lumipix37.rotationPointY - (float)(0);
        this.lumipix37.rotationPointZ = this.lumipix37.rotationPointZ + (float)(0);


        this.lumipix38.rotationPointX = this.lumipix38.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.08);
        this.lumipix38.rotationPointY = this.lumipix38.rotationPointY - (float)(0);
        this.lumipix38.rotationPointZ = this.lumipix38.rotationPointZ + (float)(0);


        this.lumipix39.rotationPointX = this.lumipix39.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.08);
        this.lumipix39.rotationPointY = this.lumipix39.rotationPointY - (float)(0);
        this.lumipix39.rotationPointZ = this.lumipix39.rotationPointZ + (float)(0);


        this.lumipix40.rotationPointX = this.lumipix40.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.08);
        this.lumipix40.rotationPointY = this.lumipix40.rotationPointY - (float)(0);
        this.lumipix40.rotationPointZ = this.lumipix40.rotationPointZ + (float)(0);


        this.lumipix41.rotationPointX = this.lumipix41.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.08);
        this.lumipix41.rotationPointY = this.lumipix41.rotationPointY - (float)(0);
        this.lumipix41.rotationPointZ = this.lumipix41.rotationPointZ + (float)(0);


        this.lumipix42.rotationPointX = this.lumipix42.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.08);
        this.lumipix42.rotationPointY = this.lumipix42.rotationPointY - (float)(0);
        this.lumipix42.rotationPointZ = this.lumipix42.rotationPointZ + (float)(0);



        this.lumipix28.rotationPointX = this.lumipix28.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*-0.08);
        this.lumipix28.rotationPointY = this.lumipix28.rotationPointY - (float)(0);
        this.lumipix28.rotationPointZ = this.lumipix28.rotationPointZ + (float)(0);


        this.lumipix29.rotationPointX = this.lumipix29.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.08);
        this.lumipix29.rotationPointY = this.lumipix29.rotationPointY - (float)(0);
        this.lumipix29.rotationPointZ = this.lumipix29.rotationPointZ + (float)(0);


        this.lumipix30.rotationPointX = this.lumipix30.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.08);
        this.lumipix30.rotationPointY = this.lumipix30.rotationPointY - (float)(0);
        this.lumipix30.rotationPointZ = this.lumipix30.rotationPointZ + (float)(0);


        this.lumipix31.rotationPointX = this.lumipix31.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.08);
        this.lumipix31.rotationPointY = this.lumipix31.rotationPointY - (float)(0);
        this.lumipix31.rotationPointZ = this.lumipix31.rotationPointZ + (float)(0);


        this.lumipix32.rotationPointX = this.lumipix32.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.08);
        this.lumipix32.rotationPointY = this.lumipix32.rotationPointY - (float)(0);
        this.lumipix32.rotationPointZ = this.lumipix32.rotationPointZ + (float)(0);


        this.lumipix33.rotationPointX = this.lumipix33.rotationPointX + (float)(0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.08);
        this.lumipix33.rotationPointY = this.lumipix33.rotationPointY - (float)(0);
        this.lumipix33.rotationPointZ = this.lumipix33.rotationPointZ + (float)(0);


        this.lumipix64.rotationPointX = this.lumipix64.rotationPointX + (float)(0);
        this.lumipix64.rotationPointY = this.lumipix64.rotationPointY - (float)(0);
        this.lumipix64.rotationPointZ = this.lumipix64.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.08);


        this.lumipix85.rotationPointX = this.lumipix85.rotationPointX + (float)(0);
        this.lumipix85.rotationPointY = this.lumipix85.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.1);
        this.lumipix85.rotationPointZ = this.lumipix85.rotationPointZ + (float)(0);


        this.lumipix84.rotationPointX = this.lumipix84.rotationPointX + (float)(0);
        this.lumipix84.rotationPointY = this.lumipix84.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.1);
        this.lumipix84.rotationPointZ = this.lumipix84.rotationPointZ + (float)(0);


        this.lumipix79.rotationPointX = this.lumipix79.rotationPointX + (float)(0);
        this.lumipix79.rotationPointY = this.lumipix79.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.1);
        this.lumipix79.rotationPointZ = this.lumipix79.rotationPointZ + (float)(0);


        this.lumipix80.rotationPointX = this.lumipix80.rotationPointX + (float)(0);
        this.lumipix80.rotationPointY = this.lumipix80.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*0.1);
        this.lumipix80.rotationPointZ = this.lumipix80.rotationPointZ + (float)(0);


        this.lumipix.rotationPointX = this.lumipix.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*-0.08);
        this.lumipix.rotationPointY = this.lumipix.rotationPointY - (float)(0);
        this.lumipix.rotationPointZ = this.lumipix.rotationPointZ + (float)(0);


        this.lumipix2.rotationPointX = this.lumipix2.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.08);
        this.lumipix2.rotationPointY = this.lumipix2.rotationPointY - (float)(0);
        this.lumipix2.rotationPointZ = this.lumipix2.rotationPointZ + (float)(0);


        this.lumipix3.rotationPointX = this.lumipix3.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.08);
        this.lumipix3.rotationPointY = this.lumipix3.rotationPointY - (float)(0);
        this.lumipix3.rotationPointZ = this.lumipix3.rotationPointZ + (float)(0);


        this.lumipix4.rotationPointX = this.lumipix4.rotationPointX + (float)(0.0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.08);
        this.lumipix4.rotationPointY = this.lumipix4.rotationPointY - (float)(0);
        this.lumipix4.rotationPointZ = this.lumipix4.rotationPointZ + (float)(0);


        this.lumipix5.rotationPointX = this.lumipix5.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.08);
        this.lumipix5.rotationPointY = this.lumipix5.rotationPointY - (float)(0);
        this.lumipix5.rotationPointZ = this.lumipix5.rotationPointZ + (float)(0);


        this.lumipix6.rotationPointX = this.lumipix6.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.08);
        this.lumipix6.rotationPointY = this.lumipix6.rotationPointY - (float)(0);
        this.lumipix6.rotationPointZ = this.lumipix6.rotationPointZ + (float)(0);



        this.lumipix19.rotationPointX = this.lumipix19.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*-0.08);
        this.lumipix19.rotationPointY = this.lumipix19.rotationPointY - (float)(0);
        this.lumipix19.rotationPointZ = this.lumipix19.rotationPointZ + (float)(0);


        this.lumipix20.rotationPointX = this.lumipix20.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.08);
        this.lumipix20.rotationPointY = this.lumipix20.rotationPointY - (float)(0);
        this.lumipix20.rotationPointZ = this.lumipix20.rotationPointZ + (float)(0);


        this.lumipix21.rotationPointX = this.lumipix21.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.08);
        this.lumipix21.rotationPointY = this.lumipix21.rotationPointY - (float)(0);
        this.lumipix21.rotationPointZ = this.lumipix21.rotationPointZ + (float)(0);


        this.lumipix22.rotationPointX = this.lumipix22.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-0.08);
        this.lumipix22.rotationPointY = this.lumipix22.rotationPointY - (float)(0);
        this.lumipix22.rotationPointZ = this.lumipix22.rotationPointZ + (float)(0);


        this.lumipix23.rotationPointX = this.lumipix23.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-0.08);
        this.lumipix23.rotationPointY = this.lumipix23.rotationPointY - (float)(0);
        this.lumipix23.rotationPointZ = this.lumipix23.rotationPointZ + (float)(0);


        this.lumipix24.rotationPointX = this.lumipix24.rotationPointX + (float)(0.05-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.08);
        this.lumipix24.rotationPointY = this.lumipix24.rotationPointY - (float)(0);
        this.lumipix24.rotationPointZ = this.lumipix24.rotationPointZ + (float)(0);



        this.lumipix10.rotationPointX = this.lumipix10.rotationPointX + (float)(0);
        this.lumipix10.rotationPointY = this.lumipix10.rotationPointY - (float)(0);
        this.lumipix10.rotationPointZ = this.lumipix10.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.08);


        this.lumipix11.rotationPointX = this.lumipix11.rotationPointX + (float)(0);
        this.lumipix11.rotationPointY = this.lumipix11.rotationPointY - (float)(0);
        this.lumipix11.rotationPointZ = this.lumipix11.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.08);


        this.lumipix12.rotationPointX = this.lumipix12.rotationPointX + (float)(0);
        this.lumipix12.rotationPointY = this.lumipix12.rotationPointY - (float)(0);
        this.lumipix12.rotationPointZ = this.lumipix12.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.08);


        this.lumipix13.rotationPointX = this.lumipix13.rotationPointX + (float)(0);
        this.lumipix13.rotationPointY = this.lumipix13.rotationPointY - (float)(0);
        this.lumipix13.rotationPointZ = this.lumipix13.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.08);


        this.lumipix14.rotationPointX = this.lumipix14.rotationPointX + (float)(0);
        this.lumipix14.rotationPointY = this.lumipix14.rotationPointY - (float)(0);
        this.lumipix14.rotationPointZ = this.lumipix14.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.08);


        this.lumipix15.rotationPointX = this.lumipix15.rotationPointX + (float)(0);
        this.lumipix15.rotationPointY = this.lumipix15.rotationPointY - (float)(0);
        this.lumipix15.rotationPointZ = this.lumipix15.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.08);


        this.lumipix65.rotationPointX = this.lumipix65.rotationPointX + (float)(0);
        this.lumipix65.rotationPointY = this.lumipix65.rotationPointY - (float)(0);
        this.lumipix65.rotationPointZ = this.lumipix65.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.08);


        this.lumipix66.rotationPointX = this.lumipix66.rotationPointX + (float)(0);
        this.lumipix66.rotationPointY = this.lumipix66.rotationPointY - (float)(0);
        this.lumipix66.rotationPointZ = this.lumipix66.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.08);


        this.lumipix67.rotationPointX = this.lumipix67.rotationPointX + (float)(0);
        this.lumipix67.rotationPointY = this.lumipix67.rotationPointY - (float)(0);
        this.lumipix67.rotationPointZ = this.lumipix67.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.08);


        this.lumipix68.rotationPointX = this.lumipix68.rotationPointX + (float)(0);
        this.lumipix68.rotationPointY = this.lumipix68.rotationPointY - (float)(0);
        this.lumipix68.rotationPointZ = this.lumipix68.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.08);


        this.lumipix69.rotationPointX = this.lumipix69.rotationPointX + (float)(0);
        this.lumipix69.rotationPointY = this.lumipix69.rotationPointY - (float)(0);
        this.lumipix69.rotationPointZ = this.lumipix69.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.08);

        this.lumipix46.rotationPointX = this.lumipix46.rotationPointX + (float)(0);
        this.lumipix46.rotationPointY = this.lumipix46.rotationPointY - (float)(0);
        this.lumipix46.rotationPointZ = this.lumipix46.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.08);


        this.lumipix47.rotationPointX = this.lumipix47.rotationPointX + (float)(0);
        this.lumipix47.rotationPointY = this.lumipix47.rotationPointY - (float)(0);
        this.lumipix47.rotationPointZ = this.lumipix47.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.08);


        this.lumipix48.rotationPointX = this.lumipix48.rotationPointX + (float)(0);
        this.lumipix48.rotationPointY = this.lumipix48.rotationPointY - (float)(0);
        this.lumipix48.rotationPointZ = this.lumipix48.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.08);


        this.lumipix49.rotationPointX = this.lumipix49.rotationPointX + (float)(0);
        this.lumipix49.rotationPointY = this.lumipix49.rotationPointY - (float)(0);
        this.lumipix49.rotationPointZ = this.lumipix49.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*0.08);


        this.lumipix50.rotationPointX = this.lumipix50.rotationPointX + (float)(0);
        this.lumipix50.rotationPointY = this.lumipix50.rotationPointY - (float)(0);
        this.lumipix50.rotationPointZ = this.lumipix50.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.08);


        this.lumipix51.rotationPointX = this.lumipix51.rotationPointX + (float)(0);
        this.lumipix51.rotationPointY = this.lumipix51.rotationPointY - (float)(0);
        this.lumipix51.rotationPointZ = this.lumipix51.rotationPointZ + (float)(0-Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*0.08);

        this.lumipix73.rotationPointX = this.lumipix73.rotationPointX + (float)(0);
        this.lumipix73.rotationPointY = this.lumipix73.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.15);
        this.lumipix73.rotationPointZ = this.lumipix73.rotationPointZ + (float)(0);


        this.lumipix77.rotationPointX = this.lumipix77.rotationPointX + (float)(0);
        this.lumipix77.rotationPointY = this.lumipix77.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.15);
        this.lumipix77.rotationPointZ = this.lumipix77.rotationPointZ + (float)(0);


        this.lumipix78.rotationPointX = this.lumipix78.rotationPointX + (float)(0);
        this.lumipix78.rotationPointY = this.lumipix78.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.1);
        this.lumipix78.rotationPointZ = this.lumipix78.rotationPointZ + (float)(0);


        this.lumipix82.rotationPointX = this.lumipix82.rotationPointX + (float)(0);
        this.lumipix82.rotationPointY = this.lumipix82.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.1);
        this.lumipix82.rotationPointZ = this.lumipix82.rotationPointZ + (float)(0);


        this.lumipix83.rotationPointX = this.lumipix83.rotationPointX + (float)(0);
        this.lumipix83.rotationPointY = this.lumipix83.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*0.1);
        this.lumipix83.rotationPointZ = this.lumipix83.rotationPointZ + (float)(0);


        this.lumipix74.rotationPointX = this.lumipix74.rotationPointX + (float)(0);
        this.lumipix74.rotationPointY = this.lumipix74.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*0.1);
        this.lumipix74.rotationPointZ = this.lumipix74.rotationPointZ + (float)(0);


        this.lumipix76.rotationPointX = this.lumipix76.rotationPointX + (float)(0);
        this.lumipix76.rotationPointY = this.lumipix76.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*0.1);
        this.lumipix76.rotationPointZ = this.lumipix76.rotationPointZ + (float)(0);


        this.lumipix81.rotationPointX = this.lumipix81.rotationPointX + (float)(0);
        this.lumipix81.rotationPointY = this.lumipix81.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-140))*0.1);
        this.lumipix81.rotationPointZ = this.lumipix81.rotationPointZ + (float)(0);


        this.lumipix75.rotationPointX = this.lumipix75.rotationPointX + (float)(0);
        this.lumipix75.rotationPointY = this.lumipix75.rotationPointY - (float)(-0.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*0.1);
        this.lumipix75.rotationPointZ = this.lumipix75.rotationPointZ + (float)(0);
     }

     public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
            EntityPrehistoricFloraArchaeocydippida e = (EntityPrehistoricFloraArchaeocydippida) entity;
        animator.update(entity);


    }
}
