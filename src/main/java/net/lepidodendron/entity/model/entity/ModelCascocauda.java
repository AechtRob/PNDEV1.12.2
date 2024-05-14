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

public class ModelCascocauda extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer leftwing;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftmembrane;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightwing;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightmembrane;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer legwingleft;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer legwingright;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;

    private ModelAnimator animator;

    public ModelCascocauda() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.25F, -2.5F);
        this.setRotateAngle(main, -0.0436F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 10, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 33, -1.5F, -1.75F, 2.5F, 3, 4, 3, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.5F, -0.5F, -2.15F);
        this.main.addChild(leftwing);
        this.setRotateAngle(leftwing, -0.0436F, -0.3927F, 0.5236F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 19, 17, -0.9F, 0.0F, -1.0F, 6, 1, 5, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(4.0F, 0.0F, 2.0F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 0.1745F, 1.309F, -0.1745F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 17, 10, 0.0F, 0.0F, -3.0F, 7, 1, 5, -0.01F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(7.0F, 0.5F, -3.0F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.0F, 1.5708F, 0.0F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 30, 28, -7.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(4.0F, 0.5F, -4.0F);
        this.leftwing3.addChild(leftmembrane);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 5, -18.0F, -0.5F, -1.0F, 14, 0, 5, 0.0F, false));
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 0, -18.0F, -0.45F, -1.0F, 14, 0, 5, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0436F, -0.48F, -0.2618F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lefthand.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 9, 33, -1.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-2.5F, -0.5F, -2.15F);
        this.main.addChild(rightwing);
        this.setRotateAngle(rightwing, -0.0436F, 0.3927F, -0.5236F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 19, 17, -5.1F, 0.0F, -1.0F, 6, 1, 5, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 0.1745F, -1.309F, 0.1745F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 17, 10, -7.0F, 0.0F, -3.0F, 7, 1, 5, -0.01F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-7.0F, 0.5F, -3.0F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.0F, -1.5708F, 0.0F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 30, 28, 0.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(-4.0F, 0.5F, -4.0F);
        this.rightwing3.addChild(rightmembrane);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 5, 4.0F, -0.5F, -1.0F, 14, 0, 5, 0.0F, true));
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 0, 4.0F, -0.45F, -1.0F, 14, 0, 5, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, 0.0436F, 0.48F, 0.2618F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.righthand.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 9, 33, 0.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 31, 31, -2.0F, 0.0F, -3.0F, 4, 4, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 36, 9, -2.0F, 0.0F, -4.0F, 4, 2, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.5F, 0.25F, -3.5F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, 0.2618F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 18, 23, -3.0F, 1.25F, -4.0F, 5, 1, 4, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 11, 1.9F, 1.4F, -4.0F, 0, 1, 3, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 18, 33, -2.5F, 1.25F, -5.0F, 4, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 16, -2.0F, 1.5F, -4.9F, 3, 1, 0, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 10, 38, 1.1F, -0.15F, -4.25F, 1, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, 1.125F, 0.35F, -3.75F, 1, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 11, -2.9F, 1.4F, -4.0F, 0, 1, 3, 0.0F, true));
        this.Head.cubeList.add(new ModelBox(Head, 10, 38, -3.1F, -0.15F, -4.25F, 1, 2, 2, 0.0F, true));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -3.125F, 0.35F, -3.75F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.5F, 1.25F, -5.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.288F, 0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 41, 0.0F, -2.5F, -1.25F, 0, 2, 2, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, 1.25F, -5.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2356F, 0.3491F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 41, -1.0F, -3.5F, -1.0F, 0, 2, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 1.25F, -5.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2356F, -0.3491F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 41, 1.0F, -3.5F, -1.0F, 0, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 1.25F, -5.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.288F, -0.2618F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 41, 0.0F, -2.5F, -1.25F, 0, 2, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.25F, -5.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4538F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 38, -2.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.25F, 0.0F);
        this.Head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 22, -3.0F, -2.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.25F, 0.0F);
        this.Head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 28, -3.0F, 0.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 10, 1.9F, -0.15F, -4.0F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 10, -2.9F, -0.15F, -4.0F, 0, 1, 3, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 15, -2.0F, -0.25F, -4.9F, 3, 1, 0, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 33, 6, -3.0F, -1.9F, -1.0F, 5, 2, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 12, -2.5F, 0.0F, -5.0F, 4, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 28, -2.5F, -1.0F, 0.0F, 4, 1, 4, 0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.25F, 5.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 20, 36, -1.0F, -0.25F, -1.0F, 2, 2, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.25F, 1.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 14, 28, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.3491F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 12, 33, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.01F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.7875F, 0.5F, 4.4F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.7418F, 0.0F, -0.6109F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 36, 16, -1.0375F, -0.75F, -1.0F, 2, 3, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 0, 0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, false));

        this.legwingleft = new AdvancedModelRenderer(this);
        this.legwingleft.setRotationPoint(0.2125F, 2.25F, -1.0F);
        this.leftleg.addChild(legwingleft);
        this.legwingleft.cubeList.add(new ModelBox(legwingleft, 0, 8, -0.35F, -3.0F, -1.0F, 1, 3, 2, -0.01F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0375F, 2.25F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.4843F, -0.0522F, 0.1388F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 33, 0, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 14, 19, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.3254F, -0.2236F, 0.3844F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 32, 23, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.7875F, 0.5F, 4.4F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.7418F, 0.0F, 0.6109F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 36, 16, -0.9625F, -0.75F, -1.0F, 2, 3, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 0, -0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, true));

        this.legwingright = new AdvancedModelRenderer(this);
        this.legwingright.setRotationPoint(-0.2125F, 2.25F, -1.0F);
        this.rightleg.addChild(legwingright);
        this.legwingright.cubeList.add(new ModelBox(legwingright, 0, 8, -0.65F, -3.0F, -1.0F, 1, 3, 2, -0.01F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0375F, 2.25F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.4843F, 0.0522F, -0.1388F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 33, 0, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 14, 19, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.3254F, 0.2236F, -0.3844F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 32, 23, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.0F, true));

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
        this.setRotateAngle(Head, -0.1F, 0.0F, 0.1F);
        this.setRotateAngle(jaw, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.5F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, 0.0F, -1.5F);
        this.setRotateAngle(leftleg2, -0.8F, -0.0F, 0.2F);
        this.setRotateAngle(leftleg3, 1.5F, -1.5F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.0F, 1.5F);
        this.setRotateAngle(rightleg2, -0.8F, 0.0F, -0.4F);
        this.setRotateAngle(rightleg3, 1.8F, 1.5F, 0.0F);
        this.setRotateAngle(leftwing, 0.05F, 0.2F, 0.08F);
        this.setRotateAngle(leftwing2, 0.0F, 0.3F, 0.1F);
        this.setRotateAngle(leftwing3, 0.0F, 2.0F, 0.1F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.05F, 0.2F, -0.08F);
        this.setRotateAngle(rightwing2, 0.0F, 0.3F, -0.1F);
        this.setRotateAngle(rightwing3, 0.0F, -2.7F, 0.1F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = -0.2F;
        this.main.offsetX = 0.0F;
        this.main.offsetZ = -0.005F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.2F, 0.0F, 0.2F);
        this.setRotateAngle(neck, -0.5F, -0.2F, 0.0F);
        this.setRotateAngle(Head, -0.3F, -0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
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
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(rightwing2, 0.0F, 0.0F, 0.2F);
        this.setRotateAngle(rightwing3, 0.0F, 3.15F, 0.2F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = 0.02F;
        this.main.offsetX = 0.005F;
        this.main.offsetY = -0.66F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, 0.3F, 0.0F, -0.1F);
        this.setRotateAngle(neck, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(Head, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg, 0.0F, -0.3F, -1.2F);
        this.setRotateAngle(leftleg2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(leftleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg, 0.0F, 0.3F, 1.2F);
        this.setRotateAngle(rightleg2, -0.3F, 0.0F, 0.0F);
        this.setRotateAngle(rightleg3, 2.0F, 0.0F, 0.0F);
        this.setRotateAngle(leftwing, 0.0F, 0.0F, -0.1F);
        this.setRotateAngle(leftwing2, 0.0F, 0.3F, -0.2F);
        this.setRotateAngle(leftwing3, 0.0F, 2.5F, -0.2F);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(rightwing, 0.0F, 0.0F, 0.1F);
        this.setRotateAngle(rightwing2, 0.0F, -0.3F, 0.3F);
        this.setRotateAngle(rightwing3, 0.0F, -2.5F, 0.2F);
        this.setRotateAngle(righthand, 0.0F, 0.0F, 0.0F);
        this.main.offsetZ = 0.0F;
        this.main.offsetX = -0.0F;
        this.main.offsetY = 0.1F;
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
            //animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else if (!ee.getHeadCollided() && ee.getAttachmentPos() != null) {
            animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        AdvancedModelRenderer[] wingLeft = {this.leftwing, this.leftwing2, this.leftwing3};
        AdvancedModelRenderer[] wingRight = {this.rightwing, this.rightwing2, this.rightwing3};

        AdvancedModelRenderer[] legLeft = {this.leftleg, this.leftleg2, this.leftleg3};
        AdvancedModelRenderer[] legRight = {this.rightleg, this.rightleg2, this.rightleg3};

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2, this.tail3};

        EntityPrehistoricFloraAnurognathid entityAnurognathid = (EntityPrehistoricFloraAnurognathid) e;
        if (entityAnurognathid.getAttachmentPos() == null) {
            //flight pose
            this.setRotateAngle(main, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing, -0.0436F, -0.3927F, 0.0436F);
            this.setRotateAngle(leftwing2, 0.0F, 0.48F, 0.0F);
            this.setRotateAngle(leftwing3, 0.0F, 2.7053F, 0.1745F);
            this.setRotateAngle(lefthand, 0.0436F, -0.48F, -0.2618F);
            this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
            this.setRotateAngle(rightwing, -0.0436F, 0.3927F, -0.0436F);
            this.setRotateAngle(rightwing2, 0.0F, -0.48F, 0.0F);
            this.setRotateAngle(rightwing3, 0.0F, -2.7053F, -0.1745F);
            this.setRotateAngle(righthand, 0.0436F, 0.48F, 0.2618F);
            this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
            this.setRotateAngle(neck, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, 0.288F, 0.2618F, 0.0F);
            this.setRotateAngle(cube_r4, -0.2356F, 0.3491F, 0.0F);
            this.setRotateAngle(cube_r5, -0.2356F, -0.3491F, 0.0F);
            this.setRotateAngle(cube_r6, 0.288F, -0.2618F, 0.0F);
            this.setRotateAngle(cube_r7, -0.4538F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r9, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(tail3, 0.3491F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.5236F, 0.0F, -1.2654F);
            this.setRotateAngle(legwingleft, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg2, -0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg3, 3.1416F, -0.8727F, -1.309F);
            this.setRotateAngle(rightleg, 0.5236F, 0.0F, 1.2654F);
            this.setRotateAngle(legwingright, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg2, -0.9163F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg3, 3.1416F, 0.8727F, 1.309F);

            float speed = 1.50F;
            float fixedY = 0; //The standard offset to centre the mob

            //Animations:
            this.chainFlap(wingLeft, speed, 0.35F, 0.3F, f2, 1F);
            this.chainFlap(wingRight, speed, -0.35F, -0.3F, f2, 1F);

            this.swing(leftwing3, speed, 0.4F, false, 2.0F, 0.12F, f2, 1F);
            this.swing(rightwing3, speed, -0.4F, false, 2.0F, -0.12F, f2, 1F);

            this.swing(leftwing, speed, 0.10F, false, 2.0F, 0.08F, f2, 1F);
            this.swing(rightwing, speed, -0.10F, false, 2.0F, -0.08F, f2, 1F);

            float floatMoveZ = this.moveBoxExtended(speed * 0.3F, 0.30F, false, 4, f2, 1);
            this.main.offsetZ = floatMoveZ;
            float floatMoveY = this.moveBoxExtended(speed * 0.3F, 0.540F, false, 4, f2, 1);
            this.main.offsetY = (floatMoveY) + fixedY;

            this.chainWaveExtended(legLeft, speed, 0.055F, 0.1F, 0F, f2, 1F);
            this.chainWaveExtended(legRight, speed, -0.055F, -0.1F, 3F, f2, 1F);
            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.5F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.15F, 2.0F, f2, 1F);

        }
        else {

        }


        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, Head);
    }

    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAnurognathid entity = (EntityPrehistoricFloraAnurognathid) entitylivingbaseIn;
        int animCycle = 40;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 2 + (((tickAnim - 0) / 10) * (-2-(2)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 10) / 10) * (-2-(-2)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -2 + (((tickAnim - 20) / 10) * (0-(-2)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = -0.5 + (((tickAnim - 8) / 7) * (0.5-(-0.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0.5 + (((tickAnim - 15) / 5) * (0-(0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (-0.5-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 7) * (0-(0)));
            zz = -0.5 + (((tickAnim - 28) / 7) * (0.75-(-0.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0.75 + (((tickAnim - 35) / 5) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);





        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2 + (((tickAnim - 0) / 10) * (2-(-2)));
            yy = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            zz = -1 + (((tickAnim - 0) / 10) * (1-(-1)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 2 + (((tickAnim - 10) / 10) * (-2-(2)));
            yy = 2 + (((tickAnim - 10) / 10) * (0-(2)));
            zz = 1 + (((tickAnim - 10) / 10) * (1-(1)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -2 + (((tickAnim - 20) / 10) * (2-(-2)));
            yy = 0 + (((tickAnim - 20) / 10) * (-2-(0)));
            zz = 1 + (((tickAnim - 20) / 10) * (0-(1)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 2 + (((tickAnim - 30) / 10) * (-2-(2)));
            yy = -2 + (((tickAnim - 30) / 10) * (0-(-2)));
            zz = 0 + (((tickAnim - 30) / 10) * (-1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0.75 + (((tickAnim - 0) / 3) * (0-(0.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0.38 + (((tickAnim - 0) / 3) * (0.5-(0.38)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0.5 + (((tickAnim - 3) / 10) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 23) {
            xx = 3 + (((tickAnim - 13) / 10) * (0-(3)));
            yy = 0 + (((tickAnim - 13) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 13) / 10) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 23) / 10) * (3-(0)));
            yy = 0 + (((tickAnim - 23) / 10) * (0-(0)));
            zz = -0.5 + (((tickAnim - 23) / 10) * (0-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 3 + (((tickAnim - 33) / 7) * (0.75-(3)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0.38-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (30-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (10-(0)));
            yy = 30 + (((tickAnim - 7) / 3) * (30-(30)));
            zz = 0 + (((tickAnim - 7) / 3) * (-10-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10 + (((tickAnim - 10) / 2) * (10-(10)));
            yy = 30 + (((tickAnim - 10) / 2) * (30-(30)));
            zz = -10 + (((tickAnim - 10) / 2) * (-12-(-10)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 10 + (((tickAnim - 12) / 18) * (9.21789-(10)));
            yy = 30 + (((tickAnim - 12) / 18) * (-16.41303-(30)));
            zz = -12 + (((tickAnim - 12) / 18) * (-4.56657-(-12)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 9.21789 + (((tickAnim - 30) / 6) * (10-(9.21789)));
            yy = -16.41303 + (((tickAnim - 30) / 6) * (-30-(-16.41303)));
            zz = -4.56657 + (((tickAnim - 30) / 6) * (-10-(-4.56657)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 36) / 4) * (0-(10)));
            yy = -30 + (((tickAnim - 36) / 4) * (0-(-30)));
            zz = -10 + (((tickAnim - 36) / 4) * (0-(-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing, leftwing.rotateAngleX + (float) Math.toRadians(xx), leftwing.rotateAngleY + (float) Math.toRadians(yy), leftwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (10-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 20 + (((tickAnim - 7) / 3) * (20-(20)));
            yy = 10 + (((tickAnim - 7) / 3) * (10-(10)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 20 + (((tickAnim - 10) / 2) * (54.57059-(20)));
            yy = 10 + (((tickAnim - 10) / 2) * (3.68459-(10)));
            zz = 0 + (((tickAnim - 10) / 2) * (35.37406-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 54.57059 + (((tickAnim - 12) / 18) * (16.67-(54.57059)));
            yy = 3.68459 + (((tickAnim - 12) / 18) * (3.33-(3.68459)));
            zz = 35.37406 + (((tickAnim - 12) / 18) * (0-(35.37406)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 16.67 + (((tickAnim - 30) / 10) * (0-(16.67)));
            yy = 3.33 + (((tickAnim - 30) / 10) * (0-(3.33)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 90 + (((tickAnim - 0) / 7) * (163.26042-(90)));
            yy = -17.5 + (((tickAnim - 0) / 7) * (-31.47495-(-17.5)));
            zz = 92.5 + (((tickAnim - 0) / 7) * (135.5746-(92.5)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 163.26042 + (((tickAnim - 7) / 3) * (167.26084-(163.26042)));
            yy = -31.47495 + (((tickAnim - 7) / 3) * (-30.83841-(-31.47495)));
            zz = 135.5746 + (((tickAnim - 7) / 3) * (165.24856-(135.5746)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 167.26084 + (((tickAnim - 10) / 2) * (158.78997-(167.26084)));
            yy = -30.83841 + (((tickAnim - 10) / 2) * (-32.29577-(-30.83841)));
            zz = 165.24856 + (((tickAnim - 10) / 2) * (161.10889-(165.24856)));
        }
        else if (tickAnim >= 12 && tickAnim < 40) {
            xx = 158.78997 + (((tickAnim - 12) / 28) * (90-(158.78997)));
            yy = -32.29577 + (((tickAnim - 12) / 28) * (-17.5-(-32.29577)));
            zz = 161.10889 + (((tickAnim - 12) / 28) * (92.5-(161.10889)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 0) / 10) * (9.21789-(10)));
            yy = -6.77 + (((tickAnim - 0) / 10) * (16.413-(-6.77)));
            zz = 10 + (((tickAnim - 0) / 10) * (4.5666-(10)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 9.21789 + (((tickAnim - 10) / 6) * (10-(9.21789)));
            yy = 16.413 + (((tickAnim - 10) / 6) * (30-(16.413)));
            zz = 4.5666 + (((tickAnim - 10) / 6) * (10-(4.5666)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 16) / 4) * (0-(10)));
            yy = 30 + (((tickAnim - 16) / 4) * (0-(30)));
            zz = 10 + (((tickAnim - 16) / 4) * (0-(10)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-30-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (10-(0)));
            yy = -30 + (((tickAnim - 27) / 3) * (-30-(-30)));
            zz = 0 + (((tickAnim - 27) / 3) * (10-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 10 + (((tickAnim - 30) / 2) * (10-(10)));
            yy = -30 + (((tickAnim - 30) / 2) * (-30-(-30)));
            zz = 10 + (((tickAnim - 30) / 2) * (12-(10)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 10 + (((tickAnim - 32) / 8) * (10-(10)));
            yy = -30 + (((tickAnim - 32) / 8) * (-6.77-(-30)));
            zz = 12 + (((tickAnim - 32) / 8) * (10-(12)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13.33 + (((tickAnim - 0) / 10) * (14.17-(13.33)));
            yy = -6.67 + (((tickAnim - 0) / 10) * (-3.33-(-6.67)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 14.17 + (((tickAnim - 10) / 10) * (0-(14.17)));
            yy = -3.33 + (((tickAnim - 10) / 10) * (0-(-3.33)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-10-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 20 + (((tickAnim - 27) / 3) * (20-(20)));
            yy = -10 + (((tickAnim - 27) / 3) * (-10-(-10)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 20 + (((tickAnim - 30) / 10) * (13.33-(20)));
            yy = -10 + (((tickAnim - 30) / 10) * (-6.67-(-10)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 138.56 + (((tickAnim - 0) / 20) * (90-(138.56)));
            yy = 27.94 + (((tickAnim - 0) / 20) * (17.5-(27.94)));
            zz = -140.93 + (((tickAnim - 0) / 20) * (-92.5-(-140.93)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 90 + (((tickAnim - 20) / 7) * (163.26042-(90)));
            yy = 17.5 + (((tickAnim - 20) / 7) * (31.4749-(17.5)));
            zz = -92.5 + (((tickAnim - 20) / 7) * (-135.5746-(-92.5)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 163.26042 + (((tickAnim - 27) / 3) * (167.26084-(163.26042)));
            yy = 31.4749 + (((tickAnim - 27) / 3) * (30.8384-(31.4749)));
            zz = -135.5746 + (((tickAnim - 27) / 3) * (-165.2486-(-135.5746)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 167.26084 + (((tickAnim - 30) / 2) * (158.78997-(167.26084)));
            yy = 30.8384 + (((tickAnim - 30) / 2) * (32.2958-(30.8384)));
            zz = -165.2486 + (((tickAnim - 30) / 2) * (-161.1089-(-165.2486)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 158.78997 + (((tickAnim - 32) / 8) * (138.56-(158.78997)));
            yy = 32.2958 + (((tickAnim - 32) / 8) * (27.94-(32.2958)));
            zz = -161.1089 + (((tickAnim - 32) / 8) * (-140.93-(-161.1089)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (15-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 15 + (((tickAnim - 10) / 10) * (0-(15)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-15-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -15 + (((tickAnim - 30) / 10) * (0-(-15)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 2 + (((tickAnim - 10) / 3) * (2-(2)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 2 + (((tickAnim - 13) / 7) * (0-(2)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (-2-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            yy = -2 + (((tickAnim - 30) / 3) * (-2-(-2)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = -2 + (((tickAnim - 33) / 7) * (0-(-2)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-8-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -8 + (((tickAnim - 10) / 10) * (0-(-8)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (8-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 8 + (((tickAnim - 30) / 10) * (0-(8)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (-108.15834-(0)));
            yy = 0 + (((tickAnim - 2) / 8) * (30.33444-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (-138.57097-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -108.15834 + (((tickAnim - 10) / 3) * (-103.42378-(-108.15834)));
            yy = 30.33444 + (((tickAnim - 10) / 3) * (40.98924-(30.33444)));
            zz = -138.57097 + (((tickAnim - 10) / 3) * (-130.49381-(-138.57097)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -103.42378 + (((tickAnim - 13) / 12) * (4.6414-(-103.42378)));
            yy = 40.98924 + (((tickAnim - 13) / 12) * (26.3541-(40.98924)));
            zz = -130.49381 + (((tickAnim - 13) / 12) * (-13.65358-(-130.49381)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 4.6414 + (((tickAnim - 25) / 5) * (18.40821-(4.6414)));
            yy = 26.3541 + (((tickAnim - 25) / 5) * (13.18922-(26.3541)));
            zz = -13.65358 + (((tickAnim - 25) / 5) * (-12.78022-(-13.65358)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 18.40821 + (((tickAnim - 30) / 6) * (7.5-(18.40821)));
            yy = 13.18922 + (((tickAnim - 30) / 6) * (0-(13.18922)));
            zz = -12.78022 + (((tickAnim - 30) / 6) * (0-(-12.78022)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 7.5 + (((tickAnim - 36) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (-42.75707-(0)));
            yy = 0 + (((tickAnim - 2) / 8) * (-60.05859-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (-7.03815-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -42.75707 + (((tickAnim - 10) / 3) * (-42.75707-(-42.75707)));
            yy = -60.05859 + (((tickAnim - 10) / 3) * (-60.05859-(-60.05859)));
            zz = -7.03815 + (((tickAnim - 10) / 3) * (-7.03815-(-7.03815)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -42.75707 + (((tickAnim - 13) / 12) * (-31.6132-(-42.75707)));
            yy = -60.05859 + (((tickAnim - 13) / 12) * (3.32973-(-60.05859)));
            zz = -7.03815 + (((tickAnim - 13) / 12) * (2.72857-(-7.03815)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -31.6132 + (((tickAnim - 25) / 5) * (-33.02596-(-31.6132)));
            yy = 3.32973 + (((tickAnim - 25) / 5) * (-17.65307-(3.32973)));
            zz = 2.72857 + (((tickAnim - 25) / 5) * (-0.20005-(2.72857)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -33.02596 + (((tickAnim - 30) / 6) * (2.5-(-33.02596)));
            yy = -17.65307 + (((tickAnim - 30) / 6) * (0-(-17.65307)));
            zz = -0.20005 + (((tickAnim - 30) / 6) * (0-(-0.20005)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 2.5 + (((tickAnim - 36) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 2) / 8) * (139.94704-(0)));
            yy = 0 + (((tickAnim - 2) / 8) * (-67.63502-(0)));
            zz = 0 + (((tickAnim - 2) / 8) * (-154.63077-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 139.94704 + (((tickAnim - 10) / 3) * (63.99508-(139.94704)));
            yy = -67.63502 + (((tickAnim - 10) / 3) * (-68.64701-(-67.63502)));
            zz = -154.63077 + (((tickAnim - 10) / 3) * (-78.42273-(-154.63077)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 63.99508 + (((tickAnim - 13) / 12) * (3.59391-(63.99508)));
            yy = -68.64701 + (((tickAnim - 13) / 12) * (-33.58353-(-68.64701)));
            zz = -78.42273 + (((tickAnim - 13) / 12) * (-1.16592-(-78.42273)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 3.59391 + (((tickAnim - 25) / 11) * (22.5-(3.59391)));
            yy = -33.58353 + (((tickAnim - 25) / 11) * (0-(-33.58353)));
            zz = -1.16592 + (((tickAnim - 25) / 11) * (0-(-1.16592)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 22.5 + (((tickAnim - 36) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -41.67 + (((tickAnim - 0) / 5) * (4.6414-(-41.67)));
            yy = -32.63 + (((tickAnim - 0) / 5) * (-26.3541-(-32.63)));
            zz = 63.73 + (((tickAnim - 0) / 5) * (13.6536-(63.73)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 4.6414 + (((tickAnim - 5) / 5) * (18.40821-(4.6414)));
            yy = -26.3541 + (((tickAnim - 5) / 5) * (-13.1892-(-26.3541)));
            zz = 13.6536 + (((tickAnim - 5) / 5) * (12.7802-(13.6536)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 18.40821 + (((tickAnim - 10) / 6) * (7.5-(18.40821)));
            yy = -13.1892 + (((tickAnim - 10) / 6) * (0-(-13.1892)));
            zz = 12.7802 + (((tickAnim - 10) / 6) * (0-(12.7802)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 16) / 4) * (0-(7.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-108.15834-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (-30.3344-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (138.571-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -108.15834 + (((tickAnim - 30) / 3) * (-103.42378-(-108.15834)));
            yy = -30.3344 + (((tickAnim - 30) / 3) * (-40.9892-(-30.3344)));
            zz = 138.571 + (((tickAnim - 30) / 3) * (130.4938-(138.571)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -103.42378 + (((tickAnim - 33) / 7) * (-41.67-(-103.42378)));
            yy = -40.9892 + (((tickAnim - 33) / 7) * (-32.63-(-40.9892)));
            zz = 130.4938 + (((tickAnim - 33) / 7) * (63.73-(130.4938)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -36.39 + (((tickAnim - 0) / 5) * (-31.6132-(-36.39)));
            yy = 23.84 + (((tickAnim - 0) / 5) * (-3.3297-(23.84)));
            zz = 1.46 + (((tickAnim - 0) / 5) * (-2.7286-(1.46)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -31.6132 + (((tickAnim - 5) / 5) * (-33.02596-(-31.6132)));
            yy = -3.3297 + (((tickAnim - 5) / 5) * (17.6531-(-3.3297)));
            zz = -2.7286 + (((tickAnim - 5) / 5) * (0.2001-(-2.7286)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -33.02596 + (((tickAnim - 10) / 6) * (2.5-(-33.02596)));
            yy = 17.6531 + (((tickAnim - 10) / 6) * (0-(17.6531)));
            zz = 0.2001 + (((tickAnim - 10) / 6) * (0-(0.2001)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 16) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (-42.75707-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (60.0586-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (7.0381-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -42.75707 + (((tickAnim - 30) / 3) * (-42.75707-(-42.75707)));
            yy = 60.0586 + (((tickAnim - 30) / 3) * (60.0586-(60.0586)));
            zz = 7.0381 + (((tickAnim - 30) / 3) * (7.0381-(7.0381)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -42.75707 + (((tickAnim - 33) / 7) * (-36.39-(-42.75707)));
            yy = 60.0586 + (((tickAnim - 33) / 7) * (23.84-(60.0586)));
            zz = 7.0381 + (((tickAnim - 33) / 7) * (1.46-(7.0381)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 29.48 + (((tickAnim - 0) / 5) * (3.59391-(29.48)));
            yy = 48.61 + (((tickAnim - 0) / 5) * (33.5835-(48.61)));
            zz = 34.28 + (((tickAnim - 0) / 5) * (1.1659-(34.28)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 3.59391 + (((tickAnim - 5) / 11) * (22.5-(3.59391)));
            yy = 33.5835 + (((tickAnim - 5) / 11) * (0-(33.5835)));
            zz = 1.1659 + (((tickAnim - 5) / 11) * (0-(1.1659)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 16) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (139.94704-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (67.635-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (154.6308-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 139.94704 + (((tickAnim - 30) / 3) * (63.99508-(139.94704)));
            yy = 67.635 + (((tickAnim - 30) / 3) * (68.647-(67.635)));
            zz = 154.6308 + (((tickAnim - 30) / 3) * (78.4227-(154.6308)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 63.99508 + (((tickAnim - 33) / 7) * (29.48-(63.99508)));
            yy = 68.647 + (((tickAnim - 33) / 7) * (48.61-(68.647)));
            zz = 78.4227 + (((tickAnim - 33) / 7) * (34.28-(78.4227)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));

    }



    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAnurognathid e = (EntityPrehistoricFloraAnurognathid) entity;
        animator.update(entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(-5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.resetKeyframe(2);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(2);
        animator.rotate(this.neck, (float) Math.toRadians(2),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(3), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.startKeyframe(1);
        animator.rotate(this.neck, (float) Math.toRadians(5),0,0);
        animator.rotate(this.Head, (float) Math.toRadians(5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(3);
    }

}
