package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraHerrerasaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelHerrerasaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended lips;
    private final AdvancedModelRendererExtended lips5;
    private final AdvancedModelRendererExtended nose2;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended forehead2;
    private final AdvancedModelRendererExtended crest3;
    private final AdvancedModelRendererExtended crest4;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended teeth2;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended lips2;
    private final AdvancedModelRendererExtended nose3;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended forehead3;
    private final AdvancedModelRendererExtended crest2;
    private final AdvancedModelRendererExtended crest5;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended teeth3;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended lips3;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended lips4;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended lips6;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended ThroatPouch;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended armLeft;
    private final AdvancedModelRendererExtended armLeft2;
    private final AdvancedModelRendererExtended handLeft;
    private final AdvancedModelRendererExtended armRight;
    private final AdvancedModelRendererExtended armRight2;
    private final AdvancedModelRendererExtended handRight;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended legRight;
    private final AdvancedModelRendererExtended legRight2;
    private final AdvancedModelRendererExtended legRight3;
    private final AdvancedModelRendererExtended footRight;
    private final AdvancedModelRendererExtended legLeft;
    private final AdvancedModelRendererExtended legLeft2;
    private final AdvancedModelRendererExtended legLeft3;
    private final AdvancedModelRendererExtended footLeft;

    private ModelAnimator animator;

    public ModelHerrerasaurus() {
        this.textureWidth = 92;
        this.textureHeight = 92;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, -1.25F, 0.0F);


        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0873F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 0, -4.0F, -5.0F, -4.0F, 8, 14, 12, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -3.1F, -4.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 26, -4.5F, -2.0F, -9.0F, 9, 12, 10, 0.0F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 0.1F, -8.0F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 48, -3.5F, -2.0F, -8.0F, 7, 10, 8, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -2.1051F, -9.7305F);
        this.chest.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 74, -2.0F, -3.1449F, 3.7305F, 4, 3, 2, 0.0F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.25F, -6.0F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 60, 0, -2.5F, -2.0F, -5.0F, 5, 7, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -2.3551F, -3.7305F);
        this.neck.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 79, -1.5F, -1.5F, -0.2695F, 3, 3, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.1F, -4.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.1745F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 67, 12, -2.0F, -2.0F, -5.0F, 4, 6, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -2.2173F, -3.0761F);
        this.neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3927F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 74, -1.0F, -1.5F, -1.0F, 2, 3, 2, 0.0F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, 0.1F, -4.0F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 34, 54, -1.5F, -2.0F, -5.0F, 3, 5, 5, -0.02F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -2.7F, 0.0F);
        this.neck3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.48F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 74, -1.0F, 0.0F, -3.0F, 2, 3, 2, 0.0F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -1.15F, -4.1F);
        this.neck3.addChild(Head);
        this.setRotateAngle(Head, 0.3927F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 52, 16, -1.5F, -1.0F, -4.0F, 3, 3, 4, 0.0F, false));

        this.lips = new AdvancedModelRendererExtended(this);
        this.lips.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Head.addChild(lips);
        this.setRotateAngle(lips, 0.1745F, 0.0F, 0.0F);
        this.lips.cubeList.add(new ModelBox(lips, 18, 68, -1.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.lips5 = new AdvancedModelRendererExtended(this);
        this.lips5.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.lips.addChild(lips5);
        this.setRotateAngle(lips5, -0.2182F, -0.0002F, -0.0002F);
        this.lips5.cubeList.add(new ModelBox(lips5, 22, 51, -0.75F, -2.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.nose2 = new AdvancedModelRendererExtended(this);
        this.nose2.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.lips5.addChild(nose2);
        this.setRotateAngle(nose2, 0.5323F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nose2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2531F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 75, 3, -0.75F, -0.4058F, 0.8826F, 1, 1, 1, -0.005F, true));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nose2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 4, -0.75F, 0.0F, 0.0F, 1, 1, 1, -0.001F, true));

        this.forehead2 = new AdvancedModelRendererExtended(this);
        this.forehead2.setRotationPoint(0.0F, 0.075F, 1.9F);
        this.nose2.addChild(forehead2);
        this.setRotateAngle(forehead2, -0.4145F, 0.0F, 0.0F);
        this.forehead2.cubeList.add(new ModelBox(forehead2, 65, 67, -0.75F, 0.0F, 0.0F, 1, 2, 5, -0.002F, true));

        this.crest3 = new AdvancedModelRendererExtended(this);
        this.crest3.setRotationPoint(-0.75F, 0.0F, 1.5F);
        this.forehead2.addChild(crest3);
        this.setRotateAngle(crest3, 0.1309F, -0.2182F, 0.0F);
        this.crest3.cubeList.add(new ModelBox(crest3, 28, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.crest4 = new AdvancedModelRendererExtended(this);
        this.crest4.setRotationPoint(-0.75F, 0.0F, 1.5F);
        this.forehead2.addChild(crest4);
        this.setRotateAngle(crest4, 0.1309F, -0.2182F, 0.0F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(1.0F, 0.0F, 2.0F);
        this.crest4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 33, 10, -1.0F, 0.0F, 0.575F, 1, 1, 1, -0.002F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 36, 9, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, true));

        this.teeth2 = new AdvancedModelRendererExtended(this);
        this.teeth2.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.lips5.addChild(teeth2);
        this.setRotateAngle(teeth2, -0.0438F, -0.0872F, 0.0038F);
        this.teeth2.cubeList.add(new ModelBox(teeth2, 0, 7, -0.3F, -0.25F, 0.0F, 0, 1, 3, 0.0F, true));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.teeth2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -0.3F, 0.0F, 0.75F, 0, 1, 1, 0.0F, true));

        this.lips2 = new AdvancedModelRendererExtended(this);
        this.lips2.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.lips.addChild(lips2);
        this.setRotateAngle(lips2, -0.2182F, 0.0002F, 0.0002F);
        this.lips2.cubeList.add(new ModelBox(lips2, 22, 51, -0.25F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));

        this.nose3 = new AdvancedModelRendererExtended(this);
        this.nose3.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.lips2.addChild(nose3);
        this.setRotateAngle(nose3, 0.5323F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nose3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.2531F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 75, 3, -0.25F, -0.4058F, 0.8826F, 1, 1, 1, -0.005F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.nose3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 29, 4, -0.25F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

        this.forehead3 = new AdvancedModelRendererExtended(this);
        this.forehead3.setRotationPoint(0.0F, 0.075F, 1.9F);
        this.nose3.addChild(forehead3);
        this.setRotateAngle(forehead3, -0.4145F, 0.0F, 0.0F);
        this.forehead3.cubeList.add(new ModelBox(forehead3, 65, 67, -0.25F, 0.0F, 0.0F, 1, 2, 5, -0.002F, false));

        this.crest2 = new AdvancedModelRendererExtended(this);
        this.crest2.setRotationPoint(0.75F, 0.0F, 1.5F);
        this.forehead3.addChild(crest2);
        this.setRotateAngle(crest2, 0.1309F, 0.2182F, 0.0F);
        this.crest2.cubeList.add(new ModelBox(crest2, 28, 0, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.crest5 = new AdvancedModelRendererExtended(this);
        this.crest5.setRotationPoint(0.75F, 0.0F, 1.5F);
        this.forehead3.addChild(crest5);
        this.setRotateAngle(crest5, 0.1309F, 0.2182F, 0.0F);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.0F, 2.0F);
        this.crest5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 10, 0.0F, 0.0F, 0.575F, 1, 1, 1, -0.002F, false));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 9, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

        this.teeth3 = new AdvancedModelRendererExtended(this);
        this.teeth3.setRotationPoint(0.0F, 0.0F, -2.5F);
        this.lips2.addChild(teeth3);
        this.setRotateAngle(teeth3, -0.0438F, 0.0872F, -0.0038F);
        this.teeth3.cubeList.add(new ModelBox(teeth3, 0, 7, 0.3F, -0.25F, 0.0F, 0, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -0.25F, 3.0F);
        this.teeth3.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, 0.3F, 0.0F, 0.75F, 0, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 56, 67, -1.5F, 0.0F, -4.0F, 3, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 30, 68, -1.0F, -3.0F, 0.0F, 2, 3, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1745F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 65, 38, -1.5F, -1.0F, -4.0F, 3, 1, 4, -0.001F, false));

        this.lips3 = new AdvancedModelRendererExtended(this);
        this.lips3.setRotationPoint(0.0F, 0.0F, -3.9F);
        this.jaw.addChild(lips3);
        this.setRotateAngle(lips3, 0.1745F, 0.0F, 0.0F);
        this.lips3.cubeList.add(new ModelBox(lips3, 68, 28, -1.0F, 0.0F, -3.75F, 2, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 1.0F, -3.75F);
        this.lips3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.192F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 28, 9, -1.0F, -1.0F, 2.5F, 2, 1, 1, -0.002F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 69, 43, -1.0F, -1.0F, 0.0F, 2, 1, 3, -0.01F, false));

        this.lips4 = new AdvancedModelRendererExtended(this);
        this.lips4.setRotationPoint(0.0F, 1.0F, -3.75F);
        this.lips3.addChild(lips4);
        this.setRotateAngle(lips4, -0.2182F, 0.0F, 0.0F);
        this.lips4.cubeList.add(new ModelBox(lips4, 13, 66, -0.25F, -1.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.lips4.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0873F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 6, 7, 0.3F, -0.5F, 1.0F, 0, 1, 3, 0.0F, false));

        this.lips6 = new AdvancedModelRendererExtended(this);
        this.lips6.setRotationPoint(0.0F, 1.0F, -3.75F);
        this.lips3.addChild(lips6);
        this.setRotateAngle(lips6, -0.2182F, 0.0F, 0.0F);
        this.lips6.cubeList.add(new ModelBox(lips6, 13, 66, -0.75F, -1.0F, -3.0F, 1, 1, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, -1.0F, -2.5F);
        this.lips6.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.0873F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 6, 7, -0.3F, -0.5F, 1.0F, 0, 1, 3, 0.0F, true));

        this.ThroatPouch = new AdvancedModelRendererExtended(this);
        this.ThroatPouch.setRotationPoint(0.0F, 1.7F, -4.0F);
        this.jaw.addChild(ThroatPouch);


        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ThroatPouch.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0698F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 68, 23, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.armLeft = new AdvancedModelRendererExtended(this);
        this.armLeft.setRotationPoint(3.5F, 6.0F, -6.0F);
        this.chest.addChild(armLeft);
        this.setRotateAngle(armLeft, 0.9563F, 0.0571F, 0.0462F);
        this.armLeft.cubeList.add(new ModelBox(armLeft, 0, 0, -1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F, false));

        this.armLeft2 = new AdvancedModelRendererExtended(this);
        this.armLeft2.setRotationPoint(0.0F, 5.0F, 0.5F);
        this.armLeft.addChild(armLeft2);
        this.setRotateAngle(armLeft2, -0.9595F, 0.0357F, 0.025F);
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 0, 26, -1.0F, 0.0F, -2.0F, 2, 7, 3, 0.0F, false));

        this.handLeft = new AdvancedModelRendererExtended(this);
        this.handLeft.setRotationPoint(1.0F, 6.5F, -0.5F);
        this.armLeft2.addChild(handLeft);
        this.setRotateAngle(handLeft, 0.0F, 0.0F, 0.4363F);
        this.handLeft.cubeList.add(new ModelBox(handLeft, 0, 48, -1.0F, 0.0F, -1.5F, 1, 5, 3, 0.01F, false));

        this.armRight = new AdvancedModelRendererExtended(this);
        this.armRight.setRotationPoint(-3.5F, 6.0F, -6.0F);
        this.chest.addChild(armRight);
        this.setRotateAngle(armRight, 0.9563F, -0.0571F, -0.0462F);
        this.armRight.cubeList.add(new ModelBox(armRight, 0, 0, -1.5F, -1.0F, -1.5F, 3, 7, 3, 0.0F, true));

        this.armRight2 = new AdvancedModelRendererExtended(this);
        this.armRight2.setRotationPoint(0.0F, 5.0F, 0.5F);
        this.armRight.addChild(armRight2);
        this.setRotateAngle(armRight2, -0.9595F, -0.0357F, -0.025F);
        this.armRight2.cubeList.add(new ModelBox(armRight2, 0, 26, -1.0F, 0.0F, -2.0F, 2, 7, 3, 0.0F, true));

        this.handRight = new AdvancedModelRendererExtended(this);
        this.handRight.setRotationPoint(-1.0F, 6.5F, -0.5F);
        this.armRight2.addChild(handRight);
        this.setRotateAngle(handRight, 0.0F, 0.0F, -0.4363F);
        this.handRight.cubeList.add(new ModelBox(handRight, 0, 48, 0.0F, 0.0F, -1.5F, 1, 5, 3, 0.01F, true));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -1.9F, 7.0F);
        this.hips.addChild(tail1);
        this.tail1.cubeList.add(new ModelBox(tail1, 30, 16, -3.0F, -3.0F, 0.0F, 6, 9, 10, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.9F, 9.0F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 37, -2.5F, -2.0F, 0.0F, 5, 6, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.1F, 10.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 40, 0, -2.0F, -2.0F, 0.0F, 4, 4, 12, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.9F, 11.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 50, 23, -1.5F, -1.0F, 0.0F, 3, 3, 12, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.1F, 11.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2618F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 18, 54, -1.0F, -1.0F, 0.0F, 2, 2, 12, 0.0F, false));

        this.legRight = new AdvancedModelRendererExtended(this);
        this.legRight.setRotationPoint(-3.5F, -0.5F, 0.0F);
        this.hips.addChild(legRight);
        this.setRotateAngle(legRight, -0.3054F, 0.0F, 0.0F);
        this.legRight.cubeList.add(new ModelBox(legRight, 51, 46, -2.5F, -1.5F, -3.5F, 5, 13, 8, 0.0F, true));

        this.legRight2 = new AdvancedModelRendererExtended(this);
        this.legRight2.setRotationPoint(0.0F, 10.5F, -2.5F);
        this.legRight.addChild(legRight2);
        this.setRotateAngle(legRight2, 0.9599F, 0.0F, 0.0F);
        this.legRight2.cubeList.add(new ModelBox(legRight2, 0, 66, -2.0F, 0.0F, -1.0F, 4, 14, 5, 0.0F, true));

        this.legRight3 = new AdvancedModelRendererExtended(this);
        this.legRight3.setRotationPoint(0.5F, 13.0F, 2.5F);
        this.legRight2.addChild(legRight3);
        this.setRotateAngle(legRight3, -0.9163F, 0.0F, 0.0F);
        this.legRight3.cubeList.add(new ModelBox(legRight3, 42, 67, -2.0F, 0.0F, -3.0F, 3, 7, 4, 0.0F, true));

        this.footRight = new AdvancedModelRendererExtended(this);
        this.footRight.setRotationPoint(0.0F, 7.0F, -1.0F);
        this.legRight3.addChild(footRight);
        this.setRotateAngle(footRight, 0.3491F, 0.0F, 0.0F);
        this.footRight.cubeList.add(new ModelBox(footRight, 28, 0, -3.0F, -1.25F, -6.0F, 5, 2, 7, 0.0F, true));
        this.footRight.cubeList.add(new ModelBox(footRight, 48, 38, -3.0F, 0.25F, -6.0F, 5, 1, 7, -0.001F, true));

        this.legLeft = new AdvancedModelRendererExtended(this);
        this.legLeft.setRotationPoint(3.5F, -0.5F, 0.0F);
        this.hips.addChild(legLeft);
        this.setRotateAngle(legLeft, -0.3054F, 0.0F, 0.0F);
        this.legLeft.cubeList.add(new ModelBox(legLeft, 51, 46, -2.5F, -1.5F, -3.5F, 5, 13, 8, 0.0F, false));

        this.legLeft2 = new AdvancedModelRendererExtended(this);
        this.legLeft2.setRotationPoint(0.0F, 10.5F, -2.5F);
        this.legLeft.addChild(legLeft2);
        this.setRotateAngle(legLeft2, 0.9599F, 0.0F, 0.0F);
        this.legLeft2.cubeList.add(new ModelBox(legLeft2, 0, 66, -2.0F, 0.0F, -1.0F, 4, 14, 5, 0.0F, false));

        this.legLeft3 = new AdvancedModelRendererExtended(this);
        this.legLeft3.setRotationPoint(-0.5F, 13.0F, 2.5F);
        this.legLeft2.addChild(legLeft3);
        this.setRotateAngle(legLeft3, -0.9163F, 0.0F, 0.0F);
        this.legLeft3.cubeList.add(new ModelBox(legLeft3, 42, 67, -1.0F, 0.0F, -3.0F, 3, 7, 4, 0.0F, false));

        this.footLeft = new AdvancedModelRendererExtended(this);
        this.footLeft.setRotationPoint(0.0F, 7.0F, -1.0F);
        this.legLeft3.addChild(footLeft);
        this.setRotateAngle(footLeft, 0.3491F, 0.0F, 0.0F);
        this.footLeft.cubeList.add(new ModelBox(footLeft, 28, 0, -2.0F, -1.25F, -6.0F, 5, 2, 7, 0.0F, false));
        this.footLeft.cubeList.add(new ModelBox(footLeft, 48, 38, -2.0F, 0.25F, -6.0F, 5, 1, 7, -0.001F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.jaw.rotateAngleX = (float) Math.toRadians(45);
        this.neck3.rotateAngleX = (float) Math.toRadians(20);
        this.Head.rotateAngleX = (float) Math.toRadians(-7);
        this.neck2.rotateAngleX = (float) Math.toRadians(-20);
        this.neck2.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.13F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
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
        //this.basin.offsetY = 0.30F;
        //this.basin.offsetZ = 0.2F;

        EntityPrehistoricFloraHerrerasaurus Herrerasaurus = (EntityPrehistoricFloraHerrerasaurus) e;
        float masterSpeed = Herrerasaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, neck2);
        this.faceTarget(f3, f4, 8, neck3);
        this.faceTarget(f3, f4, 8, Head);

        //float speed = 0.2F;

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.Head};
        Herrerasaurus.tailBuffer.applyChainSwingBuffer(Tail);

        AdvancedModelRenderer[] ArmL = {this.armLeft, this.armLeft2};
        AdvancedModelRenderer[] ArmR = {this.armRight, this.armRight2};

        //AdvancedModelRenderer[] Whole = {this.neck2, this.neck, this.body, this.body2, this.body3, this.tail, this.tail2, this.tail3, this.tail4, this.tail5};

        if (Herrerasaurus.getAnimation() == Herrerasaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
            //Other stuff

            return;
        }
        
        if (!Herrerasaurus.isReallyInWater()) {

            if (f3 == 0.0F || !Herrerasaurus.getIsMoving()) {
                this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                this.chainWave(Tail, (0.15F * 0.5F), 0.125F * 0.35F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

                return;
           }

            if (Herrerasaurus.getIsFast()) { //Running
                float speed = masterSpeed / 2F;

                this.chainWave(Tail, (speed * 1.2F), 0.125F, 0.5F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.6F) * 4F, 0.05F, 0.12F, f2, 1F);

            }
            else { //Walking
                float speed = masterSpeed / 1.50F;

                this.chainWave(Tail, (speed * 0.5F), 0.125F * 0.55F, 0.2F, f2, 1F);
                this.chainSwing(Tail, (speed * 0.5F) * 4F, 0.05F * 0.65F, 0.12F, f2, 1F);

            }
        }
        else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraHerrerasaurus ee = (EntityPrehistoricFloraHerrerasaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
//        if (ee.getAnimation() == ee.EAT_ANIMATION) {
//            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }
//        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }
        if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) {
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHerrerasaurus entity = (EntityPrehistoricFloraHerrerasaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -5 + (((tickAnim - 14) / 6) * (0-(-5)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 20) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 14) * (5-(0)));
            zz = 0 + (((tickAnim - 20) / 14) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 5 + (((tickAnim - 34) / 6) * (0-(5)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = -3 + (((tickAnim - 0) / 6) * (0-(-3)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-1.41-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -1.41 + (((tickAnim - 13) / 2) * (-1-(-1.41)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 15) / 5) * (-3-(-1)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = -3 + (((tickAnim - 20) / 6) * (0-(-3)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (-1.41-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 2) * (0-(0)));
            zz = -1.41 + (((tickAnim - 33) / 2) * (-1-(-1.41)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 35) / 5) * (-3-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 1.33 + (((tickAnim - 0) / 10) * (0-(1.33)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (-2-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 15) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -2 + (((tickAnim - 15) / 5) * (-1.33-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -1.33 + (((tickAnim - 20) / 10) * (0-(-1.33)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (2-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 35) / 5) * (0-(5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 2 + (((tickAnim - 35) / 5) * (1.33-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 1.45 + (((tickAnim - 0) / 7) * (0.5-(1.45)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.5 + (((tickAnim - 7) / 6) * (2-(0.5)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 13) / 7) * (1.45-(2)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 1.45 + (((tickAnim - 20) / 7) * (0.5-(1.45)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 27) / 6) * (0-(0)));
            yy = 0.5 + (((tickAnim - 27) / 6) * (2-(0.5)));
            zz = 0 + (((tickAnim - 27) / 6) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 33) / 7) * (1.45-(2)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -1.23 + (((tickAnim - 0) / 10) * (0-(-1.23)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 10) / 5) * (-3-(2)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (1.85-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3 + (((tickAnim - 15) / 5) * (0-(-3)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 1.85 + (((tickAnim - 15) / 5) * (1.23-(1.85)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (2-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 1.23 + (((tickAnim - 20) / 10) * (0-(1.23)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 2 + (((tickAnim - 30) / 5) * (-3-(2)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (-1.85-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -3 + (((tickAnim - 35) / 5) * (0-(-3)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -1.85 + (((tickAnim - 35) / 5) * (-1.23-(-1.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -1 + (((tickAnim - 0) / 2) * (0-(-1)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 1.44 + (((tickAnim - 0) / 2) * (-1.23-(1.44)));
        }
        else if (tickAnim >= 2 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 2) / 10) * (1-(0)));
            yy = 0 + (((tickAnim - 2) / 10) * (0-(0)));
            zz = -1.23 + (((tickAnim - 2) / 10) * (0-(-1.23)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 1 + (((tickAnim - 12) / 5) * (-3-(1)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (1.85-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -3 + (((tickAnim - 17) / 3) * (-1-(-3)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 1.85 + (((tickAnim - 17) / 3) * (1.44-(1.85)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = -1 + (((tickAnim - 20) / 2) * (0-(-1)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 1.44 + (((tickAnim - 20) / 2) * (1.23-(1.44)));
        }
        else if (tickAnim >= 22 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 22) / 10) * (1-(0)));
            yy = 0 + (((tickAnim - 22) / 10) * (0-(0)));
            zz = 1.23 + (((tickAnim - 22) / 10) * (0-(1.23)));
        }
        else if (tickAnim >= 32 && tickAnim < 37) {
            xx = 1 + (((tickAnim - 32) / 5) * (-3-(1)));
            yy = 0 + (((tickAnim - 32) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 5) * (-1.85-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -3 + (((tickAnim - 37) / 3) * (-1-(-3)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = -1.85 + (((tickAnim - 37) / 3) * (1.44-(-1.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -7 + (((tickAnim - 5) / 5) * (2-(-7)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (-7-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -7 + (((tickAnim - 25) / 5) * (2-(-7)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 30) / 10) * (0-(2)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.5 + (((tickAnim - 0) / 5) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -6 + (((tickAnim - 5) / 8) * (-10-(-6)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -10 + (((tickAnim - 13) / 7) * (0.5-(-10)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0.5 + (((tickAnim - 20) / 5) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -6 + (((tickAnim - 25) / 8) * (-10-(-6)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 33) / 7) * (0.5-(-10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 12 + (((tickAnim - 5) / 3) * (5-(12)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 5 + (((tickAnim - 8) / 8) * (3-(5)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 3 + (((tickAnim - 16) / 4) * (0-(3)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (12-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 12 + (((tickAnim - 25) / 3) * (5-(12)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 5 + (((tickAnim - 28) / 8) * (3-(5)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 36) / 4) * (0-(3)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (1-(0)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 1 + (((tickAnim - 12) / 4) * (0-(1)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 24) / 8) * (1-(0)));
            yy = 0 + (((tickAnim - 24) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 8) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 32) / 4) * (0-(1)));
            yy = 0 + (((tickAnim - 32) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 4) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 0) / 13) * (-30-(-40)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -30 + (((tickAnim - 13) / 5) * (-30-(-30)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = -30 + (((tickAnim - 18) / 8) * (-20-(-30)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = -20 + (((tickAnim - 26) / 12) * (-40-(-20)));
            yy = 0 + (((tickAnim - 26) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 12) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -40 + (((tickAnim - 38) / 2) * (-40-(-40)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 0) / 3) * (-15-(-15)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 3) / 7) * (-10-(-15)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -10 + (((tickAnim - 10) / 12) * (-20-(-10)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -20 + (((tickAnim - 22) / 2) * (-20-(-20)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -20 + (((tickAnim - 24) / 14) * (-15-(-20)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 38) / 2) * (-15-(-15)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -27.78 + (((tickAnim - 0) / 6) * (-20-(-27.78)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 6) / 12) * (-40-(-20)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -40 + (((tickAnim - 18) / 2) * (-40-(-40)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = -40 + (((tickAnim - 20) / 13) * (-30-(-40)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = -30 + (((tickAnim - 33) / 5) * (-30-(-30)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -30 + (((tickAnim - 38) / 2) * (-27.78-(-30)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -18.57 + (((tickAnim - 0) / 2) * (-20-(-18.57)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -20 + (((tickAnim - 2) / 2) * (-20-(-20)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 4) / 14) * (-15-(-20)));
            yy = 0 + (((tickAnim - 4) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 14) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -15 + (((tickAnim - 18) / 2) * (-15-(-15)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -15 + (((tickAnim - 20) / 3) * (-15-(-15)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -15 + (((tickAnim - 23) / 7) * (-10-(-15)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 30) / 10) * (-18.57-(-10)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 26.91 + (((tickAnim - 0) / 2) * (35-(26.91)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 2) * (-5-(-5)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 35 + (((tickAnim - 2) / 4) * (30-(35)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 2) / 4) * (-5-(-5)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 30 + (((tickAnim - 6) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = -5 + (((tickAnim - 6) / 7) * (0-(-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (-30-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -30 + (((tickAnim - 17) / 3) * (-35-(-30)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (-3-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -35 + (((tickAnim - 20) / 5) * (-22.5-(-35)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = -3 + (((tickAnim - 20) / 5) * (-4-(-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -22.5 + (((tickAnim - 25) / 5) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -4 + (((tickAnim - 25) / 5) * (-5-(-4)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 30) / 6) * (6.67-(0)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = -5 + (((tickAnim - 30) / 6) * (-5-(-5)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 6.67 + (((tickAnim - 36) / 4) * (26.91-(6.67)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 36) / 4) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.73 + (((tickAnim - 0) / 2) * (-0.1-(0.73)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 2) / 1) * (0.5-(-0.1)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 3) / 3) * (2-(0.5)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            yy = 2 + (((tickAnim - 6) / 14) * (0-(2)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 25) / 2) * (-0.3-(-0.7)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 27) / 3) * (1.5-(-0.3)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = 1.5 + (((tickAnim - 30) / 3) * (1-(1.5)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 33) / 5) * (1-(1)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 38) / 2) * (0.73-(1)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight.rotationPointX = this.legRight.rotationPointX + (float)(xx);
        this.legRight.rotationPointY = this.legRight.rotationPointY - (float)(yy);
        this.legRight.rotationPointZ = this.legRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -24.05 + (((tickAnim - 0) / 2) * (-25-(-24.05)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -25 + (((tickAnim - 2) / 4) * (-17.5-(-25)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -17.5 + (((tickAnim - 6) / 3) * (10-(-17.5)));
            yy = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 9) / 4) * (20-(10)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 13) / 7) * (22-(20)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 22 + (((tickAnim - 20) / 5) * (-11.5-(22)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -11.5 + (((tickAnim - 25) / 5) * (-20-(-11.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -20 + (((tickAnim - 30) / 3) * (-21.67-(-20)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = -21.67 + (((tickAnim - 33) / 3) * (-21.67-(-21.67)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -21.67 + (((tickAnim - 36) / 4) * (-24.05-(-21.67)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 11.43 + (((tickAnim - 0) / 2) * (10-(11.43)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 3 + (((tickAnim - 0) / 2) * (3-(3)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 10 + (((tickAnim - 2) / 4) * (50-(10)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 3 + (((tickAnim - 2) / 4) * (0-(3)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 50 + (((tickAnim - 6) / 14) * (-10-(50)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 20) / 5) * (26.5-(-10)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (2.25-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 26.5 + (((tickAnim - 25) / 2) * (12-(26.5)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 2.25 + (((tickAnim - 25) / 2) * (3-(2.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 12 + (((tickAnim - 27) / 3) * (22-(12)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 3 + (((tickAnim - 27) / 3) * (3-(3)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 22 + (((tickAnim - 30) / 2) * (22-(22)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 3 + (((tickAnim - 30) / 2) * (3-(3)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 22 + (((tickAnim - 32) / 1) * (15-(22)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 3 + (((tickAnim - 32) / 1) * (3-(3)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 15 + (((tickAnim - 33) / 3) * (15-(15)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 3 + (((tickAnim - 33) / 3) * (3-(3)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 36) / 4) * (11.43-(15)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 3 + (((tickAnim - 36) / 4) * (3-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -14 + (((tickAnim - 0) / 1) * (-16-(-14)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -16 + (((tickAnim - 1) / 1) * (-20-(-16)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = -20 + (((tickAnim - 2) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (95-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 95 + (((tickAnim - 20) / 5) * (7.5-(95)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 7.5 + (((tickAnim - 25) / 2) * (18-(7.5)));
            yy = 0 + (((tickAnim - 25) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 2) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 18 + (((tickAnim - 27) / 2) * (2.5-(18)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 32) {
            xx = 2.5 + (((tickAnim - 29) / 3) * (-5-(2.5)));
            yy = 0 + (((tickAnim - 29) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 3) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = -5 + (((tickAnim - 32) / 1) * (1-(-5)));
            yy = 0 + (((tickAnim - 32) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 1) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 1 + (((tickAnim - 33) / 3) * (-4-(1)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = -4 + (((tickAnim - 36) / 2) * (-10-(-4)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 38) / 2) * (-14-(-10)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -35 + (((tickAnim - 0) / 5) * (-22.5-(-35)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 3 + (((tickAnim - 0) / 5) * (4-(3)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 5) / 5) * (0-(-22.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 4 + (((tickAnim - 5) / 5) * (5-(4)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (6.67-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 10) / 6) * (5-(5)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 6.67 + (((tickAnim - 16) / 6) * (35-(6.67)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 5 + (((tickAnim - 16) / 6) * (5-(5)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 35 + (((tickAnim - 22) / 4) * (30-(35)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 5 + (((tickAnim - 22) / 4) * (5-(5)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 30 + (((tickAnim - 26) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 5 + (((tickAnim - 26) / 7) * (0-(5)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (-30-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 4) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = -30 + (((tickAnim - 37) / 3) * (-35-(-30)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 3) * (3-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.7 + (((tickAnim - 5) / 2) * (-0.3-(-0.7)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.3 + (((tickAnim - 7) / 3) * (1.5-(-0.3)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.5 + (((tickAnim - 10) / 3) * (1-(1.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1 + (((tickAnim - 13) / 5) * (1-(1)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 2) * (0.73-(1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0.73 + (((tickAnim - 20) / 2) * (-0.1-(0.73)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            yy = -0.1 + (((tickAnim - 22) / 1) * (0.5-(-0.1)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 23) / 3) * (2-(0.5)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            yy = 2 + (((tickAnim - 26) / 14) * (0-(2)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft.rotationPointX = this.legLeft.rotationPointX + (float)(xx);
        this.legLeft.rotationPointY = this.legLeft.rotationPointY - (float)(yy);
        this.legLeft.rotationPointZ = this.legLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22 + (((tickAnim - 0) / 5) * (-11.5-(22)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -11.5 + (((tickAnim - 5) / 5) * (-20-(-11.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 10) / 3) * (-21.67-(-20)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -21.67 + (((tickAnim - 13) / 3) * (-21.67-(-21.67)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -21.67 + (((tickAnim - 16) / 6) * (-25-(-21.67)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -25 + (((tickAnim - 22) / 4) * (-17.5-(-25)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 29) {
            xx = -17.5 + (((tickAnim - 26) / 3) * (10-(-17.5)));
            yy = 0 + (((tickAnim - 26) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 3) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 10 + (((tickAnim - 29) / 4) * (20-(10)));
            yy = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 4) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 33) / 7) * (22-(20)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10 + (((tickAnim - 0) / 5) * (26.5-(-10)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.25-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 26.5 + (((tickAnim - 5) / 2) * (12-(26.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = -2.25 + (((tickAnim - 5) / 2) * (-3-(-2.25)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 12 + (((tickAnim - 7) / 3) * (22-(12)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = -3 + (((tickAnim - 7) / 3) * (-3-(-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 22 + (((tickAnim - 10) / 2) * (22-(22)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = -3 + (((tickAnim - 10) / 2) * (-3-(-3)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 22 + (((tickAnim - 12) / 1) * (15-(22)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = -3 + (((tickAnim - 12) / 1) * (-3-(-3)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 15 + (((tickAnim - 13) / 3) * (15-(15)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = -3 + (((tickAnim - 13) / 3) * (-3-(-3)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 15 + (((tickAnim - 16) / 6) * (10-(15)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = -3 + (((tickAnim - 16) / 6) * (-3-(-3)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 22) / 4) * (50-(10)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = -3 + (((tickAnim - 22) / 4) * (0-(-3)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 50 + (((tickAnim - 26) / 14) * (-10-(50)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 95 + (((tickAnim - 0) / 5) * (7.5-(95)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 7.5 + (((tickAnim - 5) / 2) * (18-(7.5)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 18 + (((tickAnim - 7) / 2) * (2.5-(18)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 2.5 + (((tickAnim - 9) / 3) * (-5-(2.5)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -5 + (((tickAnim - 12) / 1) * (1-(-5)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 13) / 1) * (-2-(1)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -2 + (((tickAnim - 14) / 2) * (-4-(-2)));
            yy = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -4 + (((tickAnim - 16) / 2) * (-10-(-4)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -10 + (((tickAnim - 18) / 3) * (-16-(-10)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 22) {
            xx = -16 + (((tickAnim - 21) / 1) * (-20-(-16)));
            yy = 0 + (((tickAnim - 21) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 1) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -20 + (((tickAnim - 22) / 4) * (0-(-20)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 26) / 14) * (95-(0)));
            yy = 0 + (((tickAnim - 26) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraHerrerasaurus entity = (EntityPrehistoricFloraHerrerasaurus) entitylivingbaseIn;

        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -5 + (((tickAnim - 5) / 3) * (0-(-5)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (5-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 5 + (((tickAnim - 12) / 3) * (0-(5)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(xx), root.rotateAngleY + (float) Math.toRadians(yy), root.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = -2.5 + (((tickAnim - 3) / 5) * (1-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 1 + (((tickAnim - 8) / 0) * (0-(1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -2.5 + (((tickAnim - 11) / 4) * (1-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.root.rotationPointX = this.root.rotationPointX + (float)(xx);
        this.root.rotationPointY = this.root.rotationPointY - (float)(yy);
        this.root.rotationPointZ = this.root.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 1.33 + (((tickAnim - 0) / 3) * (0-(1.33)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (5-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (-2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 5) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -2 + (((tickAnim - 5) / 3) * (-1.33-(-2)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = -1.33 + (((tickAnim - 8) / 3) * (0-(-1.33)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (5-(0)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (2-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 12) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 2 + (((tickAnim - 12) / 3) * (1.33-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 2.5 + (((tickAnim - 0) / 1) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 2.5 + (((tickAnim - 1) / 2) * (2.8-(2.5)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.8 + (((tickAnim - 3) / 0) * (3.25-(2.8)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 3.25 + (((tickAnim - 3) / 2) * (2.7-(3.25)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 2.7 + (((tickAnim - 5) / 3) * (3-(2.7)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 3 + (((tickAnim - 8) / 0) * (2.5-(3)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 2.5 + (((tickAnim - 8) / 3) * (3.25-(2.5)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 3.25 + (((tickAnim - 11) / 1) * (2.7-(3.25)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 2.7 + (((tickAnim - 12) / 3) * (2.5-(2.7)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -1.23 + (((tickAnim - 0) / 3) * (0-(-1.23)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 2 + (((tickAnim - 3) / 2) * (-3-(2)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (1.85-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 5) / 3) * (0-(-3)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 1.85 + (((tickAnim - 5) / 3) * (1.23-(1.85)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (2-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 1.23 + (((tickAnim - 8) / 3) * (0-(1.23)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 2 + (((tickAnim - 11) / 1) * (-3-(2)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (-1.85-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -3 + (((tickAnim - 12) / 3) * (0-(-3)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = -1.85 + (((tickAnim - 12) / 3) * (-1.23-(-1.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -1 + (((tickAnim - 0) / 1) * (0-(-1)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 1.44 + (((tickAnim - 0) / 1) * (-1.23-(1.44)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (1-(0)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = -1.23 + (((tickAnim - 1) / 4) * (0-(-1.23)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 5) / 3) * (-3-(1)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (1.85-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -3 + (((tickAnim - 8) / 0) * (0-(-3)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 1.85 + (((tickAnim - 8) / 0) * (1.23-(1.85)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (1-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 1.23 + (((tickAnim - 8) / 4) * (0-(1.23)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 12) / 3) * (-3-(1)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (-1.85-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -7 + (((tickAnim - 1) / 2) * (2-(-7)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 2 + (((tickAnim - 3) / 5) * (0-(2)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (-7-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -7 + (((tickAnim - 10) / 1) * (2-(-7)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 2 + (((tickAnim - 11) / 4) * (0-(2)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0.5 + (((tickAnim - 0) / 1) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = -6 + (((tickAnim - 1) / 4) * (-10-(-6)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 5) / 3) * (0.5-(-10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.5 + (((tickAnim - 8) / 2) * (-6-(0.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -6 + (((tickAnim - 10) / 2) * (-10-(-6)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 12) / 3) * (0.5-(-10)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 12 + (((tickAnim - 1) / 2) * (5-(12)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (3-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 3 + (((tickAnim - 8) / 0) * (0-(3)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (12-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 12 + (((tickAnim - 10) / 1) * (5-(12)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 5 + (((tickAnim - 11) / 4) * (3-(5)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 1) / 4) * (1-(0)));
            yy = 0 + (((tickAnim - 1) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 4) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 1 + (((tickAnim - 5) / 3) * (0-(1)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (1-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 12) / 3) * (0-(1)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -40 + (((tickAnim - 0) / 5) * (-30-(-40)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -30 + (((tickAnim - 5) / 3) * (-30-(-30)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -30 + (((tickAnim - 8) / 3) * (-20-(-30)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -20 + (((tickAnim - 11) / 4) * (-40-(-20)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -15 + (((tickAnim - 0) / 1) * (-15-(-15)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -15 + (((tickAnim - 1) / 2) * (-10-(-15)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 3) / 5) * (-20-(-10)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (-20-(-20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -20 + (((tickAnim - 10) / 5) * (-15-(-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -27.78 + (((tickAnim - 0) / 3) * (-20-(-27.78)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 3) / 5) * (-40-(-20)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -40 + (((tickAnim - 8) / 0) * (-40-(-40)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -40 + (((tickAnim - 8) / 4) * (-30-(-40)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -30 + (((tickAnim - 12) / 3) * (-30-(-30)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -18.57 + (((tickAnim - 0) / 1) * (-20-(-18.57)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 1) / 7) * (-15-(-20)));
            yy = 0 + (((tickAnim - 1) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 7) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -15 + (((tickAnim - 8) / 0) * (-15-(-15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 8) / 2) * (-15-(-15)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -15 + (((tickAnim - 10) / 1) * (-10-(-15)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 11) / 4) * (-18.57-(-10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (50-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -5 + (((tickAnim - 0) / 3) * (-5-(-5)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 50 + (((tickAnim - 3) / 1) * (-10-(50)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = -5 + (((tickAnim - 3) / 1) * (0-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 4) / 4) * (-45-(-10)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -45 + (((tickAnim - 8) / 3) * (-10-(-45)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = -3 + (((tickAnim - 8) / 3) * (-5-(-3)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 11) / 4) * (27.5-(-10)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = -5 + (((tickAnim - 11) / 4) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.2 + (((tickAnim - 0) / 1) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 1) / 2) * (-0.3-(-0.2)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 3) / 5) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.8 + (((tickAnim - 13) / 2) * (-0.2-(-0.8)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight.rotationPointX = this.legRight.rotationPointX + (float)(xx);
        this.legRight.rotationPointY = this.legRight.rotationPointY - (float)(yy);
        this.legRight.rotationPointZ = this.legRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -21.67 + (((tickAnim - 0) / 1) * (-25-(-21.67)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -25 + (((tickAnim - 1) / 2) * (-10-(-25)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -10 + (((tickAnim - 3) / 1) * (20-(-10)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 4) / 4) * (22-(20)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 22 + (((tickAnim - 8) / 3) * (-20-(22)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 11) / 2) * (-21.67-(-20)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -21.67 + (((tickAnim - 13) / 2) * (-21.67-(-21.67)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 15 + (((tickAnim - 0) / 1) * (20-(15)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 3 + (((tickAnim - 0) / 1) * (3-(3)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 20 + (((tickAnim - 1) / 2) * (35-(20)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 3 + (((tickAnim - 1) / 2) * (1.5-(3)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 35 + (((tickAnim - 3) / 1) * (30-(35)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 1.5 + (((tickAnim - 3) / 1) * (0-(1.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 30 + (((tickAnim - 4) / 4) * (-10-(30)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 8) / 2) * (12-(-10)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 12 + (((tickAnim - 10) / 1) * (22-(12)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 3 + (((tickAnim - 10) / 1) * (3-(3)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 22 + (((tickAnim - 11) / 2) * (15-(22)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 3 + (((tickAnim - 11) / 2) * (3-(3)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 13) / 2) * (15-(15)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 3 + (((tickAnim - 13) / 2) * (3-(3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 6 + (((tickAnim - 0) / 1) * (0-(6)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (40-(0)));
            yy = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 40 + (((tickAnim - 3) / 0) * (20-(40)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 20 + (((tickAnim - 3) / 5) * (105-(20)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 105 + (((tickAnim - 8) / 2) * (75-(105)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 75 + (((tickAnim - 10) / 3) * (10-(75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 10 + (((tickAnim - 13) / 2) * (6-(10)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -45 + (((tickAnim - 0) / 3) * (-10-(-45)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 3 + (((tickAnim - 0) / 3) * (5-(3)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 3) / 7) * (50-(-10)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 5 + (((tickAnim - 3) / 7) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 50 + (((tickAnim - 10) / 2) * (-10-(50)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 5 + (((tickAnim - 10) / 2) * (0-(5)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -10 + (((tickAnim - 12) / 3) * (-40-(-10)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.8 + (((tickAnim - 5) / 3) * (-0.2-(-0.8)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 0) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 2) * (-0.3-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.3 + (((tickAnim - 10) / 5) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legLeft.rotationPointX = this.legLeft.rotationPointX + (float)(xx);
        this.legLeft.rotationPointY = this.legLeft.rotationPointY - (float)(yy);
        this.legLeft.rotationPointZ = this.legLeft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22 + (((tickAnim - 0) / 3) * (-20-(22)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20 + (((tickAnim - 3) / 2) * (-21.67-(-20)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -21.67 + (((tickAnim - 5) / 3) * (-21.67-(-21.67)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -21.67 + (((tickAnim - 8) / 0) * (-25-(-21.67)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -25 + (((tickAnim - 8) / 3) * (-10-(-25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = -10 + (((tickAnim - 11) / 1) * (20-(-10)));
            yy = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 12) / 3) * (25-(20)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10 + (((tickAnim - 0) / 3) * (12-(-10)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 12 + (((tickAnim - 3) / 0) * (22-(12)));
            yy = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            zz = -3 + (((tickAnim - 3) / 0) * (-3-(-3)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 22 + (((tickAnim - 3) / 2) * (15-(22)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = -3 + (((tickAnim - 3) / 2) * (-3-(-3)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 5) / 3) * (15-(15)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = -3 + (((tickAnim - 5) / 3) * (-3-(-3)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 8) / 0) * (20-(15)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = -3 + (((tickAnim - 8) / 0) * (-3-(-3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 8) / 2) * (35-(20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = -3 + (((tickAnim - 8) / 2) * (-1.5-(-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 35 + (((tickAnim - 10) / 2) * (30-(35)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = -1.5 + (((tickAnim - 10) / 2) * (0-(-1.5)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 30 + (((tickAnim - 12) / 3) * (-20-(30)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 105 + (((tickAnim - 0) / 3) * (75-(105)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 75 + (((tickAnim - 3) / 2) * (10-(75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 5) / 3) * (6-(10)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 6 + (((tickAnim - 8) / 0) * (0-(6)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (40-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 40 + (((tickAnim - 10) / 1) * (20-(40)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 20 + (((tickAnim - 11) / 4) * (100-(20)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHerrerasaurus entity = (EntityPrehistoricFloraHerrerasaurus) entitylivingbaseIn;

        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -10 + (((tickAnim - 15) / 4) * (5-(-10)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 19) / 11) * (0-(5)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 16) / 7) * (5-(-10)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 23) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 23) {
            xx = -10 + (((tickAnim - 16) / 7) * (5-(-10)));
            yy = 0 + (((tickAnim - 16) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 7) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 23) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 20 + (((tickAnim - 14) / 9) * (-10-(20)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 23) / 7) * (0-(-10)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 14) / 4) * (2-(20)));
            yy = 0 + (((tickAnim - 14) / 4) * (3-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (3-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 2 + (((tickAnim - 18) / 5) * (-10-(2)));
            yy = 3 + (((tickAnim - 18) / 5) * (-2-(3)));
            zz = 3 + (((tickAnim - 18) / 5) * (-2-(3)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 23) / 2) * (-6.67-(-10)));
            yy = -2 + (((tickAnim - 23) / 2) * (-5-(-2)));
            zz = -2 + (((tickAnim - 23) / 2) * (-5-(-2)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -6.67 + (((tickAnim - 25) / 3) * (-3.81-(-6.67)));
            yy = -5 + (((tickAnim - 25) / 3) * (0-(-5)));
            zz = -5 + (((tickAnim - 25) / 3) * (0-(-5)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -3.81 + (((tickAnim - 28) / 2) * (0-(-3.81)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (20-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 20 + (((tickAnim - 18) / 7) * (20-(20)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 25) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (-21.33277-(0)));
            yy = 0 + (((tickAnim - 14) / 5) * (10.50447-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (-31.12905-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -21.33277 + (((tickAnim - 19) / 11) * (0-(-21.33277)));
            yy = 10.50447 + (((tickAnim - 19) / 11) * (0-(10.50447)));
            zz = -31.12905 + (((tickAnim - 19) / 11) * (0-(-31.12905)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-19.9464-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-7.24336-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-1.94721-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -19.9464 + (((tickAnim - 19) / 11) * (0-(-19.9464)));
            yy = -7.24336 + (((tickAnim - 19) / 11) * (0-(-7.24336)));
            zz = -1.94721 + (((tickAnim - 19) / 11) * (0-(-1.94721)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(xx), armLeft2.rotateAngleY + (float) Math.toRadians(yy), armLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-7.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 19) / 11) * (0-(-10)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = -7.5 + (((tickAnim - 19) / 11) * (0-(-7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handLeft, handLeft.rotateAngleX + (float) Math.toRadians(xx), handLeft.rotateAngleY + (float) Math.toRadians(yy), handLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (-21.33277-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (-10.5045-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (31.1291-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -21.33277 + (((tickAnim - 21) / 9) * (0-(-21.33277)));
            yy = -10.5045 + (((tickAnim - 21) / 9) * (0-(-10.5045)));
            zz = 31.1291 + (((tickAnim - 21) / 9) * (0-(31.1291)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-19.9464-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (7.2434-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (1.9472-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -19.9464 + (((tickAnim - 18) / 12) * (0-(-19.9464)));
            yy = 7.2434 + (((tickAnim - 18) / 12) * (0-(7.2434)));
            zz = 1.9472 + (((tickAnim - 18) / 12) * (0-(1.9472)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(xx), armRight2.rotateAngleY + (float) Math.toRadians(yy), armRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (7.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 20) / 10) * (0-(-10)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 7.5 + (((tickAnim - 20) / 10) * (0-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(handRight, handRight.rotateAngleX + (float) Math.toRadians(xx), handRight.rotateAngleY + (float) Math.toRadians(yy), handRight.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHerrerasaurus entity = (EntityPrehistoricFloraHerrerasaurus) entitylivingbaseIn;

        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (15-(0)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 55) {
            xx = 15 + (((tickAnim - 26) / 29) * (15-(15)));
            yy = 0 + (((tickAnim - 26) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 29) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 15 + (((tickAnim - 55) / 25) * (0-(15)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 19) / 12) * (10-(0)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 60) {
            xx = 10 + (((tickAnim - 31) / 29) * (10-(10)));
            yy = 0 + (((tickAnim - 31) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 29) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 10 + (((tickAnim - 60) / 20) * (0-(10)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (15-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 60) {
            xx = 15 + (((tickAnim - 34) / 26) * (15-(15)));
            yy = 0 + (((tickAnim - 34) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 26) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = 15 + (((tickAnim - 60) / 20) * (0-(15)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 24) / 14) * (20-(0)));
            yy = 0 + (((tickAnim - 24) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 14) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 62) {
            xx = 20 + (((tickAnim - 38) / 24) * (20-(20)));
            yy = 0 + (((tickAnim - 38) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 24) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 73) {
            xx = 20 + (((tickAnim - 62) / 11) * (-3-(20)));
            yy = 0 + (((tickAnim - 62) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 11) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -3 + (((tickAnim - 73) / 7) * (0-(-3)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 31) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 31) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 31) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 9) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 58) {
            xx = 10 + (((tickAnim - 40) / 18) * (10-(10)));
            yy = 0 + (((tickAnim - 40) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 18) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 73) {
            xx = 10 + (((tickAnim - 58) / 15) * (-5-(10)));
            yy = 0 + (((tickAnim - 58) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 15) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = -5 + (((tickAnim - 73) / 7) * (0-(-5)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 26) / 7) * (10-(0)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 7) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 10 + (((tickAnim - 33) / 17) * (15-(10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 61) {
            xx = 15 + (((tickAnim - 50) / 11) * (15-(15)));
            yy = 0 + (((tickAnim - 50) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 11) * (0-(0)));
        }
        else if (tickAnim >= 61 && tickAnim < 69) {
            xx = 15 + (((tickAnim - 61) / 8) * (-10-(15)));
            yy = 0 + (((tickAnim - 61) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 8) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = -10 + (((tickAnim - 69) / 5) * (5-(-10)));
            yy = 0 + (((tickAnim - 69) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 5) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 5 + (((tickAnim - 74) / 6) * (0-(5)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-5.77-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 26) {
            xx = 25 + (((tickAnim - 8) / 18) * (25-(25)));
            yy = 0 + (((tickAnim - 8) / 18) * (0-(0)));
            zz = -5.77 + (((tickAnim - 8) / 18) * (-13.35-(-5.77)));
        }
        else if (tickAnim >= 26 && tickAnim < 33) {
            xx = 25 + (((tickAnim - 26) / 7) * (-10-(25)));
            yy = 0 + (((tickAnim - 26) / 7) * (0-(0)));
            zz = -13.35 + (((tickAnim - 26) / 7) * (-11.58-(-13.35)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 33) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-20-(-10)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = -11.58 + (((tickAnim - 33) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-20-(-11.58)));
        }
        else if (tickAnim >= 40 && tickAnim < 57) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-20 + (((tickAnim - 40) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-20)));
            yy = 0 + (((tickAnim - 40) / 17) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-20 + (((tickAnim - 40) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*-20)));
        }
        else if (tickAnim >= 57 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 57) / 12) * (-15-(0)));
            yy = 0 + (((tickAnim - 57) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 12) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = -15 + (((tickAnim - 69) / 5) * (-25-(-15)));
            yy = 0 + (((tickAnim - 69) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 69) / 5) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -25 + (((tickAnim - 74) / 6) * (0-(-25)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 34) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 34) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 34) / 8) * (12-(0)));
            yy = 0 + (((tickAnim - 34) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 8) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 12 + (((tickAnim - 42) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 44) / 7) * (12-(0)));
            yy = 0 + (((tickAnim - 44) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 7) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 53) {
            xx = 12 + (((tickAnim - 51) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 51) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 2) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 53) / 6) * (12-(0)));
            yy = 0 + (((tickAnim - 53) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 6) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 12 + (((tickAnim - 59) / 3) * (0-(12)));
            yy = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 3) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 62) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 3) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 65) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 65) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 5) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 74) {
            xx = 5 + (((tickAnim - 70) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 70) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 4) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 74) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (-20-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 37) {
            xx = -20 + (((tickAnim - 20) / 17) * (-50-(-20)));
            yy = 0 + (((tickAnim - 20) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 17) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 52) {
            xx = -50 + (((tickAnim - 37) / 15) * (-55-(-50)));
            yy = 0 + (((tickAnim - 37) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 15) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -55 + (((tickAnim - 52) / 8) * (-50-(-55)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 80) {
            xx = -50 + (((tickAnim - 60) / 20) * (0-(-50)));
            yy = 0 + (((tickAnim - 60) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 8) / 16) * (-30-(0)));
            yy = 0 + (((tickAnim - 8) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 16) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = -30 + (((tickAnim - 24) / 16) * (-50-(-30)));
            yy = 0 + (((tickAnim - 24) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 49) {
            xx = -50 + (((tickAnim - 40) / 9) * (-55-(-50)));
            yy = 0 + (((tickAnim - 40) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 9) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 65) {
            xx = -55 + (((tickAnim - 49) / 16) * (-50-(-55)));
            yy = 0 + (((tickAnim - 49) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 16) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 80) {
            xx = -50 + (((tickAnim - 65) / 15) * (0-(-50)));
            yy = 0 + (((tickAnim - 65) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (-15-(0)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 55) {
            xx = -15 + (((tickAnim - 26) / 29) * (-15-(-15)));
            yy = 0 + (((tickAnim - 26) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 29) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -15 + (((tickAnim - 55) / 25) * (0-(-15)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 13) / 13) * (-15-(0)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 55) {
            xx = -15 + (((tickAnim - 26) / 29) * (-15-(-15)));
            yy = 0 + (((tickAnim - 26) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 29) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = -15 + (((tickAnim - 55) / 25) * (0-(-15)));
            yy = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));

    }



    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHerrerasaurus entity = (EntityPrehistoricFloraHerrerasaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10 + (((tickAnim - 10) / 10) * (-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2 + (((tickAnim - 20) / 30) * (0-(-5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.5)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-1)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*0.5)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*3 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*10)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-60))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+60))*3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5+30))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1+30))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-3)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*15)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*-3)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5))*-5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-60))*5)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2.5-30))*5)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.00429-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001)));
            yy = 4.5 + (((tickAnim - 10) / 10) * (0-(4.5)));
            zz = -0.00429 + (((tickAnim - 10) / 10) * (0-(-0.00429)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1 + (((tickAnim - 20) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-1)));
            yy = 0 + (((tickAnim - 20) / 13) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.00429-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001)));
            yy = -4.5 + (((tickAnim - 33) / 17) * (0-(-4.5)));
            zz = -0.00429 + (((tickAnim - 33) / 17) * (0-(-0.00429)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.00429-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001)));
            yy = 4.5 + (((tickAnim - 10) / 10) * (0-(4.5)));
            zz = -0.00429 + (((tickAnim - 10) / 10) * (0-(-0.00429)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1 + (((tickAnim - 20) / 13) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-30))*-1)));
            yy = 0 + (((tickAnim - 20) / 13) * (-4.5-(0)));
            zz = 0 + (((tickAnim - 20) / 13) * (-0.00429-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001 + (((tickAnim - 33) / 17) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-30))*-3.0001)));
            yy = -4.5 + (((tickAnim - 33) / 17) * (0-(-4.5)));
            zz = -0.00429 + (((tickAnim - 33) / 17) * (0-(-0.00429)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-90))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-90))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3 + (((tickAnim - 10) / 10) * (3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-120))*-3)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1 + (((tickAnim - 20) / 30) * (0-(3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-120))*-1)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10 + (((tickAnim - 10) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-10)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2 + (((tickAnim - 20) / 30) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*-2)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));

        this.legLeft.rotationPointX = this.legLeft.rotationPointX + (float)(0);
        this.legLeft.rotationPointY = this.legLeft.rotationPointY - (float)(-1);
        this.legLeft.rotationPointZ = this.legLeft.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5 + (((tickAnim - 10) / 10) * (-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30 + (((tickAnim - 20) / 30) * (0-(-10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*30)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.25 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.25 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25 + (((tickAnim - 10) / 10) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-0.25)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25 + (((tickAnim - 10) / 10) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*0.25)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5 + (((tickAnim - 20) / 30) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*0.5)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1 + (((tickAnim - 20) / 30) * (0-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legRight.rotationPointX = this.legRight.rotationPointX + (float)(xx);
        this.legRight.rotationPointY = this.legRight.rotationPointY - (float)(yy);
        this.legRight.rotationPointZ = this.legRight.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20 + (((tickAnim - 20) / 30) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5-60))*20)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight2, legRight2.rotateAngleX + (float) Math.toRadians(xx), legRight2.rotateAngleY + (float) Math.toRadians(yy), legRight2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10 + (((tickAnim - 20) / 30) * (0-(10+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5))*10)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight3, legRight3.rotateAngleX + (float) Math.toRadians(xx), legRight3.rotateAngleY + (float) Math.toRadians(yy), legRight3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5 + (((tickAnim - 10) / 10) * (40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*-5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30 + (((tickAnim - 20) / 30) * (0-(40+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1.5+60))*30)));
            yy = 0 + (((tickAnim - 20) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 30) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footRight, footRight.rotateAngleX + (float) Math.toRadians(xx), footRight.rotateAngleY + (float) Math.toRadians(yy), footRight.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraHerrerasaurus entity = (EntityPrehistoricFloraHerrerasaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-30-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -30 + (((tickAnim - 10) / 15) * (-15-(-30)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -15 + (((tickAnim - 25) / 15) * (0-(-15)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));

        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-1.25);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11 + (((tickAnim - 5) / 3) * (9.5-(11)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 9.5 + (((tickAnim - 8) / 4) * (11-(9.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11 + (((tickAnim - 12) / 2) * (9.5-(11)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 9.5 + (((tickAnim - 14) / 4) * (11-(9.5)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 11 + (((tickAnim - 18) / 3) * (9.5-(11)));
            yy = 0 + (((tickAnim - 18) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 9.5 + (((tickAnim - 21) / 4) * (11-(9.5)));
            yy = 0 + (((tickAnim - 21) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 4) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11 + (((tickAnim - 25) / 3) * (9.5-(11)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 9.5 + (((tickAnim - 28) / 12) * (0-(9.5)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));
        

        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5 + (((tickAnim - 27) / 3) * (-10-(5)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -10 + (((tickAnim - 30) / 6) * (0-(-10)));
            yy = 0 + (((tickAnim - 30) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 27) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 27) / 5) * (7.5-(0)));
            yy = 0 + (((tickAnim - 27) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 5) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 7.5 + (((tickAnim - 32) / 6) * (0-(7.5)));
            yy = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10 + (((tickAnim - 4) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -10 + (((tickAnim - 11) / 2) * (0-(-10)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10 + (((tickAnim - 16) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = -10 + (((tickAnim - 22) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(xx), armLeft.rotateAngleY + (float) Math.toRadians(yy), armLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 4) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 11) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-10-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 16) / 2) * (0-(-10)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (10-(0)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 10 + (((tickAnim - 22) / 4) * (0-(10)));
            yy = 0 + (((tickAnim - 22) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(xx), armRight.rotateAngleY + (float) Math.toRadians(yy), armRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 5 + (((tickAnim - 10) / 15) * (2.5-(5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 2.5 + (((tickAnim - 25) / 5) * (1.67-(2.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 1.67 + (((tickAnim - 30) / 3) * (1.25-(1.67)));
            yy = 2.5 + (((tickAnim - 30) / 3) * (0-(2.5)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 1.25 + (((tickAnim - 33) / 2) * (0.83-(1.25)));
            yy = 0 + (((tickAnim - 33) / 2) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.83 + (((tickAnim - 35) / 3) * (0.42-(0.83)));
            yy = -2.5 + (((tickAnim - 35) / 3) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.42 + (((tickAnim - 38) / 2) * (0-(0.42)));
            yy = 0 + (((tickAnim - 38) / 2) * (1.5-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 1.5 + (((tickAnim - 40) / 2) * (0-(1.5)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = -1.5 + (((tickAnim - 43) / 2) * (0-(-1.5)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 45) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 2) * (1-(0)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            yy = 1 + (((tickAnim - 47) / 1) * (0-(1)));
            zz = 0 + (((tickAnim - 47) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5 + (((tickAnim - 10) / 15) * (3.75-(7.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 25) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 12.5 + (((tickAnim - 10) / 15) * (6.25-(12.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.25 + (((tickAnim - 25) / 5) * (8-(6.25)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 30) / 10) * (0-(8)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 12.5 + (((tickAnim - 10) / 15) * (6.25-(12.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 6.25 + (((tickAnim - 25) / 9) * (2.78-(6.25)));
            yy = 0 + (((tickAnim - 25) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 9) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 2.78 + (((tickAnim - 34) / 6) * (0-(2.78)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 30 + (((tickAnim - 10) / 15) * (15-(30)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 25) / 15) * (0-(15)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft, legLeft.rotateAngleX + (float) Math.toRadians(xx), legLeft.rotateAngleY + (float) Math.toRadians(yy), legLeft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10 + (((tickAnim - 10) / 15) * (5-(10)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5 + (((tickAnim - 25) / 15) * (0-(5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft2, legLeft2.rotateAngleX + (float) Math.toRadians(xx), legLeft2.rotateAngleY + (float) Math.toRadians(yy), legLeft2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 10) / 15) * (-5-(-10)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 25) / 15) * (0-(-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legLeft3, legLeft3.rotateAngleX + (float) Math.toRadians(xx), legLeft3.rotateAngleY + (float) Math.toRadians(yy), legLeft3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5 + (((tickAnim - 10) / 15) * (3.75-(7.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75 + (((tickAnim - 25) / 15) * (0-(3.75)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(footLeft, footLeft.rotateAngleX + (float) Math.toRadians(xx), footLeft.rotateAngleY + (float) Math.toRadians(yy), footLeft.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (30-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 30 + (((tickAnim - 10) / 15) * (15-(30)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 15 + (((tickAnim - 25) / 15) * (0-(15)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legRight, legRight.rotateAngleX + (float) Math.toRadians(xx), legRight.rotateAngleY + (float) Math.toRadians(yy), legRight.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10 + (((tickAnim - 10) / 15) * (5-(10)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 0) {
            xx = 5 + (((tickAnim - 25) / -25) * (-(5)));
            yy = 0 + (((tickAnim - 25) / -25) * (-(0)));
            zz = 0 + (((tickAnim - 25) / -25) * (-(0)));
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraHerrerasaurus e = (EntityPrehistoricFloraHerrerasaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(28.7), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.EAT_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(Head, (float) Math.toRadians(-28), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(50), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(6);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(neck, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck2, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(neck3, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(Head, (float) Math.toRadians(-38), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(jaw, (float) Math.toRadians(60), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
