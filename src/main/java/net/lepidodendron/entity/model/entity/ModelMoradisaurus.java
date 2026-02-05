package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraMoradisaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelMoradisaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer bone5;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer bone9;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer bone25;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone7;
    private final AdvancedModelRenderer bone8;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone15;
    private final AdvancedModelRenderer bone16;
    private final AdvancedModelRenderer bone22;
    private final AdvancedModelRenderer bone23;
    private final AdvancedModelRenderer bone24;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone26;
    private final AdvancedModelRenderer bone27;
    private final AdvancedModelRenderer bone17;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer bone18;
    private final AdvancedModelRenderer bone19;
    private final AdvancedModelRenderer bone20;
    private final AdvancedModelRenderer bone21;
    private final AdvancedModelRenderer bone10;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer bone11;
    private final AdvancedModelRenderer bone12;
    private final AdvancedModelRenderer bone13;
    private final AdvancedModelRenderer bone14;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;

    private ModelAnimator animator;

    public ModelMoradisaurus() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 20.0F, 6.5F);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 17, -5.0F, -4.35F, -3.0F, 10, 6, 5, 0.0F, false));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(4.75F, -0.25F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, 0.2182F, 0.48F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 55, 21, -0.75F, -1.05F, -1.5F, 5, 3, 3, 0.01F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6545F, -0.1309F, 1.9199F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 17, 59, -0.25F, -1.05F, -1.0F, 5, 2, 2, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, 0.0F, -0.1745F, -1.9199F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 53, 15, -0.25F, -0.55F, -2.0F, 5, 1, 4, 0.0F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-4.75F, -0.25F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, 0.2182F, -0.48F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 55, 21, -4.25F, -1.05F, -1.5F, 5, 3, 3, 0.01F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6545F, 0.1309F, -1.9199F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 17, 59, -4.75F, -1.05F, -1.0F, 5, 2, 2, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, 0.0F, 0.1745F, 1.9199F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 53, 15, -4.75F, -0.55F, -2.0F, 5, 1, 4, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.0F, -3.0F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.1745F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -5.5F, -2.35F, -9.5F, 11, 6, 10, 0.01F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.0873F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 26, 24, -5.0F, -2.35F, -5.0F, 10, 6, 5, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, -0.8F, -4.5F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 27, 36, -4.5F, -1.5F, -2.75F, 9, 5, 3, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 33, 0, -4.0F, 0.4F, -2.75F, 8, 4, 4, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.25F, -1.75F);
        this.neck.addChild(head);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.25F, -10.25F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 52, -2.0F, -1.0F, 4.0F, 4, 1, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 64, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 1.55F, -10.4F);
        this.head.addChild(bone4);
        this.setRotateAngle(bone4, 0.6545F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 7, -1.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 4, -1.0F, -0.5F, 0.0F, 2, 1, 1, -0.01F, false));

        this.bone5 = new AdvancedModelRenderer(this);
        this.bone5.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.bone4.addChild(bone5);
        this.setRotateAngle(bone5, -0.3927F, 0.0F, 0.0F);
        this.bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.01F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.bone5.addChild(bone6);
        this.setRotateAngle(bone6, -0.1309F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 50, 64, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 55, 47, -3.5F, 0.0F, 4.0F, 7, 2, 1, 0.0F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 43, 9, -4.5F, 0.0F, 5.0F, 9, 2, 3, 0.01F, false));

        this.bone9 = new AdvancedModelRenderer(this);
        this.bone9.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone6.addChild(bone9);
        this.setRotateAngle(bone9, 0.0F, 0.3491F, 0.0F);
        this.bone9.cubeList.add(new ModelBox(bone9, 13, 64, -1.0F, 0.0F, 0.0F, 2, 1, 4, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.75F, 0.5F, 3.9F);
        this.bone9.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 66, 31, -2.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.bone25 = new AdvancedModelRenderer(this);
        this.bone25.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone6.addChild(bone25);
        this.setRotateAngle(bone25, 0.0F, -0.3491F, 0.0F);
        this.bone25.cubeList.add(new ModelBox(bone25, 13, 64, -1.0F, 0.0F, 0.0F, 2, 1, 4, -0.01F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.75F, 0.5F, 3.9F);
        this.bone25.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.2618F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 31, 0.0F, 0.0F, -3.0F, 2, 1, 3, 0.0F, true));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(1.0F, 1.25F, -10.35F);
        this.head.addChild(bone);
        this.setRotateAngle(bone, -0.0436F, 0.6109F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 26, 17, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, -0.5236F, 0.0F);
        this.bone2.cubeList.add(new ModelBox(bone2, 0, 17, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone2.addChild(bone3);
        this.setRotateAngle(bone3, 0.0F, 0.3927F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 28, 60, -2.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 68, 12, -2.25F, -0.95F, 0.5F, 2, 1, 3, -0.01F, false));

        this.bone7 = new AdvancedModelRenderer(this);
        this.bone7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bone3.addChild(bone7);
        this.setRotateAngle(bone7, 0.0F, 0.3491F, 0.0F);
        this.bone7.cubeList.add(new ModelBox(bone7, 68, 0, -2.0F, -1.0F, -0.6F, 2, 1, 3, -0.01F, false));

        this.bone8 = new AdvancedModelRenderer(this);
        this.bone8.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.bone7.addChild(bone8);
        this.setRotateAngle(bone8, 0.0F, -0.829F, 0.0F);
        this.bone8.cubeList.add(new ModelBox(bone8, 0, 58, -4.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.bone8.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 65, 8, -4.0F, 0.75F, 2.0F, 4, 1, 2, -0.02F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 52, -4.0F, 0.0F, 0.0F, 4, 1, 4, -0.01F, false));

        this.bone15 = new AdvancedModelRenderer(this);
        this.bone15.setRotationPoint(-1.0F, 1.25F, -10.35F);
        this.head.addChild(bone15);
        this.setRotateAngle(bone15, -0.0436F, -0.6109F, 0.0F);
        this.bone15.cubeList.add(new ModelBox(bone15, 26, 17, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.01F, true));

        this.bone16 = new AdvancedModelRenderer(this);
        this.bone16.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone15.addChild(bone16);
        this.setRotateAngle(bone16, 0.0F, 0.5236F, 0.0F);
        this.bone16.cubeList.add(new ModelBox(bone16, 0, 17, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.01F, true));

        this.bone22 = new AdvancedModelRenderer(this);
        this.bone22.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone16.addChild(bone22);
        this.setRotateAngle(bone22, 0.0F, -0.3927F, 0.0F);
        this.bone22.cubeList.add(new ModelBox(bone22, 28, 60, 0.0F, -1.0F, -1.0F, 2, 1, 4, 0.0F, true));
        this.bone22.cubeList.add(new ModelBox(bone22, 68, 12, 0.25F, -0.95F, 0.5F, 2, 1, 3, -0.01F, true));

        this.bone23 = new AdvancedModelRenderer(this);
        this.bone23.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.bone22.addChild(bone23);
        this.setRotateAngle(bone23, 0.0F, -0.3491F, 0.0F);
        this.bone23.cubeList.add(new ModelBox(bone23, 68, 0, 0.0F, -1.0F, -0.6F, 2, 1, 3, -0.01F, true));

        this.bone24 = new AdvancedModelRenderer(this);
        this.bone24.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.bone23.addChild(bone24);
        this.setRotateAngle(bone24, 0.0F, 0.829F, 0.0F);
        this.bone24.cubeList.add(new ModelBox(bone24, 0, 58, 0.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.bone24.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 65, 8, 0.0F, 0.75F, 2.0F, 4, 1, 2, -0.02F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 56, 52, 0.0F, 0.0F, 0.0F, 4, 1, 4, -0.01F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0436F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 63, -1.0F, 0.5F, -8.55F, 2, 1, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 46, 39, -2.0F, 0.5F, -4.55F, 4, 1, 6, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.0472F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 52, -3.5F, 0.25F, -0.3F, 7, 2, 3, -0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 1.5F, -2.75F);
        this.jaw.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 17, -4.0F, -0.55F, -0.05F, 8, 1, 5, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.5F, -8.5F);
        this.jaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 7, 0, -0.5F, -0.5F, 0.1F, 1, 1, 0, 0.0F, false));

        this.bone26 = new AdvancedModelRenderer(this);
        this.bone26.setRotationPoint(0.0F, 1.5F, -8.55F);
        this.jaw.addChild(bone26);
        this.setRotateAngle(bone26, -0.1309F, 0.0F, 0.0F);
        this.bone26.cubeList.add(new ModelBox(bone26, 34, 69, -1.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));
        this.bone26.cubeList.add(new ModelBox(bone26, 59, 64, -2.0F, -1.0F, 2.9F, 4, 1, 2, 0.01F, false));
        this.bone26.cubeList.add(new ModelBox(bone26, 57, 28, -3.0F, -1.0F, 4.75F, 6, 1, 1, 0.0F, false));

        this.bone27 = new AdvancedModelRenderer(this);
        this.bone27.setRotationPoint(0.0F, 0.0F, 5.7F);
        this.bone26.addChild(bone27);
        this.setRotateAngle(bone27, -0.1745F, 0.0F, 0.0F);
        this.bone27.cubeList.add(new ModelBox(bone27, 23, 45, -3.0F, -1.0F, -0.6F, 6, 1, 5, -0.01F, false));

        this.bone17 = new AdvancedModelRenderer(this);
        this.bone17.setRotationPoint(1.0F, 1.5F, -8.55F);
        this.jaw.addChild(bone17);
        this.setRotateAngle(bone17, 0.0F, 0.5672F, 0.0F);
        this.bone17.cubeList.add(new ModelBox(bone17, 30, 19, -1.0F, -1.0F, -0.05F, 1, 1, 1, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.05F, -1.0F, 0.5F);
        this.bone17.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, 0.3054F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 4, -0.1F, -0.4F, -0.5F, 0, 1, 1, 0.0F, false));

        this.bone18 = new AdvancedModelRenderer(this);
        this.bone18.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone17.addChild(bone18);
        this.setRotateAngle(bone18, 0.0F, -0.48F, 0.0F);
        this.bone18.cubeList.add(new ModelBox(bone18, 0, 29, -1.0F, -1.0F, -0.05F, 1, 1, 1, 0.0F, false));

        this.bone19 = new AdvancedModelRenderer(this);
        this.bone19.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.bone18.addChild(bone19);
        this.setRotateAngle(bone19, 0.0F, 0.3927F, 0.0F);
        this.bone19.cubeList.add(new ModelBox(bone19, 69, 18, -2.0F, -1.0F, -0.05F, 2, 1, 3, -0.01F, false));
        this.bone19.cubeList.add(new ModelBox(bone19, 60, 68, -2.15F, -1.05F, 1.0F, 2, 1, 3, 0.0F, false));

        this.bone20 = new AdvancedModelRenderer(this);
        this.bone20.setRotationPoint(0.0F, 0.0F, 2.95F);
        this.bone19.addChild(bone20);
        this.setRotateAngle(bone20, 0.0F, 0.3491F, 0.0F);
        this.bone20.cubeList.add(new ModelBox(bone20, 26, 66, -2.0F, -1.0F, -0.6F, 2, 1, 3, 0.0F, false));

        this.bone21 = new AdvancedModelRenderer(this);
        this.bone21.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.bone20.addChild(bone21);
        this.setRotateAngle(bone21, 0.0F, -0.829F, 0.0F);
        this.bone21.cubeList.add(new ModelBox(bone21, 54, 58, -3.0F, -1.0F, 0.0F, 3, 1, 4, 0.01F, false));

        this.bone10 = new AdvancedModelRenderer(this);
        this.bone10.setRotationPoint(-1.0F, 1.5F, -8.55F);
        this.jaw.addChild(bone10);
        this.setRotateAngle(bone10, 0.0F, -0.5672F, 0.0F);
        this.bone10.cubeList.add(new ModelBox(bone10, 30, 19, 0.0F, -1.0F, -0.05F, 1, 1, 1, -0.01F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.05F, -1.0F, 0.5F);
        this.bone10.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, -0.3054F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 4, 0.1F, -0.4F, -0.5F, 0, 1, 1, 0.0F, true));

        this.bone11 = new AdvancedModelRenderer(this);
        this.bone11.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.bone10.addChild(bone11);
        this.setRotateAngle(bone11, 0.0F, 0.48F, 0.0F);
        this.bone11.cubeList.add(new ModelBox(bone11, 0, 29, 0.0F, -1.0F, -0.05F, 1, 1, 1, 0.0F, true));

        this.bone12 = new AdvancedModelRenderer(this);
        this.bone12.setRotationPoint(0.0F, 0.0F, 0.75F);
        this.bone11.addChild(bone12);
        this.setRotateAngle(bone12, 0.0F, -0.3927F, 0.0F);
        this.bone12.cubeList.add(new ModelBox(bone12, 69, 18, 0.0F, -1.0F, -0.05F, 2, 1, 3, -0.01F, true));
        this.bone12.cubeList.add(new ModelBox(bone12, 60, 68, 0.15F, -1.05F, 1.0F, 2, 1, 3, 0.0F, true));

        this.bone13 = new AdvancedModelRenderer(this);
        this.bone13.setRotationPoint(0.0F, 0.0F, 2.95F);
        this.bone12.addChild(bone13);
        this.setRotateAngle(bone13, 0.0F, -0.3491F, 0.0F);
        this.bone13.cubeList.add(new ModelBox(bone13, 26, 66, 0.0F, -1.0F, -0.6F, 2, 1, 3, 0.0F, true));

        this.bone14 = new AdvancedModelRenderer(this);
        this.bone14.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.bone13.addChild(bone14);
        this.setRotateAngle(bone14, 0.0F, 0.829F, 0.0F);
        this.bone14.cubeList.add(new ModelBox(bone14, 54, 58, 0.0F, -1.0F, 0.0F, 3, 1, 4, 0.01F, true));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(4.75F, 1.75F, -2.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, -0.0873F, -0.5236F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 37, 56, -0.75F, -1.05F, -1.5F, 5, 3, 3, 0.01F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, 1.5272F, 0.3491F, 1.5708F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 61, 38, -0.25F, -1.05F, -1.0F, 5, 2, 2, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(4.5F, 0.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.0F, 0.0F, -1.2217F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 53, 32, -0.25F, -0.55F, -2.0F, 4, 1, 4, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-4.75F, 1.75F, -2.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, -0.0873F, 0.5236F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 37, 56, -4.25F, -1.05F, -1.5F, 5, 3, 3, 0.01F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-4.0F, 0.0F, 0.0F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, 1.5272F, -0.3491F, -1.5708F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 61, 38, -4.75F, -1.05F, -1.0F, 5, 2, 2, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(-4.5F, 0.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.0F, 0.0F, 1.2217F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 53, 32, -3.75F, -0.55F, -2.0F, 4, 1, 4, 0.0F, true));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -2.0F, 1.5F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.1745F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 0, 31, -4.0F, -1.85F, -0.5F, 8, 5, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail1.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 42, -3.0F, -1.35F, -0.5F, 6, 4, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1745F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 41, 47, -2.0F, -0.85F, -0.5F, 4, 3, 5, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.25F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.0436F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 58, 0, -1.0F, -0.6F, -0.5F, 2, 2, 5, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.2F;
        this.hips.offsetX = 0.35F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(120);
        this.hips.rotateAngleX = (float)Math.toRadians(1);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.6F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.105F;
        this.hips.render(0.01F);
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
        //this.hips.offsetZ = 0.5F;

        EntityPrehistoricFloraMoradisaurus EntityMegalosaurus = (EntityPrehistoricFloraMoradisaurus) e;

        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.head};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMoradisaurus entity = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;
        int animCycle = 305;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (2-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            zz = 2 + (((tickAnim - 35) / 247) * (2-(2)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            zz = 2 + (((tickAnim - 282) / 23) * (0-(2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-0.475-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            zz = -0.475 + (((tickAnim - 35) / 247) * (-0.475-(-0.475)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            zz = -0.475 + (((tickAnim - 282) / 23) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-1.06948-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (-8.57601-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-3.35438-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = -1.06948 + (((tickAnim - 35) / 247) * (-1.06948-(-1.06948)));
            yy = -8.57601 + (((tickAnim - 35) / 247) * (-8.57601-(-8.57601)));
            zz = -3.35438 + (((tickAnim - 35) / 247) * (-3.35438-(-3.35438)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = -1.06948 + (((tickAnim - 282) / 23) * (0-(-1.06948)));
            yy = -8.57601 + (((tickAnim - 282) / 23) * (0-(-8.57601)));
            zz = -3.35438 + (((tickAnim - 282) / 23) * (0-(-3.35438)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0.33347-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (14.82894-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1.501-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = 0.33347 + (((tickAnim - 35) / 247) * (0.33347-(0.33347)));
            yy = 14.82894 + (((tickAnim - 35) / 247) * (14.82894-(14.82894)));
            zz = -1.501 + (((tickAnim - 35) / 247) * (-1.501-(-1.501)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = 0.33347 + (((tickAnim - 282) / 23) * (0-(0.33347)));
            yy = 14.82894 + (((tickAnim - 282) / 23) * (0-(14.82894)));
            zz = -1.501 + (((tickAnim - 282) / 23) * (0-(-1.501)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-1-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            zz = -1 + (((tickAnim - 35) / 247) * (-1-(-1)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            zz = -1 + (((tickAnim - 282) / 23) * (0-(-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -6 + (((tickAnim - 35) / 25) * (0-(-6)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (-6-(0)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 16) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 101) {
            xx = -6 + (((tickAnim - 76) / 25) * (0-(-6)));
            yy = 0 + (((tickAnim - 76) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 25) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 117) {
            xx = 0 + (((tickAnim - 101) / 16) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 101) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 16) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = -6.25 + (((tickAnim - 117) / 23) * (-15-(-6.25)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -15 + (((tickAnim - 140) / 5) * (-13-(-15)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = -13 + (((tickAnim - 145) / 5) * (-15-(-13)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = -15 + (((tickAnim - 150) / 5) * (-13-(-15)));
            yy = 0 + (((tickAnim - 150) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 5) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = -13 + (((tickAnim - 155) / 5) * (-15-(-13)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -15 + (((tickAnim - 160) / 10) * (-15-(-15)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -15 + (((tickAnim - 170) / 30) * (-6-(-15)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 225) {
            xx = -6 + (((tickAnim - 200) / 25) * (0-(-6)));
            yy = 0 + (((tickAnim - 200) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 25) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 241) {
            xx = 0 + (((tickAnim - 225) / 16) * (-6-(0)));
            yy = 0 + (((tickAnim - 225) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 16) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 266) {
            xx = -6 + (((tickAnim - 241) / 25) * (0-(-6)));
            yy = 0 + (((tickAnim - 241) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 25) * (0-(0)));
        }
        else if (tickAnim >= 266 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 266) / 16) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 266) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 266) / 16) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = -6.25 + (((tickAnim - 282) / 23) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 6.75 + (((tickAnim - 35) / 13) * (-5.1-(6.75)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -5.1 + (((tickAnim - 48) / 12) * (0-(-5.1)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (-0.43-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = -0.43 + (((tickAnim - 65) / 3) * (2.47-(-0.43)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 2.47 + (((tickAnim - 68) / 5) * (5.32-(2.47)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 5.32 + (((tickAnim - 73) / 3) * (6.75-(5.32)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 89) {
            xx = 6.75 + (((tickAnim - 76) / 13) * (-5.1-(6.75)));
            yy = 0 + (((tickAnim - 76) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 13) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 101) {
            xx = -5.1 + (((tickAnim - 89) / 12) * (0-(-5.1)));
            yy = 0 + (((tickAnim - 89) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 12) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 101) / 5) * (-0.43-(0)));
            yy = 0 + (((tickAnim - 101) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 5) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = -0.43 + (((tickAnim - 106) / 3) * (2.47-(-0.43)));
            yy = 0 + (((tickAnim - 106) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 3) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = 2.47 + (((tickAnim - 109) / 4) * (-0.43-(2.47)));
            yy = 0 + (((tickAnim - 109) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 4) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = -0.43 + (((tickAnim - 113) / 4) * (2.47-(-0.43)));
            yy = 0 + (((tickAnim - 113) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 4) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = 2.47 + (((tickAnim - 117) / 23) * (-2.03-(2.47)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 145) {
            xx = -2.03 + (((tickAnim - 140) / 5) * (-5.03-(-2.03)));
            yy = 0 + (((tickAnim - 140) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 5) * (0-(0)));
        }
        else if (tickAnim >= 145 && tickAnim < 150) {
            xx = -5.03 + (((tickAnim - 145) / 5) * (-2.03-(-5.03)));
            yy = 0 + (((tickAnim - 145) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 145) / 5) * (0-(0)));
        }
        else if (tickAnim >= 150 && tickAnim < 155) {
            xx = -2.03 + (((tickAnim - 150) / 5) * (-5.03-(-2.03)));
            yy = 0 + (((tickAnim - 150) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 150) / 5) * (0-(0)));
        }
        else if (tickAnim >= 155 && tickAnim < 160) {
            xx = -5.03 + (((tickAnim - 155) / 5) * (-2.03-(-5.03)));
            yy = 0 + (((tickAnim - 155) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 155) / 5) * (0-(0)));
        }
        else if (tickAnim >= 160 && tickAnim < 170) {
            xx = -2.03 + (((tickAnim - 160) / 10) * (-2.03-(-2.03)));
            yy = 0 + (((tickAnim - 160) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 160) / 10) * (0-(0)));
        }
        else if (tickAnim >= 170 && tickAnim < 200) {
            xx = -2.03 + (((tickAnim - 170) / 30) * (6.75-(-2.03)));
            yy = 0 + (((tickAnim - 170) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 170) / 30) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 213) {
            xx = 6.75 + (((tickAnim - 200) / 13) * (-5.1-(6.75)));
            yy = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 225) {
            xx = -5.1 + (((tickAnim - 213) / 12) * (0-(-5.1)));
            yy = 0 + (((tickAnim - 213) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 12) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 225) / 5) * (-0.43-(0)));
            yy = 0 + (((tickAnim - 225) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 5) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 233) {
            xx = -0.43 + (((tickAnim - 230) / 3) * (2.47-(-0.43)));
            yy = 0 + (((tickAnim - 230) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 3) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 238) {
            xx = 2.47 + (((tickAnim - 233) / 5) * (5.32-(2.47)));
            yy = 0 + (((tickAnim - 233) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 5) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 241) {
            xx = 5.32 + (((tickAnim - 238) / 3) * (6.75-(5.32)));
            yy = 0 + (((tickAnim - 238) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 3) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 254) {
            xx = 6.75 + (((tickAnim - 241) / 13) * (-5.1-(6.75)));
            yy = 0 + (((tickAnim - 241) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 13) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 266) {
            xx = -5.1 + (((tickAnim - 254) / 12) * (0-(-5.1)));
            yy = 0 + (((tickAnim - 254) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 12) * (0-(0)));
        }
        else if (tickAnim >= 266 && tickAnim < 271) {
            xx = 0 + (((tickAnim - 266) / 5) * (-0.43-(0)));
            yy = 0 + (((tickAnim - 266) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 266) / 5) * (0-(0)));
        }
        else if (tickAnim >= 271 && tickAnim < 274) {
            xx = -0.43 + (((tickAnim - 271) / 3) * (2.47-(-0.43)));
            yy = 0 + (((tickAnim - 271) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 271) / 3) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 278) {
            xx = 2.47 + (((tickAnim - 274) / 4) * (-0.43-(2.47)));
            yy = 0 + (((tickAnim - 274) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 4) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 282) {
            xx = -0.43 + (((tickAnim - 278) / 4) * (2.47-(-0.43)));
            yy = 0 + (((tickAnim - 278) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 4) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = 2.47 + (((tickAnim - 282) / 23) * (0-(2.47)));
            yy = 0 + (((tickAnim - 282) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (30-(0)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 55) {
            xx = 30 + (((tickAnim - 48) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 48) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 7) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 65) {
            xx = 0 + (((tickAnim - 60) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 60) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 5) * (0-(0)));
        }
        else if (tickAnim >= 65 && tickAnim < 68) {
            xx = 5 + (((tickAnim - 65) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 65) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 65) / 3) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 73) {
            xx = 0 + (((tickAnim - 68) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 68) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 5) * (0-(0)));
        }
        else if (tickAnim >= 73 && tickAnim < 76) {
            xx = 5 + (((tickAnim - 73) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 73) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 73) / 3) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 89) {
            xx = 0 + (((tickAnim - 76) / 13) * (30-(0)));
            yy = 0 + (((tickAnim - 76) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 13) * (0-(0)));
        }
        else if (tickAnim >= 89 && tickAnim < 96) {
            xx = 30 + (((tickAnim - 89) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 89) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 89) / 7) * (0-(0)));
        }
        else if (tickAnim >= 96 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 96) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 96) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 96) / 5) * (0-(0)));
        }
        else if (tickAnim >= 101 && tickAnim < 106) {
            xx = 0 + (((tickAnim - 101) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 101) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 101) / 5) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 109) {
            xx = 5 + (((tickAnim - 106) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 106) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 3) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 109) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 109) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 4) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 117) {
            xx = 5 + (((tickAnim - 113) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 113) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 4) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 117) / 83) * (0-(0)));
            yy = 0 + (((tickAnim - 117) / 83) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 83) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 213) {
            xx = 0 + (((tickAnim - 200) / 13) * (30-(0)));
            yy = 0 + (((tickAnim - 200) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 13) * (0-(0)));
        }
        else if (tickAnim >= 213 && tickAnim < 220) {
            xx = 30 + (((tickAnim - 213) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 213) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 213) / 7) * (0-(0)));
        }
        else if (tickAnim >= 220 && tickAnim < 225) {
            xx = 0 + (((tickAnim - 220) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 220) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 220) / 5) * (0-(0)));
        }
        else if (tickAnim >= 225 && tickAnim < 230) {
            xx = 0 + (((tickAnim - 225) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 225) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 225) / 5) * (0-(0)));
        }
        else if (tickAnim >= 230 && tickAnim < 233) {
            xx = 5 + (((tickAnim - 230) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 230) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 230) / 3) * (0-(0)));
        }
        else if (tickAnim >= 233 && tickAnim < 238) {
            xx = 0 + (((tickAnim - 233) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 233) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 233) / 5) * (0-(0)));
        }
        else if (tickAnim >= 238 && tickAnim < 241) {
            xx = 5 + (((tickAnim - 238) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 238) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 238) / 3) * (0-(0)));
        }
        else if (tickAnim >= 241 && tickAnim < 254) {
            xx = 0 + (((tickAnim - 241) / 13) * (30-(0)));
            yy = 0 + (((tickAnim - 241) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 241) / 13) * (0-(0)));
        }
        else if (tickAnim >= 254 && tickAnim < 261) {
            xx = 30 + (((tickAnim - 254) / 7) * (0-(30)));
            yy = 0 + (((tickAnim - 254) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 254) / 7) * (0-(0)));
        }
        else if (tickAnim >= 261 && tickAnim < 266) {
            xx = 0 + (((tickAnim - 261) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 261) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 261) / 5) * (0-(0)));
        }
        else if (tickAnim >= 266 && tickAnim < 271) {
            xx = 0 + (((tickAnim - 266) / 5) * (5-(0)));
            yy = 0 + (((tickAnim - 266) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 266) / 5) * (0-(0)));
        }
        else if (tickAnim >= 271 && tickAnim < 274) {
            xx = 5 + (((tickAnim - 271) / 3) * (0-(5)));
            yy = 0 + (((tickAnim - 271) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 271) / 3) * (0-(0)));
        }
        else if (tickAnim >= 274 && tickAnim < 278) {
            xx = 0 + (((tickAnim - 274) / 4) * (5-(0)));
            yy = 0 + (((tickAnim - 274) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 274) / 4) * (0-(0)));
        }
        else if (tickAnim >= 278 && tickAnim < 282) {
            xx = 5 + (((tickAnim - 278) / 4) * (0-(5)));
            yy = 0 + (((tickAnim - 278) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 278) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-3.46059-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (33.33814-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-27.91254-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -3.46059 + (((tickAnim - 19) / 16) * (1.06146-(-3.46059)));
            yy = 33.33814 + (((tickAnim - 19) / 16) * (67.26715-(33.33814)));
            zz = -27.91254 + (((tickAnim - 19) / 16) * (0.08368-(-27.91254)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = 1.06146 + (((tickAnim - 35) / 247) * (1.06146-(1.06146)));
            yy = 67.26715 + (((tickAnim - 35) / 247) * (67.26715-(67.26715)));
            zz = 0.08368 + (((tickAnim - 35) / 247) * (0.08368-(0.08368)));
        }
        else if (tickAnim >= 282 && tickAnim < 293) {
            xx = 1.06146 + (((tickAnim - 282) / 11) * (-0.389-(1.06146)));
            yy = 67.26715 + (((tickAnim - 282) / 11) * (32.03009-(67.26715)));
            zz = 0.08368 + (((tickAnim - 282) / 11) * (-18.41187-(0.08368)));
        }
        else if (tickAnim >= 293 && tickAnim < 305) {
            xx = -0.389 + (((tickAnim - 293) / 12) * (0-(-0.389)));
            yy = 32.03009 + (((tickAnim - 293) / 12) * (0-(32.03009)));
            zz = -18.41187 + (((tickAnim - 293) / 12) * (0-(-18.41187)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-15.49697-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (22.48337-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-12.79014-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = -15.49697 + (((tickAnim - 19) / 16) * (-34.87243-(-15.49697)));
            yy = 22.48337 + (((tickAnim - 19) / 16) * (-3.19126-(22.48337)));
            zz = -12.79014 + (((tickAnim - 19) / 16) * (-16.89868-(-12.79014)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = -34.87243 + (((tickAnim - 35) / 247) * (-34.87243-(-34.87243)));
            yy = -3.19126 + (((tickAnim - 35) / 247) * (-3.19126-(-3.19126)));
            zz = -16.89868 + (((tickAnim - 35) / 247) * (-16.89868-(-16.89868)));
        }
        else if (tickAnim >= 282 && tickAnim < 293) {
            xx = -34.87243 + (((tickAnim - 282) / 11) * (-22.03545-(-34.87243)));
            yy = -3.19126 + (((tickAnim - 282) / 11) * (18.82009-(-3.19126)));
            zz = -16.89868 + (((tickAnim - 282) / 11) * (-17.88518-(-16.89868)));
        }
        else if (tickAnim >= 293 && tickAnim < 305) {
            xx = -22.03545 + (((tickAnim - 293) / 12) * (0-(-22.03545)));
            yy = 18.82009 + (((tickAnim - 293) / 12) * (0-(18.82009)));
            zz = -17.88518 + (((tickAnim - 293) / 12) * (0-(-17.88518)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (61.5-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 16) * (0-(0)));
            zz = 61.5 + (((tickAnim - 19) / 16) * (0-(61.5)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 247) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 247) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 282) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 282) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 11) * (71.25-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 305) {
            xx = 0 + (((tickAnim - 293) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 293) / 12) * (0-(0)));
            zz = 71.25 + (((tickAnim - 293) / 12) * (0-(71.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 282) {
            xx = 0 + (((tickAnim - 0) / 282) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 282) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 282) * (0-(0)));
        }
        else if (tickAnim >= 282 && tickAnim < 293) {
            xx = 0 + (((tickAnim - 282) / 11) * (-1.775-(0)));
            yy = 0 + (((tickAnim - 282) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 282) / 11) * (0-(0)));
        }
        else if (tickAnim >= 293 && tickAnim < 305) {
            xx = -1.775 + (((tickAnim - 293) / 12) * (0-(-1.775)));
            yy = 0 + (((tickAnim - 293) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 293) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 0) / 35) * (-1.25762-(0)));
            yy = 0 + (((tickAnim - 0) / 35) * (16.17365-(0)));
            zz = 0 + (((tickAnim - 0) / 35) * (-7.51835-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 282) {
            xx = -1.25762 + (((tickAnim - 35) / 247) * (-1.25762-(-1.25762)));
            yy = 16.17365 + (((tickAnim - 35) / 247) * (16.17365-(16.17365)));
            zz = -7.51835 + (((tickAnim - 35) / 247) * (-7.51835-(-7.51835)));
        }
        else if (tickAnim >= 282 && tickAnim < 305) {
            xx = -1.25762 + (((tickAnim - 282) / 23) * (0-(-1.25762)));
            yy = 16.17365 + (((tickAnim - 282) / 23) * (0-(16.17365)));
            zz = -7.51835 + (((tickAnim - 282) / 23) * (0-(-7.51835)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMoradisaurus entity = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 16.75 + (((tickAnim - 10) / 10) * (0-(16.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.47483-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.52635-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5.47483-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 5.47483 + (((tickAnim - 10) / 10) * (0-(5.47483)));
            yy = 0.52635 + (((tickAnim - 10) / 10) * (0-(0.52635)));
            zz = -5.47483 + (((tickAnim - 10) / 10) * (0-(-5.47483)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 9.5 + (((tickAnim - 8) / 2) * (0-(9.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMoradisaurus entity = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -15.5 + (((tickAnim - 25) / 15) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -6.25 + (((tickAnim - 25) / 15) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 35.5 + (((tickAnim - 15) / 10) * (40.5-(35.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 40.5 + (((tickAnim - 25) / 8) * (0-(40.5)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMoradisaurus entity = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (53.25449-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-69.87292-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (26.42476-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 53.25449 + (((tickAnim - 20) / 8) * (29.94842-(53.25449)));
            yy = -69.87292 + (((tickAnim - 20) / 8) * (-13.73564-(-69.87292)));
            zz = 26.42476 + (((tickAnim - 20) / 8) * (-19.02027-(26.42476)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 29.94842 + (((tickAnim - 28) / 7) * (18.07016-(29.94842)));
            yy = -13.73564 + (((tickAnim - 28) / 7) * (36.49232-(-13.73564)));
            zz = -19.02027 + (((tickAnim - 28) / 7) * (19.79774-(-19.02027)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 18.07016 + (((tickAnim - 35) / 15) * (0-(18.07016)));
            yy = 36.49232 + (((tickAnim - 35) / 15) * (0-(36.49232)));
            zz = 19.79774 + (((tickAnim - 35) / 15) * (0-(19.79774)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.09318-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-25.1785-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-43.60591-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -5.09318 + (((tickAnim - 10) / 10) * (-21.02815-(-5.09318)));
            yy = -25.1785 + (((tickAnim - 10) / 10) * (2.55268-(-25.1785)));
            zz = -43.60591 + (((tickAnim - 10) / 10) * (-55.69438-(-43.60591)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -21.02815 + (((tickAnim - 20) / 15) * (0-(-21.02815)));
            yy = 2.55268 + (((tickAnim - 20) / 15) * (0-(2.55268)));
            zz = -55.69438 + (((tickAnim - 20) / 15) * (-26.5-(-55.69438)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -26.5 + (((tickAnim - 35) / 15) * (0-(-26.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-18-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (90-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 20) / 8) * (-32.47918-(0)));
            yy = -18 + (((tickAnim - 20) / 8) * (39.47043-(-18)));
            zz = 90 + (((tickAnim - 20) / 8) * (2.79646-(90)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -32.47918 + (((tickAnim - 28) / 7) * (-12.20843-(-32.47918)));
            yy = 39.47043 + (((tickAnim - 28) / 7) * (-13.42742-(39.47043)));
            zz = 2.79646 + (((tickAnim - 28) / 7) * (20.44747-(2.79646)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -12.20843 + (((tickAnim - 35) / 15) * (0-(-12.20843)));
            yy = -13.42742 + (((tickAnim - 35) / 15) * (0-(-13.42742)));
            zz = 20.44747 + (((tickAnim - 35) / 15) * (0-(20.44747)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraMoradisaurus entity = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -4.25 + (((tickAnim - 20) / 10) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -4.25 + (((tickAnim - 30) / 20) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-1.875-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -1.875 + (((tickAnim - 20) / 10) * (-1.875-(-1.875)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -1.875 + (((tickAnim - 30) / 20) * (0-(-1.875)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-29.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -29.5 + (((tickAnim - 20) / 10) * (-29.5-(-29.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -29.5 + (((tickAnim - 30) / 20) * (0-(-29.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (19-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 19 + (((tickAnim - 20) / 10) * (19-(19)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 19 + (((tickAnim - 30) / 20) * (0-(19)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (32-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.5 + (((tickAnim - 20) / 10) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 32 + (((tickAnim - 20) / 10) * (32-(32)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 30) / 20) * (0-(-7.5)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 32 + (((tickAnim - 30) / 20) * (0-(32)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (29.5-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 29.5 + (((tickAnim - 20) / 10) * (29.5-(29.5)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 29.5 + (((tickAnim - 30) / 20) * (0-(29.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-19-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = -19 + (((tickAnim - 20) / 10) * (-19-(-19)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -19 + (((tickAnim - 30) / 20) * (0-(-19)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.26535-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.36609-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-30.52184-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -7.26535 + (((tickAnim - 20) / 10) * (-7.26535-(-7.26535)));
            yy = -0.36609 + (((tickAnim - 20) / 10) * (-0.36609-(-0.36609)));
            zz = -30.52184 + (((tickAnim - 20) / 10) * (-30.52184-(-30.52184)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -7.26535 + (((tickAnim - 30) / 20) * (0-(-7.26535)));
            yy = -0.36609 + (((tickAnim - 30) / 20) * (0-(-0.36609)));
            zz = -30.52184 + (((tickAnim - 30) / 20) * (0-(-30.52184)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = -4.25 + (((tickAnim - 20) / 10) * (-4.25-(-4.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = -4.25 + (((tickAnim - 30) / 20) * (0-(-4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.48801-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0.28965-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.74118-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.48801 + (((tickAnim - 20) / 10) * (-1.48801-(-1.48801)));
            yy = 0.28965 + (((tickAnim - 20) / 10) * (0.28965-(0.28965)));
            zz = 4.74118 + (((tickAnim - 20) / 10) * (4.74118-(4.74118)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.48801 + (((tickAnim - 30) / 20) * (0-(-1.48801)));
            yy = 0.28965 + (((tickAnim - 30) / 20) * (0-(0.28965)));
            zz = 4.74118 + (((tickAnim - 30) / 20) * (0-(4.74118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (4.25-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 4.25 + (((tickAnim - 20) / 10) * (4.25-(4.25)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 4.25 + (((tickAnim - 30) / 20) * (0-(4.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-1.48801-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.28965-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-4.74118-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -1.48801 + (((tickAnim - 20) / 10) * (-1.48801-(-1.48801)));
            yy = -0.28965 + (((tickAnim - 20) / 10) * (-0.28965-(-0.28965)));
            zz = -4.74118 + (((tickAnim - 20) / 10) * (-4.74118-(-4.74118)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = -1.48801 + (((tickAnim - 30) / 20) * (0-(-1.48801)));
            yy = -0.28965 + (((tickAnim - 30) / 20) * (0-(-0.28965)));
            zz = -4.74118 + (((tickAnim - 30) / 20) * (0-(-4.74118)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 9 + (((tickAnim - 20) / 10) * (9-(9)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 9 + (((tickAnim - 30) / 20) * (0-(9)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMoradisaurus entity = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 54.37471 + (((tickAnim - 0) / 5) * (51.03117-(54.37471)));
            yy = -61.25284 + (((tickAnim - 0) / 5) * (-13.47897-(-61.25284)));
            zz = 2.99589 + (((tickAnim - 0) / 5) * (-15.36999-(2.99589)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 51.03117 + (((tickAnim - 5) / 5) * (3.71131-(51.03117)));
            yy = -13.47897 + (((tickAnim - 5) / 5) * (31.62176-(-13.47897)));
            zz = -15.36999 + (((tickAnim - 5) / 5) * (4.11529-(-15.36999)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 3.71131 + (((tickAnim - 10) / 10) * (54.37471-(3.71131)));
            yy = 31.62176 + (((tickAnim - 10) / 10) * (-61.25284-(31.62176)));
            zz = 4.11529 + (((tickAnim - 10) / 10) * (2.99589-(4.11529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -24.91704 + (((tickAnim - 0) / 3) * (-27.29405-(-24.91704)));
            yy = -2.7033 + (((tickAnim - 0) / 3) * (-0.45765-(-2.7033)));
            zz = -36.66374 + (((tickAnim - 0) / 3) * (-25.65674-(-36.66374)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -27.29405 + (((tickAnim - 3) / 5) * (-28.53841-(-27.29405)));
            yy = -0.45765 + (((tickAnim - 3) / 5) * (7.90255-(-0.45765)));
            zz = -25.65674 + (((tickAnim - 3) / 5) * (-40.60018-(-25.65674)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -28.53841 + (((tickAnim - 8) / 2) * (-30.43882-(-28.53841)));
            yy = 7.90255 + (((tickAnim - 8) / 2) * (12.23253-(7.90255)));
            zz = -40.60018 + (((tickAnim - 8) / 2) * (-24.3293-(-40.60018)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -30.43882 + (((tickAnim - 10) / 10) * (-24.91704-(-30.43882)));
            yy = 12.23253 + (((tickAnim - 10) / 10) * (-2.7033-(12.23253)));
            zz = -24.3293 + (((tickAnim - 10) / 10) * (-36.66374-(-24.3293)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -59.39784 + (((tickAnim - 0) / 3) * (-49.23779-(-59.39784)));
            yy = 18.18174 + (((tickAnim - 0) / 3) * (7.85923-(18.18174)));
            zz = 53.39638 + (((tickAnim - 0) / 3) * (77.74052-(53.39638)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -49.23779 + (((tickAnim - 3) / 5) * (-64.62184-(-49.23779)));
            yy = 7.85923 + (((tickAnim - 3) / 5) * (34.5878-(7.85923)));
            zz = 77.74052 + (((tickAnim - 3) / 5) * (5.84256-(77.74052)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -64.62184 + (((tickAnim - 8) / 2) * (-5.25-(-64.62184)));
            yy = 34.5878 + (((tickAnim - 8) / 2) * (0-(34.5878)));
            zz = 5.84256 + (((tickAnim - 8) / 2) * (31.5-(5.84256)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -5.25 + (((tickAnim - 10) / 3) * (-21.67219-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (28.40579-(0)));
            zz = 31.5 + (((tickAnim - 10) / 3) * (20.97347-(31.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -21.67219 + (((tickAnim - 13) / 1) * (-40.60188-(-21.67219)));
            yy = 28.40579 + (((tickAnim - 13) / 1) * (52.25666-(28.40579)));
            zz = 20.97347 + (((tickAnim - 13) / 1) * (-3.38815-(20.97347)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -40.60188 + (((tickAnim - 14) / 4) * (-52.7255-(-40.60188)));
            yy = 52.25666 + (((tickAnim - 14) / 4) * (26.22209-(52.25666)));
            zz = -3.38815 + (((tickAnim - 14) / 4) * (17.33422-(-3.38815)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -52.7255 + (((tickAnim - 18) / 2) * (-59.39784-(-52.7255)));
            yy = 26.22209 + (((tickAnim - 18) / 2) * (18.18174-(26.22209)));
            zz = 17.33422 + (((tickAnim - 18) / 2) * (53.39638-(17.33422)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 3.71131 + (((tickAnim - 0) / 11) * (54.37471-(3.71131)));
            yy = -31.62176 + (((tickAnim - 0) / 11) * (61.25284-(-31.62176)));
            zz = -4.11529 + (((tickAnim - 0) / 11) * (-2.99589-(-4.11529)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = 54.37471 + (((tickAnim - 11) / 5) * (51.03117-(54.37471)));
            yy = 61.25284 + (((tickAnim - 11) / 5) * (13.47897-(61.25284)));
            zz = -2.99589 + (((tickAnim - 11) / 5) * (15.36999-(-2.99589)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 51.03117 + (((tickAnim - 16) / 4) * (3.71131-(51.03117)));
            yy = 13.47897 + (((tickAnim - 16) / 4) * (-31.62176-(13.47897)));
            zz = 15.36999 + (((tickAnim - 16) / 4) * (-4.11529-(15.36999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = -30.43882 + (((tickAnim - 0) / 11) * (-24.91704-(-30.43882)));
            yy = -12.23253 + (((tickAnim - 0) / 11) * (2.7033-(-12.23253)));
            zz = 24.3293 + (((tickAnim - 0) / 11) * (36.66374-(24.3293)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -24.91704 + (((tickAnim - 11) / 2) * (-27.29405-(-24.91704)));
            yy = 2.7033 + (((tickAnim - 11) / 2) * (0.45765-(2.7033)));
            zz = 36.66374 + (((tickAnim - 11) / 2) * (25.65674-(36.66374)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -27.29405 + (((tickAnim - 13) / 5) * (-28.53841-(-27.29405)));
            yy = 0.45765 + (((tickAnim - 13) / 5) * (-7.90255-(0.45765)));
            zz = 25.65674 + (((tickAnim - 13) / 5) * (40.60018-(25.65674)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -28.53841 + (((tickAnim - 18) / 2) * (-30.43882-(-28.53841)));
            yy = -7.90255 + (((tickAnim - 18) / 2) * (-12.23253-(-7.90255)));
            zz = 40.60018 + (((tickAnim - 18) / 2) * (24.3293-(40.60018)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5.25 + (((tickAnim - 0) / 3) * (-20.31198-(-5.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-22.39956-(0)));
            zz = -31.5 + (((tickAnim - 0) / 3) * (-22.79089-(-31.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -20.31198 + (((tickAnim - 3) / 2) * (-36.92334-(-20.31198)));
            yy = -22.39956 + (((tickAnim - 3) / 2) * (-41.97033-(-22.39956)));
            zz = -22.79089 + (((tickAnim - 3) / 2) * (-6.43976-(-22.79089)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -36.92334 + (((tickAnim - 5) / 3) * (-50.18239-(-36.92334)));
            yy = -41.97033 + (((tickAnim - 5) / 3) * (-21.93037-(-41.97033)));
            zz = -6.43976 + (((tickAnim - 5) / 3) * (-22.61217-(-6.43976)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -50.18239 + (((tickAnim - 8) / 3) * (-59.39784-(-50.18239)));
            yy = -21.93037 + (((tickAnim - 8) / 3) * (-18.18174-(-21.93037)));
            zz = -22.61217 + (((tickAnim - 8) / 3) * (-53.39638-(-22.61217)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -59.39784 + (((tickAnim - 11) / 2) * (-49.23779-(-59.39784)));
            yy = -18.18174 + (((tickAnim - 11) / 2) * (-7.85923-(-18.18174)));
            zz = -53.39638 + (((tickAnim - 11) / 2) * (-77.74052-(-53.39638)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -49.23779 + (((tickAnim - 13) / 5) * (-64.62184-(-49.23779)));
            yy = -7.85923 + (((tickAnim - 13) / 5) * (-34.5878-(-7.85923)));
            zz = -77.74052 + (((tickAnim - 13) / 5) * (-5.84256-(-77.74052)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -64.62184 + (((tickAnim - 18) / 2) * (-5.25-(-64.62184)));
            yy = -34.5878 + (((tickAnim - 18) / 2) * (0-(-34.5878)));
            zz = -5.84256 + (((tickAnim - 18) / 2) * (-31.5-(-5.84256)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.86432 + (((tickAnim - 0) / 10) * (16.75-(7.86432)));
            yy = 62.10302 + (((tickAnim - 0) / 10) * (-47.5-(62.10302)));
            zz = 19.5447 + (((tickAnim - 0) / 10) * (0-(19.5447)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 16.75 + (((tickAnim - 10) / 8) * (-5.99563-(16.75)));
            yy = -47.5 + (((tickAnim - 10) / 8) * (41.40097-(-47.5)));
            zz = 0 + (((tickAnim - 10) / 8) * (-8.67296-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -5.99563 + (((tickAnim - 18) / 2) * (7.86432-(-5.99563)));
            yy = 41.40097 + (((tickAnim - 18) / 2) * (62.10302-(41.40097)));
            zz = -8.67296 + (((tickAnim - 18) / 2) * (19.5447-(-8.67296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -39.35867 + (((tickAnim - 0) / 10) * (43.52205-(-39.35867)));
            yy = 18.69362 + (((tickAnim - 0) / 10) * (-31.19458-(18.69362)));
            zz = -51.40355 + (((tickAnim - 0) / 10) * (-27.42163-(-51.40355)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 43.52205 + (((tickAnim - 10) / 3) * (98.8683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(43.52205)));
            yy = -31.19458 + (((tickAnim - 10) / 3) * (-54.19732-(-31.19458)));
            zz = -27.42163 + (((tickAnim - 10) / 3) * (-40.03964-(-27.42163)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 98.8683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 13) / 5) * (-2.16491-(98.8683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = -54.19732 + (((tickAnim - 13) / 5) * (32.37067-(-54.19732)));
            zz = -40.03964 + (((tickAnim - 13) / 5) * (1.34059-(-40.03964)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.16491 + (((tickAnim - 18) / 2) * (-39.35867-(-2.16491)));
            yy = 32.37067 + (((tickAnim - 18) / 2) * (18.69362-(32.37067)));
            zz = 1.34059 + (((tickAnim - 18) / 2) * (-51.40355-(1.34059)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-32.89061-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (15.32254-(0)));
            zz = 31.75 + (((tickAnim - 0) / 4) * (-8.09307-(31.75)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = -32.89061 + (((tickAnim - 4) / 6) * (-14.35287-(-32.89061)));
            yy = 15.32254 + (((tickAnim - 4) / 6) * (8.22609-(15.32254)));
            zz = -8.09307 + (((tickAnim - 4) / 6) * (-14.03751-(-8.09307)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -14.35287 + (((tickAnim - 10) / 4) * (-2.01802-(-14.35287)));
            yy = 8.22609 + (((tickAnim - 10) / 4) * (12.15316-(8.22609)));
            zz = -14.03751 + (((tickAnim - 10) / 4) * (59.28168-(-14.03751)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.01802 + (((tickAnim - 14) / 4) * (-0.1178-(-2.01802)));
            yy = 12.15316 + (((tickAnim - 14) / 4) * (7.50296-(12.15316)));
            zz = 59.28168 + (((tickAnim - 14) / 4) * (79.68138-(59.28168)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -0.1178 + (((tickAnim - 18) / 2) * (0-(-0.1178)));
            yy = 7.50296 + (((tickAnim - 18) / 2) * (0-(7.50296)));
            zz = 79.68138 + (((tickAnim - 18) / 2) * (31.75-(79.68138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.575-(0)));
            yy = -0.55 + (((tickAnim - 0) / 10) * (-0.475-(-0.55)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -0.575 + (((tickAnim - 10) / 4) * (-2.28-(-0.575)));
            yy = -0.475 + (((tickAnim - 10) / 4) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.28 + (((tickAnim - 14) / 4) * (-2.3-(-2.28)));
            yy = -0.475 + (((tickAnim - 14) / 4) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.3 + (((tickAnim - 18) / 2) * (0-(-2.3)));
            yy = 0 + (((tickAnim - 18) / 2) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.75 + (((tickAnim - 0) / 8) * (-5.99563-(16.75)));
            yy = 47.5 + (((tickAnim - 0) / 8) * (-41.40097-(47.5)));
            zz = 0 + (((tickAnim - 0) / 8) * (8.67296-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -5.99563 + (((tickAnim - 8) / 3) * (7.86432-(-5.99563)));
            yy = -41.40097 + (((tickAnim - 8) / 3) * (-62.10302-(-41.40097)));
            zz = 8.67296 + (((tickAnim - 8) / 3) * (-19.5447-(8.67296)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 7.86432 + (((tickAnim - 11) / 9) * (16.75-(7.86432)));
            yy = -62.10302 + (((tickAnim - 11) / 9) * (47.5-(-62.10302)));
            zz = -19.5447 + (((tickAnim - 11) / 9) * (0-(-19.5447)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 43.52205 + (((tickAnim - 0) / 3) * (69.7933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(43.52205)));
            yy = 31.19458 + (((tickAnim - 0) / 3) * (54.19732-(31.19458)));
            zz = 27.42163 + (((tickAnim - 0) / 3) * (40.03964-(27.42163)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 69.7933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 3) / 5) * (-2.16491-(69.7933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 54.19732 + (((tickAnim - 3) / 5) * (-32.37067-(54.19732)));
            zz = 40.03964 + (((tickAnim - 3) / 5) * (-1.34059-(40.03964)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -2.16491 + (((tickAnim - 8) / 3) * (-39.35867-(-2.16491)));
            yy = -32.37067 + (((tickAnim - 8) / 3) * (-18.69362-(-32.37067)));
            zz = -1.34059 + (((tickAnim - 8) / 3) * (51.40355-(-1.34059)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -39.35867 + (((tickAnim - 11) / 9) * (43.52205-(-39.35867)));
            yy = -18.69362 + (((tickAnim - 11) / 9) * (31.19458-(-18.69362)));
            zz = 51.40355 + (((tickAnim - 11) / 9) * (27.42163-(51.40355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -14.35287 + (((tickAnim - 0) / 5) * (-2.01802-(-14.35287)));
            yy = -8.22609 + (((tickAnim - 0) / 5) * (-12.15316-(-8.22609)));
            zz = 14.03751 + (((tickAnim - 0) / 5) * (-59.28168-(14.03751)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.01802 + (((tickAnim - 5) / 3) * (-0.1178-(-2.01802)));
            yy = -12.15316 + (((tickAnim - 5) / 3) * (-7.50296-(-12.15316)));
            zz = -59.28168 + (((tickAnim - 5) / 3) * (-79.68138-(-59.28168)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -0.1178 + (((tickAnim - 8) / 3) * (0-(-0.1178)));
            yy = -7.50296 + (((tickAnim - 8) / 3) * (0-(-7.50296)));
            zz = -79.68138 + (((tickAnim - 8) / 3) * (-31.75-(-79.68138)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (-23.37237-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (0.29077-(0)));
            zz = -31.75 + (((tickAnim - 11) / 2) * (-5.01361-(-31.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -23.37237 + (((tickAnim - 13) / 3) * (-31.06921-(-23.37237)));
            yy = 0.29077 + (((tickAnim - 13) / 3) * (0.6397-(0.29077)));
            zz = -5.01361 + (((tickAnim - 13) / 3) * (27.07006-(-5.01361)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -31.06921 + (((tickAnim - 16) / 4) * (-14.35287-(-31.06921)));
            yy = 0.6397 + (((tickAnim - 16) / 4) * (-8.22609-(0.6397)));
            zz = 27.07006 + (((tickAnim - 16) / 4) * (14.03751-(27.07006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.575 + (((tickAnim - 0) / 5) * (2.28-(0.575)));
            yy = -0.475 + (((tickAnim - 0) / 5) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.28 + (((tickAnim - 5) / 3) * (2.3-(2.28)));
            yy = -0.475 + (((tickAnim - 5) / 3) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 2.3 + (((tickAnim - 8) / 3) * (-0.275-(2.3)));
            yy = 0 + (((tickAnim - 8) / 3) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 16) {
            xx = -0.275 + (((tickAnim - 11) / 5) * (0.17-(-0.275)));
            yy = -0.65 + (((tickAnim - 11) / 5) * (-0.26-(-0.65)));
            zz = 0 + (((tickAnim - 11) / 5) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0.17 + (((tickAnim - 16) / 4) * (0.575-(0.17)));
            yy = -0.26 + (((tickAnim - 16) / 4) * (-0.475-(-0.26)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-150))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-330))*0.5);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-250))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*-5), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*4));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-350))*3), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*4), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-5), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/0.5-450))*-4), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(7.5), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-300))*5), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraMoradisaurus entity = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 54.37471 + (((tickAnim - 0) / 8) * (51.03117-(54.37471)));
            yy = -61.25284 + (((tickAnim - 0) / 8) * (-13.47897-(-61.25284)));
            zz = 2.99589 + (((tickAnim - 0) / 8) * (-15.36999-(2.99589)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 51.03117 + (((tickAnim - 8) / 9) * (3.71131-(51.03117)));
            yy = -13.47897 + (((tickAnim - 8) / 9) * (31.62176-(-13.47897)));
            zz = -15.36999 + (((tickAnim - 8) / 9) * (4.11529-(-15.36999)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 3.71131 + (((tickAnim - 17) / 18) * (54.37471-(3.71131)));
            yy = 31.62176 + (((tickAnim - 17) / 18) * (-61.25284-(31.62176)));
            zz = 4.11529 + (((tickAnim - 17) / 18) * (2.99589-(4.11529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -24.91704 + (((tickAnim - 0) / 4) * (-27.29405-(-24.91704)));
            yy = -2.7033 + (((tickAnim - 0) / 4) * (-0.45765-(-2.7033)));
            zz = -36.66374 + (((tickAnim - 0) / 4) * (-25.65674-(-36.66374)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -27.29405 + (((tickAnim - 4) / 9) * (-28.53841-(-27.29405)));
            yy = -0.45765 + (((tickAnim - 4) / 9) * (7.90255-(-0.45765)));
            zz = -25.65674 + (((tickAnim - 4) / 9) * (-40.60018-(-25.65674)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -28.53841 + (((tickAnim - 13) / 4) * (-30.43882-(-28.53841)));
            yy = 7.90255 + (((tickAnim - 13) / 4) * (12.23253-(7.90255)));
            zz = -40.60018 + (((tickAnim - 13) / 4) * (-24.3293-(-40.60018)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = -30.43882 + (((tickAnim - 17) / 18) * (-24.91704-(-30.43882)));
            yy = 12.23253 + (((tickAnim - 17) / 18) * (-2.7033-(12.23253)));
            zz = -24.3293 + (((tickAnim - 17) / 18) * (-36.66374-(-24.3293)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -59.39784 + (((tickAnim - 0) / 4) * (-49.23779-(-59.39784)));
            yy = 18.18174 + (((tickAnim - 0) / 4) * (7.85923-(18.18174)));
            zz = 53.39638 + (((tickAnim - 0) / 4) * (77.74052-(53.39638)));
        }
        else if (tickAnim >= 4 && tickAnim < 13) {
            xx = -49.23779 + (((tickAnim - 4) / 9) * (-64.62184-(-49.23779)));
            yy = 7.85923 + (((tickAnim - 4) / 9) * (34.5878-(7.85923)));
            zz = 77.74052 + (((tickAnim - 4) / 9) * (5.84256-(77.74052)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -64.62184 + (((tickAnim - 13) / 4) * (-5.25-(-64.62184)));
            yy = 34.5878 + (((tickAnim - 13) / 4) * (0-(34.5878)));
            zz = 5.84256 + (((tickAnim - 13) / 4) * (31.5-(5.84256)));
        }
        else if (tickAnim >= 17 && tickAnim < 21) {
            xx = -5.25 + (((tickAnim - 17) / 4) * (-21.67219-(-5.25)));
            yy = 0 + (((tickAnim - 17) / 4) * (28.40579-(0)));
            zz = 31.5 + (((tickAnim - 17) / 4) * (20.97347-(31.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -21.67219 + (((tickAnim - 21) / 4) * (-40.60188-(-21.67219)));
            yy = 28.40579 + (((tickAnim - 21) / 4) * (52.25666-(28.40579)));
            zz = 20.97347 + (((tickAnim - 21) / 4) * (-3.38815-(20.97347)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -40.60188 + (((tickAnim - 25) / 5) * (-52.7255-(-40.60188)));
            yy = 52.25666 + (((tickAnim - 25) / 5) * (26.22209-(52.25666)));
            zz = -3.38815 + (((tickAnim - 25) / 5) * (17.33422-(-3.38815)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -52.7255 + (((tickAnim - 30) / 5) * (-59.39784-(-52.7255)));
            yy = 26.22209 + (((tickAnim - 30) / 5) * (18.18174-(26.22209)));
            zz = 17.33422 + (((tickAnim - 30) / 5) * (53.39638-(17.33422)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 3.71131 + (((tickAnim - 0) / 18) * (54.37471-(3.71131)));
            yy = -31.62176 + (((tickAnim - 0) / 18) * (61.25284-(-31.62176)));
            zz = -4.11529 + (((tickAnim - 0) / 18) * (-2.99589-(-4.11529)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 54.37471 + (((tickAnim - 18) / 9) * (51.03117-(54.37471)));
            yy = 61.25284 + (((tickAnim - 18) / 9) * (13.47897-(61.25284)));
            zz = -2.99589 + (((tickAnim - 18) / 9) * (15.36999-(-2.99589)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 51.03117 + (((tickAnim - 27) / 8) * (3.71131-(51.03117)));
            yy = 13.47897 + (((tickAnim - 27) / 8) * (-31.62176-(13.47897)));
            zz = 15.36999 + (((tickAnim - 27) / 8) * (-4.11529-(15.36999)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -30.43882 + (((tickAnim - 0) / 18) * (-24.91704-(-30.43882)));
            yy = -12.23253 + (((tickAnim - 0) / 18) * (2.7033-(-12.23253)));
            zz = 24.3293 + (((tickAnim - 0) / 18) * (36.66374-(24.3293)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -24.91704 + (((tickAnim - 18) / 5) * (-27.29405-(-24.91704)));
            yy = 2.7033 + (((tickAnim - 18) / 5) * (0.45765-(2.7033)));
            zz = 36.66374 + (((tickAnim - 18) / 5) * (25.65674-(36.66374)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -27.29405 + (((tickAnim - 23) / 8) * (-28.53841-(-27.29405)));
            yy = 0.45765 + (((tickAnim - 23) / 8) * (-7.90255-(0.45765)));
            zz = 25.65674 + (((tickAnim - 23) / 8) * (40.60018-(25.65674)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -28.53841 + (((tickAnim - 31) / 4) * (-30.43882-(-28.53841)));
            yy = -7.90255 + (((tickAnim - 31) / 4) * (-12.23253-(-7.90255)));
            zz = 40.60018 + (((tickAnim - 31) / 4) * (24.3293-(40.60018)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -5.25 + (((tickAnim - 0) / 4) * (-20.31198-(-5.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (-22.39956-(0)));
            zz = -31.5 + (((tickAnim - 0) / 4) * (-22.79089-(-31.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -20.31198 + (((tickAnim - 4) / 4) * (-36.92334-(-20.31198)));
            yy = -22.39956 + (((tickAnim - 4) / 4) * (-41.97033-(-22.39956)));
            zz = -22.79089 + (((tickAnim - 4) / 4) * (-6.43976-(-22.79089)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -36.92334 + (((tickAnim - 8) / 5) * (-50.18239-(-36.92334)));
            yy = -41.97033 + (((tickAnim - 8) / 5) * (-21.93037-(-41.97033)));
            zz = -6.43976 + (((tickAnim - 8) / 5) * (-22.61217-(-6.43976)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -50.18239 + (((tickAnim - 13) / 5) * (-59.39784-(-50.18239)));
            yy = -21.93037 + (((tickAnim - 13) / 5) * (-18.18174-(-21.93037)));
            zz = -22.61217 + (((tickAnim - 13) / 5) * (-53.39638-(-22.61217)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = -59.39784 + (((tickAnim - 18) / 5) * (-49.23779-(-59.39784)));
            yy = -18.18174 + (((tickAnim - 18) / 5) * (-7.85923-(-18.18174)));
            zz = -53.39638 + (((tickAnim - 18) / 5) * (-77.74052-(-53.39638)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -49.23779 + (((tickAnim - 23) / 8) * (-64.62184-(-49.23779)));
            yy = -7.85923 + (((tickAnim - 23) / 8) * (-34.5878-(-7.85923)));
            zz = -77.74052 + (((tickAnim - 23) / 8) * (-5.84256-(-77.74052)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -64.62184 + (((tickAnim - 31) / 4) * (-5.25-(-64.62184)));
            yy = -34.5878 + (((tickAnim - 31) / 4) * (0-(-34.5878)));
            zz = -5.84256 + (((tickAnim - 31) / 4) * (-31.5-(-5.84256)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 7.86432 + (((tickAnim - 0) / 17) * (16.75-(7.86432)));
            yy = 62.10302 + (((tickAnim - 0) / 17) * (-47.5-(62.10302)));
            zz = 19.5447 + (((tickAnim - 0) / 17) * (0-(19.5447)));
        }
        else if (tickAnim >= 17 && tickAnim < 31) {
            xx = 16.75 + (((tickAnim - 17) / 14) * (-5.99563-(16.75)));
            yy = -47.5 + (((tickAnim - 17) / 14) * (41.40097-(-47.5)));
            zz = 0 + (((tickAnim - 17) / 14) * (-8.67296-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -5.99563 + (((tickAnim - 31) / 4) * (7.86432-(-5.99563)));
            yy = 41.40097 + (((tickAnim - 31) / 4) * (62.10302-(41.40097)));
            zz = -8.67296 + (((tickAnim - 31) / 4) * (19.5447-(-8.67296)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -39.35867 + (((tickAnim - 0) / 17) * (43.52205-(-39.35867)));
            yy = 18.69362 + (((tickAnim - 0) / 17) * (-31.19458-(18.69362)));
            zz = -51.40355 + (((tickAnim - 0) / 17) * (-27.42163-(-51.40355)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 43.52205 + (((tickAnim - 17) / 6) * (98.8683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(43.52205)));
            yy = -31.19458 + (((tickAnim - 17) / 6) * (-54.19732-(-31.19458)));
            zz = -27.42163 + (((tickAnim - 17) / 6) * (-40.03964-(-27.42163)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = 98.8683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 23) / 8) * (-2.16491-(98.8683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = -54.19732 + (((tickAnim - 23) / 8) * (32.37067-(-54.19732)));
            zz = -40.03964 + (((tickAnim - 23) / 8) * (1.34059-(-40.03964)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -2.16491 + (((tickAnim - 31) / 4) * (-39.35867-(-2.16491)));
            yy = 32.37067 + (((tickAnim - 31) / 4) * (18.69362-(32.37067)));
            zz = 1.34059 + (((tickAnim - 31) / 4) * (-51.40355-(1.34059)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-28.62842-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (7.86914-(0)));
            zz = 31.75 + (((tickAnim - 0) / 8) * (-22.84717-(31.75)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -28.62842 + (((tickAnim - 8) / 9) * (-14.35287-(-28.62842)));
            yy = 7.86914 + (((tickAnim - 8) / 9) * (8.22609-(7.86914)));
            zz = -22.84717 + (((tickAnim - 8) / 9) * (-14.03751-(-22.84717)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -14.35287 + (((tickAnim - 17) / 8) * (-2.01802-(-14.35287)));
            yy = 8.22609 + (((tickAnim - 17) / 8) * (12.15316-(8.22609)));
            zz = -14.03751 + (((tickAnim - 17) / 8) * (59.28168-(-14.03751)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -2.01802 + (((tickAnim - 25) / 6) * (-0.1178-(-2.01802)));
            yy = 12.15316 + (((tickAnim - 25) / 6) * (7.50296-(12.15316)));
            zz = 59.28168 + (((tickAnim - 25) / 6) * (79.68138-(59.28168)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -0.1178 + (((tickAnim - 31) / 4) * (0-(-0.1178)));
            yy = 7.50296 + (((tickAnim - 31) / 4) * (0-(7.50296)));
            zz = 79.68138 + (((tickAnim - 31) / 4) * (31.75-(79.68138)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-0.575-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.475-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -0.575 + (((tickAnim - 17) / 8) * (-2.28-(-0.575)));
            yy = -0.475 + (((tickAnim - 17) / 8) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 31) {
            xx = -2.28 + (((tickAnim - 25) / 6) * (-2.3-(-2.28)));
            yy = -0.475 + (((tickAnim - 25) / 6) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 25) / 6) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = -2.3 + (((tickAnim - 31) / 4) * (0-(-2.3)));
            yy = 0 + (((tickAnim - 31) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 16.75 + (((tickAnim - 0) / 14) * (-5.99563-(16.75)));
            yy = 47.5 + (((tickAnim - 0) / 14) * (-41.40097-(47.5)));
            zz = 0 + (((tickAnim - 0) / 14) * (8.67296-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -5.99563 + (((tickAnim - 14) / 4) * (7.86432-(-5.99563)));
            yy = -41.40097 + (((tickAnim - 14) / 4) * (-62.10302-(-41.40097)));
            zz = 8.67296 + (((tickAnim - 14) / 4) * (-19.5447-(8.67296)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = 7.86432 + (((tickAnim - 18) / 17) * (16.75-(7.86432)));
            yy = -62.10302 + (((tickAnim - 18) / 17) * (47.5-(-62.10302)));
            zz = -19.5447 + (((tickAnim - 18) / 17) * (0-(-19.5447)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 43.52205 + (((tickAnim - 0) / 6) * (69.7933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50-(43.52205)));
            yy = 31.19458 + (((tickAnim - 0) / 6) * (54.19732-(31.19458)));
            zz = 27.42163 + (((tickAnim - 0) / 6) * (40.03964-(27.42163)));
        }
        else if (tickAnim >= 6 && tickAnim < 14) {
            xx = 69.7933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50 + (((tickAnim - 6) / 8) * (-2.16491-(69.7933+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*-50)));
            yy = 54.19732 + (((tickAnim - 6) / 8) * (-32.37067-(54.19732)));
            zz = 40.03964 + (((tickAnim - 6) / 8) * (-1.34059-(40.03964)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -2.16491 + (((tickAnim - 14) / 4) * (-39.35867-(-2.16491)));
            yy = -32.37067 + (((tickAnim - 14) / 4) * (-18.69362-(-32.37067)));
            zz = -1.34059 + (((tickAnim - 14) / 4) * (51.40355-(-1.34059)));
        }
        else if (tickAnim >= 18 && tickAnim < 35) {
            xx = -39.35867 + (((tickAnim - 18) / 17) * (43.52205-(-39.35867)));
            yy = -18.69362 + (((tickAnim - 18) / 17) * (31.19458-(-18.69362)));
            zz = 51.40355 + (((tickAnim - 18) / 17) * (27.42163-(51.40355)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -14.35287 + (((tickAnim - 0) / 8) * (-2.01802-(-14.35287)));
            yy = -8.22609 + (((tickAnim - 0) / 8) * (-12.15316-(-8.22609)));
            zz = 14.03751 + (((tickAnim - 0) / 8) * (-59.28168-(14.03751)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -2.01802 + (((tickAnim - 8) / 6) * (-0.1178-(-2.01802)));
            yy = -12.15316 + (((tickAnim - 8) / 6) * (-7.50296-(-12.15316)));
            zz = -59.28168 + (((tickAnim - 8) / 6) * (-79.68138-(-59.28168)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -0.1178 + (((tickAnim - 14) / 4) * (0-(-0.1178)));
            yy = -7.50296 + (((tickAnim - 14) / 4) * (0-(-7.50296)));
            zz = -79.68138 + (((tickAnim - 14) / 4) * (-31.75-(-79.68138)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (-23.37237-(0)));
            yy = 0 + (((tickAnim - 18) / 5) * (0.29077-(0)));
            zz = -31.75 + (((tickAnim - 18) / 5) * (-5.01361-(-31.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -23.37237 + (((tickAnim - 23) / 5) * (-31.06921-(-23.37237)));
            yy = 0.29077 + (((tickAnim - 23) / 5) * (0.6397-(0.29077)));
            zz = -5.01361 + (((tickAnim - 23) / 5) * (27.07006-(-5.01361)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = -31.06921 + (((tickAnim - 28) / 7) * (-14.35287-(-31.06921)));
            yy = 0.6397 + (((tickAnim - 28) / 7) * (-8.22609-(0.6397)));
            zz = 27.07006 + (((tickAnim - 28) / 7) * (14.03751-(27.07006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.575 + (((tickAnim - 0) / 8) * (2.28-(0.575)));
            yy = -0.475 + (((tickAnim - 0) / 8) * (-0.475-(-0.475)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 2.28 + (((tickAnim - 8) / 6) * (2.3-(2.28)));
            yy = -0.475 + (((tickAnim - 8) / 6) * (0-(-0.475)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 2.3 + (((tickAnim - 14) / 4) * (0-(2.3)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 18) / 10) * (0.17-(0)));
            yy = 0 + (((tickAnim - 18) / 10) * (-0.26-(0)));
            zz = 0 + (((tickAnim - 18) / 10) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 35) {
            xx = 0.17 + (((tickAnim - 28) / 7) * (0.575-(0.17)));
            yy = -0.26 + (((tickAnim - 28) / 7) * (-0.475-(-0.26)));
            zz = 0 + (((tickAnim - 28) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-150))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-50))*2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*0.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-330))*0.35);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-250))*1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-100))*-2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*2));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-350))*1), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*2), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-450))*2), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*-2), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*-2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*205.5/0.5-450))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-150))*2), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-200))*2), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-250))*2), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*206-300))*2), tail4.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraMoradisaurus ee = (EntityPrehistoricFloraMoradisaurus) entitylivingbaseIn;

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
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraMoradisaurus e = (EntityPrehistoricFloraMoradisaurus) entity;

    }
}
