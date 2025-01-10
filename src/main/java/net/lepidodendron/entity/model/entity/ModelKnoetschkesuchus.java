package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKnoetschkesuchus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKnoetschkesuchus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer backLeftLeg;
    private final AdvancedModelRenderer backLeftLeg2;
    private final AdvancedModelRenderer backLeftLeg3;
    private final AdvancedModelRenderer backRightLeg;
    private final AdvancedModelRenderer backRightLeg2;
    private final AdvancedModelRenderer backRightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer eye;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer frontLeftLeg;
    private final AdvancedModelRenderer frontLeftLeg2;
    private final AdvancedModelRenderer frontLeftLeg3;
    private final AdvancedModelRenderer frontRightLeg;
    private final AdvancedModelRenderer frontRightLeg2;
    private final AdvancedModelRenderer frontRightLeg3;

    private ModelAnimator animator;

    public ModelKnoetschkesuchus() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.5F, 15.975F, 5.0F);
        this.main.cubeList.add(new ModelBox(main, 25, 0, -2.5F, -1.0F, -1.0F, 4, 4, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 8, 23, 0.0F, -1.5F, 0.0F, 0, 1, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 8, 23, -1.0F, -1.5F, 0.0F, 0, 1, 4, 0.0F, true));

        this.backLeftLeg = new AdvancedModelRenderer(this);
        this.backLeftLeg.setRotationPoint(1.25F, 0.25F, 1.5F);
        this.main.addChild(backLeftLeg);
        this.setRotateAngle(backLeftLeg, -0.1843F, 0.0779F, -0.2502F);
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 33, 40, -1.0231F, -0.3496F, -1.0F, 2, 5, 2, 0.0F, false));
        this.backLeftLeg.cubeList.add(new ModelBox(backLeftLeg, 0, 0, -1.0231F, -0.3496F, -1.5F, 2, 5, 1, -0.001F, false));

        this.backLeftLeg2 = new AdvancedModelRenderer(this);
        this.backLeftLeg2.setRotationPoint(0.2269F, 3.9504F, -0.675F);
        this.backLeftLeg.addChild(backLeftLeg2);
        this.setRotateAngle(backLeftLeg2, 0.6789F, 0.0F, 0.2174F);
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 27, 42, -0.75F, 0.0F, -0.8F, 1, 5, 1, -0.001F, false));
        this.backLeftLeg2.cubeList.add(new ModelBox(backLeftLeg2, 0, 13, -0.75F, 0.0F, -0.3F, 1, 5, 1, 0.0F, false));

        this.backLeftLeg3 = new AdvancedModelRenderer(this);
        this.backLeftLeg3.setRotationPoint(-0.3157F, 4.7962F, 0.0403F);
        this.backLeftLeg2.addChild(backLeftLeg3);
        this.setRotateAngle(backLeftLeg3, -0.5353F, -0.1325F, 0.1192F);
        this.backLeftLeg3.cubeList.add(new ModelBox(backLeftLeg3, 22, 38, -1.4029F, -0.0091F, -2.9495F, 3, 0, 3, 0.0F, false));

        this.backRightLeg = new AdvancedModelRenderer(this);
        this.backRightLeg.setRotationPoint(-2.25F, 0.25F, 1.5F);
        this.main.addChild(backRightLeg);
        this.setRotateAngle(backRightLeg, -0.1843F, -0.0779F, 0.2502F);
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 33, 40, -0.9769F, -0.3496F, -1.0F, 2, 5, 2, 0.0F, true));
        this.backRightLeg.cubeList.add(new ModelBox(backRightLeg, 0, 0, -0.9769F, -0.3496F, -1.5F, 2, 5, 1, -0.001F, true));

        this.backRightLeg2 = new AdvancedModelRenderer(this);
        this.backRightLeg2.setRotationPoint(-0.2269F, 3.9504F, -0.675F);
        this.backRightLeg.addChild(backRightLeg2);
        this.setRotateAngle(backRightLeg2, 0.6789F, 0.0F, -0.2174F);
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 27, 42, -0.25F, 0.0F, -0.8F, 1, 5, 1, -0.001F, true));
        this.backRightLeg2.cubeList.add(new ModelBox(backRightLeg2, 0, 13, -0.25F, 0.0F, -0.3F, 1, 5, 1, 0.0F, true));

        this.backRightLeg3 = new AdvancedModelRenderer(this);
        this.backRightLeg3.setRotationPoint(0.3157F, 4.7962F, 0.0403F);
        this.backRightLeg2.addChild(backRightLeg3);
        this.setRotateAngle(backRightLeg3, -0.5353F, 0.1325F, -0.1192F);
        this.backRightLeg3.cubeList.add(new ModelBox(backRightLeg3, 22, 38, -1.5971F, -0.0091F, -2.9495F, 3, 0, 3, 0.0F, true));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -0.875F, 3.5F);
        this.main.addChild(tail);
        this.setRotateAngle(tail, -0.2182F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 13, 17, -1.5F, 0.0F, 0.0F, 3, 3, 6, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 38, 25, 0.5F, -0.55F, 0.8F, 0, 1, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 38, 25, -0.5F, -0.55F, 0.8F, 0, 1, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.075F, 5.5F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.2182F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 13, -1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -0.025F, 3.5F);
        this.tail2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 30, -0.5F, -0.55F, -2.725F, 0, 1, 6, 0.0F, true));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 24, 30, 0.5F, -0.55F, -2.725F, 0, 1, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.125F, 6.75F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 32, 33, -0.5F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 37, 0.0F, -0.5F, 0.25F, 0, 1, 5, 0.0F, false));
        this.tail3.cubeList.add(new ModelBox(tail3, 16, 37, 0.0F, -0.5F, 0.25F, 0, 1, 5, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 4.75F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 26, 10, -0.5F, -0.5F, 0.0F, 1, 1, 6, -0.01F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 16, 0.0F, -1.0F, 0.75F, 0, 1, 5, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 36, 16, 0.0F, -1.0F, 0.75F, 0, 1, 5, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.5F, -0.2F, -0.8F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -1.0398F, -6.6609F, 5, 5, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 23, 1.0F, -1.3898F, -6.6609F, 0, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 23, -1.0F, -1.3898F, -6.6609F, 0, 1, 7, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.2898F, -6.6609F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, -0.0567F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 15, 27, -2.0F, -0.4883F, -2.7781F, 4, 4, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.2883F, -1.2781F);
        this.body2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, -0.5F, -0.575F, -1.0F, 0, 1, 2, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 32, 0.5F, -0.575F, -1.0F, 0, 1, 2, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 0.6117F, -2.5281F);
        this.body2.addChild(neck2);
        this.setRotateAngle(neck2, -0.2618F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 28, 23, -1.5F, -1.0209F, -3.5441F, 3, 2, 4, -0.01F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 42, 16, 0.5F, -1.3209F, -3.3191F, 0, 1, 3, -0.01F, false));
        this.neck2.cubeList.add(new ModelBox(neck2, 42, 16, -0.5F, -1.3209F, -3.3191F, 0, 1, 3, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, 0.9791F, -3.0441F);
        this.neck2.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2225F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 51, 19, -0.5F, -1.4361F, 1.4329F, 2, 1, 3, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 16, -0.5F, -0.4361F, -1.5671F, 2, 1, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0369F, -1.0241F, -3.4645F);
        this.neck2.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 40, 32, -1.5369F, 0.6032F, -1.9296F, 3, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 4, 0.2131F, 0.8532F, -6.0796F, 0, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 32, -0.5369F, 0.6032F, -6.1796F, 1, 1, 5, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 21, 4, -0.2869F, 0.8532F, -6.0796F, 0, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5369F, 2.1032F, -1.4296F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.2618F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 42, 0.1F, -1.25F, -3.5F, 0, 1, 3, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 10, -0.125F, -1.5F, -4.475F, 1, 1, 4, -0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.4631F, 2.0032F, -1.4296F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 10, -0.875F, -1.4F, -4.475F, 1, 1, 4, -0.001F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 42, -0.1F, -1.15F, -3.5F, 0, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.4631F, 0.0677F, -1.9735F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.288F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 44, 10, -1.0F, -0.01F, -1.9965F, 1, 1, 2, -0.001F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5369F, 0.5032F, -1.3296F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 13, -0.5F, -0.5F, -0.6F, 2, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.2396F, 1.5366F, 0.0716F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0349F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 0, -1.7765F, -0.3333F, -2.0011F, 3, 1, 2, -0.001F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 26, 18, -1.2765F, -1.3333F, -2.0011F, 2, 2, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 8, 35, -0.7765F, -0.3333F, -6.2511F, 1, 1, 5, -0.002F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 4, 0.0235F, -0.5833F, -6.1511F, 0, 1, 1, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 18, 4, -0.5765F, -0.5833F, -6.1511F, 0, 1, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.7765F, 0.1667F, -1.5011F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, 0.125F, -0.75F, -3.5F, 0, 1, 3, 0.0F, true));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 39, -0.125F, -0.5F, -4.475F, 1, 1, 4, -0.003F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.2235F, 0.1667F, -1.5011F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.2618F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 23, -0.125F, -0.75F, -3.5F, 0, 1, 3, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 39, -0.875F, -0.5F, -4.475F, 1, 1, 4, -0.003F, false));

        this.eye = new AdvancedModelRenderer(this);
        this.eye.setRotationPoint(-0.0369F, 0.7385F, -2.0211F);
        this.head.addChild(eye);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.4909F, -0.2353F, -0.2769F);
        this.eye.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0086F, -0.0017F, 0.0771F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 17, -0.65F, -0.25F, -0.225F, 1, 1, 1, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.4909F, -0.2353F, -0.2769F);
        this.eye.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0086F, 0.0017F, -0.0771F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 17, -0.35F, -0.25F, -0.225F, 1, 1, 1, 0.0F, false));

        this.frontLeftLeg = new AdvancedModelRenderer(this);
        this.frontLeftLeg.setRotationPoint(2.0F, 1.5617F, -1.7781F);
        this.body2.addChild(frontLeftLeg);
        this.setRotateAngle(frontLeftLeg, 0.5672F, 0.0F, 0.0F);
        this.frontLeftLeg.cubeList.add(new ModelBox(frontLeftLeg, 42, 40, -1.0F, 0.8403F, -0.9356F, 2, 3, 2, 0.0F, false));

        this.frontLeftLeg2 = new AdvancedModelRenderer(this);
        this.frontLeftLeg2.setRotationPoint(0.0F, 2.8901F, 0.2956F);
        this.frontLeftLeg.addChild(frontLeftLeg2);
        this.setRotateAngle(frontLeftLeg2, -0.7418F, 0.0F, 0.0F);
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 31, 30, -0.5F, 0.25F, -0.5F, 1, 4, 1, 0.0F, false));
        this.frontLeftLeg2.cubeList.add(new ModelBox(frontLeftLeg2, 44, 4, -0.5F, 0.25F, -0.1F, 1, 4, 1, -0.001F, false));

        this.frontLeftLeg3 = new AdvancedModelRenderer(this);
        this.frontLeftLeg3.setRotationPoint(0.0F, 4.1F, -0.15F);
        this.frontLeftLeg2.addChild(frontLeftLeg3);
        this.setRotateAngle(frontLeftLeg3, 0.1309F, 0.0F, 0.0F);
        this.frontLeftLeg3.cubeList.add(new ModelBox(frontLeftLeg3, 39, 0, -1.5F, 0.0102F, -2.3073F, 3, 0, 3, 0.0F, false));

        this.frontRightLeg = new AdvancedModelRenderer(this);
        this.frontRightLeg.setRotationPoint(-2.0F, 1.5617F, -1.7781F);
        this.body2.addChild(frontRightLeg);
        this.setRotateAngle(frontRightLeg, 0.5672F, 0.0F, 0.0F);
        this.frontRightLeg.cubeList.add(new ModelBox(frontRightLeg, 42, 40, -1.0F, 0.8403F, -0.9356F, 2, 3, 2, 0.0F, true));

        this.frontRightLeg2 = new AdvancedModelRenderer(this);
        this.frontRightLeg2.setRotationPoint(0.0F, 2.8901F, 0.2956F);
        this.frontRightLeg.addChild(frontRightLeg2);
        this.setRotateAngle(frontRightLeg2, -0.7418F, 0.0F, 0.0F);
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 31, 30, -0.5F, 0.25F, -0.5F, 1, 4, 1, 0.0F, true));
        this.frontRightLeg2.cubeList.add(new ModelBox(frontRightLeg2, 44, 4, -0.5F, 0.25F, -0.1F, 1, 4, 1, -0.001F, true));

        this.frontRightLeg3 = new AdvancedModelRenderer(this);
        this.frontRightLeg3.setRotationPoint(0.0F, 4.1F, -0.15F);
        this.frontRightLeg2.addChild(frontRightLeg3);
        this.setRotateAngle(frontRightLeg3, 0.1309F, 0.0F, 0.0F);
        this.frontRightLeg3.cubeList.add(new ModelBox(frontRightLeg3, 39, 0, -1.5F, 0.0102F, -2.3073F, 3, 0, 3, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.neck2.offsetZ = -0.25F;
        this.neck2.offsetY = -0.0F;
        this.neck2.offsetX = -0.0F;
        this.neck2.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(main, 0.05F, 0.0F, 0.1F);
        this.setRotateAngle(body, 0.05F, 0.25F, -0.05F);
        this.setRotateAngle(body2, -0.05F, 0.1F, -0.05F);
        this.setRotateAngle(neck2, 0.0F, 0.35F, -0.05F);
        this.setRotateAngle(head, -0.1F, 0.1F, 0.1F);
        this.setRotateAngle(jaw, 0.4F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg2, -1.1F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg3, 1.7F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 1.0F, -0.2F, 0.0F);
        this.setRotateAngle(frontRightLeg2, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg3, 1.8F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, -0.0F, 0.0F, -0.1F);
        this.setRotateAngle(backLeftLeg2, 0.6F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, -0.35F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, -0.4F, 0.25F, 0.0F);
        this.setRotateAngle(backRightLeg2, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, 0.0F, 0.0F, 0.0F);
        this.main.offsetY = 0.05F;
        this.main.offsetX = 0.015F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.30F;
        this.main.offsetX = 1.2F;
        this.main.rotateAngleY = (float)Math.toRadians(130);
        this.main.rotateAngleX = (float)Math.toRadians(0);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 2.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(main, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontLeftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(frontRightLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backLeftLeg3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(backRightLeg3, 0.0F, 0.0F, 0.0F);
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

        EntityPrehistoricFloraKnoetschkesuchus proteros = (EntityPrehistoricFloraKnoetschkesuchus) e;

        this.faceTarget(f3, f4, 10, neck2);
        this.faceTarget(f3, f4, 10, head);

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck2, this.head};
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
        EntityPrehistoricFloraKnoetschkesuchus ee = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;

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
        EntityPrehistoricFloraKnoetschkesuchus entity = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-27.27912-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.47459-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.61903-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -27.27912 + (((tickAnim - 10) / 10) * (25.22088-(-27.27912)));
            yy = -7.47459 + (((tickAnim - 10) / 10) * (-7.47459-(-7.47459)));
            zz = 0.61903 + (((tickAnim - 10) / 10) * (0.61903-(0.61903)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 25.22088 + (((tickAnim - 20) / 10) * (-27.27912-(25.22088)));
            yy = -7.47459 + (((tickAnim - 20) / 10) * (-7.47459-(-7.47459)));
            zz = 0.61903 + (((tickAnim - 20) / 10) * (0.61903-(0.61903)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -27.27912 + (((tickAnim - 30) / 10) * (25.22088-(-27.27912)));
            yy = -7.47459 + (((tickAnim - 30) / 10) * (-7.47459-(-7.47459)));
            zz = 0.61903 + (((tickAnim - 30) / 10) * (0.61903-(0.61903)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25.22088 + (((tickAnim - 40) / 10) * (0-(25.22088)));
            yy = -7.47459 + (((tickAnim - 40) / 10) * (0-(-7.47459)));
            zz = 0.61903 + (((tickAnim - 40) / 10) * (0-(0.61903)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -7.75 + (((tickAnim - 10) / 10) * (27-(-7.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 27 + (((tickAnim - 20) / 10) * (-7.75-(27)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -7.75 + (((tickAnim - 30) / 10) * (27-(-7.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 27 + (((tickAnim - 40) / 10) * (0-(27)));
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
            yy = 0 + (((tickAnim - 0) / 5) * (0.95-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 5) / 5) * (0-(0.95)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 15) * (1.275-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.275 + (((tickAnim - 25) / 5) * (0-(1.275)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 5) * (33.13-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 33.13 + (((tickAnim - 5) / 5) * (45.25-(33.13)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 45.25 + (((tickAnim - 10) / 1) * (32.64153-(45.25)));
            yy = 0 + (((tickAnim - 10) / 1) * (-0.01773-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (-0.12483-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 32.64153 + (((tickAnim - 11) / 1) * (22.53306-(32.64153)));
            yy = -0.01773 + (((tickAnim - 11) / 1) * (-0.03547-(-0.01773)));
            zz = -0.12483 + (((tickAnim - 11) / 1) * (-0.24967-(-0.12483)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 22.53306 + (((tickAnim - 12) / 1) * (14.88207-(22.53306)));
            yy = -0.03547 + (((tickAnim - 12) / 1) * (-0.50625-(-0.03547)));
            zz = -0.24967 + (((tickAnim - 12) / 1) * (-1.88619-(-0.24967)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 14.88207 + (((tickAnim - 13) / 0) * (6.76653-(14.88207)));
            yy = -0.50625 + (((tickAnim - 13) / 0) * (-0.01773-(-0.50625)));
            zz = -1.88619 + (((tickAnim - 13) / 0) * (-0.12483-(-1.88619)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 6.76653 + (((tickAnim - 13) / 2) * (-0.5-(6.76653)));
            yy = -0.01773 + (((tickAnim - 13) / 2) * (0-(-0.01773)));
            zz = -0.12483 + (((tickAnim - 13) / 2) * (0-(-0.12483)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -0.5 + (((tickAnim - 15) / 5) * (79.25-(-0.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 79.25 + (((tickAnim - 20) / 5) * (29-(79.25)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 29 + (((tickAnim - 25) / 5) * (45.25-(29)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 31) {
            xx = 45.25 + (((tickAnim - 30) / 1) * (32.64153-(45.25)));
            yy = 0 + (((tickAnim - 30) / 1) * (-0.01773-(0)));
            zz = 0 + (((tickAnim - 30) / 1) * (-0.12483-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 32) {
            xx = 32.64153 + (((tickAnim - 31) / 1) * (22.53306-(32.64153)));
            yy = -0.01773 + (((tickAnim - 31) / 1) * (-0.03547-(-0.01773)));
            zz = -0.12483 + (((tickAnim - 31) / 1) * (-0.24967-(-0.12483)));
        }
        else if (tickAnim >= 32 && tickAnim < 33) {
            xx = 22.53306 + (((tickAnim - 32) / 1) * (14.88207-(22.53306)));
            yy = -0.03547 + (((tickAnim - 32) / 1) * (-0.50625-(-0.03547)));
            zz = -0.24967 + (((tickAnim - 32) / 1) * (-1.88619-(-0.24967)));
        }
        else if (tickAnim >= 33 && tickAnim < 33) {
            xx = 14.88207 + (((tickAnim - 33) / 0) * (6.76653-(14.88207)));
            yy = -0.50625 + (((tickAnim - 33) / 0) * (-0.01773-(-0.50625)));
            zz = -1.88619 + (((tickAnim - 33) / 0) * (-0.12483-(-1.88619)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 6.76653 + (((tickAnim - 33) / 2) * (-0.5-(6.76653)));
            yy = -0.01773 + (((tickAnim - 33) / 2) * (0-(-0.01773)));
            zz = -0.12483 + (((tickAnim - 33) / 2) * (0-(-0.12483)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.5 + (((tickAnim - 35) / 5) * (79.25-(-0.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 79.25 + (((tickAnim - 40) / 10) * (0-(79.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0.625-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0.625 + (((tickAnim - 25) / 15) * (0-(0.625)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 5) * (1.305-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0.5-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            yy = 1.305 + (((tickAnim - 45) / 5) * (0-(1.305)));
            zz = 0.5 + (((tickAnim - 45) / 5) * (0-(0.5)));
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
        EntityPrehistoricFloraKnoetschkesuchus entity = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = 7.5 + (((tickAnim - 10) / 11) * (0-(7.5)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 21) {
            xx = -18.25 + (((tickAnim - 10) / 11) * (0-(-18.25)));
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
        EntityPrehistoricFloraKnoetschkesuchus entity = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 35) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 27) * (0-(0)));
            zz = 0.25 + (((tickAnim - 35) / 27) * (0.25-(0.25)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 0.25 + (((tickAnim - 62) / 18) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (1.25-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            zz = 1.25 + (((tickAnim - 35) / 7) * (1.25-(1.25)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            zz = 1.25 + (((tickAnim - 42) / 6) * (1.25-(1.25)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 1.25 + (((tickAnim - 48) / 7) * (1.25-(1.25)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            zz = 1.25 + (((tickAnim - 55) / 7) * (1.25-(1.25)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 1.25 + (((tickAnim - 62) / 18) * (0-(1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (15.68298-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-10.86868-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (5.52036-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 15.68298 + (((tickAnim - 35) / 3) * (15.34671-(15.68298)));
            yy = -10.86868 + (((tickAnim - 35) / 3) * (-10.8844-(-10.86868)));
            zz = 5.52036 + (((tickAnim - 35) / 3) * (7.3023-(5.52036)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 15.34671 + (((tickAnim - 38) / 4) * (15.68298-(15.34671)));
            yy = -10.8844 + (((tickAnim - 38) / 4) * (-10.86868-(-10.8844)));
            zz = 7.3023 + (((tickAnim - 38) / 4) * (5.52036-(7.3023)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 15.68298 + (((tickAnim - 42) / 3) * (15.34671-(15.68298)));
            yy = -10.86868 + (((tickAnim - 42) / 3) * (-10.8844-(-10.86868)));
            zz = 5.52036 + (((tickAnim - 42) / 3) * (7.3023-(5.52036)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 15.34671 + (((tickAnim - 45) / 3) * (15.68298-(15.34671)));
            yy = -10.8844 + (((tickAnim - 45) / 3) * (-10.86868-(-10.8844)));
            zz = 7.3023 + (((tickAnim - 45) / 3) * (5.52036-(7.3023)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 15.68298 + (((tickAnim - 48) / 4) * (15.34671-(15.68298)));
            yy = -10.86868 + (((tickAnim - 48) / 4) * (-10.8844-(-10.86868)));
            zz = 5.52036 + (((tickAnim - 48) / 4) * (7.3023-(5.52036)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 15.34671 + (((tickAnim - 52) / 3) * (15.68298-(15.34671)));
            yy = -10.8844 + (((tickAnim - 52) / 3) * (-10.86868-(-10.8844)));
            zz = 7.3023 + (((tickAnim - 52) / 3) * (5.52036-(7.3023)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 15.68298 + (((tickAnim - 55) / 3) * (15.34671-(15.68298)));
            yy = -10.86868 + (((tickAnim - 55) / 3) * (-10.8844-(-10.86868)));
            zz = 5.52036 + (((tickAnim - 55) / 3) * (7.3023-(5.52036)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 15.34671 + (((tickAnim - 58) / 4) * (15.68298-(15.34671)));
            yy = -10.8844 + (((tickAnim - 58) / 4) * (-10.86868-(-10.8844)));
            zz = 7.3023 + (((tickAnim - 58) / 4) * (5.52036-(7.3023)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 15.68298 + (((tickAnim - 62) / 18) * (0-(15.68298)));
            yy = -10.86868 + (((tickAnim - 62) / 18) * (0-(-10.86868)));
            zz = 5.52036 + (((tickAnim - 62) / 18) * (0-(5.52036)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-0.80694-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-9.19174-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (5.55458-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -0.80694 + (((tickAnim - 35) / 3) * (-1.87325-(-0.80694)));
            yy = -9.19174 + (((tickAnim - 35) / 3) * (-10.9329-(-9.19174)));
            zz = 5.55458 + (((tickAnim - 35) / 3) * (11.65127-(5.55458)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -1.87325 + (((tickAnim - 38) / 4) * (-0.80694-(-1.87325)));
            yy = -10.9329 + (((tickAnim - 38) / 4) * (-9.19174-(-10.9329)));
            zz = 11.65127 + (((tickAnim - 38) / 4) * (5.55458-(11.65127)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -0.80694 + (((tickAnim - 42) / 3) * (-1.87325-(-0.80694)));
            yy = -9.19174 + (((tickAnim - 42) / 3) * (-10.9329-(-9.19174)));
            zz = 5.55458 + (((tickAnim - 42) / 3) * (11.65127-(5.55458)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -1.87325 + (((tickAnim - 45) / 3) * (-0.80694-(-1.87325)));
            yy = -10.9329 + (((tickAnim - 45) / 3) * (-9.19174-(-10.9329)));
            zz = 11.65127 + (((tickAnim - 45) / 3) * (5.55458-(11.65127)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -0.80694 + (((tickAnim - 48) / 4) * (-1.87325-(-0.80694)));
            yy = -9.19174 + (((tickAnim - 48) / 4) * (-10.9329-(-9.19174)));
            zz = 5.55458 + (((tickAnim - 48) / 4) * (11.65127-(5.55458)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -1.87325 + (((tickAnim - 52) / 3) * (-0.80694-(-1.87325)));
            yy = -10.9329 + (((tickAnim - 52) / 3) * (-9.19174-(-10.9329)));
            zz = 11.65127 + (((tickAnim - 52) / 3) * (5.55458-(11.65127)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -0.80694 + (((tickAnim - 55) / 3) * (-1.87325-(-0.80694)));
            yy = -9.19174 + (((tickAnim - 55) / 3) * (-10.9329-(-9.19174)));
            zz = 5.55458 + (((tickAnim - 55) / 3) * (11.65127-(5.55458)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -1.87325 + (((tickAnim - 58) / 4) * (-0.80694-(-1.87325)));
            yy = -10.9329 + (((tickAnim - 58) / 4) * (-9.19174-(-10.9329)));
            zz = 11.65127 + (((tickAnim - 58) / 4) * (5.55458-(11.65127)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -0.80694 + (((tickAnim - 62) / 18) * (0-(-0.80694)));
            yy = -9.19174 + (((tickAnim - 62) / 18) * (0-(-9.19174)));
            zz = 5.55458 + (((tickAnim - 62) / 18) * (0-(5.55458)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 62 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 62) / 6) * (10.25-(0)));
            yy = 0 + (((tickAnim - 62) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 6) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 10.25 + (((tickAnim - 68) / 5) * (0-(10.25)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-44.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -44.75 + (((tickAnim - 35) / 3) * (-54-(-44.75)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -54 + (((tickAnim - 38) / 4) * (-44.75-(-54)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -44.75 + (((tickAnim - 42) / 3) * (-54-(-44.75)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -54 + (((tickAnim - 45) / 3) * (-44.75-(-54)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -44.75 + (((tickAnim - 48) / 4) * (-54-(-44.75)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -54 + (((tickAnim - 52) / 3) * (-44.75-(-54)));
            yy = 0 + (((tickAnim - 52) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 3) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -44.75 + (((tickAnim - 55) / 3) * (-54-(-44.75)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -54 + (((tickAnim - 58) / 4) * (-44.75-(-54)));
            yy = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -44.75 + (((tickAnim - 62) / 18) * (0-(-44.75)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.6-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 35) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 35) / 7) * (0.3-(0.3)));
            zz = 0.6 + (((tickAnim - 35) / 7) * (0.6-(0.6)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 42) / 6) * (0-(0)));
            yy = 0.3 + (((tickAnim - 42) / 6) * (0.3-(0.3)));
            zz = 0.6 + (((tickAnim - 42) / 6) * (0.6-(0.6)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 48) / 7) * (0.3-(0.3)));
            zz = 0.6 + (((tickAnim - 48) / 7) * (0.6-(0.6)));
        }
        else if (tickAnim >= 55 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 55) / 7) * (0-(0)));
            yy = 0.3 + (((tickAnim - 55) / 7) * (0.3-(0.3)));
            zz = 0.6 + (((tickAnim - 55) / 7) * (0.6-(0.6)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            yy = 0.3 + (((tickAnim - 62) / 18) * (0-(0.3)));
            zz = 0.6 + (((tickAnim - 62) / 18) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-33.98923-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (3.22745-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0.3824-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = -33.98923 + (((tickAnim - 35) / 3) * (-27.98923-(-33.98923)));
            yy = 3.22745 + (((tickAnim - 35) / 3) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 35) / 3) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = -27.98923 + (((tickAnim - 38) / 4) * (-33.98923-(-27.98923)));
            yy = 3.22745 + (((tickAnim - 38) / 4) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 38) / 4) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = -33.98923 + (((tickAnim - 42) / 3) * (-27.98923-(-33.98923)));
            yy = 3.22745 + (((tickAnim - 42) / 3) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 42) / 3) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = -27.98923 + (((tickAnim - 45) / 3) * (-33.98923-(-27.98923)));
            yy = 3.22745 + (((tickAnim - 45) / 3) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 45) / 3) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = -33.98923 + (((tickAnim - 48) / 4) * (-27.98923-(-33.98923)));
            yy = 3.22745 + (((tickAnim - 48) / 4) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 48) / 4) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = -27.98923 + (((tickAnim - 52) / 3) * (-33.98923-(-27.98923)));
            yy = 3.22745 + (((tickAnim - 52) / 3) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 52) / 3) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = -33.98923 + (((tickAnim - 55) / 3) * (-27.98923-(-33.98923)));
            yy = 3.22745 + (((tickAnim - 55) / 3) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 55) / 3) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = -27.98923 + (((tickAnim - 58) / 4) * (-33.98923-(-27.98923)));
            yy = 3.22745 + (((tickAnim - 58) / 4) * (3.22745-(3.22745)));
            zz = 0.3824 + (((tickAnim - 58) / 4) * (0.3824-(0.3824)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = -33.98923 + (((tickAnim - 62) / 18) * (0-(-33.98923)));
            yy = 3.22745 + (((tickAnim - 62) / 18) * (0-(3.22745)));
            zz = 0.3824 + (((tickAnim - 62) / 18) * (0-(0.3824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (18.86-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 18.86 + (((tickAnim - 7) / 11) * (64.25-(18.86)));
            yy = 0 + (((tickAnim - 7) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 11) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 64.25 + (((tickAnim - 18) / 17) * (21.5-(64.25)));
            yy = 0 + (((tickAnim - 18) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 17) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 21.5 + (((tickAnim - 35) / 3) * (63.25-(21.5)));
            yy = 0 + (((tickAnim - 35) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 42) {
            xx = 63.25 + (((tickAnim - 38) / 4) * (21.5-(63.25)));
            yy = 0 + (((tickAnim - 38) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 4) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 21.5 + (((tickAnim - 42) / 3) * (63.25-(21.5)));
            yy = 0 + (((tickAnim - 42) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 3) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 48) {
            xx = 63.25 + (((tickAnim - 45) / 3) * (21.5-(63.25)));
            yy = 0 + (((tickAnim - 45) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 3) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 52) {
            xx = 21.5 + (((tickAnim - 48) / 4) * (63.25-(21.5)));
            yy = 0 + (((tickAnim - 48) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 4) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 55) {
            xx = 63.25 + (((tickAnim - 52) / 3) * (21.5-(63.25)));
            yy = 0 + (((tickAnim - 52) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 3) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 58) {
            xx = 21.5 + (((tickAnim - 55) / 3) * (63.25-(21.5)));
            yy = 0 + (((tickAnim - 55) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 3) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 62) {
            xx = 63.25 + (((tickAnim - 58) / 4) * (21.5-(63.25)));
            yy = 0 + (((tickAnim - 58) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 4) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 21.5 + (((tickAnim - 62) / 18) * (0-(21.5)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 62) {
            xx = 0 + (((tickAnim - 35) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 27) * (0-(0)));
            zz = -1.5 + (((tickAnim - 35) / 27) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 62 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 62) / 18) * (0-(0)));
            zz = -1.5 + (((tickAnim - 62) / 18) * (0-(-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 35 && tickAnim < 47) {
            xx = 1 + (((tickAnim - 35) / 12) * (1-(1)));
            yy = 1 + (((tickAnim - 35) / 12) * (0.555-(1)));
            zz = 1 + (((tickAnim - 35) / 12) * (1-(1)));
        }
        else if (tickAnim >= 47 && tickAnim < 55) {
            xx = 1 + (((tickAnim - 47) / 8) * (1-(1)));
            yy = 0.555 + (((tickAnim - 47) / 8) * (0.555-(0.555)));
            zz = 1 + (((tickAnim - 47) / 8) * (1-(1)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 1 + (((tickAnim - 55) / 4) * (1-(1)));
            yy = 0.555 + (((tickAnim - 55) / 4) * (0.29-(0.555)));
            zz = 1 + (((tickAnim - 55) / 4) * (1-(1)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 1 + (((tickAnim - 59) / 4) * (1-(1)));
            yy = 0.29 + (((tickAnim - 59) / 4) * (0.555-(0.29)));
            zz = 1 + (((tickAnim - 59) / 4) * (1-(1)));
        }
        else if (tickAnim >= 63 && tickAnim < 80) {
            xx = 1 + (((tickAnim - 63) / 17) * (1-(1)));
            yy = 0.555 + (((tickAnim - 63) / 17) * (1-(0.555)));
            zz = 1 + (((tickAnim - 63) / 17) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKnoetschkesuchus entity = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -14.5 + (((tickAnim - 15) / 20) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 35) / 15) * (0-(-14.5)));
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
            yy = 0 + (((tickAnim - 0) / 15) * (-2.475-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -2.475 + (((tickAnim - 15) / 20) * (-2.475-(-2.475)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -2.475 + (((tickAnim - 35) / 15) * (0-(-2.475)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-32.94874-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-16.15806-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.40479-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -32.94874 + (((tickAnim - 15) / 20) * (-32.94874-(-32.94874)));
            yy = -16.15806 + (((tickAnim - 15) / 20) * (-16.15806-(-16.15806)));
            zz = 2.40479 + (((tickAnim - 15) / 20) * (2.40479-(2.40479)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -32.94874 + (((tickAnim - 35) / 15) * (0-(-32.94874)));
            yy = -16.15806 + (((tickAnim - 35) / 15) * (0-(-16.15806)));
            zz = 2.40479 + (((tickAnim - 35) / 15) * (0-(2.40479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (50.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 50.25 + (((tickAnim - 15) / 20) * (50.25-(50.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 50.25 + (((tickAnim - 35) / 15) * (0-(50.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.57-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.2 + (((tickAnim - 8) / 7) * (0-(0.2)));
            zz = -0.57 + (((tickAnim - 8) / 7) * (-0.75-(-0.57)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.75 + (((tickAnim - 15) / 20) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.75 + (((tickAnim - 35) / 15) * (0-(-0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg2.rotationPointX = this.backLeftLeg2.rotationPointX + (float)(xx);
        this.backLeftLeg2.rotationPointY = this.backLeftLeg2.rotationPointY - (float)(yy);
        this.backLeftLeg2.rotationPointZ = this.backLeftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 8) / 42) * (0-(2.5)));
            yy = 0 + (((tickAnim - 8) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 42) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 3) / 5) * (0.225-(0.375)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 4) * (0.175-(0.225)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 12) / 3) * (0-(0.175)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0.44-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0.44 + (((tickAnim - 40) / 3) * (0.4-(0.44)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 43) / 4) * (0.35-(0.4)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 47) / 3) * (0-(0.35)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-32.94874-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (16.1581-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.4048-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -32.94874 + (((tickAnim - 15) / 20) * (-32.94874-(-32.94874)));
            yy = 16.1581 + (((tickAnim - 15) / 20) * (16.1581-(16.1581)));
            zz = -2.4048 + (((tickAnim - 15) / 20) * (-2.4048-(-2.4048)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -32.94874 + (((tickAnim - 35) / 15) * (0-(-32.94874)));
            yy = 16.1581 + (((tickAnim - 35) / 15) * (0-(16.1581)));
            zz = -2.4048 + (((tickAnim - 35) / 15) * (0-(-2.4048)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (50.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 50.25 + (((tickAnim - 15) / 20) * (50.25-(50.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 50.25 + (((tickAnim - 35) / 15) * (0-(50.25)));
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
            zz = 0 + (((tickAnim - 0) / 15) * (-0.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -0.75 + (((tickAnim - 15) / 20) * (-0.75-(-0.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -0.75 + (((tickAnim - 35) / 15) * (0-(-0.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 15) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 35) / 15) * (0-(2.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.51-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.51 + (((tickAnim - 3) / 5) * (0.575-(0.51)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 7) * (0-(0.575)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0.39-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            yy = 0.39 + (((tickAnim - 40) / 3) * (0.4-(0.39)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 43) / 4) * (0-(0)));
            yy = 0.4 + (((tickAnim - 43) / 4) * (0.425-(0.4)));
            zz = 0 + (((tickAnim - 43) / 4) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 47) / 3) * (0-(0)));
            yy = 0.425 + (((tickAnim - 47) / 3) * (0-(0.425)));
            zz = 0 + (((tickAnim - 47) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);




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
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 26 + (((tickAnim - 15) / 20) * (26-(26)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 26 + (((tickAnim - 35) / 15) * (0-(26)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));



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




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12.75 + (((tickAnim - 15) / 20) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12.75 + (((tickAnim - 35) / 15) * (0-(12.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 15) / 20) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 35) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.5 + (((tickAnim - 15) / 20) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 35) / 15) * (0-(10.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -28 + (((tickAnim - 15) / 20) * (-28-(-28)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28 + (((tickAnim - 35) / 15) * (0-(-28)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 17.75 + (((tickAnim - 15) / 20) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 35) / 15) * (0-(17.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.5 + (((tickAnim - 15) / 20) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 35) / 15) * (0-(10.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-28-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -28 + (((tickAnim - 15) / 20) * (-28-(-28)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -28 + (((tickAnim - 35) / 15) * (0-(-28)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 17.75 + (((tickAnim - 15) / 20) * (17.75-(17.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 17.75 + (((tickAnim - 35) / 15) * (0-(17.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKnoetschkesuchus entity = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (18-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 18 + (((tickAnim - 7) / 13) * (0-(18)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 16.25 + (((tickAnim - 7) / 5) * (29.25-(16.25)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (22-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 12) {
            xx = 22 + (((tickAnim - 7) / 5) * (0-(22)));
            yy = 0 + (((tickAnim - 7) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 1 + (((tickAnim - 0) / 3) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 3) * (0.2775-(1)));
            zz = 1 + (((tickAnim - 0) / 3) * (1-(1)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 1 + (((tickAnim - 3) / 4) * (1-(1)));
            yy = 0.2775 + (((tickAnim - 3) / 4) * (1-(0.2775)));
            zz = 1 + (((tickAnim - 3) / 4) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eye.setScale((float)xx, (float)yy, (float)zz);

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKnoetschkesuchus entity = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*1), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-30))*7), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-30))*3));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-0.2);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*0.35);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*-0.2);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 30.5 + (((tickAnim - 0) / 3) * (1.64805-(30.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (-10.47249-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.30785-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.64805 + (((tickAnim - 3) / 2) * (-31.15375-(1.64805)));
            yy = -10.47249 + (((tickAnim - 3) / 2) * (-10.24276-(-10.47249)));
            zz = -1.30785 + (((tickAnim - 3) / 2) * (10.73349-(-1.30785)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -31.15375 + (((tickAnim - 5) / 8) * (30.5-(-31.15375)));
            yy = -10.24276 + (((tickAnim - 5) / 8) * (0-(-10.24276)));
            zz = 10.73349 + (((tickAnim - 5) / 8) * (0-(10.73349)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5 + (((tickAnim - 0) / 3) * (-11.54472-(27.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.6756-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.27684-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = -11.54472 + (((tickAnim - 3) / 0) * (-18.74076-(-11.54472)));
            yy = 0.6756 + (((tickAnim - 3) / 0) * (1.1823-(0.6756)));
            zz = -1.27684 + (((tickAnim - 3) / 0) * (-2.23448-(-1.27684)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -18.74076 + (((tickAnim - 3) / 2) * (-9.69281-(-18.74076)));
            yy = 1.1823 + (((tickAnim - 3) / 2) * (5.33014-(1.1823)));
            zz = -2.23448 + (((tickAnim - 3) / 2) * (-9.63503-(-2.23448)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -9.69281 + (((tickAnim - 5) / 8) * (27.5-(-9.69281)));
            yy = 5.33014 + (((tickAnim - 5) / 8) * (0-(5.33014)));
            zz = -9.63503 + (((tickAnim - 5) / 8) * (0-(-9.63503)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (2.065-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 3) / 0) * (0-(0)));
            yy = 2.065 + (((tickAnim - 3) / 0) * (0.45-(2.065)));
            zz = -0.125 + (((tickAnim - 3) / 0) * (0-(-0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 3) / 2) * (0.5-(0.45)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 0.5 + (((tickAnim - 5) / 8) * (0.25-(0.5)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
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
            xx = 87 + (((tickAnim - 0) / 3) * (63.06266-(87)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.08498-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.81453-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
            xx = 63.06266 + (((tickAnim - 3) / 0) * (25.79716-(63.06266)));
            yy = -1.08498 + (((tickAnim - 3) / 0) * (-1.89871-(-1.08498)));
            zz = -2.81453 + (((tickAnim - 3) / 0) * (-4.92543-(-2.81453)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 25.79716 + (((tickAnim - 3) / 2) * (49.70349-(25.79716)));
            yy = -1.89871 + (((tickAnim - 3) / 2) * (-2.4412-(-1.89871)));
            zz = -4.92543 + (((tickAnim - 3) / 2) * (-6.3327-(-4.92543)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 49.70349 + (((tickAnim - 5) / 3) * (3.5721-(49.70349)));
            yy = -2.4412 + (((tickAnim - 5) / 3) * (-1.46472-(-2.4412)));
            zz = -6.3327 + (((tickAnim - 5) / 3) * (-3.79962-(-6.3327)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 3.5721 + (((tickAnim - 8) / 2) * (0.90116-(3.5721)));
            yy = -1.46472 + (((tickAnim - 8) / 2) * (-0.81373-(-1.46472)));
            zz = -3.79962 + (((tickAnim - 8) / 2) * (-2.1109-(-3.79962)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.90116 + (((tickAnim - 10) / 3) * (87-(0.90116)));
            yy = -0.81373 + (((tickAnim - 10) / 3) * (0-(-0.81373)));
            zz = -2.1109 + (((tickAnim - 10) / 3) * (0-(-2.1109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.375-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = 0.9 + (((tickAnim - 1) / 2) * (0.7-(0.9)));
            zz = 0.375 + (((tickAnim - 1) / 2) * (0-(0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 2) * (-0.225-(0.7)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 5) / 2) * (0.07-(-0.225)));
            zz = 0 + (((tickAnim - 5) / 2) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.07 + (((tickAnim - 7) / 1) * (0-(0.07)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
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
            xx = -21.66153 + (((tickAnim - 0) / 5) * (30.5-(-21.66153)));
            yy = 5.49487 + (((tickAnim - 0) / 5) * (0-(5.49487)));
            zz = -6.66061 + (((tickAnim - 0) / 5) * (0-(-6.66061)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = 30.5 + (((tickAnim - 5) / 6) * (-29.91153-(30.5)));
            yy = 0 + (((tickAnim - 5) / 6) * (5.49487-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (-6.66061-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -29.91153 + (((tickAnim - 11) / 2) * (-21.66153-(-29.91153)));
            yy = 5.49487 + (((tickAnim - 11) / 2) * (5.49487-(5.49487)));
            zz = -6.66061 + (((tickAnim - 11) / 2) * (-6.66061-(-6.66061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 6.71188 + (((tickAnim - 0) / 5) * (27.5-(6.71188)));
            yy = -1.52013 + (((tickAnim - 0) / 5) * (0-(-1.52013)));
            zz = 2.87292 + (((tickAnim - 0) / 5) * (0-(2.87292)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 27.5 + (((tickAnim - 5) / 3) * (1.18475-(27.5)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.60805-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (1.14917-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 1.18475 + (((tickAnim - 8) / 2) * (-17.6305-(1.18475)));
            yy = -0.60805 + (((tickAnim - 8) / 2) * (-1.2161-(-0.60805)));
            zz = 1.14917 + (((tickAnim - 8) / 2) * (2.29833-(1.14917)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -17.6305 + (((tickAnim - 10) / 1) * (-2.28812-(-17.6305)));
            yy = -1.2161 + (((tickAnim - 10) / 1) * (-1.52013-(-1.2161)));
            zz = 2.29833 + (((tickAnim - 10) / 1) * (2.87292-(2.29833)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -2.28812 + (((tickAnim - 11) / 2) * (6.71188-(-2.28812)));
            yy = -1.52013 + (((tickAnim - 11) / 2) * (-1.52013-(-1.52013)));
            zz = 2.87292 + (((tickAnim - 11) / 2) * (2.87292-(2.87292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 5) * (0.25-(0.2)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 5) / 3) * (1.35-(0.25)));
            zz = 0 + (((tickAnim - 5) / 3) * (-0.275-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.35 + (((tickAnim - 8) / 3) * (0-(1.35)));
            zz = -0.275 + (((tickAnim - 8) / 3) * (0-(-0.275)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.2-(0)));
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




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.70349 + (((tickAnim - 0) / 3) * (17.89083-(19.70349)));
            yy = -2.44122 + (((tickAnim - 0) / 3) * (-1.35623-(-2.44122)));
            zz = 6.33272 + (((tickAnim - 0) / 3) * (3.51818-(6.33272)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.89083 + (((tickAnim - 3) / 2) * (87-(17.89083)));
            yy = -1.35623 + (((tickAnim - 3) / 2) * (0-(-1.35623)));
            zz = 3.51818 + (((tickAnim - 3) / 2) * (0-(3.51818)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 87 + (((tickAnim - 5) / 3) * (40.1314-(87)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.97649-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (2.53309-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 40.1314 + (((tickAnim - 8) / 2) * (21.34613-(40.1314)));
            yy = -0.97649 + (((tickAnim - 8) / 2) * (-1.95298-(-0.97649)));
            zz = 2.53309 + (((tickAnim - 8) / 2) * (5.06618-(2.53309)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 21.34613 + (((tickAnim - 10) / 1) * (35.95349-(21.34613)));
            yy = -1.95298 + (((tickAnim - 10) / 1) * (-2.44122-(-1.95298)));
            zz = 5.06618 + (((tickAnim - 10) / 1) * (6.33272-(5.06618)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 35.95349 + (((tickAnim - 11) / 2) * (19.70349-(35.95349)));
            yy = -2.44122 + (((tickAnim - 11) / 2) * (-2.44122-(-2.44122)));
            zz = 6.33272 + (((tickAnim - 11) / 2) * (6.33272-(6.33272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.075 + (((tickAnim - 0) / 1) * (-0.295-(-0.075)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 1) / 2) * (0-(0)));
            yy = -0.295 + (((tickAnim - 1) / 2) * (0-(-0.295)));
            zz = 0 + (((tickAnim - 1) / 2) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.61-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.55-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0.61 + (((tickAnim - 8) / 2) * (0-(0.61)));
            zz = 0.55 + (((tickAnim - 8) / 2) * (0-(0.55)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 1) * (0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 11) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 11) / 1) * (0.325-(0.275)));
            zz = 0 + (((tickAnim - 11) / 1) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.325 + (((tickAnim - 12) / 1) * (-0.075-(0.325)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-80))*5), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-30))*4));
        this.tail.rotationPointX = this.tail.rotationPointX + (float)(0);
        this.tail.rotationPointY = this.tail.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5+4))*0.05);
        this.tail.rotationPointZ = this.tail.rotationPointZ + (float)(0);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*10), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-30))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-190))*15), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-30))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-250))*20), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-30))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-170))*10), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575+30))*-3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-50))*0.15);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-130))*-10), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575+70))*-4));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-90))*0.2);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(0);


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(13+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-50))*2), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*7), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575+90))*5));
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(0);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5-130))*0.05);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(0);


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-11), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-230))*-7), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -48.19858 + (((tickAnim - 0) / 7) * (31.19565-(-48.19858)));
            yy = 1.28797 + (((tickAnim - 0) / 7) * (10.8955-(1.28797)));
            zz = 4.57243 + (((tickAnim - 0) / 7) * (-3.7094-(4.57243)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 31.19565 + (((tickAnim - 7) / 2) * (-5.93801-(31.19565)));
            yy = 10.8955 + (((tickAnim - 7) / 2) * (15.00357-(10.8955)));
            zz = -3.7094 + (((tickAnim - 7) / 2) * (-18.70824-(-3.7094)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -5.93801 + (((tickAnim - 9) / 4) * (-48.19858-(-5.93801)));
            yy = 15.00357 + (((tickAnim - 9) / 4) * (1.28797-(15.00357)));
            zz = -18.70824 + (((tickAnim - 9) / 4) * (4.57243-(-18.70824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0.525 + (((tickAnim - 0) / 7) * (0-(0.525)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.525-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg.rotationPointX = this.frontLeftLeg.rotationPointX + (float)(xx);
        this.frontLeftLeg.rotationPointY = this.frontLeftLeg.rotationPointY - (float)(yy);
        this.frontLeftLeg.rotationPointZ = this.frontLeftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 20.75 + (((tickAnim - 0) / 7) * (8-(20.75)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 8 + (((tickAnim - 7) / 3) * (-36.37-(8)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -36.37 + (((tickAnim - 10) / 1) * (-21.81-(-36.37)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -21.81 + (((tickAnim - 11) / 2) * (20.75-(-21.81)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0.55-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0.55 + (((tickAnim - 10) / 3) * (0-(0.55)));
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
            xx = 26.75 + (((tickAnim - 0) / 2) * (11.63-(26.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 11.63 + (((tickAnim - 2) / 1) * (-2.16-(11.63)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.16 + (((tickAnim - 3) / 4) * (84.25-(-2.16)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 84.25 + (((tickAnim - 7) / 3) * (92.25-(84.25)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 92.25 + (((tickAnim - 10) / 1) * (71-(92.25)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 71 + (((tickAnim - 11) / 2) * (26.75-(71)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.33-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.33 + (((tickAnim - 1) / 1) * (0.625-(0.33)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 2) / 5) * (0-(0)));
            yy = 0.625 + (((tickAnim - 2) / 5) * (0-(0.625)));
            zz = 0 + (((tickAnim - 2) / 5) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 1) * (1.05-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1.05 + (((tickAnim - 8) / 2) * (0.8-(1.05)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 10) / 3) * (0-(0.8)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 31.19565 + (((tickAnim - 0) / 3) * (-1.95412-(31.19565)));
            yy = -10.89549 + (((tickAnim - 0) / 3) * (-10.09379-(-10.89549)));
            zz = 3.70939 + (((tickAnim - 0) / 3) * (8.61249-(3.70939)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -1.95412 + (((tickAnim - 3) / 3) * (-43.93867-(-1.95412)));
            yy = -10.09379 + (((tickAnim - 3) / 3) * (-1.19411-(-10.09379)));
            zz = 8.61249 + (((tickAnim - 3) / 3) * (-5.8804-(8.61249)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -43.93867 + (((tickAnim - 6) / 7) * (31.19565-(-43.93867)));
            yy = -1.19411 + (((tickAnim - 6) / 7) * (-10.89549-(-1.19411)));
            zz = -5.8804 + (((tickAnim - 6) / 7) * (3.70939-(-5.8804)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.525-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0.525 + (((tickAnim - 6) / 7) * (0-(0.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg.rotationPointX = this.frontRightLeg.rotationPointX + (float)(xx);
        this.frontRightLeg.rotationPointY = this.frontRightLeg.rotationPointY - (float)(yy);
        this.frontRightLeg.rotationPointZ = this.frontRightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.5 + (((tickAnim - 0) / 3) * (-44.07-(8.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -44.07 + (((tickAnim - 3) / 3) * (14-(-44.07)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 14 + (((tickAnim - 6) / 7) * (8.5-(14)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.485-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.09 + (((tickAnim - 2) / 1) * (0.075-(0.09)));
            zz = 0.485 + (((tickAnim - 2) / 1) * (0.5-(0.485)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            yy = 0.075 + (((tickAnim - 3) / 10) * (0-(0.075)));
            zz = 0.5 + (((tickAnim - 3) / 10) * (0-(0.5)));
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
            xx = 84.25 + (((tickAnim - 0) / 3) * (98.14-(84.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 98.14 + (((tickAnim - 3) / 3) * (26.75-(98.14)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 26.75 + (((tickAnim - 6) / 2) * (4.87-(26.75)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 4.87 + (((tickAnim - 8) / 2) * (0.78-(4.87)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.78 + (((tickAnim - 10) / 3) * (84.25-(0.78)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.125 + (((tickAnim - 2) / 1) * (0-(1.125)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 6) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 1) * (0.275-(0)));
            zz = 0 + (((tickAnim - 6) / 1) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 0.275 + (((tickAnim - 7) / 1) * (0.425-(0.275)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.425 + (((tickAnim - 8) / 5) * (0-(0.425)));
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



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575/0.5))*0.5), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKnoetschkesuchus entity = (EntityPrehistoricFloraKnoetschkesuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(main, main.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.7), main.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3), main.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));
        this.main.rotationPointX = this.main.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.15);
        this.main.rotationPointY = this.main.rotationPointY - (float)(0);
        this.main.rotationPointZ = this.main.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.1);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26 + (((tickAnim - 0) / 3) * (1.64805-(26)));
            yy = 0 + (((tickAnim - 0) / 3) * (-10.47249-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.30785-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.64805 + (((tickAnim - 3) / 5) * (-29.91153-(1.64805)));
            yy = -10.47249 + (((tickAnim - 3) / 5) * (-5.4949-(-10.47249)));
            zz = -1.30785 + (((tickAnim - 3) / 5) * (6.6606-(-1.30785)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -29.91153 + (((tickAnim - 8) / 12) * (26-(-29.91153)));
            yy = -5.4949 + (((tickAnim - 8) / 12) * (0-(-5.4949)));
            zz = 6.6606 + (((tickAnim - 8) / 12) * (0-(6.6606)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg, backLeftLeg.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 19.75 + (((tickAnim - 0) / 3) * (-11.54472-(19.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.6756-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-1.27684-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -11.54472 + (((tickAnim - 3) / 3) * (-18.74076-(-11.54472)));
            yy = 0.6756 + (((tickAnim - 3) / 3) * (1.1823-(0.6756)));
            zz = -1.27684 + (((tickAnim - 3) / 3) * (-2.23448-(-1.27684)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -18.74076 + (((tickAnim - 6) / 2) * (-2.28812-(-18.74076)));
            yy = 1.1823 + (((tickAnim - 6) / 2) * (1.5201-(1.1823)));
            zz = -2.23448 + (((tickAnim - 6) / 2) * (-2.8729-(-2.23448)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = -2.28812 + (((tickAnim - 8) / 12) * (19.75-(-2.28812)));
            yy = 1.5201 + (((tickAnim - 8) / 12) * (0-(1.5201)));
            zz = -2.8729 + (((tickAnim - 8) / 12) * (0-(-2.8729)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg2, backLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (2.065-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.125-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 2.065 + (((tickAnim - 3) / 3) * (0.45-(2.065)));
            zz = -0.125 + (((tickAnim - 3) / 3) * (0-(-0.125)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 0.45 + (((tickAnim - 6) / 2) * (0-(0.45)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0.25-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
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
            xx = 71.25 + (((tickAnim - 0) / 3) * (63.06266-(71.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.08498-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.81453-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 63.06266 + (((tickAnim - 3) / 3) * (25.79716-(63.06266)));
            yy = -1.08498 + (((tickAnim - 3) / 3) * (-1.89871-(-1.08498)));
            zz = -2.81453 + (((tickAnim - 3) / 3) * (-4.92543-(-2.81453)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 25.79716 + (((tickAnim - 6) / 2) * (35.95349-(25.79716)));
            yy = -1.89871 + (((tickAnim - 6) / 2) * (-2.4412-(-1.89871)));
            zz = -4.92543 + (((tickAnim - 6) / 2) * (-6.3327-(-4.92543)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 35.95349 + (((tickAnim - 8) / 5) * (3.5721-(35.95349)));
            yy = -2.4412 + (((tickAnim - 8) / 5) * (-1.46472-(-2.4412)));
            zz = -6.3327 + (((tickAnim - 8) / 5) * (-3.79962-(-6.3327)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 3.5721 + (((tickAnim - 13) / 3) * (0.90116-(3.5721)));
            yy = -1.46472 + (((tickAnim - 13) / 3) * (-0.81373-(-1.46472)));
            zz = -3.79962 + (((tickAnim - 13) / 3) * (-2.1109-(-3.79962)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.90116 + (((tickAnim - 16) / 4) * (71.25-(0.90116)));
            yy = -0.81373 + (((tickAnim - 16) / 4) * (0-(-0.81373)));
            zz = -2.1109 + (((tickAnim - 16) / 4) * (0-(-2.1109)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backLeftLeg3, backLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), backLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), backLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.375-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.9 + (((tickAnim - 2) / 1) * (0.7-(0.9)));
            zz = 0.375 + (((tickAnim - 2) / 1) * (0-(0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.7 + (((tickAnim - 3) / 5) * (-0.225-(0.7)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 8) / 2) * (0.07-(-0.225)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0.07 + (((tickAnim - 10) / 3) * (0-(0.07)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backLeftLeg3.rotationPointX = this.backLeftLeg3.rotationPointX + (float)(xx);
        this.backLeftLeg3.rotationPointY = this.backLeftLeg3.rotationPointY - (float)(yy);
        this.backLeftLeg3.rotationPointZ = this.backLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -21.66153 + (((tickAnim - 0) / 8) * (26-(-21.66153)));
            yy = 5.49487 + (((tickAnim - 0) / 8) * (0-(5.49487)));
            zz = -6.66061 + (((tickAnim - 0) / 8) * (0-(-6.66061)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 26 + (((tickAnim - 8) / 10) * (-29.91153-(26)));
            yy = 0 + (((tickAnim - 8) / 10) * (5.49487-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (-6.66061-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -29.91153 + (((tickAnim - 18) / 2) * (-21.66153-(-29.91153)));
            yy = 5.49487 + (((tickAnim - 18) / 2) * (5.49487-(5.49487)));
            zz = -6.66061 + (((tickAnim - 18) / 2) * (-6.66061-(-6.66061)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg, backRightLeg.rotateAngleX + (float) Math.toRadians(xx), backRightLeg.rotateAngleY + (float) Math.toRadians(yy), backRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.71188 + (((tickAnim - 0) / 8) * (19.75-(6.71188)));
            yy = -1.52013 + (((tickAnim - 0) / 8) * (0-(-1.52013)));
            zz = 2.87292 + (((tickAnim - 0) / 8) * (0-(2.87292)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 19.75 + (((tickAnim - 8) / 5) * (1.18475-(19.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.60805-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (1.14917-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 1.18475 + (((tickAnim - 13) / 2) * (-17.6305-(1.18475)));
            yy = -0.60805 + (((tickAnim - 13) / 2) * (-1.2161-(-0.60805)));
            zz = 1.14917 + (((tickAnim - 13) / 2) * (2.29833-(1.14917)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -17.6305 + (((tickAnim - 15) / 3) * (-2.28812-(-17.6305)));
            yy = -1.2161 + (((tickAnim - 15) / 3) * (-1.52013-(-1.2161)));
            zz = 2.29833 + (((tickAnim - 15) / 3) * (2.87292-(2.29833)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.28812 + (((tickAnim - 18) / 2) * (6.71188-(-2.28812)));
            yy = -1.52013 + (((tickAnim - 18) / 2) * (-1.52013-(-1.52013)));
            zz = 2.87292 + (((tickAnim - 18) / 2) * (2.87292-(2.87292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg2, backRightLeg2.rotateAngleX + (float) Math.toRadians(xx), backRightLeg2.rotateAngleY + (float) Math.toRadians(yy), backRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.2 + (((tickAnim - 0) / 8) * (0.25-(0.2)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0.25 + (((tickAnim - 8) / 5) * (1.35-(0.25)));
            zz = 0 + (((tickAnim - 8) / 5) * (-0.275-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.35 + (((tickAnim - 13) / 5) * (0-(1.35)));
            zz = -0.275 + (((tickAnim - 13) / 5) * (0-(-0.275)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0.2-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
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
            xx = 19.20349 + (((tickAnim - 0) / 3) * (1.64083-(19.20349)));
            yy = -2.44122 + (((tickAnim - 0) / 3) * (-1.35623-(-2.44122)));
            zz = 6.33272 + (((tickAnim - 0) / 3) * (3.51818-(6.33272)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.64083 + (((tickAnim - 3) / 5) * (71.25-(1.64083)));
            yy = -1.35623 + (((tickAnim - 3) / 5) * (0-(-1.35623)));
            zz = 3.51818 + (((tickAnim - 3) / 5) * (0-(3.51818)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 71.25 + (((tickAnim - 8) / 5) * (40.1314-(71.25)));
            yy = 0 + (((tickAnim - 8) / 5) * (-0.97649-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (2.53309-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 40.1314 + (((tickAnim - 13) / 2) * (21.34613-(40.1314)));
            yy = -0.97649 + (((tickAnim - 13) / 2) * (-1.95298-(-0.97649)));
            zz = 2.53309 + (((tickAnim - 13) / 2) * (5.06618-(2.53309)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 21.34613 + (((tickAnim - 15) / 3) * (35.95349-(21.34613)));
            yy = -1.95298 + (((tickAnim - 15) / 3) * (-2.44122-(-1.95298)));
            zz = 5.06618 + (((tickAnim - 15) / 3) * (6.33272-(5.06618)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35.95349 + (((tickAnim - 18) / 2) * (19.70349-(35.95349)));
            yy = -2.44122 + (((tickAnim - 18) / 2) * (-2.44122-(-2.44122)));
            zz = 6.33272 + (((tickAnim - 18) / 2) * (6.33272-(6.33272)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(backRightLeg3, backRightLeg3.rotateAngleX + (float) Math.toRadians(xx), backRightLeg3.rotateAngleY + (float) Math.toRadians(yy), backRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 2) * (0.055-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.055 + (((tickAnim - 2) / 1) * (0-(0.055)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 5) * (0.61-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0.55-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.61 + (((tickAnim - 13) / 2) * (0-(0.61)));
            zz = 0.55 + (((tickAnim - 13) / 2) * (0-(0.55)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.225 + (((tickAnim - 18) / 2) * (-0.225-(-0.225)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.backRightLeg3.rotationPointX = this.backRightLeg3.rotationPointX + (float)(xx);
        this.backRightLeg3.rotationPointY = this.backRightLeg3.rotationPointY - (float)(yy);
        this.backRightLeg3.rotationPointZ = this.backRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*3), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-190))*9), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*15), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*4), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-1));


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-130))*-4), body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+70))*-1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-50))*0.5), neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*4), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*1));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-230))*-4), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -33.75 + (((tickAnim - 0) / 11) * (31.19565-(-33.75)));
            yy = 0 + (((tickAnim - 0) / 11) * (10.8955-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-3.7094-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 31.19565 + (((tickAnim - 11) / 9) * (-33.75-(31.19565)));
            yy = 10.8955 + (((tickAnim - 11) / 9) * (0-(10.8955)));
            zz = -3.7094 + (((tickAnim - 11) / 9) * (0-(-3.7094)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg, frontLeftLeg.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 8.25 + (((tickAnim - 0) / 11) * (8-(8.25)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 8 + (((tickAnim - 11) / 5) * (-36.37-(8)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -36.37 + (((tickAnim - 16) / 2) * (-21.81-(-36.37)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -21.81 + (((tickAnim - 18) / 2) * (8.25-(-21.81)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg2, frontLeftLeg2.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg2.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 11 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0.55-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0.55 + (((tickAnim - 16) / 4) * (0-(0.55)));
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
            xx = 26.75 + (((tickAnim - 0) / 3) * (11.63-(26.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 11.63 + (((tickAnim - 3) / 2) * (-2.16-(11.63)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 11) {
            xx = -2.16 + (((tickAnim - 5) / 6) * (84.25-(-2.16)));
            yy = 0 + (((tickAnim - 5) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 6) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 84.25 + (((tickAnim - 11) / 5) * (92.25-(84.25)));
            yy = 0 + (((tickAnim - 11) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 92.25 + (((tickAnim - 16) / 2) * (71-(92.25)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 71 + (((tickAnim - 18) / 2) * (26.75-(71)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontLeftLeg3, frontLeftLeg3.rotateAngleX + (float) Math.toRadians(xx), frontLeftLeg3.rotateAngleY + (float) Math.toRadians(yy), frontLeftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 1) * (0.18-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 0.18 + (((tickAnim - 1) / 1) * (0.39-(0.18)));
            zz = 0 + (((tickAnim - 1) / 1) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.39 + (((tickAnim - 2) / 1) * (0.525-(0.39)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 3) / 8) * (0-(0)));
            yy = 0.525 + (((tickAnim - 3) / 8) * (0-(0.525)));
            zz = 0 + (((tickAnim - 3) / 8) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (1.05-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.05 + (((tickAnim - 13) / 3) * (0.8-(1.05)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 16) / 4) * (0-(0.8)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontLeftLeg3.rotationPointX = this.frontLeftLeg3.rotationPointX + (float)(xx);
        this.frontLeftLeg3.rotationPointY = this.frontLeftLeg3.rotationPointY - (float)(yy);
        this.frontLeftLeg3.rotationPointZ = this.frontLeftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 31.19565 + (((tickAnim - 0) / 9) * (-33.75-(31.19565)));
            yy = -10.89549 + (((tickAnim - 0) / 9) * (0-(-10.89549)));
            zz = 3.70939 + (((tickAnim - 0) / 9) * (0-(3.70939)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -33.75 + (((tickAnim - 9) / 11) * (31.19565-(-33.75)));
            yy = 0 + (((tickAnim - 9) / 11) * (-10.89549-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (3.70939-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg, frontRightLeg.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 8.5 + (((tickAnim - 0) / 5) * (-44.07-(8.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -44.07 + (((tickAnim - 5) / 4) * (8.25-(-44.07)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 8.25 + (((tickAnim - 9) / 11) * (8.5-(8.25)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg2, frontRightLeg2.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg2.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.09-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.485-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 3) / 2) * (0.075-(0.09)));
            zz = 0.485 + (((tickAnim - 3) / 2) * (0.5-(0.485)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0.075 + (((tickAnim - 5) / 15) * (0-(0.075)));
            zz = 0.5 + (((tickAnim - 5) / 15) * (0-(0.5)));
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
            xx = 84.25 + (((tickAnim - 0) / 5) * (98.14-(84.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 98.14 + (((tickAnim - 5) / 4) * (26.75-(98.14)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 26.75 + (((tickAnim - 9) / 4) * (4.87-(26.75)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 4.87 + (((tickAnim - 13) / 3) * (0.78-(4.87)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.78 + (((tickAnim - 16) / 4) * (84.25-(0.78)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(frontRightLeg3, frontRightLeg3.rotateAngleX + (float) Math.toRadians(xx), frontRightLeg3.rotateAngleY + (float) Math.toRadians(yy), frontRightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.125-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 1.125 + (((tickAnim - 3) / 2) * (0-(1.125)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 2) * (0.275-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.275 + (((tickAnim - 11) / 2) * (0.405-(0.275)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 13) / 0) * (0-(0)));
            yy = 0.405 + (((tickAnim - 13) / 0) * (0.425-(0.405)));
            zz = 0 + (((tickAnim - 13) / 0) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0.425 + (((tickAnim - 13) / 7) * (0-(0.425)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.frontRightLeg3.rotationPointX = this.frontRightLeg3.rotationPointX + (float)(xx);
        this.frontRightLeg3.rotationPointY = this.frontRightLeg3.rotationPointY - (float)(yy);
        this.frontRightLeg3.rotationPointZ = this.frontRightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5))*0.3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));


    }



        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKnoetschkesuchus e = (EntityPrehistoricFloraKnoetschkesuchus) entity;
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
