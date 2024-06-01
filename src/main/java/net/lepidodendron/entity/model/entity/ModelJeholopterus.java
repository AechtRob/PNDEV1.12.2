package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAnurognathid;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelJeholopterus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightmembranearm;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightmembranemiddle;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightmembrane;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer rightwing4;
    private final AdvancedModelRenderer rightmembraneend;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftmembranearm;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftmembranemiddle;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftmembrane;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer leftmembraneend;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye2;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;

    private ModelAnimator animator;

    public ModelJeholopterus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 17.25F, -2.5F);
        this.main.cubeList.add(new ModelBox(main, 0, 23, -3.0F, -2.0F, -5.5F, 6, 6, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 38, 38, -2.0F, -1.5F, 1.5F, 4, 5, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 42, -1.5F, -1.0F, -1.5F, 3, 3, 3, 0.0F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-2.5F, -0.5F, -3.4F);
        this.main.addChild(rightwing);
        this.setRotateAngle(rightwing, -0.0265F, -0.0031F, -0.8107F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 36, 0, -5.1F, 0.0F, -1.0F, 6, 1, 3, 0.0F, true));

        this.rightmembranearm = new AdvancedModelRenderer(this);
        this.rightmembranearm.setRotationPoint(-2.1F, 0.5F, 2.0F);
        this.rightwing.addChild(rightmembranearm);
        this.rightmembranearm.cubeList.add(new ModelBox(rightmembranearm, 21, 32, -3.0F, -0.5F, 0.0F, 6, 1, 5, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.0602F, -0.1639F, 0.354F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 32, 17, -9.0F, 0.0F, -3.0F, 9, 1, 3, -0.01F, true));

        this.rightmembranemiddle = new AdvancedModelRenderer(this);
        this.rightmembranemiddle.setRotationPoint(-4.5F, 0.5F, 0.0F);
        this.rightwing2.addChild(rightmembranemiddle);
        this.rightmembranemiddle.cubeList.add(new ModelBox(rightmembranemiddle, 19, 23, -4.5F, -0.5F, -0.025F, 9, 1, 5, -0.01F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-9.0F, 0.5F, -3.0F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 2.7235F, -1.0533F, -2.4352F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 26, 29, 0.0F, -0.5F, -2.0F, 13, 1, 2, 0.02F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(6.5F, 0.0F, -2.0F);
        this.rightwing3.addChild(rightmembrane);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 16, -6.5F, -0.5F, -6.0F, 13, 1, 6, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, -0.7087F, -1.306F, 0.7114F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.righthand.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 47, 42, 0.05F, -0.5F, -1.375F, 1, 1, 3, 0.01F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(13.0F, 0.0F, 0.0F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, -0.0475F, 0.346F, -0.1392F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 36, 4, 0.0F, -0.5F, -2.0F, 6, 1, 2, 0.0F, true));

        this.rightmembraneend = new AdvancedModelRenderer(this);
        this.rightmembraneend.setRotationPoint(7.0F, -0.0375F, -2.0F);
        this.rightwing4.addChild(rightmembraneend);
        this.rightmembraneend.cubeList.add(new ModelBox(rightmembraneend, 0, 8, -7.0F, 0.0375F, -6.0F, 14, 0, 8, 0.0F, true));
        this.rightmembraneend.cubeList.add(new ModelBox(rightmembraneend, 0, 0, -7.0F, -0.0375F, -6.0F, 14, 0, 8, 0.0F, true));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.5F, -0.5F, -3.4F);
        this.main.addChild(leftwing);
        this.setRotateAngle(leftwing, -0.0265F, 0.0031F, 0.8107F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 36, 0, -0.9F, 0.0F, -1.0F, 6, 1, 3, 0.0F, false));

        this.leftmembranearm = new AdvancedModelRenderer(this);
        this.leftmembranearm.setRotationPoint(2.1F, 0.5F, 2.0F);
        this.leftwing.addChild(leftmembranearm);
        this.leftmembranearm.cubeList.add(new ModelBox(leftmembranearm, 21, 32, -3.0F, -0.5F, 0.0F, 6, 1, 5, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(4.0F, 0.0F, 2.0F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.0602F, 0.1639F, -0.354F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 32, 17, 0.0F, 0.0F, -3.0F, 9, 1, 3, -0.01F, false));

        this.leftmembranemiddle = new AdvancedModelRenderer(this);
        this.leftmembranemiddle.setRotationPoint(4.5F, 0.5F, 0.0F);
        this.leftwing2.addChild(leftmembranemiddle);
        this.leftmembranemiddle.cubeList.add(new ModelBox(leftmembranemiddle, 19, 23, -4.5F, -0.5F, -0.025F, 9, 1, 5, -0.01F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(9.0F, 0.5F, -3.0F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 2.7235F, 1.0533F, 2.4352F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 26, 29, -13.0F, -0.5F, -2.0F, 13, 1, 2, 0.02F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(-6.5F, 0.0F, -2.0F);
        this.leftwing3.addChild(leftmembrane);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 16, -6.5F, -0.5F, -6.0F, 13, 1, 6, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, -0.7087F, 1.306F, -0.7114F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lefthand.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.4363F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 47, 42, -1.05F, -0.5F, -1.375F, 1, 1, 3, 0.01F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(-13.0F, 0.0F, 0.0F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, -0.0475F, -0.346F, 0.1392F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 36, 4, -6.0F, -0.5F, -2.0F, 6, 1, 2, 0.0F, false));

        this.leftmembraneend = new AdvancedModelRenderer(this);
        this.leftmembraneend.setRotationPoint(-7.0F, -0.0375F, -2.0F);
        this.leftwing4.addChild(leftmembraneend);
        this.leftmembraneend.cubeList.add(new ModelBox(leftmembraneend, 0, 8, -7.0F, 0.0375F, -6.0F, 14, 0, 8, 0.0F, false));
        this.leftmembraneend.cubeList.add(new ModelBox(leftmembraneend, 0, 0, -7.0F, -0.0375F, -6.0F, 14, 0, 8, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.25F, -4.825F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, 0.0873F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 24, 38, -2.5F, -0.45F, -2.1F, 5, 5, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.5F, 0.25F, -2.0F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 36, -2.5F, -0.45F, -3.1F, 4, 4, 4, -0.02F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 24, 48, -2.0F, 0.95F, -3.85F, 3, 2, 1, -0.03F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.5F, -2.8F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 43, 7, -2.0F, 1.8F, -4.6F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 5, 0.375F, 1.925F, -3.6F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 4, 5, -1.375F, 1.925F, -3.6F, 0, 1, 2, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 25, 45, -2.5F, 1.8F, -2.0F, 4, 1, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 44, -2.5F, 0.8F, -2.0F, 4, 1, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.225F, -3.35F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.4966F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 47, -2.0F, -3.2895F, -0.0329F, 4, 2, 1, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 0.225F, -3.35F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -1.453F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 47, 26, -1.5F, -1.9645F, -0.0329F, 3, 2, 1, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, 1.8F, -4.6F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.6545F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 48, -1.5F, -2.0F, 0.0F, 3, 2, 1, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.375F, 2.425F, -4.1F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -0.05F, -0.5F, -0.35F, 0, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 1.8F, -0.5F, -0.35F, 0, 1, 1, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, 2.8F, -0.0375F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 45, -2.0F, 0.0F, -1.9625F, 4, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 48, -1.0F, -1.7F, -1.9625F, 2, 2, 2, -0.03F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 11, -1.5F, -0.025F, -4.5375F, 3, 1, 3, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.9F, 0.225F, -3.0375F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 20, 0.1F, -0.375F, -1.425F, 0, 1, 3, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 20, 1.7F, -0.375F, -1.425F, 0, 1, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.75F, -0.9625F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0611F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 21, -1.0F, -0.55F, -3.0F, 2, 1, 4, -0.04F, false));

        this.eye2 = new AdvancedModelRenderer(this);
        this.eye2.setRotationPoint(-1.95F, 1.4F, -2.4F);
        this.head.addChild(eye2);
        this.setRotateAngle(eye2, 0.08F, -0.4243F, -0.0971F);
        this.eye2.cubeList.add(new ModelBox(eye2, 0, 18, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.eye2.cubeList.add(new ModelBox(eye2, 4, 13, -0.55F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.95F, 1.4F, -2.4F);
        this.head.addChild(eye);
        this.setRotateAngle(eye, 0.08F, 0.4243F, 0.0971F);
        this.eye.cubeList.add(new ModelBox(eye, 0, 18, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        this.eye.cubeList.add(new ModelBox(eye, 4, 13, -0.45F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.35F, 6.3F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 47, 46, -1.0F, -0.25F, -1.0F, 2, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.45F, 0.525F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 24, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.7875F, 1.5F, 4.15F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.4282F, 0.3437F, 0.9584F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 0, -0.9625F, -0.8496F, -0.8639F, 2, 5, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 7, -0.8625F, -0.8496F, -2.8639F, 1, 4, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 11, -0.0375F, -0.8496F, 1.1361F, 0, 5, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 32, 50, 0.0125F, -0.8496F, 1.1361F, 0, 5, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0375F, 4.0504F, -0.2639F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.6704F, -0.0376F, 0.3663F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 32, 7, -0.5F, -0.6792F, -0.1541F, 1, 1, 9, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 12, 31, 0.0F, -2.6792F, 0.3459F, 0, 2, 7, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 8, 47, 0.05F, -2.6792F, 0.3459F, 0, 2, 7, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, -0.1792F, 8.5959F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.3024F, 0.2544F, -1.1118F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 38, 32, -1.5F, -0.5F, -3.884F, 3, 1, 4, 0.0F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.7875F, 1.5F, 4.15F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, 0.4282F, -0.3437F, -0.9584F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 0, -1.0375F, -0.8496F, -0.8639F, 2, 5, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 7, -0.1375F, -0.8496F, -2.8639F, 1, 4, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 11, 0.0375F, -0.8496F, 1.1361F, 0, 5, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 32, 50, -0.0125F, -0.8496F, 1.1361F, 0, 5, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0375F, 4.0504F, -0.2639F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.6704F, 0.0376F, -0.3663F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 32, 7, -0.5F, -0.6792F, -0.1541F, 1, 1, 9, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 12, 31, 0.0F, -2.6792F, 0.3459F, 0, 2, 7, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 8, 47, -0.05F, -2.6792F, 0.3459F, 0, 2, 7, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, -0.1792F, 8.5959F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.3024F, -0.2544F, 1.1118F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 38, 32, -1.5F, -0.5F, -3.884F, 3, 1, 4, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(main, -1.5F, 3.15F, 0.0F);
        this.setRotateAngle(neck, 0.2F, 0.3F, 0.3F);
        this.setRotateAngle(neck2, -0.2F, 0.3F, 0.2F);
        this.setRotateAngle(head, 0.3F, 0.0F, 0.1F);
        this.setRotateAngle(jaw, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(leftleg2, -0.8F, -0.0F, 0.2F);
        this.setRotateAngle(leftleg3, 1.5F, -1.5F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(rightleg2, -0.8F, 0.0F, 0.2F);
        this.setRotateAngle(rightleg3, 1.8F, 1.5F, 0.0F);
        this.setRotateAngle(leftwing, 0.05F, 0.2F, 0.08F);
        this.setRotateAngle(leftwing2, 0.0F, 0.3F, 0.1F);
        this.setRotateAngle(leftwing3, 0.0F, 2.0F, 0.1F);
        this.setRotateAngle(leftwing4, 0.0F, -0.8F, 0.0F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.05F, 0.2F, -0.08F);
        this.setRotateAngle(rightwing2, 0.0F, 0.3F, -0.1F);
        this.setRotateAngle(rightwing3, 0.0F, -2.7F, 0.1F);
        this.setRotateAngle(rightwing4, 0.0F, 0.9F, 0.0F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = -0.2F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = -0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.3F, 0.0F, -0.3F);
        this.setRotateAngle(neck, 0.0F, 0.2F, 0.2F);
        this.setRotateAngle(neck2, 0.0F, 0.2F, 0.2F);
        this.setRotateAngle(head, -0.0F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, -0.3F, -1.2F);
        this.setRotateAngle(leftleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.3F, 1.2F);
        this.setRotateAngle(rightleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(leftwing3, 0.0F, -3.15F, -0.2F);
        this.setRotateAngle(leftwing4, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(rightwing3, 0.0F, 3.15F, 0.2F);
        this.setRotateAngle(rightwing4, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = 0.03F;
        this.main.offsetX = -0.015F;
        this.main.offsetY = -0.6F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, -0.4F, 0.0F, 0.0F);
        this.setRotateAngle(neck, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, -0.3F, -1.2F);
        this.setRotateAngle(leftleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.3F, 1.2F);
        this.setRotateAngle(rightleg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(leftwing2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(leftwing3, 0.0F, -3.15F, -0.2F);
        this.setRotateAngle(leftwing4, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(rightwing3, 0.0F, 3.15F, 0.2F);
        this.setRotateAngle(rightwing4, 0.0F, 0.0F, -0.2F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = 0.0F;
        this.main.offsetX = 0.0F;
        this.main.offsetY = 0.08F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.2F;
        this.main.offsetX = 0.0F;
        this.main.rotateAngleY = (float)Math.toRadians(235);
        this.main.rotateAngleX = (float)Math.toRadians(-1);
        this.main.rotateAngleZ = (float)Math.toRadians(-1);
        this.main.scaleChildren = true;
        float scaler = 0.5F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAnurognathid ee = (EntityPrehistoricFloraAnurognathid) entitylivingbaseIn;

        if (ee.getAttachmentPos() == null ) {
            //animFlight(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else if (!ee.getHeadCollided() && ee.getAttachmentPos() != null) {
            animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        AdvancedModelRenderer[] wingLeft = {this.leftwing, this.leftwing2, this.leftwing3, this.leftwing4};
        AdvancedModelRenderer[] wingRight = {this.rightwing, this.rightwing2, this.rightwing3, this.rightwing4};

        AdvancedModelRenderer[] legLeft = {this.leftleg, this.leftleg2, this.leftleg3};
        AdvancedModelRenderer[] legRight = {this.rightleg, this.rightleg2, this.rightleg3};

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2};

        EntityPrehistoricFloraAnurognathid entityAnurognathid = (EntityPrehistoricFloraAnurognathid) e;
        if (entityAnurognathid.getAttachmentPos() == null) {
            //flight pose
            this.setRotateAngle(leftwing, -0.0873F, -0.0436F, 0.0873F);
            this.setRotateAngle(leftwing3, 0.0F, 2.8362F, 0.0F);
            this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
            this.setRotateAngle(leftwing4, 0.0F, -0.3054F, 0.0F);
            this.setRotateAngle(rightwing, -0.0873F, 0.0436F, -0.0873F);
            this.setRotateAngle(rightwing3, 0.0F, -2.8362F, 0.0F);
            this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
            this.setRotateAngle(rightwing4, 0.0F, 0.3054F, 0.0F);
            this.setRotateAngle(cube_r3, -0.2182F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.6109F, -0.1745F, -1.4835F);
            this.setRotateAngle(leftleg2, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg3, 2.618F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg, 0.6109F, 0.1745F, 1.4835F);
            this.setRotateAngle(rightleg2, -0.7854F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg3, 2.618F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.3054F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -1.4966F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -1.453F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r6, -0.6545F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.0611F, 0.0F, 0.0F);
            this.setRotateAngle(eye2, 0.08F, -0.4243F, -0.0971F);
            this.setRotateAngle(eye, 0.08F, 0.4243F, 0.0971F);

            float speed = 1.20F;
            float fixedY = 0; //The standard offset to centre the mob

            //Animations:
            this.chainFlap(wingLeft, speed, 0.35F, 0.3F, f2, 1F);
            this.chainFlap(wingRight, speed, -0.35F, -0.3F, f2, 1F);

            this.swing(leftwing3, speed, 0.4F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(rightwing3, speed, -0.4F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(leftwing, speed, 0.10F, false, 2.0F, 0.08F, f2, 1F);
            this.swing(rightwing, speed, -0.10F, false, 2.0F, -0.08F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speed * 0.3F, 0.25F, false, 4, f2, 1);
            this.main.offsetZ = floatMoveZ;
            float floatMoveY = this.moveBoxExtended(speed * 0.4F, 0.50F, false, 4, f2, 1);
            this.main.offsetY = (floatMoveY) + fixedY;

            this.chainWaveExtended(legLeft, speed, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speed, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else {

        }

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);
    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnurognathid entity = (EntityPrehistoricFloraAnurognathid) entitylivingbaseIn;
        int animCycle = 60;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 3 + (((tickAnim - 0) / 20) * (0-(3)));
            zz = 0 + (((tickAnim - 0) / 20) * (-5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-3-(0)));
            zz = -5 + (((tickAnim - 20) / 10) * (0-(-5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -3 + (((tickAnim - 30) / 20) * (0-(-3)));
            zz = 0 + (((tickAnim - 30) / 20) * (5-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (3-(0)));
            zz = 5 + (((tickAnim - 50) / 10) * (0-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-1-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = -1 + (((tickAnim - 25) / 25) * (0-(-1)));
        }
        else if (tickAnim >= 50 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 5) * (-1-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = -1 + (((tickAnim - 55) / 5) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.9305-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.6824-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (23.3345-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 3.9305 + (((tickAnim - 12) / 3) * (13.89834-(3.9305)));
            yy = -11.6824 + (((tickAnim - 12) / 3) * (-21.2968-(-11.6824)));
            zz = 23.3345 + (((tickAnim - 12) / 3) * (16.1425-(23.3345)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 13.89834 + (((tickAnim - 15) / 7) * (13.89834-(13.89834)));
            yy = -21.2968 + (((tickAnim - 15) / 7) * (-21.2968-(-21.2968)));
            zz = 16.1425 + (((tickAnim - 15) / 7) * (16.1425-(16.1425)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 13.89834 + (((tickAnim - 22) / 18) * (6.94246-(13.89834)));
            yy = -21.2968 + (((tickAnim - 22) / 18) * (4.9382-(-21.2968)));
            zz = 16.1425 + (((tickAnim - 22) / 18) * (10.7483-(16.1425)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.94246 + (((tickAnim - 40) / 10) * (3.41726-(6.94246)));
            yy = 4.9382 + (((tickAnim - 40) / 10) * (17.3784-(4.9382)));
            zz = 10.7483 + (((tickAnim - 40) / 10) * (4.6001-(10.7483)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 3.41726 + (((tickAnim - 50) / 10) * (0-(3.41726)));
            yy = 17.3784 + (((tickAnim - 50) / 10) * (0-(17.3784)));
            zz = 4.6001 + (((tickAnim - 50) / 10) * (0-(4.6001)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (11.61-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0.83-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-2.38-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 11.61 + (((tickAnim - 12) / 6) * (23.21034-(11.61)));
            yy = 0.83 + (((tickAnim - 12) / 6) * (1.6621-(0.83)));
            zz = -2.38 + (((tickAnim - 12) / 6) * (-4.769-(-2.38)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 23.21034 + (((tickAnim - 18) / 4) * (23.21034-(23.21034)));
            yy = 1.6621 + (((tickAnim - 18) / 4) * (1.6621-(1.6621)));
            zz = -4.769 + (((tickAnim - 18) / 4) * (-4.769-(-4.769)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = 23.21034 + (((tickAnim - 22) / 28) * (5.73308-(23.21034)));
            yy = 1.6621 + (((tickAnim - 22) / 28) * (32.8773-(1.6621)));
            zz = -4.769 + (((tickAnim - 22) / 28) * (0.1011-(-4.769)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 5.73308 + (((tickAnim - 50) / 10) * (0-(5.73308)));
            yy = 32.8773 + (((tickAnim - 50) / 10) * (0-(32.8773)));
            zz = 0.1011 + (((tickAnim - 50) / 10) * (0-(0.1011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4.58426-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-4.1023-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-13.6133-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.58426 + (((tickAnim - 15) / 5) * (18.63806-(4.58426)));
            yy = -4.1023 + (((tickAnim - 15) / 5) * (2.9536-(-4.1023)));
            zz = -13.6133 + (((tickAnim - 15) / 5) * (-26.2466-(-13.6133)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 18.63806 + (((tickAnim - 20) / 20) * (19.97905-(18.63806)));
            yy = 2.9536 + (((tickAnim - 20) / 20) * (2.0852-(2.9536)));
            zz = -26.2466 + (((tickAnim - 20) / 20) * (-33.0986-(-26.2466)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = 19.97905 + (((tickAnim - 40) / 13) * (42.19539-(19.97905)));
            yy = 2.0852 + (((tickAnim - 40) / 13) * (-7.2775-(2.0852)));
            zz = -33.0986 + (((tickAnim - 40) / 13) * (-59.6441-(-33.0986)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 42.19539 + (((tickAnim - 53) / 7) * (0-(42.19539)));
            yy = -7.2775 + (((tickAnim - 53) / 7) * (0-(-7.2775)));
            zz = -59.6441 + (((tickAnim - 53) / 7) * (0-(-59.6441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-7.5-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = -7.5 + (((tickAnim - 23) / 10) * (7.17-(-7.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 33) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 14) * (0-(0)));
            zz = 7.17 + (((tickAnim - 33) / 14) * (3.58-(7.17)));
        }
        else if (tickAnim >= 47 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 47) / 6) * (6.31411-(0)));
            yy = 0 + (((tickAnim - 47) / 6) * (-2.6586-(0)));
            zz = 3.58 + (((tickAnim - 47) / 6) * (22.8652-(3.58)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 6.31411 + (((tickAnim - 53) / 7) * (0-(6.31411)));
            yy = -2.6586 + (((tickAnim - 53) / 7) * (0-(-2.6586)));
            zz = 22.8652 + (((tickAnim - 53) / 7) * (0-(22.8652)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.74 + (((tickAnim - 0) / 10) * (6.94246-(10.74)));
            yy = 9.37 + (((tickAnim - 0) / 10) * (-4.93822-(9.37)));
            zz = -13.69 + (((tickAnim - 0) / 10) * (-10.74828-(-13.69)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 6.94246 + (((tickAnim - 10) / 10) * (3.41726-(6.94246)));
            yy = -4.93822 + (((tickAnim - 10) / 10) * (-17.37844-(-4.93822)));
            zz = -10.74828 + (((tickAnim - 10) / 10) * (-4.60006-(-10.74828)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 3.41726 + (((tickAnim - 20) / 10) * (0-(3.41726)));
            yy = -17.37844 + (((tickAnim - 20) / 10) * (0-(-17.37844)));
            zz = -4.60006 + (((tickAnim - 20) / 10) * (0-(-4.60006)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (3.9305-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (11.68244-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (-23.33452-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 3.9305 + (((tickAnim - 42) / 3) * (13.89834-(3.9305)));
            yy = 11.68244 + (((tickAnim - 42) / 3) * (21.29679-(11.68244)));
            zz = -23.33452 + (((tickAnim - 42) / 3) * (-16.14246-(-23.33452)));
        }
        else if (tickAnim >= 45 && tickAnim < 52) {
            xx = 13.89834 + (((tickAnim - 45) / 7) * (13.89834-(13.89834)));
            yy = 21.29679 + (((tickAnim - 45) / 7) * (21.29679-(21.29679)));
            zz = -16.14246 + (((tickAnim - 45) / 7) * (-16.14246-(-16.14246)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 13.89834 + (((tickAnim - 52) / 8) * (10.74-(13.89834)));
            yy = 21.29679 + (((tickAnim - 52) / 8) * (9.37-(21.29679)));
            zz = -16.14246 + (((tickAnim - 52) / 8) * (-13.69-(-16.14246)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 18.07 + (((tickAnim - 0) / 20) * (5.73308-(18.07)));
            yy = -10.84 + (((tickAnim - 0) / 20) * (-32.87733-(-10.84)));
            zz = 3.34 + (((tickAnim - 0) / 20) * (-0.10109-(3.34)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 5.73308 + (((tickAnim - 20) / 10) * (0-(5.73308)));
            yy = -32.87733 + (((tickAnim - 20) / 10) * (0-(-32.87733)));
            zz = -0.10109 + (((tickAnim - 20) / 10) * (0-(-0.10109)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 30) / 12) * (11.61-(0)));
            yy = 0 + (((tickAnim - 30) / 12) * (-0.83-(0)));
            zz = 0 + (((tickAnim - 30) / 12) * (2.38-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 11.61 + (((tickAnim - 42) / 6) * (23.21034-(11.61)));
            yy = -0.83 + (((tickAnim - 42) / 6) * (-1.6621-(-0.83)));
            zz = 2.38 + (((tickAnim - 42) / 6) * (4.76899-(2.38)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 23.21034 + (((tickAnim - 48) / 4) * (23.21034-(23.21034)));
            yy = -1.6621 + (((tickAnim - 48) / 4) * (-1.6621-(-1.6621)));
            zz = 4.76899 + (((tickAnim - 48) / 4) * (4.76899-(4.76899)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 23.21034 + (((tickAnim - 52) / 8) * (18.07-(23.21034)));
            yy = -1.6621 + (((tickAnim - 52) / 8) * (-10.84-(-1.6621)));
            zz = 4.76899 + (((tickAnim - 52) / 8) * (3.34-(4.76899)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 19.31 + (((tickAnim - 0) / 10) * (19.97905-(19.31)));
            yy = -2.52 + (((tickAnim - 0) / 10) * (-2.08516-(-2.52)));
            zz = 29.67 + (((tickAnim - 0) / 10) * (33.09862-(29.67)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 19.97905 + (((tickAnim - 10) / 13) * (42.19539-(19.97905)));
            yy = -2.08516 + (((tickAnim - 10) / 13) * (7.2775-(-2.08516)));
            zz = 33.09862 + (((tickAnim - 10) / 13) * (59.6441-(33.09862)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 42.19539 + (((tickAnim - 23) / 7) * (0-(42.19539)));
            yy = 7.2775 + (((tickAnim - 23) / 7) * (0-(7.2775)));
            zz = 59.6441 + (((tickAnim - 23) / 7) * (0-(59.6441)));
        }
        else if (tickAnim >= 30 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 30) / 15) * (4.58426-(0)));
            yy = 0 + (((tickAnim - 30) / 15) * (4.10227-(0)));
            zz = 0 + (((tickAnim - 30) / 15) * (13.61328-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 4.58426 + (((tickAnim - 45) / 5) * (18.63806-(4.58426)));
            yy = 4.10227 + (((tickAnim - 45) / 5) * (-2.95363-(4.10227)));
            zz = 13.61328 + (((tickAnim - 45) / 5) * (26.24662-(13.61328)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 18.63806 + (((tickAnim - 50) / 10) * (19.31-(18.63806)));
            yy = -2.95363 + (((tickAnim - 50) / 10) * (-2.52-(-2.95363)));
            zz = 26.24662 + (((tickAnim - 50) / 10) * (29.67-(26.24662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = -2.66 + (((tickAnim - 0) / 3) * (-7.17-(-2.66)));
        }
        else if (tickAnim >= 3 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 3) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 14) * (0-(0)));
            zz = -7.17 + (((tickAnim - 3) / 14) * (-3.58-(-7.17)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 17) / 6) * (6.31411-(0)));
            yy = 0 + (((tickAnim - 17) / 6) * (2.65859-(0)));
            zz = -3.58 + (((tickAnim - 17) / 6) * (-22.86521-(-3.58)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 6.31411 + (((tickAnim - 23) / 7) * (0-(6.31411)));
            yy = 2.65859 + (((tickAnim - 23) / 7) * (0-(2.65859)));
            zz = -22.86521 + (((tickAnim - 23) / 7) * (0-(-22.86521)));
        }
        else if (tickAnim >= 30 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 23) * (7.5-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 7.5 + (((tickAnim - 53) / 7) * (-2.66-(7.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (4-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            yy = -3 + (((tickAnim - 13) / 10) * (6-(-3)));
            zz = 4 + (((tickAnim - 13) / 10) * (8-(4)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = 6 + (((tickAnim - 23) / 7) * (0-(6)));
            zz = 8 + (((tickAnim - 23) / 7) * (0-(8)));
        }
        else if (tickAnim >= 30 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 30) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 13) * (3-(0)));
            zz = 0 + (((tickAnim - 30) / 13) * (-4-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 43) / 10) * (0-(0)));
            yy = 3 + (((tickAnim - 43) / 10) * (-6-(3)));
            zz = -4 + (((tickAnim - 43) / 10) * (-8-(-4)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = -6 + (((tickAnim - 53) / 7) * (0-(-6)));
            zz = -8 + (((tickAnim - 53) / 7) * (0-(-8)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-57.5152-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (4.223-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (6.6785-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -57.5152 + (((tickAnim - 25) / 5) * (-61.15349-(-57.5152)));
            yy = 4.223 + (((tickAnim - 25) / 5) * (7.439-(4.223)));
            zz = 6.6785 + (((tickAnim - 25) / 5) * (6.4092-(6.6785)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -61.15349 + (((tickAnim - 30) / 20) * (0-(-61.15349)));
            yy = 7.439 + (((tickAnim - 30) / 20) * (0-(7.439)));
            zz = 6.4092 + (((tickAnim - 30) / 20) * (0-(6.4092)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = -20 + (((tickAnim - 53) / 2) * (0-(-20)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = -20 + (((tickAnim - 58) / 2) * (0-(-20)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -12.5 + (((tickAnim - 25) / 5) * (9.28868-(-12.5)));
            yy = 0 + (((tickAnim - 25) / 5) * (4.3685-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-2.4329-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9.28868 + (((tickAnim - 30) / 20) * (0-(9.28868)));
            yy = 4.3685 + (((tickAnim - 30) / 20) * (0-(4.3685)));
            zz = -2.4329 + (((tickAnim - 30) / 20) * (0-(-2.4329)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 12.5 + (((tickAnim - 53) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 12.5 + (((tickAnim - 58) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (14.25076-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (52.1835-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (-23.6903-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 14.25076 + (((tickAnim - 25) / 5) * (34.36799-(14.25076)));
            yy = 52.1835 + (((tickAnim - 25) / 5) * (37.1498-(52.1835)));
            zz = -23.6903 + (((tickAnim - 25) / 5) * (-2.6111-(-23.6903)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 34.36799 + (((tickAnim - 30) / 20) * (0-(34.36799)));
            yy = 37.1498 + (((tickAnim - 30) / 20) * (0-(37.1498)));
            zz = -2.6111 + (((tickAnim - 30) / 20) * (0-(-2.6111)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 3) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 2) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 58) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -61.15349 + (((tickAnim - 0) / 20) * (0-(-61.15349)));
            yy = -7.43896 + (((tickAnim - 0) / 20) * (0-(-7.43896)));
            zz = -6.40921 + (((tickAnim - 0) / 20) * (0-(-6.40921)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -20 + (((tickAnim - 23) / 2) * (0-(-20)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (-20-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -20 + (((tickAnim - 28) / 2) * (0-(-20)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (-57.5152-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (-4.22299-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (-6.67847-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -57.5152 + (((tickAnim - 55) / 5) * (-61.15349-(-57.5152)));
            yy = -4.22299 + (((tickAnim - 55) / 5) * (-7.43896-(-4.22299)));
            zz = -6.67847 + (((tickAnim - 55) / 5) * (-6.40921-(-6.67847)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 9.28868 + (((tickAnim - 0) / 20) * (0-(9.28868)));
            yy = -4.36852 + (((tickAnim - 0) / 20) * (0-(-4.36852)));
            zz = 2.43288 + (((tickAnim - 0) / 20) * (0-(2.43288)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 12.5 + (((tickAnim - 23) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (12.5-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 12.5 + (((tickAnim - 28) / 2) * (0-(12.5)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 55) / 5) * (9.28868-(-12.5)));
            yy = 0 + (((tickAnim - 55) / 5) * (-4.36852-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (2.43288-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 34.36799 + (((tickAnim - 0) / 20) * (0-(34.36799)));
            yy = -37.14981 + (((tickAnim - 0) / 20) * (0-(-37.14981)));
            zz = 2.61109 + (((tickAnim - 0) / 20) * (0-(2.61109)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 2) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 18) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (14.25076-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (-52.18353-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (23.69028-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 14.25076 + (((tickAnim - 55) / 5) * (34.36799-(14.25076)));
            yy = -52.18353 + (((tickAnim - 55) / 5) * (-37.14981-(-52.18353)));
            zz = 23.69028 + (((tickAnim - 55) / 5) * (2.61109-(23.69028)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnurognathid e = (EntityPrehistoricFloraAnurognathid) entity;
        animator.update(entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(2);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(2),0,0);
        animator.rotate(this.head, (float) Math.toRadians(3), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(5),0,0);
        animator.rotate(this.head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(3);
    }

}
