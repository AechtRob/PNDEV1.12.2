package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraQianosuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelQianosuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;

    private ModelAnimator animator;

    public ModelQianosuchus() {
        this.textureWidth = 74;
        this.textureHeight = 74;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 18.5F, 8.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 20, -3.5F, -8.5F, -0.75F, 6, 6, 6, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 30, 53, -1.5F, -10.0F, -0.75F, 2, 2, 6, -0.001F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-3.5F, -5.5F, 3.25F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.3927F, 0.0F, 0.0F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 53, 21, -1.5F, -1.5F, -2.5F, 3, 7, 4, 0.0F, false));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(0.0F, 3.55F, -1.2F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6981F, 0.0F, 0.0F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 25, 62, -1.0F, 1.0F, -0.5F, 2, 7, 2, 0.0F, false));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 0, -1.0F, 1.0F, -1.175F, 2, 7, 2, -0.001F, false));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.0F, 8.125F, 0.3F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.3054F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.backRightLeg3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 44, -1.5F, -0.5F, -2.0F, 3, 1, 5, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.5F, -5.5F, 3.25F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.3927F, 0.0F, 0.0F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 53, 21, -1.5F, -1.5F, -2.5F, 3, 7, 4, 0.0F, true));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.0F, 3.55F, -1.2F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.6981F, 0.0F, 0.0F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 25, 62, -1.0F, 1.0F, -0.5F, 2, 7, 2, 0.0F, true));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 0, -1.0F, 1.0F, -1.175F, 2, 7, 2, -0.001F, true));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(0.0F, 8.125F, 0.3F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.3054F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -2.7F);
        this.backLeftLeg3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 44, -1.5F, -0.5F, -2.0F, 3, 1, 5, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -8.0F, 4.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 32, 13, -2.5F, 0.0F, 0.0F, 5, 4, 7, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 52, 34, -0.5F, -1.95F, 0.0F, 1, 2, 7, -0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 0, -2.0F, 0.2F, 0.0F, 4, 3, 8, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 43, 45, -0.5F, -1.75F, 0.0F, 1, 2, 8, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.4F, 7.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0436F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 24, -1.5F, -0.0436F, -0.001F, 3, 2, 9, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 30, 41, -0.5F, -2.0436F, -0.126F, 1, 2, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0564F, 8.399F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 45, -1.0F, 0.0F, 0.0F, 2, 1, 8, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 13, 49, 0.05F, -2.0F, 0.0F, 0, 2, 8, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 7.6F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 55, -0.5F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 22, 49, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -8.825F, -0.15F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1047F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -3.5F, -0.2709F, -11.9216F, 7, 7, 12, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.1959F, -0.5966F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 6, -1.5F, 0.0214F, -5.8956F, 3, 2, 6, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -1.3459F, -5.5216F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 47, 56, -1.5F, -0.0435F, -5.9687F, 2, 2, 5, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-3.25F, 4.5041F, -10.3216F);
        this.body.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.5672F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 12, 60, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, false));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.5F, 4.5F, 1.0F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -1.0036F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 42, 41, -1.5F, -0.0988F, -1.5206F, 2, 6, 2, 0.0F, false));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 5.9012F, -0.5206F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.3054F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 50, 15, -2.0F, -0.5F, -2.5F, 3, 1, 3, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(3.25F, 4.5041F, -10.3216F);
        this.body.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.5672F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 12, 60, -1.5F, -0.5F, -1.5F, 3, 5, 3, 0.0F, true));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(-0.5F, 4.5F, 1.0F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -1.0036F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 42, 41, -0.5F, -0.0988F, -1.5206F, 2, 6, 2, 0.0F, true));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 5.9012F, -0.5206F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.3054F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 50, 15, -1.0F, -0.5F, -2.5F, 3, 1, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.2459F, -10.0216F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.2923F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 34, 29, -2.5F, 0.0F, -7.0F, 5, 4, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.5F, 3.0F, -6.0F);
        this.neck.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 38, -1.5F, -2.0F, 0.0F, 4, 3, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.025F, -6.5F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, 0.1309F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 33, -2.0F, 0.0262F, -7.008F, 4, 4, 7, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0441F, -6.6732F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 57, 56, -1.5F, 1.4571F, -2.8848F, 3, 1, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 20, -1.0F, 1.4571F, -4.8848F, 2, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 8, -0.975F, 1.8071F, -4.8848F, 0, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 8, 0.975F, 1.8071F, -4.8848F, 0, 1, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.4772F, -4.9305F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.4451F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 0, 0.475F, 0.3981F, -4.0035F, 0, 1, 1, 0.001F, true));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 0, -0.475F, 0.3981F, -4.0035F, 0, 1, 1, 0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 58, 61, -0.5F, -0.0019F, -4.0035F, 1, 1, 4, 0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0451F, -6.2915F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.3352F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 3, 0.45F, -1.1199F, -0.0546F, 0, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 9, 3, -0.45F, -1.1199F, -0.0546F, 0, 1, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 30, -0.5F, -1.1199F, 0.2454F, 1, 1, 1, -0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 2.4571F, -4.7848F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2007F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 0, 0.475F, -0.7F, -1.35F, 0, 1, 1, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 9, 0, -0.475F, -0.7F, -1.35F, 0, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 33, -0.5F, -1.0F, -1.6F, 1, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, 0.1571F, -2.7598F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1658F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 51, -0.5F, -0.0446F, -2.1973F, 2, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, 0.8955F, -2.925F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0452F, 0.2615F, 0.0117F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 27, 5, -0.45F, -0.425F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.8955F, -2.925F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0452F, -0.2615F, -0.0117F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 27, 5, -0.55F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0071F, 0.2402F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0436F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 0, -1.5F, -0.0006F, -3.201F, 3, 2, 3, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.4571F, -0.5348F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 57, 0, -1.5F, 0.0F, -2.35F, 3, 1, 3, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 62, 33, -1.5F, -1.5F, -1.6F, 3, 2, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 41, 25, -1.0F, 0.0F, -4.35F, 2, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 20, -0.9F, -0.4F, -4.35F, 0, 1, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 25, -0.5F, 0.0F, -7.25F, 1, 1, 3, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 0, -0.4F, -0.4F, -7.25F, 0, 1, 3, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 20, 0.9F, -0.4F, -4.35F, 0, 1, 2, 0.0F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 27, 0, 0.4F, -0.4F, -7.25F, 0, 1, 3, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.7474F, -0.7884F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1702F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 62, -1.0F, -0.45F, -1.75F, 2, 1, 3, -0.001F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(neck2, 0.15F, 0.05F, 0.05F);
        this.setRotateAngle(head, 0.15F, 0.1F, 0.05F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.neck.offsetZ = 0.02F;
        this.neck.offsetY = -0.01F;
        this.neck.offsetX = -0.0F;
        this.neck.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.05F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(neck, 0.05F, 0.05F, 0.0F);
        this.setRotateAngle(neck2, -0.05F, 0.05F, 0.0F);
        this.setRotateAngle(head, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(jaw, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(tail, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, -0.1F, 0.05F, 0.0F);
        this.setRotateAngle(tail3, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.15F, 0.0F);
        this.setRotateAngle(tail5, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg2, -0.8F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg3, -0.05F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg2, -0.85F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg3, 0.9F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg2, 0.65F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg2, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, -0.5F, 0.0F, 0.0F);
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.setRotateAngle(main, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(neck, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(neck2, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(head, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.3F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, 0.4F, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.9F, 0.0F, -0.8F);
        this.setRotateAngle(frontLeftLeg2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg3, 1.8F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 1.0F, 0.0F, 1.0F);
        this.setRotateAngle(frontRightLeg2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg3, 1.8F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, 0.7F, -0.35F, -0.4F);
        this.setRotateAngle(backLeftLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, 1.0F, 0.3F, 0.3F);
        this.setRotateAngle(backRightLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, 0.9F, 0.0F, 0.0F);
        this.main.offsetY = -0.11F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.20F;
        this.main.offsetX = 0.02F;
        this.main.rotateAngleY = (float)Math.toRadians(212);
        this.main.rotateAngleX = (float)Math.toRadians(22);
        this.main.rotateAngleZ = (float)Math.toRadians(-12);
        this.main.scaleChildren = true;
        float scaler = 0.525F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(body, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(neck, 0.1F, 0.2F, 0.0F);
        this.setRotateAngle(neck2, -0.1F, 0.1F, 0.0F);
        this.setRotateAngle(head, -0.2F, 0.2F, 0.0F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.05F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.05F, 0.3F, 0.0F);
        this.setRotateAngle(tail5, 0.05F, 0.4F, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.9F, 0.0F, -0.8F);
        this.setRotateAngle(frontLeftLeg2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg3, 1.8F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 1.0F, 0.0F, 1.0F);
        this.setRotateAngle(frontRightLeg2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg3, 1.8F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, 0.7F, -0.35F, -0.4F);
        this.setRotateAngle(backLeftLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.8F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, 1.0F, 0.3F, 0.3F);
        this.setRotateAngle(backRightLeg2, 0.5F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, 0.9F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.resetToDefaultPose();
        this.main.offsetY = 0.0F;

        EntityPrehistoricFloraQianosuchus proteros = (EntityPrehistoricFloraQianosuchus) e;

        this.faceTarget(f3, f4, 10, neck);
        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        proteros.tailBuffer.applyChainSwingBuffer(Tail);

        if (proteros.getAnimation() == proteros.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!proteros.isReallyInWater()) {

                if (f3 == 0.0F || !proteros.getIsMoving()) {
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraQianosuchus ee = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if(ee.getIsFast()){
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (ee.getIsFast()) { //Running
                animSwimFast(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.75 + (((tickAnim - 10) / 10) * (22.75-(-9.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 22.75 + (((tickAnim - 20) / 10) * (-9.75-(22.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.75 + (((tickAnim - 30) / 10) * (22.75-(-9.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 22.75 + (((tickAnim - 40) / 10) * (0-(22.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -21.5 + (((tickAnim - 5) / 5) * (-11.5-(-21.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -11.5 + (((tickAnim - 10) / 10) * (30.75-(-11.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 30.75 + (((tickAnim - 20) / 5) * (-2.37-(30.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -2.37 + (((tickAnim - 25) / 5) * (-11.5-(-2.37)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -11.5 + (((tickAnim - 30) / 10) * (30.75-(-11.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 30.75 + (((tickAnim - 40) / 10) * (0-(30.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.48-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.48 + (((tickAnim - 5) / 5) * (-0.45-(0.48)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 10) / 10) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 20) / 5) * (1.4-(-0.45)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.925-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.4 + (((tickAnim - 25) / 5) * (-0.45-(1.4)));
            zz = -0.925 + (((tickAnim - 25) / 5) * (0-(-0.925)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = -0.45 + (((tickAnim - 30) / 10) * (-0.45-(-0.45)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = -0.45 + (((tickAnim - 40) / 5) * (0.355-(-0.45)));
            zz = 0 + (((tickAnim - 40) / 5) * (-0.85-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.355 + (((tickAnim - 45) / 5) * (0-(0.355)));
            zz = -0.85 + (((tickAnim - 45) / 5) * (0-(-0.85)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (40.63-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 40.63 + (((tickAnim - 5) / 5) * (20.75-(40.63)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 20.75 + (((tickAnim - 10) / 4) * (-7.08-(20.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -7.08 + (((tickAnim - 14) / 4) * (6.36-(-7.08)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 6.36 + (((tickAnim - 18) / 2) * (66.75-(6.36)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 66.75 + (((tickAnim - 20) / 10) * (20.75-(66.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 20.75 + (((tickAnim - 30) / 5) * (-4-(20.75)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -4 + (((tickAnim - 35) / 3) * (13.38-(-4)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 13.38 + (((tickAnim - 38) / 2) * (66.75-(13.38)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 66.75 + (((tickAnim - 40) / 10) * (0-(66.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.65-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.65 + (((tickAnim - 5) / 5) * (0-(0.65)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 20) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 2) * (1.25-(0)));
            zz = 0 + (((tickAnim - 20) / 2) * (0.7-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 22) / 3) * (1.575-(1.25)));
            zz = 0.7 + (((tickAnim - 22) / 3) * (0-(0.7)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.575 + (((tickAnim - 25) / 5) * (0-(1.575)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (0.125-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0.95-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 38) / 2) * (0-(0.125)));
            zz = 0.95 + (((tickAnim - 38) / 2) * (0-(0.95)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (0.675-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (1.125-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 0.675 + (((tickAnim - 45) / 5) * (0-(0.675)));
            zz = 1.125 + (((tickAnim - 45) / 5) * (0-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -5 + (((tickAnim - 10) / 11) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -5 + (((tickAnim - 10) / 11) * (0-(-5)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 1.75 + (((tickAnim - 10) / 11) * (0-(1.75)));
            yy = 0 + (((tickAnim - 10) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 22.25 + (((tickAnim - 10) / 6) * (0-(22.25)));
            yy = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 56;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = -32.25 + (((tickAnim - 15) / 30) * (-32.25-(-32.25)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 57) {
            xx = -32.25 + (((tickAnim - 45) / 12) * (0-(-32.25)));
            yy = 0 + (((tickAnim - 45) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -18.5 + (((tickAnim - 8) / 7) * (13.5-(-18.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = 13.5 + (((tickAnim - 15) / 30) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 13.5 + (((tickAnim - 45) / 6) * (-20.25-(13.5)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 57) {
            xx = -20.25 + (((tickAnim - 51) / 6) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 51) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (72.88-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 72.88 + (((tickAnim - 8) / 7) * (21.25-(72.88)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 45) {
            xx = 21.25 + (((tickAnim - 15) / 30) * (21.25-(21.25)));
            yy = 0 + (((tickAnim - 15) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 30) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 51) {
            xx = 21.25 + (((tickAnim - 45) / 6) * (82.63-(21.25)));
            yy = 0 + (((tickAnim - 45) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 6) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 57) {
            xx = 82.63 + (((tickAnim - 51) / 6) * (0-(82.63)));
            yy = 0 + (((tickAnim - 51) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 36) {
            xx = 12.25 + (((tickAnim - 26) / 10) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 26) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 10) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 57) {
            xx = 12.25 + (((tickAnim - 36) / 21) * (0-(12.25)));
            yy = 0 + (((tickAnim - 36) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 0) / 26) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 26) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 7 + (((tickAnim - 26) / 2) * (7.5-(7)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 7.5 + (((tickAnim - 28) / 3) * (7-(7.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 7 + (((tickAnim - 31) / 2) * (7.5-(7)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 7.5 + (((tickAnim - 33) / 3) * (7-(7.5)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 7 + (((tickAnim - 36) / 9) * (5.75-(7)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 57) {
            xx = 5.75 + (((tickAnim - 45) / 12) * (0-(5.75)));
            yy = 0 + (((tickAnim - 45) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 26) {
            xx = 11.75 + (((tickAnim - 15) / 11) * (15-(11.75)));
            yy = 0 + (((tickAnim - 15) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 11) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 28) {
            xx = 15 + (((tickAnim - 26) / 2) * (13.5-(15)));
            yy = 0 + (((tickAnim - 26) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 2) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 13.5 + (((tickAnim - 28) / 3) * (15-(13.5)));
            yy = 0 + (((tickAnim - 28) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 3) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 33) {
            xx = 15 + (((tickAnim - 31) / 2) * (13.5-(15)));
            yy = 0 + (((tickAnim - 31) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 2) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 13.5 + (((tickAnim - 33) / 3) * (15-(13.5)));
            yy = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 45) {
            xx = 15 + (((tickAnim - 36) / 9) * (22.25-(15)));
            yy = 0 + (((tickAnim - 36) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 9) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 57) {
            xx = 22.25 + (((tickAnim - 45) / 12) * (0-(22.25)));
            yy = 0 + (((tickAnim - 45) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 36) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (5.25-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 5.25 + (((tickAnim - 40) / 5) * (0-(5.25)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -10 + (((tickAnim - 15) / 20) * (-10-(-10)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 35) / 15) * (0-(-10)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(xx), main.rotateAngleY + (float) Math.toRadians(yy), main.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.025-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (1.975-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -3.025 + (((tickAnim - 15) / 20) * (-3.025-(-3.025)));
            zz = 1.975 + (((tickAnim - 15) / 20) * (1.975-(1.975)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -3.025 + (((tickAnim - 35) / 15) * (0-(-3.025)));
            zz = 1.975 + (((tickAnim - 35) / 15) * (0-(1.975)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.main.rotationPointX = this.main.rotationPointX + (float)(xx);
        this.main.rotationPointY = this.main.rotationPointY - (float)(yy);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -29.75 + (((tickAnim - 15) / 20) * (-29.75-(-29.75)));
            yy = 11 + (((tickAnim - 15) / 20) * (11-(11)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 35) / 15) * (0-(-29.75)));
            yy = 11 + (((tickAnim - 35) / 15) * (0-(11)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.75 + (((tickAnim - 15) / 20) * (22.75-(22.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.75 + (((tickAnim - 35) / 15) * (0-(22.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -1.575 + (((tickAnim - 15) / 20) * (-1.575-(-1.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -1.575 + (((tickAnim - 35) / 15) * (0-(-1.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 15) / 20) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 35) / 15) * (0-(17.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-11-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -29.75 + (((tickAnim - 15) / 20) * (-29.75-(-29.75)));
            yy = -11 + (((tickAnim - 15) / 20) * (-11-(-11)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -29.75 + (((tickAnim - 35) / 15) * (0-(-29.75)));
            yy = -11 + (((tickAnim - 35) / 15) * (0-(-11)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (22.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 22.75 + (((tickAnim - 15) / 20) * (22.75-(22.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 22.75 + (((tickAnim - 35) / 15) * (0-(22.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-1.575-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -1.575 + (((tickAnim - 15) / 20) * (-1.575-(-1.575)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -1.575 + (((tickAnim - 35) / 15) * (0-(-1.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (17.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 17.5 + (((tickAnim - 15) / 20) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 35) / 15) * (0-(17.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(0);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(0);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6 + (((tickAnim - 15) / 20) * (-6-(-6)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 35) / 15) * (0-(-6)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0.4827-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-0.02705-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0.12743-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0.4827 + (((tickAnim - 15) / 20) * (0.4827-(0.4827)));
            yy = -0.02705 + (((tickAnim - 15) / 20) * (-0.02705-(-0.02705)));
            zz = 0.12743 + (((tickAnim - 15) / 20) * (0.12743-(0.12743)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.4827 + (((tickAnim - 35) / 5) * (-3.9282-(0.4827)));
            yy = -0.02705 + (((tickAnim - 35) / 5) * (-0.01803-(-0.02705)));
            zz = 0.12743 + (((tickAnim - 35) / 5) * (0.08495-(0.12743)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -3.9282 + (((tickAnim - 40) / 10) * (0-(-3.9282)));
            yy = -0.01803 + (((tickAnim - 40) / 10) * (0-(-0.01803)));
            zz = 0.08495 + (((tickAnim - 40) / 10) * (0-(0.08495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.25 + (((tickAnim - 15) / 20) * (10.25-(10.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 10.25 + (((tickAnim - 35) / 5) * (0.58-(10.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0.58 + (((tickAnim - 40) / 10) * (0-(0.58)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8 + (((tickAnim - 15) / 20) * (8-(8)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 8 + (((tickAnim - 35) / 5) * (12.08-(8)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 12.08 + (((tickAnim - 40) / 3) * (-2.71-(12.08)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -2.71 + (((tickAnim - 43) / 7) * (0-(-2.71)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18.25 + (((tickAnim - 15) / 20) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.25 + (((tickAnim - 35) / 15) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 33 + (((tickAnim - 15) / 20) * (33-(33)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 35) / 15) * (0-(33)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -18.25 + (((tickAnim - 15) / 20) * (-18.25-(-18.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -18.25 + (((tickAnim - 35) / 15) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (33-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 33 + (((tickAnim - 15) / 20) * (33-(33)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 33 + (((tickAnim - 35) / 15) * (0-(33)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.5 + (((tickAnim - 15) / 20) * (12.5-(12.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.5 + (((tickAnim - 35) / 15) * (0-(12.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 14;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 15.5 + (((tickAnim - 5) / 3) * (9.25-(15.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 9.25 + (((tickAnim - 8) / 6) * (0-(9.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -12.75 + (((tickAnim - 5) / 3) * (-11.25-(-12.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -11.25 + (((tickAnim - 8) / 4) * (-0.49731-(-11.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (-1.14544-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (-1.67923-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = -0.49731 + (((tickAnim - 12) / 2) * (0-(-0.49731)));
            yy = -1.14544 + (((tickAnim - 12) / 2) * (0-(-1.14544)));
            zz = -1.67923 + (((tickAnim - 12) / 2) * (0-(-1.67923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -8.25 + (((tickAnim - 5) / 3) * (-5.5-(-8.25)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -5.5 + (((tickAnim - 8) / 4) * (1.5-(-5.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 1.5 + (((tickAnim - 12) / 2) * (0-(1.5)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 8.75 + (((tickAnim - 5) / 3) * (28.75-(8.75)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 28.75 + (((tickAnim - 8) / 4) * (0-(28.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 16.75 + (((tickAnim - 8) / 12) * (0-(16.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 12.25 + (((tickAnim - 8) / 4) * (15.5-(12.25)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 15.5 + (((tickAnim - 12) / 8) * (0-(15.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 21.75 + (((tickAnim - 8) / 4) * (29.25-(21.75)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 29.25 + (((tickAnim - 12) / 8) * (0-(29.25)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 14.5 + (((tickAnim - 8) / 4) * (0-(14.5)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 22;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-20))*-4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1.5));


        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(72.45213), backRightLeg.rotateAngleY + (float) Math.toRadians(23.00725), backRightLeg.rotateAngleZ + (float) Math.toRadians(38.06301));


        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(-16.4998+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*-2), backRightLeg2.rotateAngleY + (float) Math.toRadians(11.6608), backRightLeg2.rotateAngleZ + (float) Math.toRadians(7.3372));


        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(117.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))*-4), backRightLeg3.rotateAngleY + (float) Math.toRadians(0), backRightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(73.70213), backLeftLeg.rotateAngleY + (float) Math.toRadians(-23.0072), backLeftLeg.rotateAngleZ + (float) Math.toRadians(-38.063));


        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(-16.4998+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*2), backLeftLeg2.rotateAngleY + (float) Math.toRadians(-11.6608), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(-7.3372));


        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(117.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-70))*4), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-30))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-90))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-130))*-9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-160))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-190))*-14), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-4), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-140))*-5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+30))*1));


        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(31.99844), frontRightLeg.rotateAngleY + (float) Math.toRadians(19.15276), frontRightLeg.rotateAngleZ + (float) Math.toRadians(61.2949));


        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(72.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*-2), frontRightLeg2.rotateAngleY + (float) Math.toRadians(0), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(0);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(0.975);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(102.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-20))*-5), frontRightLeg3.rotateAngleY + (float) Math.toRadians(0), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(32.15623), frontLeftLeg.rotateAngleY + (float) Math.toRadians(-19.3674), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(-61.7733));


        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(72.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320))*2), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(0);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(0.975);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(102.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-20))*5), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(15.25), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-220))*4), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+60))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-6.75), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-320))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320+120))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-3.25), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*320-20))*6), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 23;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 6 + (((tickAnim - 0) / 10) * (38.04399-(6)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.18494-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.50511-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 38.04399 + (((tickAnim - 10) / 10) * (-6.25-(38.04399)));
            yy = 0.18494 + (((tickAnim - 10) / 10) * (0-(0.18494)));
            zz = -0.50511 + (((tickAnim - 10) / 10) * (0-(-0.50511)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -6.25 + (((tickAnim - 20) / 3) * (6-(-6.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -6 + (((tickAnim - 0) / 10) * (12.81201-(-6)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.361-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.15853-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 12.81201 + (((tickAnim - 10) / 8) * (-18.64728-(12.81201)));
            yy = -0.361 + (((tickAnim - 10) / 8) * (-0.21861-(-0.361)));
            zz = 2.15853 + (((tickAnim - 10) / 8) * (1.30715-(2.15853)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -18.64728 + (((tickAnim - 18) / 2) * (-9.5-(-18.64728)));
            yy = -0.21861 + (((tickAnim - 18) / 2) * (0-(-0.21861)));
            zz = 1.30715 + (((tickAnim - 18) / 2) * (0-(1.30715)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -9.5 + (((tickAnim - 20) / 3) * (-6-(-9.5)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 10) / 3) * (0.86-(-0.55)));
            zz = 0 + (((tickAnim - 10) / 3) * (-0.425-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.86 + (((tickAnim - 13) / 5) * (1.175-(0.86)));
            zz = -0.425 + (((tickAnim - 13) / 5) * (0-(-0.425)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 18) / 2) * (0-(1.175)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 3.5 + (((tickAnim - 0) / 3) * (-1.75-(3.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -1.75 + (((tickAnim - 3) / 2) * (1.26-(-1.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.26 + (((tickAnim - 5) / 5) * (54.75-(1.26)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 54.75 + (((tickAnim - 10) / 3) * (20.31-(54.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 20.31 + (((tickAnim - 13) / 5) * (5.42-(20.31)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 5.42 + (((tickAnim - 18) / 2) * (16.75-(5.42)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 16.75 + (((tickAnim - 20) / 3) * (3.5-(16.75)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 5) * (0.3-(0.275)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 5) * (0.525-(0.3)));
            zz = 0.5 + (((tickAnim - 5) / 5) * (0.525-(0.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 10) / 3) * (0.775-(0.525)));
            zz = 0.525 + (((tickAnim - 10) / 3) * (0.44-(0.525)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.775 + (((tickAnim - 13) / 5) * (0-(0.775)));
            zz = 0.44 + (((tickAnim - 13) / 5) * (0-(0.44)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 3) * (0.275-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 38.04399 + (((tickAnim - 0) / 8) * (-6.25-(38.04399)));
            yy = 0.18494 + (((tickAnim - 0) / 8) * (0-(0.18494)));
            zz = -0.50511 + (((tickAnim - 0) / 8) * (0-(-0.50511)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -6.25 + (((tickAnim - 8) / 15) * (38.04399-(-6.25)));
            yy = 0 + (((tickAnim - 8) / 15) * (0.18494-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (-0.50511-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 12.81201 + (((tickAnim - 0) / 4) * (-13.07981-(12.81201)));
            yy = -0.361 + (((tickAnim - 0) / 4) * (-0.19691-(-0.361)));
            zz = 2.15853 + (((tickAnim - 0) / 4) * (1.17738-(2.15853)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -13.07981 + (((tickAnim - 4) / 2) * (-22.53991-(-13.07981)));
            yy = -0.19691 + (((tickAnim - 4) / 2) * (-0.09846-(-0.19691)));
            zz = 1.17738 + (((tickAnim - 4) / 2) * (0.58869-(1.17738)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -22.53991 + (((tickAnim - 6) / 2) * (-9.5-(-22.53991)));
            yy = -0.09846 + (((tickAnim - 6) / 2) * (0-(-0.09846)));
            zz = 0.58869 + (((tickAnim - 6) / 2) * (0-(0.58869)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = -9.5 + (((tickAnim - 8) / 15) * (12.81201-(-9.5)));
            yy = 0 + (((tickAnim - 8) / 15) * (-0.361-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (2.15853-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 4) * (1.825-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.825 + (((tickAnim - 4) / 4) * (0-(1.825)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 8) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 15) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 8) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 54.75 + (((tickAnim - 0) / 4) * (19.48-(54.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 19.48 + (((tickAnim - 4) / 2) * (8.42103-(19.48)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.39387-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-0.73813-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 8.42103 + (((tickAnim - 6) / 2) * (16.75-(8.42103)));
            yy = 0.39387 + (((tickAnim - 6) / 2) * (0-(0.39387)));
            zz = -0.73813 + (((tickAnim - 6) / 2) * (0-(-0.73813)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 16.75 + (((tickAnim - 8) / 5) * (-2.32-(16.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -2.32 + (((tickAnim - 13) / 5) * (12.77-(-2.32)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 12.77 + (((tickAnim - 18) / 5) * (54.75-(12.77)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 0) / 4) * (0.515-(0.425)));
            zz = 0.625 + (((tickAnim - 0) / 4) * (0-(0.625)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.515 + (((tickAnim - 4) / 4) * (0-(0.515)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.22-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0.22 + (((tickAnim - 13) / 5) * (0.935-(0.22)));
            zz = 0 + (((tickAnim - 13) / 5) * (0.775-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.935 + (((tickAnim - 18) / 2) * (0.695-(0.935)));
            zz = 0.775 + (((tickAnim - 18) / 2) * (0.915-(0.775)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 0.695 + (((tickAnim - 20) / 3) * (0.425-(0.695)));
            zz = 0.915 + (((tickAnim - 20) / 3) * (0.625-(0.915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 13.18843 + (((tickAnim - 0) / 11) * (-47.52244-(13.18843)));
            yy = 5.63518 + (((tickAnim - 0) / 11) * (-0.396-(5.63518)));
            zz = -1.37404 + (((tickAnim - 0) / 11) * (6.488-(-1.37404)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = -47.52244 + (((tickAnim - 11) / 12) * (13.18843-(-47.52244)));
            yy = -0.396 + (((tickAnim - 11) / 12) * (5.63518-(-0.396)));
            zz = 6.488 + (((tickAnim - 11) / 12) * (-1.37404-(6.488)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 33.25 + (((tickAnim - 0) / 5) * (-22.70133-(33.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.16006-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-1.36526-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -22.70133 + (((tickAnim - 5) / 3) * (-15.736-(-22.70133)));
            yy = -0.16006 + (((tickAnim - 5) / 3) * (-0.32012-(-0.16006)));
            zz = -1.36526 + (((tickAnim - 5) / 3) * (-2.73052-(-1.36526)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -15.736 + (((tickAnim - 8) / 3) * (24.47067-(-15.736)));
            yy = -0.32012 + (((tickAnim - 8) / 3) * (-0.5202-(-0.32012)));
            zz = -2.73052 + (((tickAnim - 8) / 3) * (-4.4371-(-2.73052)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 24.47067 + (((tickAnim - 11) / 12) * (33.25-(24.47067)));
            yy = -0.5202 + (((tickAnim - 11) / 12) * (0-(-0.5202)));
            zz = -4.4371 + (((tickAnim - 11) / 12) * (0-(-4.4371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 11) * (0.225-(1.05)));
            zz = 0.1 + (((tickAnim - 0) / 11) * (0-(0.1)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            yy = 0.225 + (((tickAnim - 11) / 12) * (1.05-(0.225)));
            zz = 0 + (((tickAnim - 11) / 12) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 76.75 + (((tickAnim - 0) / 5) * (93.23-(76.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 93.23 + (((tickAnim - 5) / 3) * (89.13-(93.23)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 89.13 + (((tickAnim - 8) / 3) * (25.5-(89.13)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 25.5 + (((tickAnim - 11) / 3) * (5.67-(25.5)));
            yy = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 5.67 + (((tickAnim - 14) / 4) * (-13.98-(5.67)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -13.98 + (((tickAnim - 18) / 2) * (4.15-(-13.98)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 4.15 + (((tickAnim - 20) / 3) * (76.75-(4.15)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 5) * (0.725-(0.55)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.125-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            yy = 0.725 + (((tickAnim - 5) / 6) * (0-(0.725)));
            zz = -0.125 + (((tickAnim - 5) / 6) * (0-(-0.125)));
        }
        else if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 11) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 3) * (0.475-(0)));
            zz = 0 + (((tickAnim - 11) / 3) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            yy = 0.475 + (((tickAnim - 14) / 9) * (0.55-(0.475)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -47.52244 + (((tickAnim - 0) / 11) * (13.18843-(-47.52244)));
            yy = 0.39597 + (((tickAnim - 0) / 11) * (-5.6352-(0.39597)));
            zz = -6.48798 + (((tickAnim - 0) / 11) * (1.374-(-6.48798)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 13.18843 + (((tickAnim - 11) / 12) * (-47.52244-(13.18843)));
            yy = -5.6352 + (((tickAnim - 11) / 12) * (0.39597-(-5.6352)));
            zz = 1.374 + (((tickAnim - 11) / 12) * (-6.48798-(1.374)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 24.47067 + (((tickAnim - 0) / 11) * (39-(24.47067)));
            yy = 0.52017 + (((tickAnim - 0) / 11) * (0-(0.52017)));
            zz = 4.43713 + (((tickAnim - 0) / 11) * (0-(4.43713)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 39 + (((tickAnim - 11) / 4) * (-1.96811-(39)));
            yy = 0 + (((tickAnim - 11) / 4) * (0.17339-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (1.47904-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -1.96811 + (((tickAnim - 15) / 4) * (-12.93622-(-1.96811)));
            yy = 0.17339 + (((tickAnim - 15) / 4) * (0.34678-(0.17339)));
            zz = 1.47904 + (((tickAnim - 15) / 4) * (2.95809-(1.47904)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -12.93622 + (((tickAnim - 19) / 4) * (24.47067-(-12.93622)));
            yy = 0.34678 + (((tickAnim - 19) / 4) * (0.52017-(0.34678)));
            zz = 2.95809 + (((tickAnim - 19) / 4) * (4.43713-(2.95809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 11) * (0.65-(0.225)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.65 + (((tickAnim - 11) / 4) * (1.585-(0.65)));
            zz = 0 + (((tickAnim - 11) / 4) * (0.25-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 1.585 + (((tickAnim - 15) / 8) * (0.225-(1.585)));
            zz = 0.25 + (((tickAnim - 15) / 8) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.5 + (((tickAnim - 0) / 3) * (8.76-(25.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 8.76 + (((tickAnim - 3) / 4) * (-19.78-(8.76)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = -19.78 + (((tickAnim - 7) / 4) * (78-(-19.78)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 78 + (((tickAnim - 11) / 4) * (88.5-(78)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 88.5 + (((tickAnim - 15) / 4) * (76.25-(88.5)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 4) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 76.25 + (((tickAnim - 19) / 4) * (25.5-(76.25)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.595-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.595 + (((tickAnim - 3) / 4) * (0.6-(0.595)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 7) / 4) * (0.85-(0.6)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0.85 + (((tickAnim - 11) / 4) * (1.395-(0.85)));
            zz = 0 + (((tickAnim - 11) / 4) * (-0.35-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 15) / 8) * (0-(0)));
            yy = 1.395 + (((tickAnim - 15) / 8) * (0-(1.395)));
            zz = -0.35 + (((tickAnim - 15) / 8) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8.25), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-220))*1), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+60))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-5.25), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-320))*-1), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+120))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-3.25), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-20))*3), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5))*-0.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*-1), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*-0.15);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5))*0.1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5-20))*-0.05);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-30))*-2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-90))*-2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-130))*-3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-160))*-4), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-190))*-5), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309-140))*-1.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309+30))*1));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5))*-0.1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animSwimFast(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*-3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(72.45213), backRightLeg.rotateAngleY + (float) Math.toRadians(23.00725), backRightLeg.rotateAngleZ + (float) Math.toRadians(38.06301));


        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(-16.4998+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-2), backRightLeg2.rotateAngleY + (float) Math.toRadians(11.6608), backRightLeg2.rotateAngleZ + (float) Math.toRadians(7.3372));


        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(117.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-70))*-4), backRightLeg3.rotateAngleY + (float) Math.toRadians(0), backRightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(73.70213), backLeftLeg.rotateAngleY + (float) Math.toRadians(-23.0072), backLeftLeg.rotateAngleZ + (float) Math.toRadians(-38.063));


        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(-16.4998+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*2), backLeftLeg2.rotateAngleY + (float) Math.toRadians(-11.6608), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(-7.3372));


        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(117.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-70))*4), backLeftLeg3.rotateAngleY + (float) Math.toRadians(0), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-30))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-90))*-6), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-130))*-15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*-20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*-20), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-4), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-140))*-5), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+30))*1));


        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(31.99844), frontRightLeg.rotateAngleY + (float) Math.toRadians(19.15276), frontRightLeg.rotateAngleZ + (float) Math.toRadians(61.2949));


        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(72.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-2), frontRightLeg2.rotateAngleY + (float) Math.toRadians(0), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(0);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(0.975);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(102.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*-5), frontRightLeg3.rotateAngleY + (float) Math.toRadians(0), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(32.15623), frontLeftLeg.rotateAngleY + (float) Math.toRadians(-19.3674), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(-61.7733));


        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(72.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*2), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(0));
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(0);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(0.975);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(0);


        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(102.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*5), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(0), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(15.25), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-220))*4), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-6.75), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-320))*-5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+120))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-3.25), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-20))*6), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraQianosuchus entity = (EntityPrehistoricFloraQianosuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -2.25 + (((tickAnim - 0) / 5) * (38.04399-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.18494-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.50511-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 38.04399 + (((tickAnim - 5) / 6) * (-18.75-(38.04399)));
            yy = 0.18494 + (((tickAnim - 5) / 6) * (0-(0.18494)));
            zz = -0.50511 + (((tickAnim - 5) / 6) * (0-(-0.50511)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -18.75 + (((tickAnim - 11) / 2) * (-2.25-(-18.75)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -9.25 + (((tickAnim - 0) / 5) * (25.56201-(-9.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.361-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (2.15853-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 25.56201 + (((tickAnim - 5) / 4) * (-18.64728-(25.56201)));
            yy = -0.361 + (((tickAnim - 5) / 4) * (-0.21861-(-0.361)));
            zz = 2.15853 + (((tickAnim - 5) / 4) * (1.30715-(2.15853)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -18.64728 + (((tickAnim - 9) / 2) * (-5.25-(-18.64728)));
            yy = -0.21861 + (((tickAnim - 9) / 2) * (0-(-0.21861)));
            zz = 1.30715 + (((tickAnim - 9) / 2) * (0-(1.30715)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -5.25 + (((tickAnim - 11) / 2) * (-9.25-(-5.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.55 + (((tickAnim - 5) / 2) * (0.86-(-0.55)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.425-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.86 + (((tickAnim - 7) / 2) * (1.175-(0.86)));
            zz = -0.425 + (((tickAnim - 7) / 2) * (0-(-0.425)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 1.175 + (((tickAnim - 9) / 2) * (-0.65-(1.175)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = -0.65 + (((tickAnim - 11) / 2) * (0-(-0.65)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 13.75 + (((tickAnim - 0) / 2) * (-1.75-(13.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -1.75 + (((tickAnim - 2) / 1) * (1.26-(-1.75)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.26 + (((tickAnim - 3) / 2) * (54.75-(1.26)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 54.75 + (((tickAnim - 5) / 2) * (20.31-(54.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 20.31 + (((tickAnim - 7) / 2) * (5.42-(20.31)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 5.42 + (((tickAnim - 9) / 2) * (23.25-(5.42)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 23.25 + (((tickAnim - 11) / 2) * (13.75-(23.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 0) / 3) * (0.3-(0.275)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 2) * (0.525-(0.3)));
            zz = 0.5 + (((tickAnim - 3) / 2) * (0.525-(0.5)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.525 + (((tickAnim - 5) / 2) * (0.775-(0.525)));
            zz = 0.525 + (((tickAnim - 5) / 2) * (0.44-(0.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.775 + (((tickAnim - 7) / 2) * (0-(0.775)));
            zz = 0.44 + (((tickAnim - 7) / 2) * (0-(0.44)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0.275-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 11) / 2) * (0.275-(0.275)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 38.04399 + (((tickAnim - 0) / 4) * (-18.75-(38.04399)));
            yy = 0.18494 + (((tickAnim - 0) / 4) * (0-(0.18494)));
            zz = -0.50511 + (((tickAnim - 0) / 4) * (0-(-0.50511)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -18.75 + (((tickAnim - 4) / 9) * (38.04399-(-18.75)));
            yy = 0 + (((tickAnim - 4) / 9) * (0.18494-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (-0.50511-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25.56201 + (((tickAnim - 0) / 3) * (-13.07981-(25.56201)));
            yy = -0.361 + (((tickAnim - 0) / 3) * (-0.19691-(-0.361)));
            zz = 2.15853 + (((tickAnim - 0) / 3) * (1.17738-(2.15853)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -13.07981 + (((tickAnim - 3) / 0) * (-22.53991-(-13.07981)));
            yy = -0.19691 + (((tickAnim - 3) / 0) * (-0.09846-(-0.19691)));
            zz = 1.17738 + (((tickAnim - 3) / 0) * (0.58869-(1.17738)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -22.53991 + (((tickAnim - 3) / 1) * (-5.25-(-22.53991)));
            yy = -0.09846 + (((tickAnim - 3) / 1) * (0-(-0.09846)));
            zz = 0.58869 + (((tickAnim - 3) / 1) * (0-(0.58869)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -5.25 + (((tickAnim - 4) / 9) * (25.56201-(-5.25)));
            yy = 0 + (((tickAnim - 4) / 9) * (-0.361-(0)));
            zz = 0 + (((tickAnim - 4) / 9) * (2.15853-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.55 + (((tickAnim - 0) / 3) * (1.825-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.825 + (((tickAnim - 3) / 1) * (-0.65-(1.825)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 4) / 9) * (0-(0)));
            yy = -0.65 + (((tickAnim - 4) / 9) * (-0.55-(-0.65)));
            zz = 0 + (((tickAnim - 4) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 54.75 + (((tickAnim - 0) / 3) * (19.48-(54.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 19.48 + (((tickAnim - 3) / 0) * (8.42103-(19.48)));
            yy = 0 + (((tickAnim - 3) / 0) * (0.39387-(0)));
            zz = 0 + (((tickAnim - 3) / 0) * (-0.73813-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 8.42103 + (((tickAnim - 3) / 1) * (23.25-(8.42103)));
            yy = 0.39387 + (((tickAnim - 3) / 1) * (0-(0.39387)));
            zz = -0.73813 + (((tickAnim - 3) / 1) * (0-(-0.73813)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 23.25 + (((tickAnim - 4) / 3) * (-2.32-(23.25)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = -2.32 + (((tickAnim - 7) / 2) * (12.77-(-2.32)));
            yy = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 12.77 + (((tickAnim - 9) / 4) * (54.75-(12.77)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.525 + (((tickAnim - 0) / 3) * (0.515-(0.525)));
            zz = 0.525 + (((tickAnim - 0) / 3) * (0-(0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.515 + (((tickAnim - 3) / 1) * (0.275-(0.515)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = 0.275 + (((tickAnim - 4) / 3) * (0.22-(0.275)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.22 + (((tickAnim - 7) / 2) * (0.935-(0.22)));
            zz = 0 + (((tickAnim - 7) / 2) * (0.775-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.935 + (((tickAnim - 9) / 2) * (0.695-(0.935)));
            zz = 0.775 + (((tickAnim - 9) / 2) * (0.915-(0.775)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.695 + (((tickAnim - 11) / 2) * (0.525-(0.695)));
            zz = 0.915 + (((tickAnim - 11) / 2) * (0.525-(0.915)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 12.86699 + (((tickAnim - 0) / 6) * (-62.65832-(12.86699)));
            yy = 8.31162 + (((tickAnim - 0) / 6) * (-2.78747-(8.31162)));
            zz = -4.0205 + (((tickAnim - 0) / 6) * (2.38205-(-4.0205)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -62.65832 + (((tickAnim - 6) / 7) * (12.86699-(-62.65832)));
            yy = -2.78747 + (((tickAnim - 6) / 7) * (8.31162-(-2.78747)));
            zz = 2.38205 + (((tickAnim - 6) / 7) * (-4.0205-(2.38205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 33.83797 + (((tickAnim - 0) / 3) * (-22.70133-(33.83797)));
            yy = 3.50196 + (((tickAnim - 0) / 3) * (-0.16006-(3.50196)));
            zz = -15.47097 + (((tickAnim - 0) / 3) * (-1.36526-(-15.47097)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -22.70133 + (((tickAnim - 3) / 1) * (-15.736-(-22.70133)));
            yy = -0.16006 + (((tickAnim - 3) / 1) * (-0.32012-(-0.16006)));
            zz = -1.36526 + (((tickAnim - 3) / 1) * (-2.73052-(-1.36526)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -15.736 + (((tickAnim - 4) / 2) * (39.22067-(-15.736)));
            yy = -0.32012 + (((tickAnim - 4) / 2) * (-0.5202-(-0.32012)));
            zz = -2.73052 + (((tickAnim - 4) / 2) * (-4.4371-(-2.73052)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 39.22067 + (((tickAnim - 6) / 7) * (33.83797-(39.22067)));
            yy = -0.5202 + (((tickAnim - 6) / 7) * (3.50196-(-0.5202)));
            zz = -4.4371 + (((tickAnim - 6) / 7) * (-15.47097-(-4.4371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.05 + (((tickAnim - 0) / 6) * (0.225-(1.05)));
            zz = 0.1 + (((tickAnim - 0) / 6) * (0-(0.1)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.225 + (((tickAnim - 6) / 7) * (1.05-(0.225)));
            zz = 0 + (((tickAnim - 6) / 7) * (0.1-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 93.5 + (((tickAnim - 0) / 3) * (93.23-(93.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 93.23 + (((tickAnim - 3) / 1) * (89.13-(93.23)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 89.13 + (((tickAnim - 4) / 2) * (25.5-(89.13)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 25.5 + (((tickAnim - 6) / 2) * (5.67-(25.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 5.67 + (((tickAnim - 8) / 1) * (-13.98-(5.67)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -13.98 + (((tickAnim - 9) / 2) * (4.15-(-13.98)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 4.15 + (((tickAnim - 11) / 2) * (93.5-(4.15)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 0) / 3) * (0.725-(0.55)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.725 + (((tickAnim - 3) / 3) * (0-(0.725)));
            zz = -0.125 + (((tickAnim - 3) / 3) * (0-(-0.125)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0.475-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.475 + (((tickAnim - 8) / 5) * (0.55-(0.475)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = -62.65832 + (((tickAnim - 0) / 6) * (12.86699-(-62.65832)));
            yy = 2.7875 + (((tickAnim - 0) / 6) * (-8.3116-(2.7875)));
            zz = -2.382 + (((tickAnim - 0) / 6) * (4.0205-(-2.382)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 12.86699 + (((tickAnim - 6) / 7) * (-62.65832-(12.86699)));
            yy = -8.3116 + (((tickAnim - 6) / 7) * (2.7875-(-8.3116)));
            zz = 4.0205 + (((tickAnim - 6) / 7) * (-2.382-(4.0205)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 39.22067 + (((tickAnim - 0) / 6) * (33.83797-(39.22067)));
            yy = 0.5202 + (((tickAnim - 0) / 6) * (-3.502-(0.5202)));
            zz = 4.4371 + (((tickAnim - 0) / 6) * (15.471-(4.4371)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 33.83797 + (((tickAnim - 6) / 2) * (-1.96811-(33.83797)));
            yy = -3.502 + (((tickAnim - 6) / 2) * (0.17339-(-3.502)));
            zz = 15.471 + (((tickAnim - 6) / 2) * (1.47904-(15.471)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -1.96811 + (((tickAnim - 8) / 3) * (-12.93622-(-1.96811)));
            yy = 0.17339 + (((tickAnim - 8) / 3) * (0.34678-(0.17339)));
            zz = 1.47904 + (((tickAnim - 8) / 3) * (2.95809-(1.47904)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -12.93622 + (((tickAnim - 11) / 2) * (39.22067-(-12.93622)));
            yy = 0.34678 + (((tickAnim - 11) / 2) * (0.5202-(0.34678)));
            zz = 2.95809 + (((tickAnim - 11) / 2) * (4.4371-(2.95809)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.225 + (((tickAnim - 0) / 6) * (1.05-(0.225)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.05 + (((tickAnim - 6) / 2) * (1.585-(1.05)));
            zz = 0.1 + (((tickAnim - 6) / 2) * (0.25-(0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.585 + (((tickAnim - 8) / 5) * (0.225-(1.585)));
            zz = 0.25 + (((tickAnim - 8) / 5) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 25.5 + (((tickAnim - 0) / 2) * (8.76-(25.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 8.76 + (((tickAnim - 2) / 1) * (-19.78-(8.76)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -19.78 + (((tickAnim - 3) / 3) * (103.5-(-19.78)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 103.5 + (((tickAnim - 6) / 2) * (88.5-(103.5)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 88.5 + (((tickAnim - 8) / 3) * (76.25-(88.5)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 76.25 + (((tickAnim - 11) / 2) * (25.5-(76.25)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.595-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.595 + (((tickAnim - 2) / 1) * (0.6-(0.595)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 3) / 3) * (0.55-(0.6)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 6) / 2) * (1.395-(0.55)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.395 + (((tickAnim - 8) / 5) * (0-(1.395)));
            zz = -0.35 + (((tickAnim - 8) / 5) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8.25), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*3), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575+60))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-5.25), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-320))*-3), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575+120))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-3.25), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-20))*5), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5+50))*-1.5), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-4), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-0.25);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*0.5);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-20))*-0.3);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-30))*-4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-90))*-4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-130))*-6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-160))*-9), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-190))*-9), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-140))*-5.5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575+30))*1));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*309/0.5))*-0.1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));

    }




    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraQianosuchus e = (EntityPrehistoricFloraQianosuchus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
