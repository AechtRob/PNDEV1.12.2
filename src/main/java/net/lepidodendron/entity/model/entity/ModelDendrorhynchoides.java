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

public class ModelDendrorhynchoides extends AdvancedModelBaseExtended {
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
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;

    private ModelAnimator animator;

    public ModelDendrorhynchoides() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 20.75F, -2.5F);
        this.setRotateAngle(main, 0.0436F, 0.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 10, -2.5F, -2.0F, -3.5F, 5, 5, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 32, 28, -1.5F, -1.75F, 2.5F, 3, 4, 3, 0.0F, false));

        this.leftwing = new AdvancedModelRenderer(this);
        this.leftwing.setRotationPoint(2.5F, -0.5F, -2.15F);
        this.main.addChild(leftwing);
        this.setRotateAngle(leftwing, 0.4268F, -1.0187F, -0.1231F);
        this.leftwing.cubeList.add(new ModelBox(leftwing, 19, 17, -0.9F, 0.0F, -1.0F, 6, 1, 5, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(6.0F, 1.0F, 0.0F);
        this.leftwing.addChild(leftwing2);
        this.setRotateAngle(leftwing2, 3.0803F, 0.8197F, -3.0826F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 17, 10, 0.0F, 0.0F, -3.0F, 7, 1, 5, -0.01F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(7.0F, 0.5F, -3.0F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, -2.9512F, 0.3231F, 0.1283F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 29, 5, -7.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, false));

        this.leftmembrane = new AdvancedModelRenderer(this);
        this.leftmembrane.setRotationPoint(4.0F, 0.5F, -4.0F);
        this.leftwing3.addChild(leftmembrane);
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 5, -16.0F, -0.5F, -1.0F, 12, 0, 5, 0.0F, false));
        this.leftmembrane.cubeList.add(new ModelBox(leftmembrane, 0, 0, -16.0F, -0.45F, -1.0F, 12, 0, 5, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.5F, 0.0F, -0.25F);
        this.leftwing3.addChild(lefthand);
        this.setRotateAngle(lefthand, -1.1927F, -0.6237F, -2.7648F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.lefthand.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.4363F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 28, -1.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, false));

        this.rightwing = new AdvancedModelRenderer(this);
        this.rightwing.setRotationPoint(-2.5F, -0.5F, -2.15F);
        this.main.addChild(rightwing);
        this.setRotateAngle(rightwing, 0.4268F, 1.0187F, 0.1231F);
        this.rightwing.cubeList.add(new ModelBox(rightwing, 19, 17, -5.1F, 0.0F, -1.0F, 6, 1, 5, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-6.0F, 1.0F, 0.0F);
        this.rightwing.addChild(rightwing2);
        this.setRotateAngle(rightwing2, 3.0803F, -0.8197F, 3.0826F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 17, 10, -7.0F, 0.0F, -3.0F, 7, 1, 5, -0.01F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(-7.0F, 0.5F, -3.0F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, -2.9512F, -0.3231F, -0.1283F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 29, 5, 0.0F, -0.5F, -2.0F, 7, 1, 2, 0.02F, true));

        this.rightmembrane = new AdvancedModelRenderer(this);
        this.rightmembrane.setRotationPoint(-4.0F, 0.5F, -4.0F);
        this.rightwing3.addChild(rightmembrane);
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 5, 4.0F, -0.5F, -1.0F, 12, 0, 5, 0.0F, true));
        this.rightmembrane.cubeList.add(new ModelBox(rightmembrane, 0, 0, 4.0F, -0.45F, -1.0F, 12, 0, 5, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.5F, 0.0F, -0.25F);
        this.rightwing3.addChild(righthand);
        this.setRotateAngle(righthand, -1.1927F, 0.6237F, 2.7648F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.righthand.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.4363F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 28, 0.05F, -0.5F, -1.375F, 1, 1, 2, 0.01F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -1.5F, -1.325F);
        this.main.addChild(neck);
        this.setRotateAngle(neck, -0.48F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 18, 28, -2.0F, -0.45F, -3.1F, 4, 5, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 36, 8, -2.0F, -0.45F, -4.1F, 4, 3, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.5F, 0.1F, -3.575F);
        this.neck.addChild(Head);
        this.setRotateAngle(Head, 0.3927F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 18, 23, -3.0F, 1.2F, -4.0F, 5, 1, 4, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 7, 33, -2.5F, 1.2F, -5.0F, 4, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, 1.125F, 0.35F, -3.75F, 1, 1, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 0, -3.125F, 0.35F, -3.75F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.6F, 0.85F, -3.25F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 38, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 38, 3.7F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 1.25F, -5.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.4538F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, -0.75F, -2.175F, -1.5F, 0, 2, 2, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 3, 1.75F, -2.175F, -1.5F, 0, 2, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 36, -1.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-2.0F, 1.7F, -5.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.829F, 0.48F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 13, -1.5F, -0.275F, -1.85F, 2, 0, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, 1.7F, -5.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.829F, -0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 13, -0.5F, -0.275F, -1.85F, 2, 0, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.25F, 0.0F);
        this.Head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 22, -3.0F, -2.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.15F, 0.0F);
        this.Head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 28, -3.0F, 0.0F, -4.0F, 5, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 7, 35, -3.0F, -1.9F, -1.1F, 5, 2, 1, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 12, -2.5F, 0.0F, -5.0F, 4, 1, 1, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 29, 0, -2.5F, -1.0F, 0.0F, 4, 1, 4, 0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.25F, 5.5F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 29, 35, -1.0F, -0.25F, -2.0F, 2, 2, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.45F, 0.525F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 29, 28, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.7875F, 0.0F, 4.65F);
        this.main.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.3806F, -0.0992F, -1.0281F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 36, 16, -1.0375F, -0.75F, -1.0F, 2, 3, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 8, -0.1375F, -0.75F, -3.0F, 1, 3, 2, 0.0F, false));
        this.leftleg.cubeList.add(new ModelBox(leftleg, 0, 0, 0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(-0.0375F, 2.25F, 0.0F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.3491F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 33, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, false));
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 14, 19, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.5593F, -0.6484F, 0.7675F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 32, 23, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-1.7875F, 0.0F, 4.65F);
        this.main.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.3806F, 0.0992F, 1.0281F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 36, 16, -0.9625F, -0.75F, -1.0F, 2, 3, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 8, -0.8625F, -0.75F, -3.0F, 1, 3, 2, 0.0F, true));
        this.rightleg.cubeList.add(new ModelBox(rightleg, 0, 0, -0.0375F, -0.75F, 1.0F, 0, 3, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0375F, 2.25F, 0.0F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.3491F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 33, -0.5F, -0.5F, -0.5F, 1, 1, 5, 0.0F, true));
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 14, 19, 0.0F, -2.5F, 0.5F, 0, 2, 4, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, -0.25F, 4.25F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.5593F, 0.6484F, -0.7675F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 32, 23, -1.5F, 0.0F, -2.75F, 3, 1, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticSuspended(float f) {

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();

    }

    public void renderStaticDisplayCase(float f) {
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

        AdvancedModelRenderer[] tailFull = {this.tail, this.tail2};

        EntityPrehistoricFloraAnurognathid entityAnurognathid = (EntityPrehistoricFloraAnurognathid) e;
        if (entityAnurognathid.getAttachmentPos() == null) {
            //flight pose
            this.setRotateAngle(main, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing, 0.2346F, -0.1622F, 0.0055F);
            this.setRotateAngle(rightwing2, -0.024F, 0.1382F, -0.1671F);
            this.setRotateAngle(rightwing3, -3.112F, -0.0769F, 2.9882F);
            this.setRotateAngle(righthand, 0.0922F, -0.0606F, -0.0084F);
            this.setRotateAngle(cube_r1, 0.0F, 0.4363F, 0.0F);
            this.setRotateAngle(leftwing, 0.2346F, 0.1622F, -0.0055F);
            this.setRotateAngle(leftwing2, -0.024F, -0.1382F, 0.1671F);
            this.setRotateAngle(leftwing3, -3.112F, 0.0769F, -2.9882F);
            this.setRotateAngle(lefthand, 0.0922F, 0.0606F, 0.0084F);
            this.setRotateAngle(cube_r2, 0.0F, -0.4363F, 0.0F);
            this.setRotateAngle(neck, -0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(Head, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r4, -0.4538F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r5, -0.829F, 0.48F, 0.0F);
            this.setRotateAngle(cube_r6, -0.829F, -0.48F, 0.0F);
            this.setRotateAngle(cube_r7, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(tail2, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg, 0.0F, 0.0F, -1.6144F);
            this.setRotateAngle(leftleg2, -0.9599F, 0.0F, 0.0F);
            this.setRotateAngle(leftleg3, 2.7053F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg, 0.0F, 0.0F, 1.6144F);
            this.setRotateAngle(rightleg2, -0.9599F, 0.0F, 0.0F);
            this.setRotateAngle(rightleg3, 2.7053F, 0.0F, 0.0F);

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
            float floatMoveY = this.moveBoxExtended(speed * 0.3F, 0.70F, false, 4, f2, 1);
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


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0.8 + (((tickAnim - 0) / 13) * (0.5-(0.8)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0.5 + (((tickAnim - 13) / 4) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = -0.5 + (((tickAnim - 17) / 3) * (0.8-(-0.5)));
        }
        else if (tickAnim >= 20 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 13) * (0-(0)));
            zz = 0.8 + (((tickAnim - 20) / 13) * (0.5-(0.8)));
        }
        else if (tickAnim >= 33 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 4) * (0-(0)));
            zz = 0.5 + (((tickAnim - 33) / 4) * (-0.5-(0.5)));
        }
        else if (tickAnim >= 37 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 3) * (0-(0)));
            zz = -0.5 + (((tickAnim - 37) / 3) * (0.8-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (12.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -10 + (((tickAnim - 7) / 3) * (-4.47512-(-10)));
            yy = 12.5 + (((tickAnim - 7) / 3) * (53.41034-(12.5)));
            zz = 0 + (((tickAnim - 7) / 3) * (5.20113-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -4.47512 + (((tickAnim - 10) / 2) * (-4.47512-(-4.47512)));
            yy = 53.41034 + (((tickAnim - 10) / 2) * (53.41034-(53.41034)));
            zz = 5.20113 + (((tickAnim - 10) / 2) * (5.20113-(5.20113)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -4.47512 + (((tickAnim - 12) / 18) * (9.21789-(-4.47512)));
            yy = 53.41034 + (((tickAnim - 12) / 18) * (-16.41303-(53.41034)));
            zz = 5.20113 + (((tickAnim - 12) / 18) * (-4.56657-(5.20113)));
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
            xx = 0 + (((tickAnim - 0) / 7) * (23.59777-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (9.21505-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (4.31-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 23.59777 + (((tickAnim - 7) / 3) * (125.24559-(23.59777)));
            yy = 9.21505 + (((tickAnim - 7) / 3) * (25.03219-(9.21505)));
            zz = 4.31 + (((tickAnim - 7) / 3) * (113.20208-(4.31)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 125.24559 + (((tickAnim - 10) / 10) * (85.37885-(125.24559)));
            yy = 25.03219 + (((tickAnim - 10) / 10) * (29.12517-(25.03219)));
            zz = 113.20208 + (((tickAnim - 10) / 10) * (71.78172-(113.20208)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 85.37885 + (((tickAnim - 20) / 10) * (74.77223-(85.37885)));
            yy = 29.12517 + (((tickAnim - 20) / 10) * (30.77915-(29.12517)));
            zz = 71.78172 + (((tickAnim - 20) / 10) * (61.22923-(71.78172)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 74.77223 + (((tickAnim - 30) / 10) * (0-(74.77223)));
            yy = 30.77915 + (((tickAnim - 30) / 10) * (0-(30.77915)));
            zz = 61.22923 + (((tickAnim - 30) / 10) * (0-(61.22923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (30-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-25-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 30 + (((tickAnim - 7) / 3) * (30-(30)));
            zz = -25 + (((tickAnim - 7) / 3) * (0-(-25)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (-5-(0)));
            yy = 30 + (((tickAnim - 10) / 2) * (30-(30)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = -5 + (((tickAnim - 12) / 18) * (4.50522-(-5)));
            yy = 30 + (((tickAnim - 12) / 18) * (39.97555-(30)));
            zz = 0 + (((tickAnim - 12) / 18) * (8.74798-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 4.50522 + (((tickAnim - 30) / 10) * (0-(4.50522)));
            yy = 39.97555 + (((tickAnim - 30) / 10) * (0-(39.97555)));
            zz = 8.74798 + (((tickAnim - 30) / 10) * (0-(8.74798)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 1.75 + (((tickAnim - 0) / 10) * (9.21789-(1.75)));
            yy = -21.67 + (((tickAnim - 0) / 10) * (16.413-(-21.67)));
            zz = -0.76 + (((tickAnim - 0) / 10) * (4.5666-(-0.76)));
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
            xx = 0 + (((tickAnim - 20) / 7) * (-10-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-12.5-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -10 + (((tickAnim - 27) / 3) * (-4.47512-(-10)));
            yy = -12.5 + (((tickAnim - 27) / 3) * (-53.4103-(-12.5)));
            zz = 0 + (((tickAnim - 27) / 3) * (-5.2011-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -4.47512 + (((tickAnim - 30) / 2) * (-4.47512-(-4.47512)));
            yy = -53.4103 + (((tickAnim - 30) / 2) * (-53.4103-(-53.4103)));
            zz = -5.2011 + (((tickAnim - 30) / 2) * (-5.2011-(-5.2011)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -4.47512 + (((tickAnim - 32) / 8) * (1.75-(-4.47512)));
            yy = -53.4103 + (((tickAnim - 32) / 8) * (-21.67-(-53.4103)));
            zz = -5.2011 + (((tickAnim - 32) / 8) * (-0.76-(-5.2011)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing, rightwing.rotateAngleX + (float) Math.toRadians(xx), rightwing.rotateAngleY + (float) Math.toRadians(yy), rightwing.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 85.37885 + (((tickAnim - 0) / 10) * (74.77223-(85.37885)));
            yy = -29.1252 + (((tickAnim - 0) / 10) * (-30.7791-(-29.1252)));
            zz = -71.7817 + (((tickAnim - 0) / 10) * (-61.2292-(-71.7817)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 74.77223 + (((tickAnim - 10) / 10) * (0-(74.77223)));
            yy = -30.7791 + (((tickAnim - 10) / 10) * (0-(-30.7791)));
            zz = -61.2292 + (((tickAnim - 10) / 10) * (0-(-61.2292)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (23.59777-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-9.2151-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (-4.31-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 23.59777 + (((tickAnim - 27) / 3) * (125.24559-(23.59777)));
            yy = -9.2151 + (((tickAnim - 27) / 3) * (-25.0322-(-9.2151)));
            zz = -4.31 + (((tickAnim - 27) / 3) * (-113.2021-(-4.31)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 125.24559 + (((tickAnim - 30) / 10) * (85.37885-(125.24559)));
            yy = -25.0322 + (((tickAnim - 30) / 10) * (-29.1252-(-25.0322)));
            zz = -113.2021 + (((tickAnim - 30) / 10) * (-71.7817-(-113.2021)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.68 + (((tickAnim - 0) / 10) * (4.50522-(-0.68)));
            yy = -34.53 + (((tickAnim - 0) / 10) * (-39.9755-(-34.53)));
            zz = -3.98 + (((tickAnim - 0) / 10) * (-8.748-(-3.98)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 4.50522 + (((tickAnim - 10) / 10) * (0-(4.50522)));
            yy = -39.9755 + (((tickAnim - 10) / 10) * (0-(-39.9755)));
            zz = -8.748 + (((tickAnim - 10) / 10) * (0-(-8.748)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (-30-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (25-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = -30 + (((tickAnim - 27) / 3) * (-30-(-30)));
            zz = 25 + (((tickAnim - 27) / 3) * (0-(25)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (-5-(0)));
            yy = -30 + (((tickAnim - 30) / 2) * (-30-(-30)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -5 + (((tickAnim - 32) / 8) * (-0.68-(-5)));
            yy = -30 + (((tickAnim - 32) / 8) * (-34.53-(-30)));
            zz = 0 + (((tickAnim - 32) / 8) * (-3.98-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




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
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-35.26888-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (16.80276-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-40.87852-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -35.26888 + (((tickAnim - 14) / 2) * (-25.96754-(-35.26888)));
            yy = 16.80276 + (((tickAnim - 14) / 2) * (57.21945-(16.80276)));
            zz = -40.87852 + (((tickAnim - 14) / 2) * (-28.02822-(-40.87852)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -25.96754 + (((tickAnim - 16) / 9) * (31.58789-(-25.96754)));
            yy = 57.21945 + (((tickAnim - 16) / 9) * (20.35136-(57.21945)));
            zz = -28.02822 + (((tickAnim - 16) / 9) * (-8.7523-(-28.02822)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 31.58789 + (((tickAnim - 25) / 5) * (48.40821-(31.58789)));
            yy = 20.35136 + (((tickAnim - 25) / 5) * (13.18922-(20.35136)));
            zz = -8.7523 + (((tickAnim - 25) / 5) * (-12.78022-(-8.7523)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 48.40821 + (((tickAnim - 30) / 6) * (25-(48.40821)));
            yy = 13.18922 + (((tickAnim - 30) / 6) * (0-(13.18922)));
            zz = -12.78022 + (((tickAnim - 30) / 6) * (0-(-12.78022)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 36) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-20-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-70-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-10-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = -20 + (((tickAnim - 14) / 2) * (-40.30979-(-20)));
            yy = -70 + (((tickAnim - 14) / 2) * (-45.51448-(-70)));
            zz = -10 + (((tickAnim - 14) / 2) * (-30.55096-(-10)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -40.30979 + (((tickAnim - 16) / 4) * (-31.15978-(-40.30979)));
            yy = -45.51448 + (((tickAnim - 16) / 4) * (-47.97175-(-45.51448)));
            zz = -30.55096 + (((tickAnim - 16) / 4) * (5.30496-(-30.55096)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -31.15978 + (((tickAnim - 20) / 5) * (-32.59336-(-31.15978)));
            yy = -47.97175 + (((tickAnim - 20) / 5) * (-34.07088-(-47.97175)));
            zz = 5.30496 + (((tickAnim - 20) / 5) * (5.67487-(5.30496)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -32.59336 + (((tickAnim - 25) / 5) * (-38.032-(-32.59336)));
            yy = -34.07088 + (((tickAnim - 25) / 5) * (-26.18409-(-34.07088)));
            zz = 5.67487 + (((tickAnim - 25) / 5) * (13.12162-(5.67487)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -38.032 + (((tickAnim - 30) / 6) * (2.5-(-38.032)));
            yy = -26.18409 + (((tickAnim - 30) / 6) * (0-(-26.18409)));
            zz = 13.12162 + (((tickAnim - 30) / 6) * (0-(13.12162)));
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




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (76.07571-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (-19.18061-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (-23.05589-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 76.07571 + (((tickAnim - 14) / 2) * (108.25499-(76.07571)));
            yy = -19.18061 + (((tickAnim - 14) / 2) * (-27.32048-(-19.18061)));
            zz = -23.05589 + (((tickAnim - 14) / 2) * (-91.19207-(-23.05589)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = 108.25499 + (((tickAnim - 16) / 9) * (11.45312-(108.25499)));
            yy = -27.32048 + (((tickAnim - 16) / 9) * (-17.70417-(-27.32048)));
            zz = -91.19207 + (((tickAnim - 16) / 9) * (2.44045-(-91.19207)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 11.45312 + (((tickAnim - 25) / 11) * (22.5-(11.45312)));
            yy = -17.70417 + (((tickAnim - 25) / 11) * (0-(-17.70417)));
            zz = 2.44045 + (((tickAnim - 25) / 11) * (0-(2.44045)));
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
            xx = 0.19 + (((tickAnim - 0) / 5) * (31.58789-(0.19)));
            yy = -40.46 + (((tickAnim - 0) / 5) * (-20.3514-(-40.46)));
            zz = 19.27 + (((tickAnim - 0) / 5) * (8.7523-(19.27)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 31.58789 + (((tickAnim - 5) / 5) * (48.40821-(31.58789)));
            yy = -20.3514 + (((tickAnim - 5) / 5) * (-13.1892-(-20.3514)));
            zz = 8.7523 + (((tickAnim - 5) / 5) * (12.7802-(8.7523)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 48.40821 + (((tickAnim - 10) / 6) * (25-(48.40821)));
            yy = -13.1892 + (((tickAnim - 10) / 6) * (0-(-13.1892)));
            zz = 12.7802 + (((tickAnim - 10) / 6) * (0-(12.7802)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 25 + (((tickAnim - 16) / 4) * (0-(25)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-35.26888-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (-16.8028-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (40.8785-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = -35.26888 + (((tickAnim - 34) / 2) * (-25.96754-(-35.26888)));
            yy = -16.8028 + (((tickAnim - 34) / 2) * (-57.2195-(-16.8028)));
            zz = 40.8785 + (((tickAnim - 34) / 2) * (28.0282-(40.8785)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -25.96754 + (((tickAnim - 36) / 4) * (0.19-(-25.96754)));
            yy = -57.2195 + (((tickAnim - 36) / 4) * (-40.46-(-57.2195)));
            zz = 28.0282 + (((tickAnim - 36) / 4) * (19.27-(28.0282)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -31.15978 + (((tickAnim - 0) / 5) * (-32.59336-(-31.15978)));
            yy = 47.9718 + (((tickAnim - 0) / 5) * (34.0709-(47.9718)));
            zz = -5.305 + (((tickAnim - 0) / 5) * (-5.6749-(-5.305)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -32.59336 + (((tickAnim - 5) / 5) * (-38.032-(-32.59336)));
            yy = 34.0709 + (((tickAnim - 5) / 5) * (26.1841-(34.0709)));
            zz = -5.6749 + (((tickAnim - 5) / 5) * (-13.1216-(-5.6749)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -38.032 + (((tickAnim - 10) / 6) * (2.5-(-38.032)));
            yy = 26.1841 + (((tickAnim - 10) / 6) * (0-(26.1841)));
            zz = -13.1216 + (((tickAnim - 10) / 6) * (0-(-13.1216)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 2.5 + (((tickAnim - 16) / 4) * (0-(2.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (-20-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (70-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (10-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = -20 + (((tickAnim - 34) / 2) * (-40.30979-(-20)));
            yy = 70 + (((tickAnim - 34) / 2) * (45.5145-(70)));
            zz = 10 + (((tickAnim - 34) / 2) * (30.551-(10)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -40.30979 + (((tickAnim - 36) / 4) * (-31.15978-(-40.30979)));
            yy = 45.5145 + (((tickAnim - 36) / 4) * (47.9718-(45.5145)));
            zz = 30.551 + (((tickAnim - 36) / 4) * (-5.305-(30.551)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 64.25 + (((tickAnim - 0) / 5) * (11.45312-(64.25)));
            yy = 22.95 + (((tickAnim - 0) / 5) * (17.7042-(22.95)));
            zz = 48.63 + (((tickAnim - 0) / 5) * (-2.4404-(48.63)));
        }
        else if (tickAnim >= 5 && tickAnim < 16) {
            xx = 11.45312 + (((tickAnim - 5) / 11) * (22.5-(11.45312)));
            yy = 17.7042 + (((tickAnim - 5) / 11) * (0-(17.7042)));
            zz = -2.4404 + (((tickAnim - 5) / 11) * (0-(-2.4404)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 16) / 4) * (0-(22.5)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (76.07571-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (19.1806-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (23.0559-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 36) {
            xx = 76.07571 + (((tickAnim - 34) / 2) * (108.25499-(76.07571)));
            yy = 19.1806 + (((tickAnim - 34) / 2) * (27.3205-(19.1806)));
            zz = 23.0559 + (((tickAnim - 34) / 2) * (91.1921-(23.0559)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 108.25499 + (((tickAnim - 36) / 4) * (64.25-(108.25499)));
            yy = 27.3205 + (((tickAnim - 36) / 4) * (22.95-(27.3205)));
            zz = 91.1921 + (((tickAnim - 36) / 4) * (48.63-(91.1921)));
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
