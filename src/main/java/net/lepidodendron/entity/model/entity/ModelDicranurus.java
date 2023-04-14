package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDicranurus extends AdvancedModelBase {
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer LLeg;
    private final AdvancedModelRenderer RLeg;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer lhorn;
    private final AdvancedModelRenderer lhorn2;
    private final AdvancedModelRenderer lhorn3;
    private final AdvancedModelRenderer lhorn4;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rhorn;
    private final AdvancedModelRenderer rhorn2;
    private final AdvancedModelRenderer rhorn3;
    private final AdvancedModelRenderer rhorn4;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer LAntennae;
    private final AdvancedModelRenderer RAntennae;
    private final AdvancedModelRenderer lside;
    private final AdvancedModelRenderer lside2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer lspikelarge;
    private final AdvancedModelRenderer lspikelarge2;
    private final AdvancedModelRenderer lspikelarge3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer rside;
    private final AdvancedModelRenderer rside2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer lspikelarge4;
    private final AdvancedModelRenderer lspikelarge5;
    private final AdvancedModelRenderer lspikelarge6;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer LLeg2;
    private final AdvancedModelRenderer RLeg2;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer LLeg3;
    private final AdvancedModelRenderer RLeg3;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer LLeg4;
    private final AdvancedModelRenderer RLeg4;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer LLeg5;
    private final AdvancedModelRenderer RLeg5;
    private final AdvancedModelRenderer lspikesmall;
    private final AdvancedModelRenderer lspikesmall2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer lspikesmall3;
    private final AdvancedModelRenderer lspikesmall4;
    private final AdvancedModelRenderer cube_r16;

    public ModelDicranurus() {
        this.textureWidth = 45;
        this.textureHeight = 45;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.95F, -1.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.75F, -3.0F);
        this.Root.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 28, 28, -2.0F, -1.0F, -2.0F, 4, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 7, 4, -2.75F, -1.25F, -0.95F, 1, 1, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 7, 4, 1.75F, -1.25F, -0.95F, 1, 1, 2, 0.0F, true));

        this.LLeg = new AdvancedModelRenderer(this);
        this.LLeg.setRotationPoint(1.0F, 0.0F, -0.25F);
        this.Head.addChild(LLeg);
        this.setRotateAngle(LLeg, 0.0F, 0.0F, 0.1745F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 7, 37, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.RLeg = new AdvancedModelRenderer(this);
        this.RLeg.setRotationPoint(-1.0F, 0.0F, -0.25F);
        this.Head.addChild(RLeg);
        this.setRotateAngle(RLeg, 0.0F, 0.0F, -0.1745F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 7, 37, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -1.0F, -2.0F);
        this.Head.addChild(forehead);
        this.setRotateAngle(forehead, 0.3054F, 0.0F, 0.0F);
        this.forehead.cubeList.add(new ModelBox(forehead, 0, 15, -1.0F, -0.1F, 0.0F, 2, 1, 3, 0.0F, false));
        this.forehead.cubeList.add(new ModelBox(forehead, 18, 23, -2.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        this.lhorn = new AdvancedModelRenderer(this);
        this.lhorn.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.forehead.addChild(lhorn);
        this.setRotateAngle(lhorn, 0.3104F, 0.4219F, -0.0491F);
        this.lhorn.cubeList.add(new ModelBox(lhorn, 36, 0, 0.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.lhorn2 = new AdvancedModelRenderer(this);
        this.lhorn2.setRotationPoint(0.5F, 0.0F, 2.0F);
        this.lhorn.addChild(lhorn2);
        this.setRotateAngle(lhorn2, -0.3491F, 0.0F, 0.0F);
        this.lhorn2.cubeList.add(new ModelBox(lhorn2, 28, 11, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.lhorn3 = new AdvancedModelRenderer(this);
        this.lhorn3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.lhorn2.addChild(lhorn3);
        this.setRotateAngle(lhorn3, -0.7854F, 0.0F, 0.0F);
        this.lhorn3.cubeList.add(new ModelBox(lhorn3, 21, 11, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.lhorn4 = new AdvancedModelRenderer(this);
        this.lhorn4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.lhorn3.addChild(lhorn4);
        this.setRotateAngle(lhorn4, -1.6185F, 0.0376F, -0.215F);
        this.lhorn4.cubeList.add(new ModelBox(lhorn4, 8, 15, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lhorn4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -1.038F, 0.1018F, -0.2873F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 19, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, false));

        this.rhorn = new AdvancedModelRenderer(this);
        this.rhorn.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.forehead.addChild(rhorn);
        this.setRotateAngle(rhorn, 0.3104F, -0.4219F, 0.0491F);
        this.rhorn.cubeList.add(new ModelBox(rhorn, 36, 0, -1.0F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.rhorn2 = new AdvancedModelRenderer(this);
        this.rhorn2.setRotationPoint(-0.5F, 0.0F, 2.0F);
        this.rhorn.addChild(rhorn2);
        this.setRotateAngle(rhorn2, -0.3491F, 0.0F, 0.0F);
        this.rhorn2.cubeList.add(new ModelBox(rhorn2, 28, 11, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.rhorn3 = new AdvancedModelRenderer(this);
        this.rhorn3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rhorn2.addChild(rhorn3);
        this.setRotateAngle(rhorn3, -0.7854F, 0.0F, 0.0F);
        this.rhorn3.cubeList.add(new ModelBox(rhorn3, 21, 11, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.rhorn4 = new AdvancedModelRenderer(this);
        this.rhorn4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.rhorn3.addChild(rhorn4);
        this.setRotateAngle(rhorn4, -1.6185F, -0.0376F, 0.215F);
        this.rhorn4.cubeList.add(new ModelBox(rhorn4, 8, 15, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.rhorn4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -1.038F, -0.1018F, 0.2873F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 19, -0.5F, 0.0F, 0.0F, 1, 0, 2, 0.0F, true));

        this.LAntennae = new AdvancedModelRenderer(this);
        this.LAntennae.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.Head.addChild(LAntennae);
        this.setRotateAngle(LAntennae, 0.0F, -0.3491F, 0.0F);
        this.LAntennae.cubeList.add(new ModelBox(LAntennae, 18, 15, 0.0F, -0.01F, -5.0F, 7, 0, 7, 0.0F, false));

        this.RAntennae = new AdvancedModelRenderer(this);
        this.RAntennae.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.Head.addChild(RAntennae);
        this.setRotateAngle(RAntennae, 0.0F, 0.3491F, 0.0F);
        this.RAntennae.cubeList.add(new ModelBox(RAntennae, 18, 15, -7.0F, -0.01F, -5.0F, 7, 0, 7, 0.0F, true));

        this.lside = new AdvancedModelRenderer(this);
        this.lside.setRotationPoint(2.0F, -1.0F, -2.0F);
        this.Head.addChild(lside);
        this.setRotateAngle(lside, 0.0F, -0.4363F, 0.0F);
        this.lside.cubeList.add(new ModelBox(lside, 36, 6, 0.0F, 0.01F, 0.0F, 2, 1, 1, 0.0F, false));

        this.lside2 = new AdvancedModelRenderer(this);
        this.lside2.setRotationPoint(2.0F, 1.0F, 0.0F);
        this.lside.addChild(lside2);
        this.setRotateAngle(lside2, 0.0F, 0.9599F, 0.0F);
        this.lside2.cubeList.add(new ModelBox(lside2, 7, 9, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.lside2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.0472F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 29, 0.0F, -0.98F, -2.0F, 2, 1, 2, 0.0F, false));

        this.lspikelarge = new AdvancedModelRenderer(this);
        this.lspikelarge.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.lside2.addChild(lspikelarge);
        this.setRotateAngle(lspikelarge, 0.0F, 0.9599F, 0.0F);
        this.lspikelarge.cubeList.add(new ModelBox(lspikelarge, 0, 9, 0.0F, -0.5F, 0.0F, 1, 0, 4, 0.0F, false));

        this.lspikelarge2 = new AdvancedModelRenderer(this);
        this.lspikelarge2.setRotationPoint(1.0F, -0.5F, 4.0F);
        this.lspikelarge.addChild(lspikelarge2);
        this.setRotateAngle(lspikelarge2, 0.0F, -0.0873F, 0.0F);
        this.lspikelarge2.cubeList.add(new ModelBox(lspikelarge2, 21, 4, -1.0F, 0.01F, 0.0F, 1, 0, 3, 0.0F, false));

        this.lspikelarge3 = new AdvancedModelRenderer(this);
        this.lspikelarge3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.lspikelarge2.addChild(lspikelarge3);
        this.setRotateAngle(lspikelarge3, 0.0F, -0.2618F, 0.0F);
        this.lspikelarge3.cubeList.add(new ModelBox(lspikelarge3, 0, 4, -1.0F, 0.02F, 0.0F, 1, 0, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.lspikelarge3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.3054F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 0, -1.0F, 0.03F, 0.0F, 1, 0, 3, 0.0F, false));

        this.rside = new AdvancedModelRenderer(this);
        this.rside.setRotationPoint(-2.0F, -1.0F, -2.0F);
        this.Head.addChild(rside);
        this.setRotateAngle(rside, 0.0F, 0.4363F, 0.0F);
        this.rside.cubeList.add(new ModelBox(rside, 36, 6, -2.0F, 0.01F, 0.0F, 2, 1, 1, 0.0F, true));

        this.rside2 = new AdvancedModelRenderer(this);
        this.rside2.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.rside.addChild(rside2);
        this.setRotateAngle(rside2, 0.0F, -0.9599F, 0.0F);
        this.rside2.cubeList.add(new ModelBox(rside2, 7, 9, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.rside2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -1.0472F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 29, -2.0F, -0.98F, -2.0F, 2, 1, 2, 0.0F, true));

        this.lspikelarge4 = new AdvancedModelRenderer(this);
        this.lspikelarge4.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.rside2.addChild(lspikelarge4);
        this.setRotateAngle(lspikelarge4, 0.0F, -0.9599F, 0.0F);
        this.lspikelarge4.cubeList.add(new ModelBox(lspikelarge4, 0, 9, -1.0F, -0.5F, 0.0F, 1, 0, 4, 0.0F, true));

        this.lspikelarge5 = new AdvancedModelRenderer(this);
        this.lspikelarge5.setRotationPoint(-1.0F, -0.5F, 4.0F);
        this.lspikelarge4.addChild(lspikelarge5);
        this.setRotateAngle(lspikelarge5, 0.0F, 0.0873F, 0.0F);
        this.lspikelarge5.cubeList.add(new ModelBox(lspikelarge5, 21, 4, 0.0F, 0.01F, 0.0F, 1, 0, 3, 0.0F, true));

        this.lspikelarge6 = new AdvancedModelRenderer(this);
        this.lspikelarge6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.lspikelarge5.addChild(lspikelarge6);
        this.setRotateAngle(lspikelarge6, 0.0F, 0.2618F, 0.0F);
        this.lspikelarge6.cubeList.add(new ModelBox(lspikelarge6, 0, 4, 0.0F, 0.02F, 0.0F, 1, 0, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.lspikelarge6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.3054F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 0, 0.0F, 0.03F, 0.0F, 1, 0, 3, 0.0F, true));

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 0.25F, -2.0F);
        this.Root.addChild(Body);
        this.Body.cubeList.add(new ModelBox(Body, 0, 29, -2.5F, -0.5F, 0.0F, 5, 1, 2, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 35, 11, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.Body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.1309F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 37, -2.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.Body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.1309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 37, 0.0F, 0.0F, 0.0F, 2, 0, 1, 0.0F, false));

        this.LLeg2 = new AdvancedModelRenderer(this);
        this.LLeg2.setRotationPoint(0.75F, 0.5F, 1.0F);
        this.Body.addChild(LLeg2);
        this.setRotateAngle(LLeg2, 0.0F, 0.0F, 0.1745F);
        this.LLeg2.cubeList.add(new ModelBox(LLeg2, 7, 37, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.RLeg2 = new AdvancedModelRenderer(this);
        this.RLeg2.setRotationPoint(-0.75F, 0.5F, 1.0F);
        this.Body.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 0.0F, 0.0F, -0.1745F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 7, 37, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 24, -2.25F, -0.49F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 20, -0.75F, -0.49F, 0.0F, 3, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 27, 33, -1.0F, -0.74F, 0.0F, 2, 1, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 18, 33, -1.0F, -0.48F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.25F, 0.0F, 0.0F);
        this.Body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.3927F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -2.5F, 0.03F, 0.0F, 3, 0, 14, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.25F, 0.0F, 0.0F);
        this.Body2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.3927F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, 0.03F, 0.0F, 3, 0, 14, 0.0F, false));

        this.LLeg3 = new AdvancedModelRenderer(this);
        this.LLeg3.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.Body2.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 0.0F, 0.0F, 0.1745F);
        this.LLeg3.cubeList.add(new ModelBox(LLeg3, 7, 37, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.RLeg3 = new AdvancedModelRenderer(this);
        this.RLeg3.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.Body2.addChild(RLeg3);
        this.setRotateAngle(RLeg3, 0.0F, 0.0F, -0.1745F);
        this.RLeg3.cubeList.add(new ModelBox(RLeg3, 7, 37, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 0, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 33, 23, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.Body3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.2182F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 15, -1.75F, 0.04F, 0.3F, 2, 0, 13, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.Body3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.2182F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 15, -0.25F, 0.04F, 0.3F, 2, 0, 13, 0.0F, false));

        this.LLeg4 = new AdvancedModelRenderer(this);
        this.LLeg4.setRotationPoint(0.25F, 0.5F, 1.0F);
        this.Body3.addChild(LLeg4);
        this.setRotateAngle(LLeg4, 0.0F, 0.0F, 0.1745F);
        this.LLeg4.cubeList.add(new ModelBox(LLeg4, 7, 37, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.RLeg4 = new AdvancedModelRenderer(this);
        this.RLeg4.setRotationPoint(-0.25F, 0.5F, 1.0F);
        this.Body3.addChild(RLeg4);
        this.setRotateAngle(RLeg4, 0.0F, 0.0F, -0.1745F);
        this.RLeg4.cubeList.add(new ModelBox(RLeg4, 7, 37, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 9, 33, -1.75F, -0.49F, 0.0F, 2, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 33, -0.25F, -0.49F, 0.0F, 2, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 20, 0, 1.25F, 0.05F, 0.0F, 2, 0, 11, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 20, 0, -3.25F, 0.05F, 0.0F, 2, 0, 11, 0.0F, true));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 37, -1.0F, -0.5F, 2.0F, 2, 1, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 34, 35, -0.5F, -0.74F, 0.0F, 1, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 18, 15, -0.5F, -0.49F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.Body4.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 36, 3, -0.2F, 0.06F, -0.5F, 1, 0, 2, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, 0.0F, 3.0F);
        this.Body4.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1745F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 3, -0.8F, 0.06F, -0.5F, 1, 0, 2, 0.0F, false));

        this.LLeg5 = new AdvancedModelRenderer(this);
        this.LLeg5.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Body4.addChild(LLeg5);
        this.setRotateAngle(LLeg5, 0.0F, 0.0F, 0.1745F);
        this.LLeg5.cubeList.add(new ModelBox(LLeg5, 7, 37, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.RLeg5 = new AdvancedModelRenderer(this);
        this.RLeg5.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Body4.addChild(RLeg5);
        this.setRotateAngle(RLeg5, 0.0F, 0.0F, -0.1745F);
        this.RLeg5.cubeList.add(new ModelBox(RLeg5, 7, 37, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.lspikesmall = new AdvancedModelRenderer(this);
        this.lspikesmall.setRotationPoint(2.5F, 0.0F, 1.0F);
        this.Body.addChild(lspikesmall);
        this.setRotateAngle(lspikesmall, 0.0F, -0.2618F, 0.0F);
        this.lspikesmall.cubeList.add(new ModelBox(lspikesmall, 21, 8, 0.0F, -0.01F, 0.0F, 3, 0, 1, 0.0F, false));

        this.lspikesmall2 = new AdvancedModelRenderer(this);
        this.lspikesmall2.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.lspikesmall.addChild(lspikesmall2);
        this.setRotateAngle(lspikesmall2, 0.0F, -0.1309F, 0.0F);
        this.lspikesmall2.cubeList.add(new ModelBox(lspikesmall2, 34, 33, 0.0F, 0.01F, 0.0F, 2, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.0F, 0.0F, 0.0F);
        this.lspikesmall2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.6109F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 22, 29, 0.0F, 0.02F, 0.0F, 2, 0, 1, 0.0F, false));

        this.lspikesmall3 = new AdvancedModelRenderer(this);
        this.lspikesmall3.setRotationPoint(-2.5F, 0.0F, 1.0F);
        this.Body.addChild(lspikesmall3);
        this.setRotateAngle(lspikesmall3, 0.0F, 0.2618F, 0.0F);
        this.lspikesmall3.cubeList.add(new ModelBox(lspikesmall3, 21, 8, -3.0F, -0.01F, 0.0F, 3, 0, 1, 0.0F, true));

        this.lspikesmall4 = new AdvancedModelRenderer(this);
        this.lspikesmall4.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.lspikesmall3.addChild(lspikesmall4);
        this.setRotateAngle(lspikesmall4, 0.0F, 0.1309F, 0.0F);
        this.lspikesmall4.cubeList.add(new ModelBox(lspikesmall4, 34, 33, -2.0F, 0.01F, 0.0F, 2, 0, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-2.0F, 0.0F, 0.0F);
        this.lspikesmall4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.6109F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 29, -2.0F, 0.02F, 0.0F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Root.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.Root.offsetZ = -0.03F;
        this.Root.render(0.022f);
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Root.offsetY = 1.3F;

        AdvancedModelRenderer[] legsL = {this.LLeg, this.LLeg2, this.LLeg3, this.LLeg4, this.LLeg5};
        AdvancedModelRenderer[] legsR = {this.RLeg, this.RLeg2, this.RLeg3, this.RLeg4, this.RLeg5};

        this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
        this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);

        this.swing(LAntennae, 0.5F, -0.3F, false, 0, -0.1F, f2, 0.8F);
        this.swing(RAntennae, 0.5F, 0.3F, false, 0, 0.1F, f2, 0.8F);

        this.flap(LLeg, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
        this.flap(RLeg, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
        this.flap(LLeg2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
        this.flap(LLeg5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
        this.flap(RLeg5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
    }
}
