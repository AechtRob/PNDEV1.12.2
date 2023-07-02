package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPiatnitzkysaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPiatnitzkysaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRendererExtended root;
    private final AdvancedModelRendererExtended hips;
    private final AdvancedModelRendererExtended basin_r1;
    private final AdvancedModelRendererExtended rightLeg;
    private final AdvancedModelRendererExtended rightLeg2;
    private final AdvancedModelRendererExtended rightLeg3;
    private final AdvancedModelRendererExtended rightLeg4;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended leftLeg;
    private final AdvancedModelRendererExtended leftLeg2;
    private final AdvancedModelRendererExtended leftLeg3;
    private final AdvancedModelRendererExtended leftLeg4;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended tail1;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended tail5;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended chest;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended rightArm;
    private final AdvancedModelRendererExtended rightArm2;
    private final AdvancedModelRendererExtended rightArm3;
    private final AdvancedModelRendererExtended leftArm;
    private final AdvancedModelRendererExtended leftArm2;
    private final AdvancedModelRendererExtended leftArm3;
    private final AdvancedModelRendererExtended neck1;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended neck2;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended neck3;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended Leftcrestfront_r1;
    private final AdvancedModelRendererExtended Leftcrestfront_r2;
    private final AdvancedModelRendererExtended Leftcrestfront_r3;
    private final AdvancedModelRendererExtended Leftcrestfront_r4;
    private final AdvancedModelRendererExtended Upperjawbase_r1;
    private final AdvancedModelRendererExtended Upperjawbase_r2;
    private final AdvancedModelRendererExtended Upperjawslopebase_r1;
    private final AdvancedModelRendererExtended Upperjawslopefront_r1;
    private final AdvancedModelRendererExtended Upperjawslopefront_r2;
    private final AdvancedModelRendererExtended Upperjawslopefront_r3;
    private final AdvancedModelRendererExtended Leftcrestfront_r5;
    private final AdvancedModelRendererExtended Leftcrestfront_r6;
    private final AdvancedModelRendererExtended Upperjawfront_r1;
    private final AdvancedModelRendererExtended Upperjawfront_r2;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended Lowerjawslope_r1;
    private final AdvancedModelRendererExtended Lowerjawfront_r1;
    private final AdvancedModelRendererExtended Lowerjawmiddle_r1;
    private final AdvancedModelRendererExtended Lowerjawbase_r1;
    private final AdvancedModelRendererExtended throat;
    private final AdvancedModelRendererExtended Lowerjawbase_r2;

    private ModelAnimator animator;

    public ModelPiatnitzkysaurus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.root = new AdvancedModelRendererExtended(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.hips = new AdvancedModelRendererExtended(this);
        this.hips.setRotationPoint(0.0F, -24.0F, 3.2F);
        this.root.addChild(hips);


        this.basin_r1 = new AdvancedModelRendererExtended(this);
        this.basin_r1.setRotationPoint(0.5F, -5.2F, -4.0F);
        this.hips.addChild(basin_r1);
        this.setRotateAngle(basin_r1, -0.1134F, 0.0F, 0.0F);
        this.basin_r1.cubeList.add(new ModelBox(basin_r1, 0, 28, -4.5F, 0.575F, -1.0F, 8, 12, 12, 0.0F, false));

        this.rightLeg = new AdvancedModelRendererExtended(this);
        this.rightLeg.setRotationPoint(-3.58F, -0.04F, -0.92F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.2618F, 0.0F, 0.0F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 0, 52, -2.8F, -1.7177F, -3.5102F, 6, 13, 8, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRendererExtended(this);
        this.rightLeg2.setRotationPoint(-0.48F, 10.8967F, -2.8334F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.6981F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 48, 70, -1.84F, -0.1561F, -0.5161F, 4, 10, 4, 0.0F, false));
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 28, -1.8402F, -0.1559F, 3.1637F, 4, 10, 1, -0.001F, false));

        this.rightLeg3 = new AdvancedModelRendererExtended(this);
        this.rightLeg3.setRotationPoint(0.0F, 9.5911F, 3.7661F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, -0.6545F, 0.0F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 0, 0, -1.52F, -0.0728F, -2.7577F, 3, 7, 3, 0.0F, false));

        this.rightLeg4 = new AdvancedModelRendererExtended(this);
        this.rightLeg4.setRotationPoint(0.0F, 6.1094F, -0.4317F);
        this.rightLeg3.addChild(rightLeg4);
        this.setRotateAngle(rightLeg4, 0.1745F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -0.0216F, 0.1618F);
        this.rightLeg4.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 65, 0, -2.32F, -0.8F, -5.4F, 5, 2, 6, 0.0F, false));

        this.leftLeg = new AdvancedModelRendererExtended(this);
        this.leftLeg.setRotationPoint(3.58F, -0.04F, -0.92F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.2618F, 0.0F, 0.0F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 0, 52, -3.2F, -1.7177F, -3.5102F, 6, 13, 8, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRendererExtended(this);
        this.leftLeg2.setRotationPoint(0.48F, 10.8967F, -2.8334F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.6981F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 48, 70, -2.16F, -0.1561F, -0.5161F, 4, 10, 4, 0.0F, true));
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 28, -2.1598F, -0.1559F, 3.1637F, 4, 10, 1, -0.001F, true));

        this.leftLeg3 = new AdvancedModelRendererExtended(this);
        this.leftLeg3.setRotationPoint(0.0F, 9.5911F, 3.7661F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, -0.6545F, 0.0F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 0, 0, -1.48F, -0.0728F, -2.7577F, 3, 7, 3, 0.0F, true));

        this.leftLeg4 = new AdvancedModelRendererExtended(this);
        this.leftLeg4.setRotationPoint(0.0F, 6.1094F, -0.4317F);
        this.leftLeg3.addChild(leftLeg4);
        this.setRotateAngle(leftLeg4, 0.1745F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -0.0216F, 0.1618F);
        this.leftLeg4.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 65, 0, -2.68F, -0.8F, -5.4F, 5, 2, 6, 0.0F, true));

        this.tail1 = new AdvancedModelRendererExtended(this);
        this.tail1.setRotationPoint(0.0F, -1.1F, 6.48F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.0436F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 36, 16, -3.0F, -2.1332F, -1.3201F, 6, 9, 12, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.0F, -0.251F, 10.4559F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, 0.0436F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 27, 39, -2.0F, -1.8399F, -3.7761F, 4, 7, 13, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, -0.1431F, 8.9062F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 0, -1.5F, -1.5996F, -0.0004F, 3, 5, 11, -0.002F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, -0.4F, 10.8F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1571F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 37, -1.0F, -0.9642F, 0.0758F, 2, 3, 11, 0.0F, false));

        this.tail5 = new AdvancedModelRendererExtended(this);
        this.tail5.setRotationPoint(0.0F, 0.1842F, 10.9692F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.3491F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(-0.4F, -1.2747F, 1.6399F);
        this.tail5.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 60, 16, -0.1F, 0.3061F, -2.2122F, 1, 2, 9, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, -2.46F, -4.12F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, -2.34F, -15.8F, 9, 13, 15, 0.02F, false));

        this.chest = new AdvancedModelRendererExtended(this);
        this.chest.setRotationPoint(0.0F, 0.4F, -15.6F);
        this.body.addChild(chest);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(-0.3F, -1.1F, -1.0F);
        this.chest.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 52, -3.7F, -1.465F, -5.6F, 8, 11, 7, 0.0F, false));

        this.rightArm = new AdvancedModelRendererExtended(this);
        this.rightArm.setRotationPoint(-4.4F, 5.97F, -4.16F);
        this.chest.addChild(rightArm);
        this.setRotateAngle(rightArm, -0.7418F, 0.0F, 0.0F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 32, 73, -1.0398F, -1.7213F, -0.7832F, 2, 3, 6, 0.001F, false));

        this.rightArm2 = new AdvancedModelRendererExtended(this);
        this.rightArm2.setRotationPoint(-0.24F, -0.9233F, 5.1656F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.829F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 77, 52, -0.8F, -0.3052F, -0.271F, 2, 2, 5, 0.0F, false));
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 75, 25, -0.8002F, 0.255F, -0.2712F, 2, 2, 5, -0.001F, false));

        this.rightArm3 = new AdvancedModelRendererExtended(this);
        this.rightArm3.setRotationPoint(0.45F, 1.1232F, 4.1629F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 0.0F, 0.3491F, 0.0F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 0, 73, -0.5752F, -1.66F, -0.2232F, 1, 3, 7, 0.0F, false));

        this.leftArm = new AdvancedModelRendererExtended(this);
        this.leftArm.setRotationPoint(4.4F, 5.97F, -4.16F);
        this.chest.addChild(leftArm);
        this.setRotateAngle(leftArm, -0.7418F, 0.0F, 0.0F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 32, 73, -0.9602F, -1.7213F, -0.7832F, 2, 3, 6, 0.001F, true));

        this.leftArm2 = new AdvancedModelRendererExtended(this);
        this.leftArm2.setRotationPoint(0.24F, -0.9233F, 5.1656F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.829F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 77, 52, -1.2F, -0.3052F, -0.271F, 2, 2, 5, 0.0F, true));
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 75, 25, -1.1998F, 0.255F, -0.2712F, 2, 2, 5, -0.001F, true));

        this.leftArm3 = new AdvancedModelRendererExtended(this);
        this.leftArm3.setRotationPoint(-0.45F, 1.1232F, 4.1629F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 0.0F, -0.3491F, 0.0F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 0, 73, -0.4248F, -1.66F, -0.2232F, 1, 3, 7, 0.0F, true));

        this.neck1 = new AdvancedModelRendererExtended(this);
        this.neck1.setRotationPoint(0.0F, -0.34F, -5.12F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.0873F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -1.0F, 1.9231F);
        this.neck1.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 67, 32, -3.0F, 0.1082F, -4.684F, 6, 8, 5, 0.0F, false));

        this.neck2 = new AdvancedModelRendererExtended(this);
        this.neck2.setRotationPoint(0.0F, 0.82F, -1.6769F);
        this.neck1.addChild(neck2);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, -3.5F, -4.0F);
        this.neck2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4014F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 59, -2.5F, -0.318F, -0.322F, 5, 7, 7, -0.01F, false));

        this.neck3 = new AdvancedModelRendererExtended(this);
        this.neck3.setRotationPoint(0.0F, -2.9F, -4.4F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0436F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, -0.94F, -2.88F);
        this.neck3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1309F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 63, 45, -2.0F, 0.0637F, -0.4508F, 4, 2, 1, -0.004F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -0.92F, -2.72F);
        this.neck3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0262F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 73, -2.5F, 0.0F, -0.08F, 5, 7, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.37F, -2.46F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 0.3927F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 64, 70, -2.5F, -0.6956F, -4.9082F, 5, 4, 5, 0.02F, false));

        this.Leftcrestfront_r1 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r1.setRotationPoint(1.521F, -0.1245F, -5.9587F);
        this.head.addChild(Leftcrestfront_r1);
        this.setRotateAngle(Leftcrestfront_r1, 0.233F, 0.5099F, 0.023F);
        this.Leftcrestfront_r1.cubeList.add(new ModelBox(Leftcrestfront_r1, 48, 42, -0.5F, -0.5F, -1.5F, 1, 1, 4, -0.12F, true));

        this.Leftcrestfront_r2 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r2.setRotationPoint(1.1954F, 0.7585F, -6.5484F);
        this.head.addChild(Leftcrestfront_r2);
        this.setRotateAngle(Leftcrestfront_r2, 0.2823F, 0.2737F, 0.1149F);
        this.Leftcrestfront_r2.cubeList.add(new ModelBox(Leftcrestfront_r2, 47, 0, -0.75F, -1.1F, -1.75F, 1, 3, 4, -0.12F, true));

        this.Leftcrestfront_r3 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r3.setRotationPoint(1.521F, -0.1245F, -5.9587F);
        this.head.addChild(Leftcrestfront_r3);
        this.setRotateAngle(Leftcrestfront_r3, 0.3458F, 0.4641F, 0.3308F);
        this.Leftcrestfront_r3.cubeList.add(new ModelBox(Leftcrestfront_r3, 33, 0, -0.675F, 0.1F, -0.5F, 1, 2, 2, -0.12F, true));

        this.Leftcrestfront_r4 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r4.setRotationPoint(-1.1954F, 0.7585F, -6.5484F);
        this.head.addChild(Leftcrestfront_r4);
        this.setRotateAngle(Leftcrestfront_r4, 0.2823F, -0.2737F, -0.1149F);
        this.Leftcrestfront_r4.cubeList.add(new ModelBox(Leftcrestfront_r4, 47, 0, -0.25F, -1.1F, -1.75F, 1, 3, 4, -0.12F, false));

        this.Upperjawbase_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawbase_r1.setRotationPoint(0.0F, 16.3793F, 23.1894F);
        this.head.addChild(Upperjawbase_r1);
        this.setRotateAngle(Upperjawbase_r1, -0.0698F, 0.0F, 0.0F);
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 0, 10, -1.5F, -11.3506F, -32.5721F, 3, 1, 4, -0.2F, false));

        this.Upperjawbase_r2 = new AdvancedModelRendererExtended(this);
        this.Upperjawbase_r2.setRotationPoint(0.0F, 16.1793F, 23.1894F);
        this.head.addChild(Upperjawbase_r2);
        this.setRotateAngle(Upperjawbase_r2, -0.0698F, 0.0F, 0.0F);
        this.Upperjawbase_r2.cubeList.add(new ModelBox(Upperjawbase_r2, 64, 79, -1.5F, -12.8506F, -32.6971F, 3, 2, 4, 0.05F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, 0.674F, -6.1679F);
        this.head.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.2527F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 28, 33, -1.0F, -0.85F, -2.5F, 2, 2, 4, 0.2F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, -0.25F, -8.5651F);
        this.head.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.2388F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 28, 28, -1.0F, 0.4466F, -1.5009F, 2, 2, 2, -0.012F, false));

        this.Upperjawslopefront_r2 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r2.setRotationPoint(-0.008F, 1.7149F, -11.1569F);
        this.head.addChild(Upperjawslopefront_r2);
        this.setRotateAngle(Upperjawslopefront_r2, 0.8409F, 0.0F, 0.0F);
        this.Upperjawslopefront_r2.cubeList.add(new ModelBox(Upperjawslopefront_r2, 9, 0, -0.992F, 0.136F, 0.7256F, 2, 2, 1, -0.02F, false));

        this.Upperjawslopefront_r3 = new AdvancedModelRendererExtended(this);
        this.Upperjawslopefront_r3.setRotationPoint(0.002F, 1.9352F, -11.172F);
        this.head.addChild(Upperjawslopefront_r3);
        this.setRotateAngle(Upperjawslopefront_r3, 1.1463F, 0.0F, 0.0F);
        this.Upperjawslopefront_r3.cubeList.add(new ModelBox(Upperjawslopefront_r3, 33, 4, -1.002F, 0.286F, -0.1188F, 2, 2, 1, -0.01F, false));

        this.Leftcrestfront_r5 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r5.setRotationPoint(-1.521F, -0.1245F, -5.9587F);
        this.head.addChild(Leftcrestfront_r5);
        this.setRotateAngle(Leftcrestfront_r5, 0.3458F, -0.4641F, -0.3308F);
        this.Leftcrestfront_r5.cubeList.add(new ModelBox(Leftcrestfront_r5, 33, 0, -0.325F, 0.1F, -0.5F, 1, 2, 2, -0.12F, false));

        this.Leftcrestfront_r6 = new AdvancedModelRendererExtended(this);
        this.Leftcrestfront_r6.setRotationPoint(-1.521F, -0.1245F, -5.9587F);
        this.head.addChild(Leftcrestfront_r6);
        this.setRotateAngle(Leftcrestfront_r6, 0.233F, -0.5099F, -0.023F);
        this.Leftcrestfront_r6.cubeList.add(new ModelBox(Leftcrestfront_r6, 48, 42, -0.5F, -0.5F, -1.5F, 1, 1, 4, -0.12F, false));

        this.Upperjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, 4.2393F, -9.3906F);
        this.head.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.1019F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 39, 82, -1.0F, -1.594F, -1.8334F, 2, 1, 3, -0.3F, false));

        this.Upperjawfront_r2 = new AdvancedModelRendererExtended(this);
        this.Upperjawfront_r2.setRotationPoint(0.0F, 4.0393F, -9.3906F);
        this.head.addChild(Upperjawfront_r2);
        this.setRotateAngle(Upperjawfront_r2, -0.1019F, 0.0F, 0.0F);
        this.Upperjawfront_r2.cubeList.add(new ModelBox(Upperjawfront_r2, 0, 83, -1.0F, -2.019F, -1.7334F, 2, 1, 3, 0.0F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(0.0F, 3.8193F, -0.6606F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.3508F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -0.4597F, -4.0704F);
        this.jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 18, -2.5F, -2.3226F, 1.1425F, 5, 4, 3, -0.003F, false));

        this.Lowerjawslope_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawslope_r1.setRotationPoint(0.0F, 20.6515F, 18.2094F);
        this.jaw.addChild(Lowerjawslope_r1);
        this.setRotateAngle(Lowerjawslope_r1, 0.104F, 0.0F, 0.0F);
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 69, 46, -1.5F, -21.0617F, -23.7797F, 3, 1, 5, -0.1F, false));
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 33, 10, -1.5F, -21.0613F, -24.1001F, 3, 1, 4, -0.102F, false));
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 79, 70, -1.5F, -21.6613F, -24.1001F, 3, 1, 4, -0.104F, false));
        this.Lowerjawslope_r1.cubeList.add(new ModelBox(Lowerjawslope_r1, 78, 79, -1.5F, -21.6617F, -23.7797F, 3, 1, 4, 0.0F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, 3.5315F, -8.6906F);
        this.jaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.1162F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 20, 56, -0.96F, -1.1793F, -1.5014F, 2, 1, 3, -0.2F, false));
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 48, 37, -0.96F, -2.2793F, -1.3014F, 2, 2, 3, -0.3F, false));
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 29, 82, -0.96F, -1.7793F, -1.5014F, 2, 1, 3, -0.2F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawmiddle_r1.setRotationPoint(-0.2F, 1.8515F, -7.7906F);
        this.jaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.3309F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 80, 45, -1.29F, -0.6294F, -0.1166F, 3, 1, 4, -0.2F, false));
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 81, 0, -1.29F, -0.1294F, -0.1166F, 3, 1, 4, -0.05F, false));

        this.Lowerjawbase_r1 = new AdvancedModelRendererExtended(this);
        this.Lowerjawbase_r1.setRotationPoint(0.0F, 20.5715F, 18.3694F);
        this.jaw.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, 0.2443F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 71, 11, -2.5F, -24.9083F, -17.1087F, 5, 2, 5, 0.011F, false));

        this.throat = new AdvancedModelRendererExtended(this);
        this.throat.setRotationPoint(0.0F, 2.6915F, -3.5306F);
        this.jaw.addChild(throat);


        this.Lowerjawbase_r2 = new AdvancedModelRendererExtended(this);
        this.Lowerjawbase_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.throat.addChild(Lowerjawbase_r2);
        this.setRotateAngle(Lowerjawbase_r2, -0.0087F, 0.0F, 0.0F);
        this.Lowerjawbase_r2.cubeList.add(new ModelBox(Lowerjawbase_r2, 33, 0, -1.4F, -2.037F, 0.9601F, 3, 2, 8, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
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

        EntityPrehistoricFloraPiatnitzkysaurus EntityMegalosaurus = (EntityPrehistoricFloraPiatnitzkysaurus) e;

        this.faceTarget(f3, f4, 4, neck1);
        this.faceTarget(f3, f4, 4, neck2);
        this.faceTarget(f3, f4, 4, neck3);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftArm, this.leftArm2, this.leftArm3};
        AdvancedModelRenderer[] ArmR = {this.rightArm, this.rightArm2, this.rightArm3};

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

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.leftArm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftArm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightArm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

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

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*20)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*-30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-20)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*10)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*30)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-60))*30)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-10)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*-20)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-30)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*10)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5) + (((tickAnim - 0) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+60))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5) + (((tickAnim - 10) / 5) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*10))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*10))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-60))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2-30))*-2.5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5) + (((tickAnim - 15) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*2.5))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75+30))*-5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*40)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2))*1)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75-30))*-20)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10 + (((tickAnim - 15) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+50))*10)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));
    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;
        //System.err.println("Animating: EAT " + animTick);
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*-15)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+30))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*-3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-30))*-5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/2+60))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10 + (((tickAnim - 15) / 10) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25-60))*10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10 + (((tickAnim - 25) / 15) * (0-(20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1))*-10)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2))*-3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3) + (((tickAnim - 0) / 15) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*60)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*-5)));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3) + (((tickAnim - 15) / 10) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*20)));
            yy = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*-5))));
            zz = -(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3) + (((tickAnim - 25) / 15) * (0-(-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2+60))*3))));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10 + (((tickAnim - 15) / 10) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+90))*-10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5 + (((tickAnim - 25) / 15) * (0-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1+30))*5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10 + (((tickAnim - 15) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+60))*10)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5 + (((tickAnim - 25) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*5)));
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
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*-5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30 + (((tickAnim - 15) / 10) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25))*30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5 + (((tickAnim - 25) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5-(15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1-30))*-5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5 + (((tickAnim - 35) / 5) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/1-30))*-5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5 + (((tickAnim - 0) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.75))*5)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-30 + (((tickAnim - 15) / 10) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1.25+30))*-30)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-5 + (((tickAnim - 25) / 15) * (0-(5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/1))*-5)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-20))*2), hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*3)), hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 0) / 7) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 0) / 7) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25 + (((tickAnim - 7) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25)));
            zz = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 7) / 6) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 13) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 25) / 7) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 25) / 7) * (-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = 0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25 + (((tickAnim - 32) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.25)));
            zz = -1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 32) / 6) * (-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5 + (((tickAnim - 38) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5+10))*-0.5)));
            zz = -2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75 + (((tickAnim - 38) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75-(-2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/2.5))*0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -20 + (((tickAnim - 0) / 13) * (-7.5-(-20)));
            yy = 5 + (((tickAnim - 0) / 13) * (2.5-(5)));
            zz = 5 + (((tickAnim - 0) / 13) * (2.5-(5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -7.5 + (((tickAnim - 13) / 12) * (12.5-(-7.5)));
            yy = 2.5 + (((tickAnim - 13) / 12) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 13) / 12) * (0-(2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.5 + (((tickAnim - 25) / 10) * (7.5-(12.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 7.5 + (((tickAnim - 35) / 8) * (-27.5-(7.5)));
            yy = 5 + (((tickAnim - 35) / 8) * (5-(5)));
            zz = 5 + (((tickAnim - 35) / 8) * (5-(5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (-20-(-27.5)));
            yy = 5 + (((tickAnim - 43) / 7) * (5-(5)));
            zz = 5 + (((tickAnim - 43) / 7) * (5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5 + (((tickAnim - 19) / 6) * (1-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 25) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 0) / 13) * (0-(-17.5)));
            yy = 2.5 + (((tickAnim - 0) / 13) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 0) / 13) * (0-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 25) / 10) * (20-(-2.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 20 + (((tickAnim - 35) / 8) * (25-(20)));
            yy = 2.5 + (((tickAnim - 35) / 8) * (2.5-(2.5)));
            zz = -2.5 + (((tickAnim - 35) / 8) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 43) / 7) * (-17.5-(25)));
            yy = 2.5 + (((tickAnim - 43) / 7) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 43) / 7) * (-2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 19) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 27.5 + (((tickAnim - 0) / 13) * (17.5-(27.5)));
            yy = -2.5 + (((tickAnim - 0) / 13) * (-2.5-(-2.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 17.5 + (((tickAnim - 13) / 12) * (30-(17.5)));
            yy = -2.5 + (((tickAnim - 13) / 12) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 30 + (((tickAnim - 25) / 10) * (-10-(30)));
            yy = 0 + (((tickAnim - 25) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -10 + (((tickAnim - 35) / 8) * (-27.5-(-10)));
            yy = -2.5 + (((tickAnim - 35) / 8) * (-5-(-2.5)));
            zz = 2.5 + (((tickAnim - 35) / 8) * (-5-(2.5)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 43) / 7) * (27.5-(-27.5)));
            yy = -5 + (((tickAnim - 43) / 7) * (-2.5-(-5)));
            zz = -5 + (((tickAnim - 43) / 7) * (0-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 19) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 12.5 + (((tickAnim - 0) / 7) * (-1.25-(12.5)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.25 + (((tickAnim - 7) / 6) * (-10-(-1.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -10 + (((tickAnim - 13) / 12) * (-17.5-(-10)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -17.5 + (((tickAnim - 25) / 10) * (80-(-17.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 80 + (((tickAnim - 35) / 8) * (70-(80)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 70 + (((tickAnim - 43) / 7) * (12.5-(70)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.5 + (((tickAnim - 0) / 10) * (7.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.5 + (((tickAnim - 10) / 8) * (-27.5-(7.5)));
            yy = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
            zz = -5 + (((tickAnim - 10) / 8) * (-5-(-5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 18) / 7) * (-20-(-27.5)));
            yy = -5 + (((tickAnim - 18) / 7) * (-5-(-5)));
            zz = -5 + (((tickAnim - 18) / 7) * (-5-(-5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -20 + (((tickAnim - 25) / 13) * (-7.5-(-20)));
            yy = -5 + (((tickAnim - 25) / 13) * (-2.5-(-5)));
            zz = -5 + (((tickAnim - 25) / 13) * (-2.5-(-5)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -7.5 + (((tickAnim - 38) / 12) * (12.5-(-7.5)));
            yy = -2.5 + (((tickAnim - 38) / 12) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 38) / 12) * (0-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 1 + (((tickAnim - 0) / 10) * (0-(1)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*0.5)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5 + (((tickAnim - 44) / 6) * (1-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*0.5)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 0) / 10) * (20-(-2.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 20 + (((tickAnim - 10) / 8) * (25-(20)));
            yy = -2.5 + (((tickAnim - 10) / 8) * (-2.5-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 8) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 25 + (((tickAnim - 18) / 7) * (-17.5-(25)));
            yy = -2.5 + (((tickAnim - 18) / 7) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 18) / 7) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -17.5 + (((tickAnim - 25) / 13) * (0-(-17.5)));
            yy = -2.5 + (((tickAnim - 25) / 13) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 25) / 13) * (0-(2.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 44) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 30 + (((tickAnim - 0) / 10) * (-10-(30)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 10) / 8) * (-27.5-(-10)));
            yy = 2.5 + (((tickAnim - 10) / 8) * (5-(2.5)));
            zz = -2.5 + (((tickAnim - 10) / 8) * (5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5 + (((tickAnim - 18) / 7) * (27.5-(-27.5)));
            yy = 5 + (((tickAnim - 18) / 7) * (2.5-(5)));
            zz = 5 + (((tickAnim - 18) / 7) * (0-(5)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 27.5 + (((tickAnim - 25) / 13) * (17.5-(27.5)));
            yy = 2.5 + (((tickAnim - 25) / 13) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.5 + (((tickAnim - 38) / 12) * (30-(17.5)));
            yy = 2.5 + (((tickAnim - 38) / 12) * (0-(2.5)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.35)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25 + (((tickAnim - 44) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.4))*-0.25)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -15 + (((tickAnim - 0) / 10) * (80-(-15)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 80 + (((tickAnim - 10) / 8) * (70-(80)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 70 + (((tickAnim - 18) / 7) * (12.5-(70)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 12.5 + (((tickAnim - 25) / 13) * (-10-(12.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 38) / 12) * (-15-(-10)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*-2), tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-4)), tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-10))*-2), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*-5)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-30))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-2), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-7.5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*-2), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*-5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-80))*-2), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*-5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*3)));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-2), body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-3)), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+50))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-30))*-1), chest.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+40))*-1)), chest.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+40))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 7) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 7) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 32) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1 + (((tickAnim - 32) / 6) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 32) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+70))*-5), rightArm.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*5), rightArm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-80))*-5)));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*-5), rightArm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+70))*5), rightArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5)));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*5), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-5), leftArm.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), leftArm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-110))*5)));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-120))*5), leftArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*5)));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*5), leftArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-60))*5), neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-40))*-3)), neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-40))*-1)));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+60))*10), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*3)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*1)));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*-10), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+50))*2.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-60))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(4.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5+30))*2.5), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*2), hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-3), hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+60))*-2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 3) / 1) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5 + (((tickAnim - 4) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 4) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2 + (((tickAnim - 12) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+50))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25 + (((tickAnim - 12) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+10))*1.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -15 + (((tickAnim - 0) / 4) * (-12.5-(-15)));
            yy = 2.5 + (((tickAnim - 0) / 4) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 0) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5 + (((tickAnim - 4) / 4) * (10-(-12.5)));
            yy = 2.5 + (((tickAnim - 4) / 4) * (-2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 4) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10 + (((tickAnim - 8) / 2) * (12.5-(10)));
            yy = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
            zz = 2.5 + (((tickAnim - 8) / 2) * (2.5-(2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 10) / 3) * (-5-(12.5)));
            yy = -2.5 + (((tickAnim - 10) / 3) * (5-(-2.5)));
            zz = 2.5 + (((tickAnim - 10) / 3) * (5-(2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5 + (((tickAnim - 13) / 5) * (-37.5-(-5)));
            yy = 5 + (((tickAnim - 13) / 5) * (5-(5)));
            zz = 5 + (((tickAnim - 13) / 5) * (5-(5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -37.5 + (((tickAnim - 18) / 2) * (-15-(-37.5)));
            yy = 5 + (((tickAnim - 18) / 2) * (2.5-(5)));
            zz = 5 + (((tickAnim - 18) / 2) * (2.5-(5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 3) / 1) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 6) / 2) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(xx);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(yy);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5 + (((tickAnim - 0) / 4) * (5-(-27.5)));
            yy = -2.5 + (((tickAnim - 0) / 4) * (2.5-(-2.5)));
            zz = 2.5 + (((tickAnim - 0) / 4) * (2.5-(2.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 4) / 4) * (-2.5-(5)));
            yy = 2.5 + (((tickAnim - 4) / 4) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 4) / 4) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5 + (((tickAnim - 8) / 2) * (12.5-(-2.5)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (0-(2.5)));
            zz = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 10) / 3) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
            zz = -2.5 + (((tickAnim - 10) / 3) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.5 + (((tickAnim - 13) / 5) * (22.5-(22.5)));
            yy = -2.5 + (((tickAnim - 13) / 5) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 13) / 5) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5 + (((tickAnim - 18) / 2) * (-27.5-(22.5)));
            yy = -2.5 + (((tickAnim - 18) / 2) * (-2.5-(-2.5)));
            zz = 2.5 + (((tickAnim - 18) / 2) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 3) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20 + (((tickAnim - 0) / 4) * (15-(20)));
            yy = -2.5 + (((tickAnim - 0) / 4) * (-2.5-(-2.5)));
            zz = -5 + (((tickAnim - 0) / 4) * (-2.5-(-5)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 15 + (((tickAnim - 4) / 4) * (35-(15)));
            yy = -2.5 + (((tickAnim - 4) / 4) * (0-(-2.5)));
            zz = -2.5 + (((tickAnim - 4) / 4) * (0-(-2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35 + (((tickAnim - 8) / 2) * (25-(35)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25 + (((tickAnim - 10) / 3) * (-20-(25)));
            yy = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (-2.5-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -20 + (((tickAnim - 13) / 5) * (-22.5-(-20)));
            yy = -2.5 + (((tickAnim - 13) / 5) * (-5-(-2.5)));
            zz = -2.5 + (((tickAnim - 13) / 5) * (-5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -22.5 + (((tickAnim - 18) / 2) * (20-(-22.5)));
            yy = -5 + (((tickAnim - 18) / 2) * (-2.5-(-5)));
            zz = -5 + (((tickAnim - 18) / 2) * (-5-(-5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 3) / 1) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 6) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 22.5 + (((tickAnim - 0) / 4) * (-10-(22.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10 + (((tickAnim - 4) / 4) * (-20-(-10)));
            yy = -2.5 + (((tickAnim - 4) / 4) * (0-(-2.5)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -20 + (((tickAnim - 8) / 2) * (67.5-(-20)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 67.5 + (((tickAnim - 10) / 3) * (87.5-(67.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 87.5 + (((tickAnim - 13) / 5) * (77.5-(87.5)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 77.5 + (((tickAnim - 18) / 2) * (22.5-(77.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg4, rightLeg4.rotateAngleX + (float) Math.toRadians(xx), rightLeg4.rotateAngleY + (float) Math.toRadians(yy), rightLeg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 0) / 3) * (-5-(12.5)));
            yy = 2.5 + (((tickAnim - 0) / 3) * (-5-(2.5)));
            zz = -2.5 + (((tickAnim - 0) / 3) * (-5-(-2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5 + (((tickAnim - 3) / 5) * (-37.5-(-5)));
            yy = -5 + (((tickAnim - 3) / 5) * (-5-(-5)));
            zz = -5 + (((tickAnim - 3) / 5) * (-5-(-5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.5 + (((tickAnim - 8) / 2) * (-15-(-37.5)));
            yy = -5 + (((tickAnim - 8) / 2) * (-2.5-(-5)));
            zz = -5 + (((tickAnim - 8) / 2) * (-2.5-(-5)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -15 + (((tickAnim - 10) / 4) * (-12.5-(-15)));
            yy = -2.5 + (((tickAnim - 10) / 4) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 10) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.5 + (((tickAnim - 14) / 4) * (10-(-12.5)));
            yy = -2.5 + (((tickAnim - 14) / 4) * (2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 14) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10 + (((tickAnim - 18) / 2) * (12.5-(10)));
            yy = 2.5 + (((tickAnim - 18) / 2) * (2.5-(2.5)));
            zz = -2.5 + (((tickAnim - 18) / 2) * (-2.5-(-2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 12) / 2) * (0-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4 + (((tickAnim - 16) / 2) * (1-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*0.4)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 2) * (0-(1)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(xx);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(yy);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5 + (((tickAnim - 0) / 3) * (22.5-(12.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 2.5 + (((tickAnim - 0) / 3) * (2.5-(2.5)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 22.5 + (((tickAnim - 3) / 5) * (22.5-(22.5)));
            yy = 2.5 + (((tickAnim - 3) / 5) * (2.5-(2.5)));
            zz = 2.5 + (((tickAnim - 3) / 5) * (-2.5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5 + (((tickAnim - 8) / 2) * (-27.5-(22.5)));
            yy = 2.5 + (((tickAnim - 8) / 2) * (2.5-(2.5)));
            zz = -2.5 + (((tickAnim - 8) / 2) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -27.5 + (((tickAnim - 10) / 4) * (5-(-27.5)));
            yy = 2.5 + (((tickAnim - 10) / 4) * (-2.5-(2.5)));
            zz = -2.5 + (((tickAnim - 10) / 4) * (-2.5-(-2.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 5 + (((tickAnim - 14) / 4) * (-2.5-(5)));
            yy = -2.5 + (((tickAnim - 14) / 4) * (-2.5-(-2.5)));
            zz = -2.5 + (((tickAnim - 14) / 4) * (2.5-(-2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5 + (((tickAnim - 18) / 2) * (12.5-(-2.5)));
            yy = -2.5 + (((tickAnim - 18) / 2) * (0-(-2.5)));
            zz = 2.5 + (((tickAnim - 18) / 2) * (2.5-(2.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 12) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25 + (((tickAnim - 0) / 3) * (-20-(25)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (2.5-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -20 + (((tickAnim - 3) / 5) * (-22.5-(-20)));
            yy = 2.5 + (((tickAnim - 3) / 5) * (5-(2.5)));
            zz = 2.5 + (((tickAnim - 3) / 5) * (5-(2.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.5 + (((tickAnim - 8) / 2) * (20-(-22.5)));
            yy = 5 + (((tickAnim - 8) / 2) * (2.5-(5)));
            zz = 5 + (((tickAnim - 8) / 2) * (5-(5)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 20 + (((tickAnim - 10) / 4) * (15-(20)));
            yy = 2.5 + (((tickAnim - 10) / 4) * (2.5-(2.5)));
            zz = 5 + (((tickAnim - 10) / 4) * (2.5-(5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15 + (((tickAnim - 14) / 4) * (35-(15)));
            yy = 2.5 + (((tickAnim - 14) / 4) * (0-(2.5)));
            zz = 2.5 + (((tickAnim - 14) / 4) * (0-(2.5)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35 + (((tickAnim - 18) / 2) * (25-(35)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3 + (((tickAnim - 12) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.3)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 14) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 2) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2-(0)));
            zz = 0 + (((tickAnim - 14) / 2) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2 + (((tickAnim - 16) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.2)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 67.5 + (((tickAnim - 0) / 3) * (87.5-(67.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 87.5 + (((tickAnim - 3) / 5) * (77.5-(87.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.5 + (((tickAnim - 8) / 2) * (22.5-(77.5)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 22.5 + (((tickAnim - 10) / 4) * (-10-(22.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (2.5-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 14) / 4) * (-17.5-(-10)));
            yy = 2.5 + (((tickAnim - 14) / 4) * (0-(2.5)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -17.5 + (((tickAnim - 18) / 2) * (67.5-(-17.5)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg4, leftLeg4.rotateAngleX + (float) Math.toRadians(xx), leftLeg4.rotateAngleY + (float) Math.toRadians(yy), leftLeg4.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-3), tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*3)), tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail1.rotationPointX = this.tail1.rotationPointX + (float)(xx);
        this.tail1.rotationPointY = this.tail1.rotationPointY - (float)(yy);
        this.tail1.rotationPointZ = this.tail1.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-3), tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*5)), tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail2.rotationPointX = this.tail2.rotationPointX + (float)(xx);
        this.tail2.rotationPointY = this.tail2.rotationPointY - (float)(yy);
        this.tail2.rotationPointZ = this.tail2.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-90))*-3), tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5)), tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail3.rotationPointX = this.tail3.rotationPointX + (float)(xx);
        this.tail3.rotationPointY = this.tail3.rotationPointY - (float)(yy);
        this.tail3.rotationPointZ = this.tail3.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-120))*-3), tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*7.5)), tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-3)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail4.rotationPointX = this.tail4.rotationPointX + (float)(xx);
        this.tail4.rotationPointY = this.tail4.rotationPointY - (float)(yy);
        this.tail4.rotationPointZ = this.tail4.rotationPointZ + (float)(zz);



        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-3), tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*7.5)), tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-160))*-3)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.05)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.tail5.rotationPointX = this.tail5.rotationPointX + (float)(xx);
        this.tail5.rotationPointY = this.tail5.rotationPointY - (float)(yy);
        this.tail5.rotationPointZ = this.tail5.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-60))*-2), body.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-3)), body.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-1)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);



        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+10))*-1), chest.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*-1)), chest.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*-1)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 3) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1 + (((tickAnim - 13) / 2) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*720/0.3))*-0.1)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-5), rightArm.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5), rightArm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-110))*5)));
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*5), rightArm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*5), rightArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*5)));
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(0), rightArm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*5), rightArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+70))*-5), leftArm.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), leftArm.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*5)));
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-5), leftArm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+70))*5), leftArm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-5)));
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(0), leftArm3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720/2.5-50))*5), leftArm3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*-5), neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-1)), neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-1)));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+70))*5), neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*2)), neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-30))*1)));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*5), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.5), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+30))*-2), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*1), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-30))*-2), throat.rotateAngleY + (float) Math.toRadians(0), throat.rotateAngleZ + (float) Math.toRadians(0));

    }


    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPiatnitzkysaurus entity = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPiatnitzkysaurus ee = (EntityPrehistoricFloraPiatnitzkysaurus) entitylivingbaseIn;

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
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
//        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
//            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }
//        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
//            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }
//        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The idle noise/anim
//            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }
//        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The actual roar/anim
//            //animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
//        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPiatnitzkysaurus e = (EntityPrehistoricFloraPiatnitzkysaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-55), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
