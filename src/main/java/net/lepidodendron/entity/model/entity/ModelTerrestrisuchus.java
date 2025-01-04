package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraTerrestrisuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTerrestrisuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backLeftLeg4;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer backRightLeg4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontLeftLeg4;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;
    private final AdvancedModelRenderer frontRightLeg4;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;

    private ModelAnimator animator;

    public ModelTerrestrisuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 10.775F, 1.0F);
        this.main.cubeList.add(new ModelBox(main, 22, 9, -2.0F, -2.0F, -3.0F, 4, 5, 7, 0.0F, false));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(2.0F, 0.85F, 0.15F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, 0.0F, 0.0F, -0.1309F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 19, 35, -0.0436F, -1.751F, -1.5F, 1, 7, 3, 0.01F, false));
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 20, 50, -1.0436F, -1.751F, -1.5F, 1, 7, 3, 0.01F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.2064F, 3.924F, -0.35F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.7107F, -0.0181F, 0.1193F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 41, 38, -0.4F, -0.0904F, -1.2132F, 1, 8, 2, 0.0F, false));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 41, 38, -0.85F, -0.0904F, -1.2132F, 1, 8, 2, -0.001F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(-0.15F, 7.4096F, 0.1868F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.9599F, 0.0F, 0.0F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 38, 7, -0.5F, 0.0F, -0.5F, 1, 3, 1, -0.01F, false));

        this.backLeftLeg4 = new AdvancedModelRenderer(this);
        this.backLeftLeg4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.backLeftLeg3.addChild(backLeftLeg4);
        this.setRotateAngle(backLeftLeg4, 0.2618F, 0.0F, 0.0F);
        this.backLeftLeg4.cubeList.add(new ModelBox(backLeftLeg4, 25, 45, -1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.0F, 0.85F, 0.15F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, 0.0F, 0.0F, 0.1309F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 19, 35, -0.9564F, -1.751F, -1.5F, 1, 7, 3, 0.01F, true));
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 20, 50, 0.0436F, -1.751F, -1.5F, 1, 7, 3, 0.01F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.2064F, 3.924F, -0.35F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.7107F, 0.0181F, -0.1193F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 41, 38, -0.6F, -0.0904F, -1.2132F, 1, 8, 2, 0.0F, true));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 41, 38, -0.15F, -0.0904F, -1.2132F, 1, 8, 2, -0.001F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.15F, 7.4096F, 0.1868F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.9599F, 0.0F, 0.0F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 38, 7, -0.5F, 0.0F, -0.5F, 1, 3, 1, -0.01F, true));

        this.backRightLeg4 = new AdvancedModelRenderer(this);
        this.backRightLeg4.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.backRightLeg3.addChild(backRightLeg4);
        this.setRotateAngle(backRightLeg4, 0.2618F, 0.0F, 0.0F);
        this.backRightLeg4.cubeList.add(new ModelBox(backRightLeg4, 25, 45, -1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.825F, 3.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.0873F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 16, -1.5F, 0.0872F, -0.9962F, 3, 4, 8, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3372F, 6.0038F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 26, -1.0F, 0.0F, 0.0F, 2, 3, 8, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 7.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 14, 22, -0.5F, 0.0F, 0.0F, 1, 2, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 8.85F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 50, -0.5F, -0.5F, 0.0F, 1, 1, 9, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -2.925F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.1309F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -0.07F, -0.0088F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0262F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.5F, 0.0F, -9.0F, 5, 6, 9, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.25F, 4.43F, -8.3588F);
        this.body.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.0855F, 0.0468F, -0.0737F);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.4816F, 1.4758F, -0.6058F);
        this.frontLeftLeg.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.1309F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 16, -0.5F, -3.0F, 0.0F, 1, 5, 2, 0.01F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.4816F, 2.7094F, 0.5048F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.307F, 0.0398F, 0.0116F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 15, 16, -0.4674F, 0.2293F, -0.3526F, 1, 6, 1, 0.0F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0326F, 5.2293F, 0.1474F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.0007F, -0.0087F, -0.0124F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 31, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, -0.01F, false));

        this.frontLeftLeg4 = new AdvancedModelRenderer(this);
        this.frontLeftLeg4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontLeftLeg3.addChild(frontLeftLeg4);
        this.setRotateAngle(frontLeftLeg4, 0.0694F, -0.0234F, 0.0368F);
        this.frontLeftLeg4.cubeList.add(new ModelBox(frontLeftLeg4, 26, 22, -1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.25F, 4.43F, -8.3588F);
        this.body.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.0855F, -0.0468F, 0.0737F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.4816F, 1.4758F, -0.6058F);
        this.frontRightLeg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.1309F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 16, -0.5F, -3.0F, 0.0F, 1, 5, 2, 0.01F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(-0.4816F, 2.7094F, 0.5048F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.307F, -0.0398F, -0.0116F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 15, 16, -0.5326F, 0.2293F, -0.3526F, 1, 6, 1, 0.0F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(-0.0326F, 5.2293F, 0.1474F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.0007F, 0.0087F, 0.0124F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 31, 0, -0.5F, 0.0F, -0.5F, 1, 2, 1, -0.01F, true));

        this.frontRightLeg4 = new AdvancedModelRenderer(this);
        this.frontRightLeg4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.frontRightLeg3.addChild(frontRightLeg4);
        this.setRotateAngle(frontRightLeg4, 0.0694F, 0.0234F, -0.0368F);
        this.frontRightLeg4.cubeList.add(new ModelBox(frontRightLeg4, 26, 22, -1.5F, 0.0F, -2.5F, 3, 0, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.18F, -8.8088F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.432F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 35, 0, -1.5F, -0.1805F, -2.1177F, 3, 2, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 1.8195F, -2.1177F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 28, -1.0F, -0.5F, 0.025F, 2, 1, 4, 0.01F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.2232F, -1.5989F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 20, 0, -1.5F, -0.4037F, -4.0188F, 3, 2, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.5963F, -1.0188F);
        this.neck2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 40, 22, -1.0F, -0.575F, -2.975F, 2, 1, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.4037F, -3.9688F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.4363F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 46, 0, -1.0F, 0.525F, -2.0F, 2, 1, 2, 0.002F, false));
        this.head.cubeList.add(new ModelBox(head, 28, 38, -0.5F, 0.525F, -6.0F, 1, 1, 5, 0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.325F, -4.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0698F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 26, 26, -1.0F, -1.075F, 2.05F, 2, 1, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 45, 14, -0.5F, -1.075F, -1.95F, 1, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.0803F, 1.025F, -0.2478F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3316F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 40, -0.0433F, -0.5F, -4.9784F, 1, 1, 5, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.0803F, 1.025F, -0.2478F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3316F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 40, -0.9567F, -0.5F, -4.9784F, 1, 1, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.475F, 1.15F, -4.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -0.1F, -0.5F, -2.0F, 0, 1, 4, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.475F, 1.15F, -4.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.1745F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, 0.1F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.525F, -0.7F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 9, 43, -0.5F, 0.0F, -5.3F, 1, 1, 4, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 10, 34, -1.0F, 0.0F, -1.3F, 2, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.475F, 0.3F, -3.8F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 29, -0.05F, -0.5F, -1.5F, 0, 1, 4, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.475F, 0.3F, -3.8F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1745F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 29, 0.05F, -0.5F, -1.5F, 0, 1, 4, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.0803F, -0.5F, 0.4522F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.3316F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 7, -0.0433F, 0.5F, -4.9784F, 1, 1, 5, -0.001F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.0803F, -0.5F, 0.4522F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.3316F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 7, -0.9567F, 0.5F, -4.9784F, 1, 1, 5, -0.001F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(0.0125F, 0.7085F, -2.0404F);
        this.head.addChild(eye);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(1.0614F, 0.0F, 0.0F);
        this.eye.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0551F, 0.2632F, -0.2285F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 6, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0614F, 0.0F, 0.0F);
        this.eye.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0551F, -0.2632F, 0.2285F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 6, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));


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
        this.main.offsetY = -2.0F;
        this.main.offsetX = -1.338F;
        this.main.rotateAngleY = (float)Math.toRadians(200);
        this.main.rotateAngleX = (float)Math.toRadians(8);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 1.63F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.main.offsetY = 0.055F;
        this.main.render(0.01f);
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        this.body.offsetZ = -0.05F;
        this.body.offsetY = -0.02F;
        this.body.render(0.01f);
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
        this.main.offsetY = -0.03F;

        EntityPrehistoricFloraTerrestrisuchus proteros = (EntityPrehistoricFloraTerrestrisuchus) e;

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
                    if (proteros.getAnimation() != proteros.EAT_ANIMATION
                        && proteros.getAnimation() != proteros.DRINK_ANIMATION) {
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
        EntityPrehistoricFloraTerrestrisuchus ee = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;

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
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
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
        EntityPrehistoricFloraTerrestrisuchus entity = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-37.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -37.25 + (((tickAnim - 10) / 10) * (20.5-(-37.25)));
            yy = -6 + (((tickAnim - 10) / 10) * (-6-(-6)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 20.5 + (((tickAnim - 20) / 10) * (-37.25-(20.5)));
            yy = -6 + (((tickAnim - 20) / 10) * (-6-(-6)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -37.25 + (((tickAnim - 30) / 10) * (20.5-(-37.25)));
            yy = -6 + (((tickAnim - 30) / 10) * (-6-(-6)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 20.5 + (((tickAnim - 40) / 10) * (0-(20.5)));
            yy = -6 + (((tickAnim - 40) / 10) * (0-(-6)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.25 + (((tickAnim - 10) / 10) * (9.5-(-9.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 9.5 + (((tickAnim - 20) / 4) * (-14.56-(9.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -14.56 + (((tickAnim - 24) / 6) * (-9.25-(-14.56)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -9.25 + (((tickAnim - 30) / 10) * (9.5-(-9.25)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.5 + (((tickAnim - 40) / 10) * (0-(9.5)));
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
            yy = 0 + (((tickAnim - 0) / 5) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.825 + (((tickAnim - 5) / 5) * (0-(0.825)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.675-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.675 + (((tickAnim - 14) / 6) * (0-(0.675)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = 1 + (((tickAnim - 24) / 6) * (0-(1)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0.675-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.675 + (((tickAnim - 34) / 16) * (0-(0.675)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (-41.12-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -41.12 + (((tickAnim - 5) / 5) * (-18.25-(-41.12)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -18.25 + (((tickAnim - 10) / 2) * (-18.42-(-18.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = -18.42 + (((tickAnim - 12) / 8) * (25.75-(-18.42)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 25.75 + (((tickAnim - 20) / 4) * (-49.58-(25.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = -49.58 + (((tickAnim - 24) / 6) * (-18.25-(-49.58)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = -18.25 + (((tickAnim - 30) / 2) * (-18.42-(-18.25)));
            yy = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -18.42 + (((tickAnim - 32) / 8) * (25.75-(-18.42)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.75 + (((tickAnim - 40) / 10) * (0-(25.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0.725-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            yy = 0.725 + (((tickAnim - 14) / 10) * (-0.55-(0.725)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            yy = -0.55 + (((tickAnim - 24) / 6) * (0-(-0.55)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 4) * (0.725-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 34) / 16) * (0-(0)));
            yy = 0.725 + (((tickAnim - 34) / 16) * (0-(0.725)));
            zz = 0 + (((tickAnim - 34) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (77.38-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 77.38 + (((tickAnim - 5) / 5) * (68.75-(77.38)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 68.75 + (((tickAnim - 10) / 4) * (16.29-(68.75)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 16.29 + (((tickAnim - 14) / 6) * (128.25-(16.29)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = 128.25 + (((tickAnim - 20) / 4) * (91.46-(128.25)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 91.46 + (((tickAnim - 24) / 6) * (68.75-(91.46)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 68.75 + (((tickAnim - 30) / 4) * (16.29-(68.75)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 16.29 + (((tickAnim - 34) / 6) * (128.25-(16.29)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 128.25 + (((tickAnim - 40) / 10) * (0-(128.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.4 + (((tickAnim - 2) / 3) * (0-(0.4)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);


    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTerrestrisuchus entity = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -19.5 + (((tickAnim - 15) / 20) * (-19.5-(-19.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -19.5 + (((tickAnim - 35) / 15) * (0-(-19.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-4.35-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (6.875-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -4.35 + (((tickAnim - 15) / 20) * (-4.35-(-4.35)));
            zz = 6.875 + (((tickAnim - 15) / 20) * (6.875-(6.875)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -4.35 + (((tickAnim - 35) / 15) * (0-(-4.35)));
            zz = 6.875 + (((tickAnim - 35) / 15) * (0-(6.875)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-54-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -54 + (((tickAnim - 15) / 20) * (-54-(-54)));
            yy = -12.75 + (((tickAnim - 15) / 20) * (-12.75-(-12.75)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -54 + (((tickAnim - 35) / 15) * (0-(-54)));
            yy = -12.75 + (((tickAnim - 35) / 15) * (0-(-12.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 34 + (((tickAnim - 15) / 20) * (34-(34)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 35) / 15) * (0-(34)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0.6 + (((tickAnim - 6) / 9) * (0-(0.6)));
            zz = 0 + (((tickAnim - 6) / 9) * (-0.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.625 + (((tickAnim - 15) / 20) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0.85-(0)));
            zz = -0.625 + (((tickAnim - 35) / 7) * (-0.35-(-0.625)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.85 + (((tickAnim - 42) / 8) * (0-(0.85)));
            zz = -0.35 + (((tickAnim - 42) / 8) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-38.21-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -38.21 + (((tickAnim - 6) / 9) * (-30.75-(-38.21)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -30.75 + (((tickAnim - 15) / 20) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -30.75 + (((tickAnim - 35) / 7) * (-45.58-(-30.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -45.58 + (((tickAnim - 42) / 8) * (0-(-45.58)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
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



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (58.82-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 58.82 + (((tickAnim - 6) / 2) * (59.06-(58.82)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 59.06 + (((tickAnim - 8) / 7) * (68.75-(59.06)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 68.75 + (((tickAnim - 15) / 20) * (68.75-(68.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 68.75 + (((tickAnim - 35) / 7) * (75.53-(68.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 75.53 + (((tickAnim - 42) / 8) * (0-(75.53)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.05-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.575 + (((tickAnim - 2) / 1) * (0.6-(0.575)));
            zz = -0.05 + (((tickAnim - 2) / 1) * (-0.09-(-0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 3) / 3) * (0-(0.6)));
            zz = -0.09 + (((tickAnim - 3) / 3) * (0-(-0.09)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.355-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = -0.355 + (((tickAnim - 10) / 1) * (-0.295-(-0.355)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -0.295 + (((tickAnim - 11) / 2) * (-0.125-(-0.295)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -0.125 + (((tickAnim - 13) / 2) * (0.275-(-0.125)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.275 + (((tickAnim - 15) / 20) * (0.275-(0.275)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0.275 + (((tickAnim - 35) / 2) * (0.07-(0.275)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0.07 + (((tickAnim - 37) / 2) * (0-(0.07)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0.4-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (-0.38-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 43) / 2) * (0.75-(0.4)));
            zz = -0.38 + (((tickAnim - 43) / 2) * (-0.525-(-0.38)));
        }
        else if (tickAnim >= 45 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 45) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 45) / 1) * (0.935-(0.75)));
            zz = -0.525 + (((tickAnim - 45) / 1) * (-0.44-(-0.525)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 46) / 1) * (0-(0)));
            yy = 0.935 + (((tickAnim - 46) / 1) * (0.975-(0.935)));
            zz = -0.44 + (((tickAnim - 46) / 1) * (-0.35-(-0.44)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            yy = 0.975 + (((tickAnim - 47) / 1) * (0.88-(0.975)));
            zz = -0.35 + (((tickAnim - 47) / 1) * (-0.26-(-0.35)));
        }
        else if (tickAnim >= 48 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 48) / 0) * (0-(0)));
            yy = 0.88 + (((tickAnim - 48) / 0) * (0.815-(0.88)));
            zz = -0.26 + (((tickAnim - 48) / 0) * (-0.17-(-0.26)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.815 + (((tickAnim - 48) / 2) * (0-(0.815)));
            zz = -0.17 + (((tickAnim - 48) / 2) * (0-(-0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 15) / 20) * (4-(4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1 + (((tickAnim - 15) / 20) * (1-(1)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1 + (((tickAnim - 35) / 3) * (-6.74-(1)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -6.74 + (((tickAnim - 38) / 5) * (-6.04-(-6.74)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -6.04 + (((tickAnim - 43) / 7) * (0-(-6.04)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9 + (((tickAnim - 15) / 20) * (9-(9)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 9 + (((tickAnim - 35) / 3) * (-2.12-(9)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -2.12 + (((tickAnim - 38) / 5) * (-16.52-(-2.12)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -16.52 + (((tickAnim - 43) / 7) * (0-(-16.52)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.75 + (((tickAnim - 15) / 20) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 35) / 15) * (0-(11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25.5 + (((tickAnim - 15) / 20) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25.5 + (((tickAnim - 35) / 15) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16.75 + (((tickAnim - 15) / 20) * (-16.75-(-16.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16.75 + (((tickAnim - 35) / 15) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.305-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.305 + (((tickAnim - 3) / 4) * (0.45-(0.305)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 7) / 2) * (0.44-(0.45)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.44 + (((tickAnim - 9) / 2) * (0.355-(0.44)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.355 + (((tickAnim - 11) / 2) * (0.19-(0.355)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 13) / 2) * (0-(0.19)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.25 + (((tickAnim - 15) / 20) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 35) / 15) * (0-(11.25)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 40.25 + (((tickAnim - 15) / 20) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 40.25 + (((tickAnim - 35) / 15) * (0-(40.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.42-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.42 + (((tickAnim - 8) / 7) * (0.05-(0.42)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.05 + (((tickAnim - 15) / 20) * (0.05-(0.05)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 35) / 2) * (0.255-(0.05)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 0.255 + (((tickAnim - 37) / 1) * (0.34-(0.255)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.34 + (((tickAnim - 38) / 2) * (0.65-(0.34)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0.65 + (((tickAnim - 40) / 4) * (0.8-(0.65)));
            zz = 0 + (((tickAnim - 40) / 4) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.8 + (((tickAnim - 44) / 6) * (0-(0.8)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(xx);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(yy);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.25 + (((tickAnim - 15) / 20) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.25 + (((tickAnim - 35) / 15) * (0-(12.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-54-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (12.75-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -54 + (((tickAnim - 15) / 20) * (-54-(-54)));
            yy = 12.75 + (((tickAnim - 15) / 20) * (12.75-(12.75)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -54 + (((tickAnim - 35) / 15) * (0-(-54)));
            yy = 12.75 + (((tickAnim - 35) / 15) * (0-(12.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (34-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 34 + (((tickAnim - 15) / 20) * (34-(34)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 34 + (((tickAnim - 35) / 15) * (0-(34)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0.6-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            yy = 0.6 + (((tickAnim - 6) / 9) * (0-(0.6)));
            zz = 0 + (((tickAnim - 6) / 9) * (-0.625-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.625 + (((tickAnim - 15) / 20) * (-0.625-(-0.625)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0.85-(0)));
            zz = -0.625 + (((tickAnim - 35) / 7) * (-0.35-(-0.625)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 0.85 + (((tickAnim - 42) / 8) * (0-(0.85)));
            zz = -0.35 + (((tickAnim - 42) / 8) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg2.rotationPointX = this.backRightLeg2.rotationPointX + (float)(xx);
        this.backRightLeg2.rotationPointY = this.backRightLeg2.rotationPointY - (float)(yy);
        this.backRightLeg2.rotationPointZ = this.backRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-38.21-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -38.21 + (((tickAnim - 6) / 9) * (-30.75-(-38.21)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -30.75 + (((tickAnim - 15) / 20) * (-30.75-(-30.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = -30.75 + (((tickAnim - 35) / 7) * (-45.58-(-30.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = -45.58 + (((tickAnim - 42) / 8) * (0-(-45.58)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(0);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(0);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (58.82-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 58.82 + (((tickAnim - 6) / 2) * (57.81-(58.82)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 57.81 + (((tickAnim - 8) / 7) * (68.75-(57.81)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 68.75 + (((tickAnim - 15) / 20) * (68.75-(68.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 68.75 + (((tickAnim - 35) / 7) * (75.53-(68.75)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 75.53 + (((tickAnim - 42) / 8) * (0-(75.53)));
            yy = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.05-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.575 + (((tickAnim - 2) / 1) * (0.6-(0.575)));
            zz = -0.05 + (((tickAnim - 2) / 1) * (-0.09-(-0.05)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.6 + (((tickAnim - 3) / 3) * (0-(0.6)));
            zz = -0.09 + (((tickAnim - 3) / 3) * (0-(-0.09)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (-0.33-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = -0.33 + (((tickAnim - 10) / 1) * (-0.295-(-0.33)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = -0.295 + (((tickAnim - 11) / 2) * (-0.125-(-0.295)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = -0.125 + (((tickAnim - 13) / 2) * (0.275-(-0.125)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0.275 + (((tickAnim - 15) / 20) * (0.275-(0.275)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0.275 + (((tickAnim - 35) / 2) * (0.07-(0.275)));
        }
        else if (tickAnim >= 37 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 2) * (0-(0)));
            zz = 0.07 + (((tickAnim - 37) / 2) * (0-(0.07)));
        }
        else if (tickAnim >= 39 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 3) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 42) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 1) * (0.4-(0)));
            zz = 0 + (((tickAnim - 42) / 1) * (-0.38-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 43) / 2) * (0-(0)));
            yy = 0.4 + (((tickAnim - 43) / 2) * (0.75-(0.4)));
            zz = -0.38 + (((tickAnim - 43) / 2) * (-0.525-(-0.38)));
        }
        else if (tickAnim >= 45 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 45) / 1) * (0-(0)));
            yy = 0.75 + (((tickAnim - 45) / 1) * (0.935-(0.75)));
            zz = -0.525 + (((tickAnim - 45) / 1) * (-0.44-(-0.525)));
        }
        else if (tickAnim >= 46 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 46) / 1) * (0-(0)));
            yy = 0.935 + (((tickAnim - 46) / 1) * (0.975-(0.935)));
            zz = -0.44 + (((tickAnim - 46) / 1) * (-0.35-(-0.44)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 47) / 1) * (0-(0)));
            yy = 0.975 + (((tickAnim - 47) / 1) * (0.88-(0.975)));
            zz = -0.35 + (((tickAnim - 47) / 1) * (-0.26-(-0.35)));
        }
        else if (tickAnim >= 48 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 48) / 0) * (0-(0)));
            yy = 0.88 + (((tickAnim - 48) / 0) * (0.815-(0.88)));
            zz = -0.26 + (((tickAnim - 48) / 0) * (-0.17-(-0.26)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.815 + (((tickAnim - 48) / 2) * (0-(0.815)));
            zz = -0.17 + (((tickAnim - 48) / 2) * (0-(-0.17)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-25.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -25.5 + (((tickAnim - 15) / 20) * (-25.5-(-25.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -25.5 + (((tickAnim - 35) / 15) * (0-(-25.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -16 + (((tickAnim - 15) / 20) * (-16-(-16)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 35) / 15) * (0-(-16)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.305-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.305 + (((tickAnim - 3) / 4) * (0.45-(0.305)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 7) / 2) * (0.44-(0.45)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0.44 + (((tickAnim - 9) / 2) * (0.355-(0.44)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.355 + (((tickAnim - 11) / 2) * (0.19-(0.355)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.19 + (((tickAnim - 13) / 2) * (0-(0.19)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 11.25 + (((tickAnim - 15) / 20) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 35) / 15) * (0-(11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 40.25 + (((tickAnim - 15) / 20) * (40.25-(40.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 40.25 + (((tickAnim - 35) / 15) * (0-(40.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.345-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.345 + (((tickAnim - 8) / 7) * (0.05-(0.345)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.05 + (((tickAnim - 15) / 20) * (0.05-(0.05)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            yy = 0.05 + (((tickAnim - 35) / 2) * (0.355-(0.05)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 37) / 1) * (0-(0)));
            yy = 0.355 + (((tickAnim - 37) / 1) * (0.54-(0.355)));
            zz = 0 + (((tickAnim - 37) / 1) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            yy = 0.54 + (((tickAnim - 38) / 2) * (0.625-(0.54)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 40) / 2) * (0-(0)));
            yy = 0.625 + (((tickAnim - 40) / 2) * (0.71-(0.625)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 42) / 2) * (0-(0)));
            yy = 0.71 + (((tickAnim - 42) / 2) * (0.6-(0.71)));
            zz = 0 + (((tickAnim - 42) / 2) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0.6 + (((tickAnim - 44) / 4) * (0.485-(0.6)));
            zz = 0 + (((tickAnim - 44) / 4) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 48) / 2) * (0-(0)));
            yy = 0.485 + (((tickAnim - 48) / 2) * (0-(0.485)));
            zz = 0 + (((tickAnim - 48) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg4.rotationPointX = this.frontRightLeg4.rotationPointX + (float)(xx);
        this.frontRightLeg4.rotationPointY = this.frontRightLeg4.rotationPointY - (float)(yy);
        this.frontRightLeg4.rotationPointZ = this.frontRightLeg4.rotationPointZ + (float)(zz);


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTerrestrisuchus entity = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;
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
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTerrestrisuchus entity = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 9) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -37 + (((tickAnim - 9) / 11) * (0-(-37)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 30.75 + (((tickAnim - 9) / 11) * (0-(30.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 2) / 3) * (0.425-(0.175)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 5) / 4) * (0.2-(0.425)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 9) / 4) * (0.425-(0.2)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.425 + (((tickAnim - 13) / 4) * (0.3-(0.425)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.3 + (((tickAnim - 17) / 3) * (0-(0.3)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(xx);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(yy);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 13.25 + (((tickAnim - 9) / 4) * (20.75-(13.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 20.75 + (((tickAnim - 13) / 7) * (0-(20.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (-1.2-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = -1.2 + (((tickAnim - 9) / 11) * (0-(-1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (15.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 15.75 + (((tickAnim - 9) / 11) * (0-(15.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10 + (((tickAnim - 9) / 4) * (19.42-(10)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 19.42 + (((tickAnim - 13) / 7) * (0-(19.42)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 18.25 + (((tickAnim - 9) / 4) * (0-(18.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 12.5 + (((tickAnim - 9) / 11) * (0-(12.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 9) / 11) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (-37-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -37 + (((tickAnim - 9) / 11) * (0-(-37)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg2.rotationPointX = this.frontRightLeg2.rotationPointX + (float)(xx);
        this.frontRightLeg2.rotationPointY = this.frontRightLeg2.rotationPointY - (float)(yy);
        this.frontRightLeg2.rotationPointZ = this.frontRightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (30.75-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 30.75 + (((tickAnim - 9) / 11) * (0-(30.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 2) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 2) / 3) * (0.55-(0.175)));
            zz = 0 + (((tickAnim - 2) / 3) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.55 + (((tickAnim - 5) / 4) * (0.25-(0.55)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0.25 + (((tickAnim - 9) / 4) * (0.5-(0.25)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 0.5 + (((tickAnim - 13) / 4) * (0.335-(0.5)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0.335 + (((tickAnim - 17) / 3) * (0-(0.335)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg4.rotationPointX = this.frontRightLeg4.rotationPointX + (float)(xx);
        this.frontRightLeg4.rotationPointY = this.frontRightLeg4.rotationPointY - (float)(yy);
        this.frontRightLeg4.rotationPointZ = this.frontRightLeg4.rotationPointZ + (float)(zz);


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraTerrestrisuchus entity = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;
        int animCycle = 135;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 56) {
            xx = -4.75 + (((tickAnim - 35) / 21) * (-4-(-4.75)));
            yy = 0 + (((tickAnim - 35) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 21) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 105) {
            xx = -4 + (((tickAnim - 56) / 49) * (4.75-(-4)));
            yy = 0 + (((tickAnim - 56) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 49) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 4.75 + (((tickAnim - 105) / 11) * (3.5-(4.75)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = 3.5 + (((tickAnim - 116) / 19) * (0-(3.5)));
            yy = 0 + (((tickAnim - 116) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 56) {
            xx = -6 + (((tickAnim - 35) / 21) * (-7.5-(-6)));
            yy = 0 + (((tickAnim - 35) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 21) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 105) {
            xx = -7.5 + (((tickAnim - 56) / 49) * (0.5-(-7.5)));
            yy = 0 + (((tickAnim - 56) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 49) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 0.5 + (((tickAnim - 105) / 11) * (-0.5-(0.5)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = -0.5 + (((tickAnim - 116) / 19) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 116) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 56) {
            xx = -5 + (((tickAnim - 35) / 21) * (-8.75-(-5)));
            yy = 0 + (((tickAnim - 35) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 21) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 105) {
            xx = -8.75 + (((tickAnim - 56) / 49) * (-5.5-(-8.75)));
            yy = 0 + (((tickAnim - 56) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 49) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = -5.5 + (((tickAnim - 105) / 11) * (-6.25-(-5.5)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = -6.25 + (((tickAnim - 116) / 19) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 116) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (3.79-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 35) {
            xx = 3.79 + (((tickAnim - 13) / 22) * (-7.25-(3.79)));
            yy = 0 + (((tickAnim - 13) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 22) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 56) {
            xx = -7.25 + (((tickAnim - 35) / 21) * (-13.75-(-7.25)));
            yy = 0 + (((tickAnim - 35) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 21) * (0-(0)));
        }
        else if (tickAnim >= 56 && tickAnim < 105) {
            xx = -13.75 + (((tickAnim - 56) / 49) * (3-(-13.75)));
            yy = 0 + (((tickAnim - 56) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 56) / 49) * (0-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 116) {
            xx = 3 + (((tickAnim - 105) / 11) * (2-(3)));
            yy = 0 + (((tickAnim - 105) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 11) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = 2 + (((tickAnim - 116) / 19) * (0-(2)));
            yy = 0 + (((tickAnim - 116) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (36.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 36.25 + (((tickAnim - 8) / 12) * (39.5-(36.25)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 116) {
            xx = 39.5 + (((tickAnim - 20) / 96) * (39.5-(39.5)));
            yy = 0 + (((tickAnim - 20) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 96) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = 39.5 + (((tickAnim - 116) / 19) * (0-(39.5)));
            yy = 0 + (((tickAnim - 116) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-18.954-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-6.214-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.06861-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -18.954 + (((tickAnim - 8) / 12) * (-16.454-(-18.954)));
            yy = -6.214 + (((tickAnim - 8) / 12) * (-6.214-(-6.214)));
            zz = -0.06861 + (((tickAnim - 8) / 12) * (-0.06861-(-0.06861)));
        }
        else if (tickAnim >= 20 && tickAnim < 116) {
            xx = -16.454 + (((tickAnim - 20) / 96) * (-16.454-(-16.454)));
            yy = -6.214 + (((tickAnim - 20) / 96) * (-6.214-(-6.214)));
            zz = -0.06861 + (((tickAnim - 20) / 96) * (-0.06861-(-0.06861)));
        }
        else if (tickAnim >= 116 && tickAnim < 126) {
            xx = -16.454 + (((tickAnim - 116) / 10) * (-64.8693-(-16.454)));
            yy = -6.214 + (((tickAnim - 116) / 10) * (-2.97191-(-6.214)));
            zz = -0.06861 + (((tickAnim - 116) / 10) * (-0.03281-(-0.06861)));
        }
        else if (tickAnim >= 126 && tickAnim < 135) {
            xx = -64.8693 + (((tickAnim - 126) / 9) * (0-(-64.8693)));
            yy = -2.97191 + (((tickAnim - 126) / 9) * (0-(-2.97191)));
            zz = -0.03281 + (((tickAnim - 126) / 9) * (0-(-0.03281)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -0.25 + (((tickAnim - 8) / 12) * (0-(-0.25)));
            yy = 1.075 + (((tickAnim - 8) / 12) * (-0.3-(1.075)));
            zz = 0 + (((tickAnim - 8) / 12) * (-0.35-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 20) / 96) * (0-(0)));
            yy = -0.3 + (((tickAnim - 20) / 96) * (-0.3-(-0.3)));
            zz = -0.35 + (((tickAnim - 20) / 96) * (-0.35-(-0.35)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 116) / 4) * (0-(0)));
            yy = -0.3 + (((tickAnim - 116) / 4) * (-0.045-(-0.3)));
            zz = -0.35 + (((tickAnim - 116) / 4) * (-0.29-(-0.35)));
        }
        else if (tickAnim >= 120 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 120) / 6) * (0-(0)));
            yy = -0.045 + (((tickAnim - 120) / 6) * (-0.04-(-0.045)));
            zz = -0.29 + (((tickAnim - 120) / 6) * (-0.22-(-0.29)));
        }
        else if (tickAnim >= 126 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 126) / 9) * (0-(0)));
            yy = -0.04 + (((tickAnim - 126) / 9) * (0-(-0.04)));
            zz = -0.22 + (((tickAnim - 126) / 9) * (0-(-0.22)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (44.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 44.75 + (((tickAnim - 8) / 12) * (0-(44.75)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 20) / 96) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 96) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 126) {
            xx = 0 + (((tickAnim - 116) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 116) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 116) / 10) * (0-(0)));
        }
        else if (tickAnim >= 126 && tickAnim < 135) {
            xx = 11.25 + (((tickAnim - 126) / 9) * (0-(11.25)));
            yy = 0 + (((tickAnim - 126) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 126) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = -0.55 + (((tickAnim - 8) / 12) * (-0.95-(-0.55)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 20) / 96) * (0-(0)));
            yy = -0.95 + (((tickAnim - 20) / 96) * (-0.95-(-0.95)));
            zz = 0 + (((tickAnim - 20) / 96) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 116) / 4) * (0-(0)));
            yy = -0.95 + (((tickAnim - 116) / 4) * (0.105-(-0.95)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 120) / 15) * (0-(0)));
            yy = 0.105 + (((tickAnim - 120) / 15) * (0-(0.105)));
            zz = 0 + (((tickAnim - 120) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (45.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 45.5 + (((tickAnim - 8) / 12) * (-18.95053-(45.5)));
            yy = 0 + (((tickAnim - 8) / 12) * (-0.37672-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (7.49323-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 116) {
            xx = -18.95053 + (((tickAnim - 20) / 96) * (-18.95053-(-18.95053)));
            yy = -0.37672 + (((tickAnim - 20) / 96) * (-0.37672-(-0.37672)));
            zz = 7.49323 + (((tickAnim - 20) / 96) * (7.49323-(7.49323)));
        }
        else if (tickAnim >= 116 && tickAnim < 126) {
            xx = -18.95053 + (((tickAnim - 116) / 10) * (73.39323-(-18.95053)));
            yy = -0.37672 + (((tickAnim - 116) / 10) * (-0.18017-(-0.37672)));
            zz = 7.49323 + (((tickAnim - 116) / 10) * (3.58372-(7.49323)));
        }
        else if (tickAnim >= 126 && tickAnim < 135) {
            xx = 73.39323 + (((tickAnim - 126) / 9) * (0-(73.39323)));
            yy = -0.18017 + (((tickAnim - 126) / 9) * (0-(-0.18017)));
            zz = 3.58372 + (((tickAnim - 126) / 9) * (0-(3.58372)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0.525 + (((tickAnim - 8) / 12) * (0-(0.525)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 116) {
            xx = 0 + (((tickAnim - 20) / 96) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 96) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 96) * (0-(0)));
        }
        else if (tickAnim >= 116 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 116) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 116) / 4) * (0.45-(0)));
            zz = 0 + (((tickAnim - 116) / 4) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 131) {
            xx = 0 + (((tickAnim - 120) / 11) * (0-(0)));
            yy = 0.45 + (((tickAnim - 120) / 11) * (0.37-(0.45)));
            zz = 0 + (((tickAnim - 120) / 11) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 135) {
            xx = 0 + (((tickAnim - 131) / 4) * (0-(0)));
            yy = 0.37 + (((tickAnim - 131) / 4) * (0-(0.37)));
            zz = 0 + (((tickAnim - 131) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(xx);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(yy);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-12.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (7.75-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = -12.5 + (((tickAnim - 14) / 10) * (-13-(-12.5)));
            yy = 7.75 + (((tickAnim - 14) / 10) * (7.75-(7.75)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 48) {
            xx = -13 + (((tickAnim - 24) / 24) * (-14.25-(-13)));
            yy = 7.75 + (((tickAnim - 24) / 24) * (7.75-(7.75)));
            zz = 0 + (((tickAnim - 24) / 24) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -14.25 + (((tickAnim - 48) / 17) * (-14.25-(-14.25)));
            yy = 7.75 + (((tickAnim - 48) / 17) * (7.75-(7.75)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 90) {
            xx = -14.25 + (((tickAnim - 65) / 25) * (-1.34855-(-14.25)));
            yy = 7.75 + (((tickAnim - 65) / 25) * (-6.97433-(7.75)));
            zz = 0 + (((tickAnim - 65) / 25) * (-1.51563-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 104) {
            xx = -1.34855 + (((tickAnim - 90) / 14) * (-1.34855-(-1.34855)));
            yy = -6.97433 + (((tickAnim - 90) / 14) * (-6.97433-(-6.97433)));
            zz = -1.51563 + (((tickAnim - 90) / 14) * (-1.51563-(-1.51563)));
        }
        else if (tickAnim >= 104 && tickAnim < 116) {
            xx = -1.34855 + (((tickAnim - 104) / 12) * (-1.34855-(-1.34855)));
            yy = -6.97433 + (((tickAnim - 104) / 12) * (-6.97433-(-6.97433)));
            zz = -1.51563 + (((tickAnim - 104) / 12) * (-1.51563-(-1.51563)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = -1.34855 + (((tickAnim - 116) / 19) * (0-(-1.34855)));
            yy = -6.97433 + (((tickAnim - 116) / 19) * (0-(-6.97433)));
            zz = -1.51563 + (((tickAnim - 116) / 19) * (0-(-1.51563)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 24) {
            xx = -6.25 + (((tickAnim - 14) / 10) * (-7.25-(-6.25)));
            yy = 0 + (((tickAnim - 14) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 10) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 48) {
            xx = -7.25 + (((tickAnim - 24) / 24) * (-5.5-(-7.25)));
            yy = 0 + (((tickAnim - 24) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 24) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = -5.5 + (((tickAnim - 48) / 17) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 48) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 17) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 90) {
            xx = -5.5 + (((tickAnim - 65) / 25) * (-5.2934-(-5.5)));
            yy = 0 + (((tickAnim - 65) / 25) * (-17.06371-(0)));
            zz = 0 + (((tickAnim - 65) / 25) * (0.11726-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 104) {
            xx = -5.2934 + (((tickAnim - 90) / 14) * (-5.2934-(-5.2934)));
            yy = -17.06371 + (((tickAnim - 90) / 14) * (-17.06371-(-17.06371)));
            zz = 0.11726 + (((tickAnim - 90) / 14) * (0.11726-(0.11726)));
        }
        else if (tickAnim >= 104 && tickAnim < 116) {
            xx = -5.2934 + (((tickAnim - 104) / 12) * (-5.2934-(-5.2934)));
            yy = -17.06371 + (((tickAnim - 104) / 12) * (-17.06371-(-17.06371)));
            zz = 0.11726 + (((tickAnim - 104) / 12) * (0.11726-(0.11726)));
        }
        else if (tickAnim >= 116 && tickAnim < 135) {
            xx = -5.2934 + (((tickAnim - 116) / 19) * (0-(-5.2934)));
            yy = -17.06371 + (((tickAnim - 116) / 19) * (0-(-17.06371)));
            zz = 0.11726 + (((tickAnim - 116) / 19) * (0-(0.11726)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 13.5 + (((tickAnim - 14) / 3) * (10.91-(13.5)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 10.91 + (((tickAnim - 17) / 2) * (13.5-(10.91)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 13.5 + (((tickAnim - 19) / 3) * (10.91-(13.5)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 10.91 + (((tickAnim - 22) / 2) * (15.25-(10.91)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 65) {
            xx = 15.25 + (((tickAnim - 24) / 41) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 24) / 41) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 41) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 73) {
            xx = 15.25 + (((tickAnim - 65) / 8) * (14.11685-(15.25)));
            yy = 0 + (((tickAnim - 65) / 8) * (-18.2168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (-6.28002-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 90) {
            xx = 14.11685 + (((tickAnim - 73) / 17) * (4.84745-(14.11685)));
            yy = -18.2168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25 + (((tickAnim - 73) / 17) * (-10.31241-(-18.2168+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*25)));
            zz = -6.28002 + (((tickAnim - 73) / 17) * (-3.84896-(-6.28002)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 4.84745 + (((tickAnim - 90) / 3) * (3.70974-(4.84745)));
            yy = -10.31241 + (((tickAnim - 90) / 3) * (-9.76861-(-10.31241)));
            zz = -3.84896 + (((tickAnim - 90) / 3) * (-3.68171-(-3.84896)));
        }
        else if (tickAnim >= 93 && tickAnim < 97) {
            xx = 3.70974 + (((tickAnim - 93) / 4) * (4.84745-(3.70974)));
            yy = -9.76861 + (((tickAnim - 93) / 4) * (-10.31241-(-9.76861)));
            zz = -3.68171 + (((tickAnim - 93) / 4) * (-3.84896-(-3.68171)));
        }
        else if (tickAnim >= 97 && tickAnim < 100) {
            xx = 4.84745 + (((tickAnim - 97) / 3) * (3.70974-(4.84745)));
            yy = -10.31241 + (((tickAnim - 97) / 3) * (-9.76861-(-10.31241)));
            zz = -3.84896 + (((tickAnim - 97) / 3) * (-3.68171-(-3.84896)));
        }
        else if (tickAnim >= 100 && tickAnim < 103) {
            xx = 3.70974 + (((tickAnim - 100) / 3) * (4.84745-(3.70974)));
            yy = -9.76861 + (((tickAnim - 100) / 3) * (-10.31241-(-9.76861)));
            zz = -3.68171 + (((tickAnim - 100) / 3) * (-3.84896-(-3.68171)));
        }
        else if (tickAnim >= 103 && tickAnim < 115) {
            xx = 4.84745 + (((tickAnim - 103) / 12) * (4.84745-(4.84745)));
            yy = -10.31241 + (((tickAnim - 103) / 12) * (-10.31241-(-10.31241)));
            zz = -3.84896 + (((tickAnim - 103) / 12) * (-3.84896-(-3.84896)));
        }
        else if (tickAnim >= 115 && tickAnim < 135) {
            xx = 4.84745 + (((tickAnim - 115) / 20) * (0-(4.84745)));
            yy = -10.31241 + (((tickAnim - 115) / 20) * (0-(-10.31241)));
            zz = -3.84896 + (((tickAnim - 115) / 20) * (0-(-3.84896)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 65 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 65) / 8) * (9-(0)));
            yy = 0 + (((tickAnim - 65) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 8) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 80) {
            xx = 9 + (((tickAnim - 73) / 7) * (0-(9)));
            yy = 0 + (((tickAnim - 73) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 41 && tickAnim < 44) {
            xx = 1 + (((tickAnim - 41) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 41) / 3) * (0.22-(1)));
            zz = 1 + (((tickAnim - 41) / 3) * (1-(1)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 1 + (((tickAnim - 44) / 4) * (1-(1)));
            yy = 0.22 + (((tickAnim - 44) / 4) * (1-(0.22)));
            zz = 1 + (((tickAnim - 44) / 4) * (1-(1)));
        }
        else if (tickAnim >= 48 && tickAnim < 65) {
            xx = 1 + (((tickAnim - 48) / 17) * (1-(1)));
            yy = 1 + (((tickAnim - 48) / 17) * (1-(1)));
            zz = 1 + (((tickAnim - 48) / 17) * (1-(1)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 1 + (((tickAnim - 65) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 65) / 3) * (0.22-(1)));
            zz = 1 + (((tickAnim - 65) / 3) * (1-(1)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 1 + (((tickAnim - 68) / 4) * (1-(1)));
            yy = 0.22 + (((tickAnim - 68) / 4) * (1-(0.22)));
            zz = 1 + (((tickAnim - 68) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTerrestrisuchus entity = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -28.48438 + (((tickAnim - 0) / 9) * (8.72396-(-28.48438)));
            yy = -11.78635 + (((tickAnim - 0) / 9) * (-0.01029-(-11.78635)));
            zz = 2.27041 + (((tickAnim - 0) / 9) * (-0.53518-(2.27041)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 8.72396 + (((tickAnim - 9) / 9) * (-34.98438-(8.72396)));
            yy = -0.01029 + (((tickAnim - 9) / 9) * (-11.78635-(-0.01029)));
            zz = -0.53518 + (((tickAnim - 9) / 9) * (2.27041-(-0.53518)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -34.98438 + (((tickAnim - 18) / 2) * (-28.48438-(-34.98438)));
            yy = -11.78635 + (((tickAnim - 18) / 2) * (-11.78635-(-11.78635)));
            zz = 2.27041 + (((tickAnim - 18) / 2) * (2.27041-(2.27041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -6 + (((tickAnim - 0) / 9) * (1.75-(-6)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 1.75 + (((tickAnim - 9) / 9) * (-12-(1.75)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -12 + (((tickAnim - 18) / 2) * (-6-(-12)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (1.81-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 1.81 + (((tickAnim - 14) / 4) * (0.675-(1.81)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.675 + (((tickAnim - 18) / 2) * (0-(0.675)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -2.25 + (((tickAnim - 0) / 9) * (39.5-(-2.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 39.5 + (((tickAnim - 9) / 5) * (-27.9-(39.5)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -27.9 + (((tickAnim - 14) / 3) * (-27.19-(-27.9)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = -27.19 + (((tickAnim - 17) / 1) * (-5.25-(-27.19)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.25 + (((tickAnim - 18) / 2) * (-2.25-(-5.25)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 36.7327 + (((tickAnim - 0) / 3) * (24.71469-(36.7327)));
            yy = 2.02647 + (((tickAnim - 0) / 3) * (1.4738-(2.02647)));
            zz = -0.97791 + (((tickAnim - 0) / 3) * (-0.71121-(-0.97791)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 24.71469 + (((tickAnim - 3) / 2) * (4.69668-(24.71469)));
            yy = 1.4738 + (((tickAnim - 3) / 2) * (0.92112-(1.4738)));
            zz = -0.71121 + (((tickAnim - 3) / 2) * (-0.4445-(-0.71121)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 4.69668 + (((tickAnim - 5) / 4) * (70-(4.69668)));
            yy = 0.92112 + (((tickAnim - 5) / 4) * (0-(0.92112)));
            zz = -0.4445 + (((tickAnim - 5) / 4) * (0-(-0.4445)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 70 + (((tickAnim - 9) / 5) * (92.81894-(70)));
            yy = 0 + (((tickAnim - 9) / 5) * (0.9353-(0)));
            zz = 0 + (((tickAnim - 9) / 5) * (-0.45134-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 92.81894 + (((tickAnim - 14) / 3) * (87.21055-(92.81894)));
            yy = 0.9353 + (((tickAnim - 14) / 3) * (1.40294-(0.9353)));
            zz = -0.45134 + (((tickAnim - 14) / 3) * (-0.67701-(-0.45134)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 87.21055 + (((tickAnim - 17) / 1) * (51.7327-(87.21055)));
            yy = 1.40294 + (((tickAnim - 17) / 1) * (2.02647-(1.40294)));
            zz = -0.67701 + (((tickAnim - 17) / 1) * (-0.97791-(-0.67701)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 51.7327 + (((tickAnim - 18) / 2) * (36.7327-(51.7327)));
            yy = 2.02647 + (((tickAnim - 18) / 2) * (2.02647-(2.02647)));
            zz = -0.97791 + (((tickAnim - 18) / 2) * (-0.97791-(-0.97791)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.895-(0)));
            zz = -0.375 + (((tickAnim - 0) / 1) * (-0.05-(-0.375)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.895 + (((tickAnim - 1) / 1) * (1.17-(0.895)));
            zz = -0.05 + (((tickAnim - 1) / 1) * (0.15-(-0.05)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.17 + (((tickAnim - 2) / 1) * (1.295-(1.17)));
            zz = 0.15 + (((tickAnim - 2) / 1) * (0.06-(0.15)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.295 + (((tickAnim - 3) / 0) * (1.44-(1.295)));
            zz = 0.06 + (((tickAnim - 3) / 0) * (0.295-(0.06)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.44 + (((tickAnim - 3) / 2) * (1.53-(1.44)));
            zz = 0.295 + (((tickAnim - 3) / 2) * (-0.02-(0.295)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 1.53 + (((tickAnim - 5) / 4) * (0.45-(1.53)));
            zz = -0.02 + (((tickAnim - 5) / 4) * (0-(-0.02)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            yy = 0.45 + (((tickAnim - 9) / 3) * (1.545-(0.45)));
            zz = 0 + (((tickAnim - 9) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.545 + (((tickAnim - 12) / 2) * (0.49-(1.545)));
            zz = -0.15 + (((tickAnim - 12) / 2) * (-0.32-(-0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0.49 + (((tickAnim - 14) / 4) * (0-(0.49)));
            zz = -0.32 + (((tickAnim - 14) / 4) * (-0.05-(-0.32)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = -0.05 + (((tickAnim - 18) / 2) * (-0.375-(-0.05)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 43.41323 + (((tickAnim - 0) / 9) * (-26.75-(43.41323)));
            yy = -4.27707 + (((tickAnim - 0) / 9) * (0-(-4.27707)));
            zz = 5.13016 + (((tickAnim - 0) / 9) * (0-(5.13016)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -26.75 + (((tickAnim - 9) / 11) * (43.41323-(-26.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (-4.27707-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (5.13016-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(0);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(-0.075);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(0.775);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -18.73986 + (((tickAnim - 0) / 5) * (-71.24436-(-18.73986)));
            yy = 3.58457 + (((tickAnim - 0) / 5) * (1.99143-(3.58457)));
            zz = 7.17129 + (((tickAnim - 0) / 5) * (3.98405-(7.17129)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -71.24436 + (((tickAnim - 5) / 4) * (-4.75-(-71.24436)));
            yy = 1.99143 + (((tickAnim - 5) / 4) * (0-(1.99143)));
            zz = 3.98405 + (((tickAnim - 5) / 4) * (0-(3.98405)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -4.75 + (((tickAnim - 9) / 11) * (-18.73986-(-4.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (3.58457-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (7.17129-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 3) / 6) * (0-(0)));
            yy = -0.075 + (((tickAnim - 3) / 6) * (-0.425-(-0.075)));
            zz = 0 + (((tickAnim - 3) / 6) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -0.425 + (((tickAnim - 9) / 11) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
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
            xx = 120.48244 + (((tickAnim - 0) / 3) * (98.30578-(120.48244)));
            yy = -0.35172 + (((tickAnim - 0) / 3) * (-0.27356-(-0.35172)));
            zz = 0.66265 + (((tickAnim - 0) / 3) * (0.51539-(0.66265)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 98.30578 + (((tickAnim - 3) / 2) * (121.12913-(98.30578)));
            yy = -0.27356 + (((tickAnim - 3) / 2) * (-0.1954-(-0.27356)));
            zz = 0.51539 + (((tickAnim - 3) / 2) * (0.36814-(0.51539)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 121.12913 + (((tickAnim - 5) / 3) * (80.20165-(121.12913)));
            yy = -0.1954 + (((tickAnim - 5) / 3) * (-0.07816-(-0.1954)));
            zz = 0.36814 + (((tickAnim - 5) / 3) * (0.14726-(0.36814)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 80.20165 + (((tickAnim - 8) / 1) * (32.5-(80.20165)));
            yy = -0.07816 + (((tickAnim - 8) / 1) * (0-(-0.07816)));
            zz = 0.14726 + (((tickAnim - 8) / 1) * (0-(0.14726)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 32.5 + (((tickAnim - 9) / 4) * (12.30501-(32.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.83231-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (-3.40007-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 12.30501 + (((tickAnim - 13) / 7) * (120.48244-(12.30501)));
            yy = 0.83231 + (((tickAnim - 13) / 7) * (-0.35172-(0.83231)));
            zz = -3.40007 + (((tickAnim - 13) / 7) * (0.66265-(-3.40007)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.665-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.665 + (((tickAnim - 3) / 2) * (0.475-(0.665)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 5) / 4) * (0-(0.475)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (0.33-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.33 + (((tickAnim - 10) / 1) * (0.615-(0.33)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.615 + (((tickAnim - 11) / 1) * (0.885-(0.615)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.885 + (((tickAnim - 12) / 1) * (1.025-(0.885)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            yy = 1.025 + (((tickAnim - 13) / 4) * (2.125-(1.025)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 2.125 + (((tickAnim - 17) / 3) * (0-(2.125)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(xx);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(yy);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*-1.5));


        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.5));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.15);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-0.1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-10), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*-15), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.5));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*3), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-20))*-1.5));



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11 + (((tickAnim - 0) / 5) * (23-(11)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 23 + (((tickAnim - 5) / 4) * (0-(23)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (11-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 9) / 6) * (0-(-1)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*-1.5), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-380))*-3), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*-1.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(2.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1.5), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-400))*3), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-40))*-1.5));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -26.75 + (((tickAnim - 0) / 12) * (43.41323-(-26.75)));
            yy = 0 + (((tickAnim - 0) / 12) * (4.2771-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-5.1302-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 43.41323 + (((tickAnim - 12) / 8) * (-26.75-(43.41323)));
            yy = 4.2771 + (((tickAnim - 12) / 8) * (0-(4.2771)));
            zz = -5.1302 + (((tickAnim - 12) / 8) * (0-(-5.1302)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(0);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(-0.075);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(0.775);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -5 + (((tickAnim - 0) / 12) * (-18.73986-(-5)));
            yy = 0 + (((tickAnim - 0) / 12) * (-3.5846-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-7.1713-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = -18.73986 + (((tickAnim - 12) / 4) * (-63.26513-(-18.73986)));
            yy = -3.5846 + (((tickAnim - 12) / 4) * (0.65145-(-3.5846)));
            zz = -7.1713 + (((tickAnim - 12) / 4) * (1.30328-(-7.1713)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -63.26513 + (((tickAnim - 16) / 4) * (-5-(-63.26513)));
            yy = 0.65145 + (((tickAnim - 16) / 4) * (0-(0.65145)));
            zz = 1.30328 + (((tickAnim - 16) / 4) * (0-(1.30328)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = -0.325 + (((tickAnim - 0) / 12) * (-0.35-(-0.325)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.05-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            yy = -0.35 + (((tickAnim - 12) / 8) * (-0.325-(-0.35)));
            zz = 0.05 + (((tickAnim - 12) / 8) * (0-(0.05)));
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
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 3) / 9) * (20.5-(0)));
            yy = 0 + (((tickAnim - 3) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 9) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 20.5 + (((tickAnim - 12) / 4) * (16.42-(20.5)));
            yy = 0 + (((tickAnim - 12) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 4) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 16.42 + (((tickAnim - 16) / 4) * (0-(16.42)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.95 + (((tickAnim - 0) / 6) * (0-(-0.95)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 6) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 14) * (-0.95-(0)));
            zz = 0 + (((tickAnim - 6) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 32.5 + (((tickAnim - 0) / 3) * (21.37873-(32.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.1436-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.12243-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 21.37873 + (((tickAnim - 3) / 3) * (0.41203-(21.37873)));
            yy = -1.1436 + (((tickAnim - 3) / 3) * (0.11438-(-1.1436)));
            zz = 2.12243 + (((tickAnim - 3) / 3) * (4.71953-(2.12243)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0.41203 + (((tickAnim - 6) / 6) * (120.48244-(0.41203)));
            yy = 0.11438 + (((tickAnim - 6) / 6) * (-0.35172-(0.11438)));
            zz = 4.71953 + (((tickAnim - 6) / 6) * (0.66265-(4.71953)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 120.48244 + (((tickAnim - 12) / 4) * (85.26675-(120.48244)));
            yy = -0.35172 + (((tickAnim - 12) / 4) * (-0.10433-(-0.35172)));
            zz = 0.66265 + (((tickAnim - 12) / 4) * (0.19657-(0.66265)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 85.26675 + (((tickAnim - 16) / 4) * (32.5-(85.26675)));
            yy = -0.10433 + (((tickAnim - 16) / 4) * (0-(-0.10433)));
            zz = 0.19657 + (((tickAnim - 16) / 4) * (0-(0.19657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.845-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.845 + (((tickAnim - 2) / 1) * (1.1-(0.845)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 1.1 + (((tickAnim - 3) / 0) * (1.145-(1.1)));
            zz = 0 + (((tickAnim - 3) / 0) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1.145 + (((tickAnim - 3) / 1) * (1.085-(1.145)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 1.085 + (((tickAnim - 4) / 1) * (0.9-(1.085)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 5) / 1) * (0.735-(0.9)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            yy = 0.735 + (((tickAnim - 6) / 6) * (0-(0.735)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (1.105-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.11-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.105 + (((tickAnim - 13) / 3) * (0.575-(1.105)));
            zz = -0.11 + (((tickAnim - 13) / 3) * (-0.275-(-0.11)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.575 + (((tickAnim - 16) / 4) * (0-(0.575)));
            zz = -0.275 + (((tickAnim - 16) / 4) * (0-(-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg4.rotationPointX = this.frontRightLeg4.rotationPointX + (float)(xx);
        this.frontRightLeg4.rotationPointY = this.frontRightLeg4.rotationPointY - (float)(yy);
        this.frontRightLeg4.rotationPointZ = this.frontRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 8.72396 + (((tickAnim - 0) / 7) * (-34.98438-(8.72396)));
            yy = -0.01029 + (((tickAnim - 0) / 7) * (11.7864-(-0.01029)));
            zz = -0.53518 + (((tickAnim - 0) / 7) * (2.27041-(-0.53518)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -34.98438 + (((tickAnim - 7) / 13) * (8.72396-(-34.98438)));
            yy = 11.7864 + (((tickAnim - 7) / 13) * (-0.01029-(11.7864)));
            zz = 2.27041 + (((tickAnim - 7) / 13) * (-0.53518-(2.27041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 1.75 + (((tickAnim - 0) / 7) * (-12-(1.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = -12 + (((tickAnim - 7) / 13) * (1.75-(-12)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 1.275 + (((tickAnim - 3) / 4) * (0-(1.275)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
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
            xx = 39.5 + (((tickAnim - 0) / 3) * (-37.03-(39.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -37.03 + (((tickAnim - 3) / 2) * (-31.71-(-37.03)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -31.71 + (((tickAnim - 5) / 2) * (16.5-(-31.71)));
            yy = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 16.5 + (((tickAnim - 7) / 3) * (-8.31-(16.5)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -8.31 + (((tickAnim - 10) / 10) * (39.5-(-8.31)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 70 + (((tickAnim - 0) / 1) * (107.88325-(70)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.25331-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (-0.12224-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 107.88325 + (((tickAnim - 1) / 2) * (77.14976-(107.88325)));
            yy = 0.25331 + (((tickAnim - 1) / 2) * (0.75993-(0.25331)));
            zz = -0.12224 + (((tickAnim - 1) / 2) * (-0.36672-(-0.12224)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 77.14976 + (((tickAnim - 3) / 2) * (78.14953-(77.14976)));
            yy = 0.75993 + (((tickAnim - 3) / 2) * (1.51985-(0.75993)));
            zz = -0.36672 + (((tickAnim - 3) / 2) * (-0.73343-(-0.36672)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 78.14953 + (((tickAnim - 5) / 2) * (33.2327-(78.14953)));
            yy = 1.51985 + (((tickAnim - 5) / 2) * (2.02647-(1.51985)));
            zz = -0.73343 + (((tickAnim - 5) / 2) * (-0.97791-(-0.73343)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 33.2327 + (((tickAnim - 7) / 3) * (42.47045-(33.2327)));
            yy = 2.02647 + (((tickAnim - 7) / 3) * (2.33822-(2.02647)));
            zz = -0.97791 + (((tickAnim - 7) / 3) * (-1.44789-(-0.97791)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 42.47045 + (((tickAnim - 10) / 5) * (6.39976-(42.47045)));
            yy = 2.33822 + (((tickAnim - 10) / 5) * (0.75993-(2.33822)));
            zz = -1.44789 + (((tickAnim - 10) / 5) * (-0.36672-(-1.44789)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 6.39976 + (((tickAnim - 15) / 5) * (70-(6.39976)));
            yy = 0.75993 + (((tickAnim - 15) / 5) * (0-(0.75993)));
            zz = -0.36672 + (((tickAnim - 15) / 5) * (0-(-0.36672)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.45 + (((tickAnim - 0) / 1) * (1.04-(0.45)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 1) / 6) * (0-(0)));
            yy = 1.04 + (((tickAnim - 1) / 6) * (0.275-(1.04)));
            zz = 0 + (((tickAnim - 1) / 6) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 7) / 1) * (0.435-(0.275)));
            zz = 0 + (((tickAnim - 7) / 1) * (0.04-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.435 + (((tickAnim - 8) / 2) * (0.15-(0.435)));
            zz = 0.04 + (((tickAnim - 8) / 2) * (0.075-(0.04)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0.15 + (((tickAnim - 10) / 1) * (0.49-(0.15)));
            zz = 0.075 + (((tickAnim - 10) / 1) * (-0.125-(0.075)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.49 + (((tickAnim - 11) / 2) * (0.965-(0.49)));
            zz = -0.125 + (((tickAnim - 11) / 2) * (0-(-0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.965 + (((tickAnim - 13) / 1) * (1.27-(0.965)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 14) / 1) * (0-(0)));
            yy = 1.27 + (((tickAnim - 14) / 1) * (1.105-(1.27)));
            zz = 0 + (((tickAnim - 14) / 1) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 1.105 + (((tickAnim - 15) / 3) * (1.73-(1.105)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.73 + (((tickAnim - 18) / 2) * (0.45-(1.73)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);


    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraTerrestrisuchus entity = (EntityPrehistoricFloraTerrestrisuchus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -24.5 + (((tickAnim - 0) / 4) * (47.67216-(-24.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-3.81853-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (4.49349-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 47.67216 + (((tickAnim - 4) / 6) * (-24.5-(47.67216)));
            yy = -3.81853 + (((tickAnim - 4) / 6) * (0-(-3.81853)));
            zz = 4.49349 + (((tickAnim - 4) / 6) * (0-(4.49349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(0);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(0);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(0.4);



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -20.75 + (((tickAnim - 0) / 4) * (-6.23986-(-20.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (3.58457-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (7.17129-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -6.23986 + (((tickAnim - 4) / 3) * (-81.63706-(-6.23986)));
            yy = 3.58457 + (((tickAnim - 4) / 3) * (2.04833-(3.58457)));
            zz = 7.17129 + (((tickAnim - 4) / 3) * (4.09788-(7.17129)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -81.63706 + (((tickAnim - 7) / 1) * (-70.19353-(-81.63706)));
            yy = 2.04833 + (((tickAnim - 7) / 1) * (1.02416-(2.04833)));
            zz = 4.09788 + (((tickAnim - 7) / 1) * (2.04894-(4.09788)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -70.19353 + (((tickAnim - 8) / 2) * (-20.75-(-70.19353)));
            yy = 1.02416 + (((tickAnim - 8) / 2) * (0-(1.02416)));
            zz = 2.04894 + (((tickAnim - 8) / 2) * (0-(2.04894)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.055-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 1) * (-0.35-(-0.35)));
            zz = 0.055 + (((tickAnim - 3) / 1) * (0.05-(0.055)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            yy = -0.35 + (((tickAnim - 4) / 3) * (-0.305-(-0.35)));
            zz = 0.05 + (((tickAnim - 4) / 3) * (0.03-(0.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.305 + (((tickAnim - 7) / 1) * (-0.305-(-0.305)));
            zz = 0.03 + (((tickAnim - 7) / 1) * (0.03-(0.03)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.305 + (((tickAnim - 8) / 2) * (0-(-0.305)));
            zz = 0.03 + (((tickAnim - 8) / 2) * (0-(0.03)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg2.rotationPointX = this.frontLeftLeg2.rotationPointX + (float)(xx);
        this.frontLeftLeg2.rotationPointY = this.frontLeftLeg2.rotationPointY - (float)(yy);
        this.frontLeftLeg2.rotationPointZ = this.frontLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 51.25 + (((tickAnim - 0) / 1) * (14.84649-(51.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.07034-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.13253-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 14.84649 + (((tickAnim - 1) / 1) * (10.07276-(14.84649)));
            yy = -0.07034 + (((tickAnim - 1) / 1) * (-0.26002-(-0.07034)));
            zz = 0.13253 + (((tickAnim - 1) / 1) * (-2.233-(0.13253)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 10.07276 + (((tickAnim - 2) / 2) * (120.48244-(10.07276)));
            yy = -0.26002 + (((tickAnim - 2) / 2) * (-0.35172-(-0.26002)));
            zz = -2.233 + (((tickAnim - 2) / 2) * (0.66265-(-2.233)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 120.48244 + (((tickAnim - 4) / 3) * (112.77568-(120.48244)));
            yy = -0.35172 + (((tickAnim - 4) / 3) * (-0.20098-(-0.35172)));
            zz = 0.66265 + (((tickAnim - 4) / 3) * (0.37866-(0.66265)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 112.77568 + (((tickAnim - 7) / 1) * (99.38784-(112.77568)));
            yy = -0.20098 + (((tickAnim - 7) / 1) * (-0.10049-(-0.20098)));
            zz = 0.37866 + (((tickAnim - 7) / 1) * (0.18933-(0.37866)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 99.38784 + (((tickAnim - 8) / 2) * (51.25-(99.38784)));
            yy = -0.10049 + (((tickAnim - 8) / 2) * (0-(-0.10049)));
            zz = 0.18933 + (((tickAnim - 8) / 2) * (0-(0.18933)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg4, frontLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 0) / 1) * (0.675-(0.675)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.675 + (((tickAnim - 1) / 1) * (0.41-(0.675)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.41 + (((tickAnim - 2) / 1) * (0.725-(0.41)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.725 + (((tickAnim - 3) / 1) * (0-(0.725)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.925-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (-0.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 6) / 4) * (0.8-(0.925)));
            zz = -0.1 + (((tickAnim - 6) / 4) * (-0.55-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg4.rotationPointX = this.frontLeftLeg4.rotationPointX + (float)(xx);
        this.frontLeftLeg4.rotationPointY = this.frontLeftLeg4.rotationPointY - (float)(yy);
        this.frontLeftLeg4.rotationPointZ = this.frontLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 21.25 + (((tickAnim - 0) / 3) * (-66.47113-(21.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-4.8254-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.13207-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -66.47113 + (((tickAnim - 3) / 2) * (-51.38937-(-66.47113)));
            yy = -4.8254 + (((tickAnim - 3) / 2) * (-9.475-(-4.8254)));
            zz = -0.13207 + (((tickAnim - 3) / 2) * (-3.2404-(-0.13207)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -51.38937 + (((tickAnim - 5) / 5) * (21.25-(-51.38937)));
            yy = -9.475 + (((tickAnim - 5) / 5) * (0-(-9.475)));
            zz = -3.2404 + (((tickAnim - 5) / 5) * (0-(-3.2404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.75 + (((tickAnim - 0) / 3) * (27.25-(23.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 27.25 + (((tickAnim - 3) / 2) * (-13-(27.25)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -13 + (((tickAnim - 5) / 5) * (23.75-(-13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.955-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.265-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.955 + (((tickAnim - 2) / 1) * (-0.15-(0.955)));
            zz = -0.265 + (((tickAnim - 2) / 1) * (-0.175-(-0.265)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 2) * (-0.75-(-0.15)));
            zz = -0.175 + (((tickAnim - 3) / 2) * (0-(-0.175)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.75 + (((tickAnim - 5) / 3) * (0.93-(-0.75)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.93 + (((tickAnim - 8) / 2) * (0-(0.93)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 19.75 + (((tickAnim - 0) / 2) * (-35.76-(19.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -35.76 + (((tickAnim - 2) / 1) * (-32.77-(-35.76)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -32.77 + (((tickAnim - 3) / 2) * (6.75-(-32.77)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 6.75 + (((tickAnim - 5) / 1) * (-10.08-(6.75)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = -10.08 + (((tickAnim - 6) / 1) * (-14.76-(-10.08)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -14.76 + (((tickAnim - 7) / 3) * (19.75-(-14.76)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 114.25 + (((tickAnim - 0) / 2) * (109.54-(114.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 109.54 + (((tickAnim - 2) / 1) * (111.9-(109.54)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 111.9 + (((tickAnim - 3) / 3) * (47.74772-(111.9)));
            yy = 0 + (((tickAnim - 3) / 3) * (3.41669-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-2.15295-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 47.74772 + (((tickAnim - 6) / 1) * (51.08-(47.74772)));
            yy = 3.41669 + (((tickAnim - 6) / 1) * (0-(3.41669)));
            zz = -2.15295 + (((tickAnim - 6) / 1) * (0-(-2.15295)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 51.08 + (((tickAnim - 7) / 1) * (48.79-(51.08)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 48.79 + (((tickAnim - 8) / 0) * (32-(48.79)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32 + (((tickAnim - 8) / 2) * (114.25-(32)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg4, backLeftLeg4.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg4.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 2) / 4) * (0-(0.475)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.275-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 1.275 + (((tickAnim - 8) / 0) * (1.525-(1.275)));
            zz = -0.35 + (((tickAnim - 8) / 0) * (0-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 8) / 2) * (0-(1.525)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg4.rotationPointX = this.backLeftLeg4.rotationPointX + (float)(xx);
        this.backLeftLeg4.rotationPointY = this.backLeftLeg4.rotationPointY - (float)(yy);
        this.backLeftLeg4.rotationPointZ = this.backLeftLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 19.75 + (((tickAnim - 5) / 2) * (23.9153-(19.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (2.39195-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-1.44608-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 23.9153 + (((tickAnim - 7) / 3) * (0-(23.9153)));
            yy = 2.39195 + (((tickAnim - 7) / 3) * (0-(2.39195)));
            zz = -1.44608 + (((tickAnim - 7) / 3) * (0-(-1.44608)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = -0.925 + (((tickAnim - 0) / 3) * (1.04-(-0.925)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.04 + (((tickAnim - 3) / 2) * (0-(1.04)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.025-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.65 + (((tickAnim - 7) / 3) * (-0.925-(-0.65)));
            zz = -0.025 + (((tickAnim - 7) / 3) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*10), main.rotateAngleY + (float) Math.toRadians(0), main.rotateAngleZ + (float) Math.toRadians(0));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*1.1);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*-8), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+100))*-5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+150))*15), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+180))*25), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*-10), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+50))*-5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-3.75+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+320))*-5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5+300))*5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 21.25 + (((tickAnim - 0) / 3) * (-66.47113-(21.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (4.8254-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.1321-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -66.47113 + (((tickAnim - 3) / 3) * (-51.38937-(-66.47113)));
            yy = 4.8254 + (((tickAnim - 3) / 3) * (9.47503-(4.8254)));
            zz = 0.1321 + (((tickAnim - 3) / 3) * (3.24037-(0.1321)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -51.38937 + (((tickAnim - 6) / 4) * (21.25-(-51.38937)));
            yy = 9.47503 + (((tickAnim - 6) / 4) * (0-(9.47503)));
            zz = 3.24037 + (((tickAnim - 6) / 4) * (0-(3.24037)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23.75 + (((tickAnim - 0) / 3) * (27.25-(23.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 27.25 + (((tickAnim - 3) / 3) * (-13-(27.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -13 + (((tickAnim - 6) / 4) * (23.75-(-13)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.955-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-0.265-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.955 + (((tickAnim - 2) / 1) * (-0.15-(0.955)));
            zz = -0.265 + (((tickAnim - 2) / 1) * (-0.175-(-0.265)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 3) / 3) * (-0.75-(-0.15)));
            zz = -0.175 + (((tickAnim - 3) / 3) * (0-(-0.175)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.75 + (((tickAnim - 6) / 2) * (0.93-(-0.75)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.93 + (((tickAnim - 8) / 2) * (0-(0.93)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
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
            xx = 19.75 + (((tickAnim - 0) / 2) * (-35.76-(19.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -35.76 + (((tickAnim - 2) / 1) * (-32.77-(-35.76)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -32.77 + (((tickAnim - 3) / 2) * (-15.78-(-32.77)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = -15.78 + (((tickAnim - 5) / 1) * (23-(-15.78)));
            yy = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 23 + (((tickAnim - 6) / 1) * (-1.08-(23)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -1.08 + (((tickAnim - 7) / 1) * (-16.01-(-1.08)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -16.01 + (((tickAnim - 8) / 2) * (19.75-(-16.01)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 114.25 + (((tickAnim - 0) / 2) * (109.54-(114.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 109.54 + (((tickAnim - 2) / 1) * (111.9-(109.54)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 111.9 + (((tickAnim - 3) / 3) * (47.74772-(111.9)));
            yy = 0 + (((tickAnim - 3) / 3) * (3.41669-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (-2.15295-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 47.74772 + (((tickAnim - 6) / 1) * (51.08-(47.74772)));
            yy = 3.41669 + (((tickAnim - 6) / 1) * (0-(3.41669)));
            zz = -2.15295 + (((tickAnim - 6) / 1) * (0-(-2.15295)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 51.08 + (((tickAnim - 7) / 1) * (48.79-(51.08)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 48.79 + (((tickAnim - 8) / 0) * (32-(48.79)));
            yy = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 0) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 32 + (((tickAnim - 8) / 2) * (114.25-(32)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg4, backRightLeg4.rotateAngleX + (float) Math.toRadians(xx), backRightLeg4.rotateAngleY + (float) Math.toRadians(yy), backRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 2) / 4) * (0-(0)));
            yy = 0.475 + (((tickAnim - 2) / 4) * (0-(0.475)));
            zz = 0 + (((tickAnim - 2) / 4) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (-0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 0) * (1.875-(0)));
            zz = -0.35 + (((tickAnim - 8) / 0) * (0-(-0.35)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.875 + (((tickAnim - 8) / 2) * (0-(1.875)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg4.rotationPointX = this.backRightLeg4.rotationPointX + (float)(xx);
        this.backRightLeg4.rotationPointY = this.backRightLeg4.rotationPointY - (float)(yy);
        this.backRightLeg4.rotationPointZ = this.backRightLeg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -27.47728 + (((tickAnim - 0) / 5) * (43.419-(-27.47728)));
            yy = 0.04597 + (((tickAnim - 0) / 5) * (1.36993-(0.04597)));
            zz = -0.09265 + (((tickAnim - 0) / 5) * (-2.76121-(-0.09265)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 43.419 + (((tickAnim - 5) / 5) * (-27.47728-(43.419)));
            yy = 1.36993 + (((tickAnim - 5) / 5) * (0.04597-(1.36993)));
            zz = -2.76121 + (((tickAnim - 5) / 5) * (-0.09265-(-2.76121)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));

        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(0);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(0);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(0.4);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -20.75 + (((tickAnim - 0) / 5) * (-12.23986-(-20.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.5846-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-7.1713-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = -12.23986 + (((tickAnim - 5) / 2) * (-81.63706-(-12.23986)));
            yy = -3.5846 + (((tickAnim - 5) / 2) * (2.04833-(-3.5846)));
            zz = -7.1713 + (((tickAnim - 5) / 2) * (4.09788-(-7.1713)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = -81.63706 + (((tickAnim - 7) / 1) * (-70.19353-(-81.63706)));
            yy = 2.04833 + (((tickAnim - 7) / 1) * (1.02416-(2.04833)));
            zz = 4.09788 + (((tickAnim - 7) / 1) * (2.04894-(4.09788)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -70.19353 + (((tickAnim - 8) / 2) * (-20.75-(-70.19353)));
            yy = 1.02416 + (((tickAnim - 8) / 2) * (0-(1.02416)));
            zz = 2.04894 + (((tickAnim - 8) / 2) * (0-(2.04894)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.27-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.04-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.27 + (((tickAnim - 2) / 1) * (-0.35-(0.27)));
            zz = 0.04 + (((tickAnim - 2) / 1) * (0.055-(0.04)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 0) * (-0.35-(-0.35)));
            zz = 0.055 + (((tickAnim - 3) / 0) * (0.055-(0.055)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 3) / 1) * (-0.35-(-0.35)));
            zz = 0.055 + (((tickAnim - 3) / 1) * (0.05-(0.055)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = -0.35 + (((tickAnim - 4) / 1) * (-0.35-(-0.35)));
            zz = 0.05 + (((tickAnim - 4) / 1) * (0.05-(0.05)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.35 + (((tickAnim - 5) / 2) * (-0.305-(-0.35)));
            zz = 0.05 + (((tickAnim - 5) / 2) * (0.03-(0.05)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = -0.305 + (((tickAnim - 7) / 1) * (-0.305-(-0.305)));
            zz = 0.03 + (((tickAnim - 7) / 1) * (0.03-(0.03)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.305 + (((tickAnim - 8) / 2) * (0-(-0.305)));
            zz = 0.03 + (((tickAnim - 8) / 2) * (0-(0.03)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 19.75 + (((tickAnim - 5) / 2) * (23.9153-(19.75)));
            yy = 0 + (((tickAnim - 5) / 2) * (2.39195-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-1.44608-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 23.9153 + (((tickAnim - 7) / 3) * (0-(23.9153)));
            yy = 2.39195 + (((tickAnim - 7) / 3) * (0-(2.39195)));
            zz = -1.44608 + (((tickAnim - 7) / 3) * (0-(-1.44608)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.925 + (((tickAnim - 0) / 5) * (0-(-0.925)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 2) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 5) / 2) * (-0.025-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.65 + (((tickAnim - 7) / 3) * (-0.925-(-0.65)));
            zz = -0.025 + (((tickAnim - 7) / 3) * (0-(-0.025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 44 + (((tickAnim - 0) / 1) * (31.53912-(44)));
            yy = 0 + (((tickAnim - 0) / 1) * (-0.00546-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.01028-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 31.53912 + (((tickAnim - 1) / 1) * (13.85986-(31.53912)));
            yy = -0.00546 + (((tickAnim - 1) / 1) * (-1.25093-(-0.00546)));
            zz = 0.01028 + (((tickAnim - 1) / 1) * (1.38395-(0.01028)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 13.85986 + (((tickAnim - 2) / 1) * (1.78197-(13.85986)));
            yy = -1.25093 + (((tickAnim - 2) / 1) * (-0.54356-(-1.25093)));
            zz = 1.38395 + (((tickAnim - 2) / 1) * (3.22569-(1.38395)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 1.78197 + (((tickAnim - 3) / 1) * (120.48244-(1.78197)));
            yy = -0.54356 + (((tickAnim - 3) / 1) * (-0.35172-(-0.54356)));
            zz = 3.22569 + (((tickAnim - 3) / 1) * (0.66265-(3.22569)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 120.48244 + (((tickAnim - 4) / 1) * (120.48244-(120.48244)));
            yy = -0.35172 + (((tickAnim - 4) / 1) * (-0.35172-(-0.35172)));
            zz = 0.66265 + (((tickAnim - 4) / 1) * (0.66265-(0.66265)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 120.48244 + (((tickAnim - 5) / 2) * (112.77568-(120.48244)));
            yy = -0.35172 + (((tickAnim - 5) / 2) * (-0.20098-(-0.35172)));
            zz = 0.66265 + (((tickAnim - 5) / 2) * (0.37866-(0.66265)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 112.77568 + (((tickAnim - 7) / 1) * (99.38784-(112.77568)));
            yy = -0.20098 + (((tickAnim - 7) / 1) * (-0.10049-(-0.20098)));
            zz = 0.37866 + (((tickAnim - 7) / 1) * (0.18933-(0.37866)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 99.38784 + (((tickAnim - 8) / 2) * (44-(99.38784)));
            yy = -0.10049 + (((tickAnim - 8) / 2) * (0-(-0.10049)));
            zz = 0.18933 + (((tickAnim - 8) / 2) * (0-(0.18933)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg4, frontRightLeg4.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg4.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.825-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.825 + (((tickAnim - 1) / 1) * (0.535-(0.825)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.535 + (((tickAnim - 2) / 1) * (0.92-(0.535)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 0.92 + (((tickAnim - 3) / 1) * (0-(0.92)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 1) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 5) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 1) * (0.925-(0)));
            zz = 0 + (((tickAnim - 5) / 1) * (-0.1-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.925 + (((tickAnim - 6) / 4) * (0.4-(0.925)));
            zz = -0.1 + (((tickAnim - 6) / 4) * (-0.55-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg4.rotationPointX = this.frontRightLeg4.rotationPointX + (float)(xx);
        this.frontRightLeg4.rotationPointY = this.frontRightLeg4.rotationPointY - (float)(yy);
        this.frontRightLeg4.rotationPointZ = this.frontRightLeg4.rotationPointZ + (float)(zz);



    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraTerrestrisuchus e = (EntityPrehistoricFloraTerrestrisuchus) entity;
        animator.update(entity);

            animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
            animator.startKeyframe(5);
            animator.rotate(this.neck2, (float) Math.toRadians(8), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.jaw, (float) -Math.toRadians(36), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(5);
            animator.startKeyframe(2);
            animator.rotate(this.neck2, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.rotate(this.head, (float) Math.toRadians(2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
            animator.endKeyframe();
            animator.setStaticKeyframe(4);
            animator.resetKeyframe(4);

    }
}
