package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraEuropejara;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;

public class ModelEuropejara extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer chest1;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer leftlegwing2;
    private final AdvancedModelRenderer leftlegwing1;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer rightlegwing2;
    private final AdvancedModelRenderer rightlegwing1;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck1_r1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck3_r1;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer head3_r1;
    private final AdvancedModelRenderer head3_r2;
    private final AdvancedModelRenderer head2_r1;
    private final AdvancedModelRenderer head1_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw2_r1;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer jaw5;
    private final AdvancedModelRenderer jaw5_r1;
    private final AdvancedModelRenderer shape64;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer jaw7_r1;
    private final AdvancedModelRenderer jaw8_r1;
    private final AdvancedModelRenderer jaw7_r2;
    private final AdvancedModelRenderer jaw6_r1;
    private final AdvancedModelRenderer jaw4_r1;
    private final AdvancedModelRenderer underneck3;
    private final AdvancedModelRenderer underneck4_r1;
    private final AdvancedModelRenderer gums1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head2_r2;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer head7_r1;
    private final AdvancedModelRenderer head6_r1;
    private final AdvancedModelRenderer lips1;
    private final AdvancedModelRenderer lips2;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer head6_r2;
    private final AdvancedModelRenderer head6_r3;
    private final AdvancedModelRenderer head5_r1;
    private final AdvancedModelRenderer head5_r2;
    private final AdvancedModelRenderer head4_r1;
    private final AdvancedModelRenderer crest1;
    private final AdvancedModelRenderer crest3_r1;
    private final AdvancedModelRenderer crest2_r1;
    private final AdvancedModelRenderer crest2_r2;
    private final AdvancedModelRenderer crest1_r1;
    private final AdvancedModelRenderer crest2;
    private final AdvancedModelRenderer leftwing1;
    private final AdvancedModelRenderer leftwing2;
    private final AdvancedModelRenderer leftwing3;
    private final AdvancedModelRenderer leftwing4;
    private final AdvancedModelRenderer leftwing5;
    private final AdvancedModelRenderer leftwingmembranehidable1;
    private final AdvancedModelRenderer leftwingmembranehideable2;
    private final AdvancedModelRenderer bone_r1;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer leftwinghidable2;
    private final AdvancedModelRenderer leftwinghideable3;
    private final AdvancedModelRenderer bone_r2;
    private final AdvancedModelRenderer leftwingmembrane6;
    private final AdvancedModelRenderer leftwinghidable3;
    private final AdvancedModelRenderer bone_r3;
    private final AdvancedModelRenderer leftwingmembrane7;
    private final AdvancedModelRenderer wing5_r1;
    private final AdvancedModelRenderer leftwinghidable4;
    private final AdvancedModelRenderer bone_r4;
    private final AdvancedModelRenderer leftwingmembrane1;
    private final AdvancedModelRenderer upperwing4_r1;
    private final AdvancedModelRenderer rightwing1;
    private final AdvancedModelRenderer rightwing2;
    private final AdvancedModelRenderer rightwing3;
    private final AdvancedModelRenderer rightwing4;
    private final AdvancedModelRenderer rightwing5;
    private final AdvancedModelRenderer rightwingmembranehidable1;
    private final AdvancedModelRenderer rightwingmembranehideable2;
    private final AdvancedModelRenderer bone_r5;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer rightwinghidable2;
    private final AdvancedModelRenderer rightwinghideable3;
    private final AdvancedModelRenderer bone_r6;
    private final AdvancedModelRenderer rightwingmembrane6;
    private final AdvancedModelRenderer rightwinghidable3;
    private final AdvancedModelRenderer bone_r7;
    private final AdvancedModelRenderer rightwingmembrane7;
    private final AdvancedModelRenderer wing6_r1;
    private final AdvancedModelRenderer rightwinghidable4;
    private final AdvancedModelRenderer bone_r8;
    private final AdvancedModelRenderer rightwingmembrane1;
    private final AdvancedModelRenderer upperwing5_r1;

    private ModelAnimator animator;

    public ModelEuropejara() {
        this.textureWidth = 84;
        this.textureHeight = 84;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 14.75F, 0.0F);
        this.setRotateAngle(root, -0.3054F, 0.0F, 0.0F);


        this.chest1 = new AdvancedModelRenderer(this);
        this.chest1.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.root.addChild(chest1);
        this.setRotateAngle(chest1, -0.0133F, 0.0F, 0.0F);
        this.chest1.cubeList.add(new ModelBox(chest1, 46, 31, -2.0F, -1.5F, -2.8F, 4, 4, 3, 0.0F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.chest1.addChild(body1);
        this.setRotateAngle(body1, -0.1367F, 0.0F, 0.0F);
        this.body1.cubeList.add(new ModelBox(body1, 39, 47, -1.5F, -1.5F, 1.0F, 3, 2, 4, 0.0F, false));

        this.body2_r1 = new AdvancedModelRenderer(this);
        this.body2_r1.setRotationPoint(0.0F, 2.2F, 1.2F);
        this.body1.addChild(body2_r1);
        this.setRotateAngle(body2_r1, 0.4363F, 0.0F, 0.0F);
        this.body2_r1.cubeList.add(new ModelBox(body2_r1, 42, 23, -1.5F, -1.9F, -0.2F, 3, 2, 5, -0.003F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, 0.0F, 4.7F);
        this.body1.addChild(tail1);
        this.setRotateAngle(tail1, -0.2731F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 20, 60, -0.5F, -1.2604F, -0.6659F, 1, 1, 3, 0.0F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(0.675F, 0.95F, 3.9F);
        this.body1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.2346F, -0.1882F, -0.6916F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, 0, 19, -0.5F, 0.0F, -1.5F, 2, 5, 2, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.1F, 3.85F, -0.25F);
        this.leftleg1.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.5865F, 0.1604F, 0.3639F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 49, 57, 0.0F, -1.0F, -1.5F, 1, 7, 2, 0.0F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.5F, 5.9F, -0.5F);
        this.leftleg2.addChild(leftfoot);
        this.setRotateAngle(leftfoot, -0.225F, 0.1026F, 0.238F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 50, 51, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.leftlegwing2 = new AdvancedModelRenderer(this);
        this.leftlegwing2.setRotationPoint(0.5F, 0.0103F, 0.3075F);
        this.leftleg2.addChild(leftlegwing2);
        this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);
        this.leftlegwing2.cubeList.add(new ModelBox(leftlegwing2, 37, 28, 0.0F, -0.0144F, 0.0423F, 0, 6, 2, 0.0F, false));

        this.leftlegwing1 = new AdvancedModelRenderer(this);
        this.leftlegwing1.setRotationPoint(0.5985F, 0.0345F, 0.0048F);
        this.leftleg1.addChild(leftlegwing1);
        this.setRotateAngle(leftlegwing1, 0.1361F, -0.0119F, 0.0865F);
        this.leftlegwing1.cubeList.add(new ModelBox(leftlegwing1, 0, 32, -0.5F, 0.0F, 0.0F, 1, 5, 2, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-0.675F, 0.95F, 3.9F);
        this.body1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.2346F, 0.1882F, 0.6916F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 19, -1.5F, 0.0F, -1.5F, 2, 5, 2, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.1F, 3.85F, -0.25F);
        this.rightleg1.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.5865F, -0.1604F, -0.3639F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 49, 57, -1.0F, -1.0F, -1.5F, 1, 7, 2, 0.0F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(-0.5F, 5.9F, -0.5F);
        this.rightleg2.addChild(rightfoot);
        this.setRotateAngle(rightfoot, -0.225F, -0.1026F, -0.238F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 50, 51, -1.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, true));

        this.rightlegwing2 = new AdvancedModelRenderer(this);
        this.rightlegwing2.setRotationPoint(-0.5F, 0.0103F, 0.3075F);
        this.rightleg2.addChild(rightlegwing2);
        this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);
        this.rightlegwing2.cubeList.add(new ModelBox(rightlegwing2, 37, 28, 0.0F, -0.0144F, 0.0423F, 0, 6, 2, 0.0F, true));

        this.rightlegwing1 = new AdvancedModelRenderer(this);
        this.rightlegwing1.setRotationPoint(-0.5985F, 0.0345F, 0.0048F);
        this.rightleg1.addChild(rightlegwing1);
        this.setRotateAngle(rightlegwing1, 0.1361F, 0.0119F, -0.0865F);
        this.rightlegwing1.cubeList.add(new ModelBox(rightlegwing1, 0, 32, -0.5F, 0.0F, 0.0F, 1, 5, 2, 0.0F, true));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.7F, -2.9F);
        this.chest1.addChild(neck1);
        this.setRotateAngle(neck1, -0.6109F, 0.0F, 0.0F);


        this.neck1_r1 = new AdvancedModelRenderer(this);
        this.neck1_r1.setRotationPoint(0.0F, 0.8445F, -0.5832F);
        this.neck1.addChild(neck1_r1);
        this.setRotateAngle(neck1_r1, 0.0436F, 0.0F, 0.0F);
        this.neck1_r1.cubeList.add(new ModelBox(neck1_r1, 46, 0, -1.5F, -1.5F, -2.0F, 3, 3, 4, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.4555F, -2.3832F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.1461F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 38, 54, -1.0F, -0.2615F, -2.2878F, 2, 3, 3, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 0.1385F, -2.1878F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.1089F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 0, 45, -1.0F, -0.5007F, -2.9983F, 2, 3, 4, -0.014F, false));

        this.neck3_r1 = new AdvancedModelRenderer(this);
        this.neck3_r1.setRotationPoint(0.0F, 1.4993F, -0.6233F);
        this.neck3.addChild(neck3_r1);
        this.setRotateAngle(neck3_r1, 0.1745F, 0.0F, 0.0F);
        this.neck3_r1.cubeList.add(new ModelBox(neck3_r1, 27, 53, -1.0F, -1.7F, -1.5F, 2, 3, 3, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.8493F, -1.8733F);
        this.neck3.addChild(head);
        this.setRotateAngle(head, 1.1345F, 0.0F, 0.0F);


        this.head3_r1 = new AdvancedModelRenderer(this);
        this.head3_r1.setRotationPoint(0.0F, 1.3808F, -0.8648F);
        this.head.addChild(head3_r1);
        this.setRotateAngle(head3_r1, -0.1309F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 50, 44, -1.5F, -2.8863F, -2.2088F, 3, 3, 3, 0.003F, false));

        this.head3_r2 = new AdvancedModelRenderer(this);
        this.head3_r2.setRotationPoint(0.0F, 1.5058F, -1.0648F);
        this.head.addChild(head3_r2);
        this.setRotateAngle(head3_r2, -1.0821F, 0.0F, 0.0F);
        this.head3_r2.cubeList.add(new ModelBox(head3_r2, 12, 0, -0.5F, -3.6932F, -2.529F, 1, 4, 1, -0.003F, false));

        this.head2_r1 = new AdvancedModelRenderer(this);
        this.head2_r1.setRotationPoint(0.0F, 0.2058F, -0.6648F);
        this.head.addChild(head2_r1);
        this.setRotateAngle(head2_r1, -1.4748F, 0.0F, 0.0F);
        this.head2_r1.cubeList.add(new ModelBox(head2_r1, 61, 0, -0.5F, -4.6932F, -2.529F, 1, 5, 1, -0.001F, false));

        this.head1_r1 = new AdvancedModelRenderer(this);
        this.head1_r1.setRotationPoint(0.0F, -2.1553F, -2.9545F);
        this.head.addChild(head1_r1);
        this.setRotateAngle(head1_r1, 0.0611F, 0.0F, 0.0F);
        this.head1_r1.cubeList.add(new ModelBox(head1_r1, 18, 37, -0.5F, -0.1276F, -0.6794F, 1, 1, 5, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 1.4432F, -0.9969F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.0175F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 22, -1.5F, -0.1078F, -2.9027F, 3, 1, 3, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.3922F, 0.2973F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);


        this.jaw2_r1 = new AdvancedModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.0F, -0.3F, -1.0F);
        this.jaw2.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.0873F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 47, 15, -1.0F, -0.1F, -4.5F, 2, 1, 5, 0.001F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, -1.1F, -2.75F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);


        this.jaw5 = new AdvancedModelRenderer(this);
        this.jaw5.setRotationPoint(0.0F, 0.6F, -3.0F);
        this.jaw3.addChild(jaw5);
        this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);


        this.jaw5_r1 = new AdvancedModelRenderer(this);
        this.jaw5_r1.setRotationPoint(0.0F, -0.8256F, 0.3974F);
        this.jaw5.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, -0.0175F, 0.0F, 0.0F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 29, 60, -0.5F, -0.075F, -2.9882F, 1, 1, 3, -0.004F, false));

        this.shape64 = new AdvancedModelRenderer(this);
        this.shape64.setRotationPoint(0.0F, -0.1256F, -1.9026F);
        this.jaw5.addChild(shape64);
        this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);


        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(0.0F, 1.0F, 0.9F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);


        this.jaw7_r1 = new AdvancedModelRenderer(this);
        this.jaw7_r1.setRotationPoint(0.0F, 0.3451F, -6.1156F);
        this.jaw4.addChild(jaw7_r1);
        this.setRotateAngle(jaw7_r1, 1.8239F, 0.0F, 0.0F);
        this.jaw7_r1.cubeList.add(new ModelBox(jaw7_r1, 43, 0, -0.5F, -1.005F, -1.0635F, 1, 1, 2, -0.015F, false));

        this.jaw8_r1 = new AdvancedModelRenderer(this);
        this.jaw8_r1.setRotationPoint(0.0F, 1.2951F, -7.2156F);
        this.jaw4.addChild(jaw8_r1);
        this.setRotateAngle(jaw8_r1, 0.5585F, 0.0F, 0.0F);
        this.jaw8_r1.cubeList.add(new ModelBox(jaw8_r1, 29, 0, -0.5F, -2.005F, -0.0635F, 1, 2, 1, -0.017F, false));

        this.jaw7_r2 = new AdvancedModelRenderer(this);
        this.jaw7_r2.setRotationPoint(0.0F, 1.9951F, -6.5406F);
        this.jaw4.addChild(jaw7_r2);
        this.setRotateAngle(jaw7_r2, 0.7505F, 0.0F, 0.0F);
        this.jaw7_r2.cubeList.add(new ModelBox(jaw7_r2, 12, 8, -0.5F, -1.005F, -0.0635F, 1, 1, 1, -0.01F, false));

        this.jaw6_r1 = new AdvancedModelRenderer(this);
        this.jaw6_r1.setRotationPoint(0.0F, 0.3951F, -6.1656F);
        this.jaw4.addChild(jaw6_r1);
        this.setRotateAngle(jaw6_r1, 1.1694F, 0.0F, 0.0F);
        this.jaw6_r1.cubeList.add(new ModelBox(jaw6_r1, 17, 8, -0.5F, -1.005F, -0.0635F, 1, 1, 1, -0.017F, false));

        this.jaw4_r1 = new AdvancedModelRenderer(this);
        this.jaw4_r1.setRotationPoint(0.0F, -0.2F, -4.1F);
        this.jaw4.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.0524F, 0.0F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 0, 53, -1.0F, -1.0099F, -1.8917F, 2, 1, 2, -0.015F, false));

        this.underneck3 = new AdvancedModelRenderer(this);
        this.underneck3.setRotationPoint(0.0F, 0.7922F, -2.9027F);
        this.jaw.addChild(underneck3);
        this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);


        this.underneck4_r1 = new AdvancedModelRenderer(this);
        this.underneck4_r1.setRotationPoint(0.0F, 0.1741F, 2.6334F);
        this.underneck3.addChild(underneck4_r1);
        this.setRotateAngle(underneck4_r1, -0.0873F, 0.0F, 0.0F);
        this.underneck4_r1.cubeList.add(new ModelBox(underneck4_r1, 24, 28, -0.5F, -1.0F, -1.6F, 1, 1, 3, -0.004F, false));
        this.underneck4_r1.cubeList.add(new ModelBox(underneck4_r1, 11, 60, -0.5F, -1.0F, -2.6F, 1, 1, 3, 0.0F, false));

        this.gums1 = new AdvancedModelRenderer(this);
        this.gums1.setRotationPoint(0.0F, 0.6922F, -1.1027F);
        this.jaw.addChild(gums1);
        this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);
        this.gums1.cubeList.add(new ModelBox(gums1, 57, 14, -1.0F, -2.5F, -1.4F, 2, 2, 3, -0.015F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.0F, -0.9568F, -2.6969F);
        this.head.addChild(head2);
        this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);


        this.head2_r2 = new AdvancedModelRenderer(this);
        this.head2_r2.setRotationPoint(0.0F, 1.6F, -1.9F);
        this.head2.addChild(head2_r2);
        this.setRotateAngle(head2_r2, -0.0436F, 0.0F, 0.0F);
        this.head2_r2.cubeList.add(new ModelBox(head2_r2, 52, 8, -1.0F, -0.5F, -1.7F, 2, 1, 4, 0.015F, false));

        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 0.4F, -7.5F);
        this.head2.addChild(head3);
        this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);


        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(0.0F, -0.66F, 4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);


        this.head7_r1 = new AdvancedModelRenderer(this);
        this.head7_r1.setRotationPoint(0.0F, 1.9F, -2.85F);
        this.head5.addChild(head7_r1);
        this.setRotateAngle(head7_r1, 0.5236F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 14, 49, -0.5F, -0.0565F, -0.0215F, 1, 1, 2, -0.02F, false));

        this.head6_r1 = new AdvancedModelRenderer(this);
        this.head6_r1.setRotationPoint(0.0F, 1.2F, -1.0F);
        this.head5.addChild(head6_r1);
        this.setRotateAngle(head6_r1, 0.3927F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 60, 48, -0.5F, -0.1F, -2.0F, 1, 1, 3, 0.0F, false));

        this.lips1 = new AdvancedModelRenderer(this);
        this.lips1.setRotationPoint(-0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips1);
        this.setRotateAngle(lips1, 0.0025F, -0.0138F, 0.2731F);


        this.lips2 = new AdvancedModelRenderer(this);
        this.lips2.setRotationPoint(0.85F, 0.1F, 3.9F);
        this.head3.addChild(lips2);
        this.setRotateAngle(lips2, 0.0025F, 0.0138F, -0.2731F);


        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.1559F, 0.0F, 0.0F);


        this.head6_r2 = new AdvancedModelRenderer(this);
        this.head6_r2.setRotationPoint(0.0F, 1.1F, -4.975F);
        this.head4.addChild(head6_r2);
        this.setRotateAngle(head6_r2, 1.1257F, 0.0F, 0.0F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 59, 27, -0.5F, 0.0383F, -2.1225F, 1, 3, 3, -0.01F, false));

        this.head6_r3 = new AdvancedModelRenderer(this);
        this.head6_r3.setRotationPoint(0.0F, 0.15F, -2.9F);
        this.head4.addChild(head6_r3);
        this.setRotateAngle(head6_r3, 0.2094F, 0.0F, 0.0F);
        this.head6_r3.cubeList.add(new ModelBox(head6_r3, 61, 7, -0.8F, -0.0573F, -1.6936F, 1, 2, 2, -0.01F, false));

        this.head5_r1 = new AdvancedModelRenderer(this);
        this.head5_r1.setRotationPoint(0.0F, 0.225F, -2.95F);
        this.head4.addChild(head5_r1);
        this.setRotateAngle(head5_r1, 0.2094F, 0.0F, 0.0F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 61, 34, -0.2F, -0.0573F, -1.6936F, 1, 2, 2, -0.01F, false));

        this.head5_r2 = new AdvancedModelRenderer(this);
        this.head5_r2.setRotationPoint(1.0F, -2.7F, -0.275F);
        this.head4.addChild(head5_r2);
        this.setRotateAngle(head5_r2, -0.0524F, 0.0F, 0.0F);
        this.head5_r2.cubeList.add(new ModelBox(head5_r2, 0, 0, -1.0F, -3.1F, -3.0F, 0, 7, 11, 0.0F, false));

        this.head4_r1 = new AdvancedModelRenderer(this);
        this.head4_r1.setRotationPoint(0.0F, 0.35F, 0.1F);
        this.head4.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.0524F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 0, 57, -1.0F, -0.1F, -3.0F, 2, 3, 3, 0.003F, false));

        this.crest1 = new AdvancedModelRenderer(this);
        this.crest1.setRotationPoint(0.0F, -0.2568F, 4.7531F);
        this.head.addChild(crest1);
        this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);


        this.crest3_r1 = new AdvancedModelRenderer(this);
        this.crest3_r1.setRotationPoint(0.0F, -3.192F, -10.586F);
        this.crest1.addChild(crest3_r1);
        this.setRotateAngle(crest3_r1, -1.309F, 0.0F, 0.0F);
        this.crest3_r1.cubeList.add(new ModelBox(crest3_r1, 26, 13, -0.5F, -0.9289F, 0.1442F, 1, 1, 3, 0.01F, false));

        this.crest2_r1 = new AdvancedModelRenderer(this);
        this.crest2_r1.setRotationPoint(0.0F, -1.892F, -11.236F);
        this.crest1.addChild(crest2_r1);
        this.setRotateAngle(crest2_r1, -1.0472F, 0.0F, 0.0F);
        this.crest2_r1.cubeList.add(new ModelBox(crest2_r1, 13, 23, -0.5F, -1.8918F, 0.1262F, 1, 1, 3, 0.0F, false));

        this.crest2_r2 = new AdvancedModelRenderer(this);
        this.crest2_r2.setRotationPoint(0.0F, -3.167F, -10.586F);
        this.crest1.addChild(crest2_r2);
        this.setRotateAngle(crest2_r2, -0.4974F, 0.0F, 0.0F);
        this.crest2_r2.cubeList.add(new ModelBox(crest2_r2, 9, 36, -0.5F, 0.1289F, 0.0491F, 1, 1, 1, -0.001F, false));

        this.crest1_r1 = new AdvancedModelRenderer(this);
        this.crest1_r1.setRotationPoint(0.0F, -0.517F, -11.936F);
        this.crest1.addChild(crest1_r1);
        this.setRotateAngle(crest1_r1, -0.4451F, 0.0F, 0.0F);
        this.crest1_r1.cubeList.add(new ModelBox(crest1_r1, 38, 61, -0.5F, -1.8424F, 0.0536F, 1, 2, 2, 0.0F, false));

        this.crest2 = new AdvancedModelRenderer(this);
        this.crest2.setRotationPoint(0.0F, -0.7F, 1.3F);
        this.crest1.addChild(crest2);
        this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);


        this.leftwing1 = new AdvancedModelRenderer(this);
        this.leftwing1.setRotationPoint(1.9F, 0.2F, -3.3F);
        this.chest1.addChild(leftwing1);
        this.setRotateAngle(leftwing1, 0.2169F, 0.0756F, 0.9364F);
        this.leftwing1.cubeList.add(new ModelBox(leftwing1, 52, 39, -0.5F, -1.5F, 0.0F, 4, 2, 2, 0.0F, false));

        this.leftwing2 = new AdvancedModelRenderer(this);
        this.leftwing2.setRotationPoint(3.4F, -1.0F, 1.3F);
        this.leftwing1.addChild(leftwing2);
        this.setRotateAngle(leftwing2, -0.3195F, 0.2905F, -0.9403F);
        this.leftwing2.cubeList.add(new ModelBox(leftwing2, 56, 57, -0.9745F, -0.1996F, -1.3227F, 1, 6, 2, 0.0F, false));

        this.leftwing3 = new AdvancedModelRenderer(this);
        this.leftwing3.setRotationPoint(-0.5745F, 5.4004F, -1.2227F);
        this.leftwing2.addChild(leftwing3);
        this.setRotateAngle(leftwing3, 0.6948F, -0.0078F, 0.0826F);
        this.leftwing3.cubeList.add(new ModelBox(leftwing3, 36, 0, -0.5F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

        this.leftwing4 = new AdvancedModelRenderer(this);
        this.leftwing4.setRotationPoint(0.0844F, 5.277F, 0.2582F);
        this.leftwing3.addChild(leftwing4);
        this.setRotateAngle(leftwing4, 0.8614F, 0.0539F, -0.0263F);
        this.leftwing4.cubeList.add(new ModelBox(leftwing4, 26, 29, -0.5799F, -1.5164F, 0.346F, 1, 2, 8, 0.0F, false));

        this.leftwing5 = new AdvancedModelRenderer(this);
        this.leftwing5.setRotationPoint(-0.0799F, 0.4836F, 8.346F);
        this.leftwing4.addChild(leftwing5);
        this.setRotateAngle(leftwing5, 0.1076F, -0.1006F, -0.0197F);
        this.leftwing5.cubeList.add(new ModelBox(leftwing5, 0, 19, -0.5F, -2.0F, 0.0F, 1, 2, 10, 0.0F, false));

        this.leftwingmembranehidable1 = new AdvancedModelRenderer(this);
        this.leftwingmembranehidable1.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.leftwing5.addChild(leftwingmembranehidable1);
        this.leftwingmembranehidable1.cubeList.add(new ModelBox(leftwingmembranehidable1, 13, 9, -0.525F, -3.5F, -4.65F, 1, 3, 10, 0.0F, false));

        this.leftwingmembranehideable2 = new AdvancedModelRenderer(this);
        this.leftwingmembranehideable2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftwingmembranehidable1.addChild(leftwingmembranehideable2);


        this.bone_r1 = new AdvancedModelRenderer(this);
        this.bone_r1.setRotationPoint(0.175F, -1.4F, -0.15F);
        this.leftwingmembranehideable2.addChild(bone_r1);
        this.setRotateAngle(bone_r1, 0.0F, 0.0F, -0.1222F);
        this.bone_r1.cubeList.add(new ModelBox(bone_r1, 13, 23, 0.0F, -3.1F, -4.5F, 0, 3, 10, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(-0.4031F, 0.0233F, 0.9773F);
        this.leftwing4.addChild(lefthand);
        this.setRotateAngle(lefthand, 2.0464F, 0.1054F, 0.0432F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 46, 8, -0.1219F, -1.3532F, -1.0048F, 2, 1, 2, 0.0F, false));

        this.leftwinghidable2 = new AdvancedModelRenderer(this);
        this.leftwinghidable2.setRotationPoint(-0.0799F, -0.5164F, 4.346F);
        this.leftwing4.addChild(leftwinghidable2);
        this.leftwinghidable2.cubeList.add(new ModelBox(leftwinghidable2, 28, 15, -0.5F, -4.5F, -4.0F, 1, 4, 8, -0.01F, false));

        this.leftwinghideable3 = new AdvancedModelRenderer(this);
        this.leftwinghideable3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.leftwinghidable2.addChild(leftwinghideable3);


        this.bone_r2 = new AdvancedModelRenderer(this);
        this.bone_r2.setRotationPoint(0.1F, -4.0F, 0.0F);
        this.leftwinghideable3.addChild(bone_r2);
        this.setRotateAngle(bone_r2, 0.0F, 0.0F, -0.1396F);
        this.bone_r2.cubeList.add(new ModelBox(bone_r2, 9, 37, -0.2F, -1.5F, -4.0F, 0, 3, 8, -0.01F, false));

        this.leftwingmembrane6 = new AdvancedModelRenderer(this);
        this.leftwingmembrane6.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.leftwing3.addChild(leftwingmembrane6);
        this.leftwingmembrane6.cubeList.add(new ModelBox(leftwingmembrane6, 0, 0, -0.5F, -3.0F, 1.0F, 1, 6, 4, 0.0F, false));

        this.leftwinghidable3 = new AdvancedModelRenderer(this);
        this.leftwinghidable3.setRotationPoint(0.1F, 0.0F, 10.0F);
        this.leftwingmembrane6.addChild(leftwinghidable3);


        this.bone_r3 = new AdvancedModelRenderer(this);
        this.bone_r3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.leftwinghidable3.addChild(bone_r3);
        this.setRotateAngle(bone_r3, 0.0024F, -0.0698F, -0.035F);
        this.bone_r3.cubeList.add(new ModelBox(bone_r3, 9, 49, -0.3F, -3.0F, -2.1F, 0, 6, 4, 0.0F, false));

        this.leftwingmembrane7 = new AdvancedModelRenderer(this);
        this.leftwingmembrane7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftwing2.addChild(leftwingmembrane7);


        this.wing5_r1 = new AdvancedModelRenderer(this);
        this.wing5_r1.setRotationPoint(-0.4745F, 2.3004F, 2.6773F);
        this.leftwingmembrane7.addChild(wing5_r1);
        this.setRotateAngle(wing5_r1, -0.0742F, -0.0218F, 0.0016F);
        this.wing5_r1.cubeList.add(new ModelBox(wing5_r1, 26, 40, -0.575F, -3.275F, -2.525F, 1, 7, 5, 0.0F, false));

        this.leftwinghidable4 = new AdvancedModelRenderer(this);
        this.leftwinghidable4.setRotationPoint(-0.4745F, 2.3004F, 6.6773F);
        this.leftwingmembrane7.addChild(leftwinghidable4);


        this.bone_r4 = new AdvancedModelRenderer(this);
        this.bone_r4.setRotationPoint(0.25F, 0.0F, -4.225F);
        this.leftwinghidable4.addChild(bone_r4);
        this.setRotateAngle(bone_r4, -0.2929F, -0.1204F, -0.0234F);
        this.bone_r4.cubeList.add(new ModelBox(bone_r4, 39, 34, 0.125F, -3.875F, 0.875F, 0, 6, 6, 0.0F, false));

        this.leftwingmembrane1 = new AdvancedModelRenderer(this);
        this.leftwingmembrane1.setRotationPoint(1.025F, -0.3F, 1.675F);
        this.leftwing1.addChild(leftwingmembrane1);
        this.setRotateAngle(leftwingmembrane1, -0.6888F, -0.3005F, 0.2284F);


        this.upperwing4_r1 = new AdvancedModelRenderer(this);
        this.upperwing4_r1.setRotationPoint(0.4405F, -1.2284F, 0.954F);
        this.leftwingmembrane1.addChild(upperwing4_r1);
        this.setRotateAngle(upperwing4_r1, -0.0218F, 0.5794F, -0.1017F);
        this.upperwing4_r1.cubeList.add(new ModelBox(upperwing4_r1, 12, 0, -2.7079F, 0.4759F, -1.4343F, 5, 1, 6, 0.0F, false));

        this.rightwing1 = new AdvancedModelRenderer(this);
        this.rightwing1.setRotationPoint(-1.9F, 0.2F, -3.3F);
        this.chest1.addChild(rightwing1);
        this.setRotateAngle(rightwing1, 0.2169F, -0.0756F, -0.9364F);
        this.rightwing1.cubeList.add(new ModelBox(rightwing1, 52, 39, -3.5F, -1.5F, 0.0F, 4, 2, 2, 0.0F, true));

        this.rightwing2 = new AdvancedModelRenderer(this);
        this.rightwing2.setRotationPoint(-3.4F, -1.0F, 1.3F);
        this.rightwing1.addChild(rightwing2);
        this.setRotateAngle(rightwing2, -0.3195F, -0.2905F, 0.9403F);
        this.rightwing2.cubeList.add(new ModelBox(rightwing2, 56, 57, -0.0255F, -0.1996F, -1.3227F, 1, 6, 2, 0.0F, true));

        this.rightwing3 = new AdvancedModelRenderer(this);
        this.rightwing3.setRotationPoint(0.5745F, 5.4004F, -1.2227F);
        this.rightwing2.addChild(rightwing3);
        this.setRotateAngle(rightwing3, 0.6948F, 0.0078F, -0.0826F);
        this.rightwing3.cubeList.add(new ModelBox(rightwing3, 36, 0, -0.5F, 0.0F, 0.0F, 1, 6, 2, 0.0F, true));

        this.rightwing4 = new AdvancedModelRenderer(this);
        this.rightwing4.setRotationPoint(-0.0844F, 5.277F, 0.2582F);
        this.rightwing3.addChild(rightwing4);
        this.setRotateAngle(rightwing4, 0.8614F, -0.0539F, 0.0263F);
        this.rightwing4.cubeList.add(new ModelBox(rightwing4, 26, 29, -0.4201F, -1.5164F, 0.346F, 1, 2, 8, 0.0F, true));

        this.rightwing5 = new AdvancedModelRenderer(this);
        this.rightwing5.setRotationPoint(0.0799F, 0.4836F, 8.346F);
        this.rightwing4.addChild(rightwing5);
        this.setRotateAngle(rightwing5, 0.1076F, 0.1006F, 0.0197F);
        this.rightwing5.cubeList.add(new ModelBox(rightwing5, 0, 19, -0.5F, -2.0F, 0.0F, 1, 2, 10, 0.0F, true));

        this.rightwingmembranehidable1 = new AdvancedModelRenderer(this);
        this.rightwingmembranehidable1.setRotationPoint(0.0F, -0.9559F, 4.6511F);
        this.rightwing5.addChild(rightwingmembranehidable1);
        this.rightwingmembranehidable1.cubeList.add(new ModelBox(rightwingmembranehidable1, 13, 9, -0.475F, -3.5F, -4.65F, 1, 3, 10, 0.0F, true));

        this.rightwingmembranehideable2 = new AdvancedModelRenderer(this);
        this.rightwingmembranehideable2.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightwingmembranehidable1.addChild(rightwingmembranehideable2);


        this.bone_r5 = new AdvancedModelRenderer(this);
        this.bone_r5.setRotationPoint(-0.175F, -1.4F, -0.15F);
        this.rightwingmembranehideable2.addChild(bone_r5);
        this.setRotateAngle(bone_r5, 0.0F, 0.0F, 0.1222F);
        this.bone_r5.cubeList.add(new ModelBox(bone_r5, 13, 23, 0.0F, -3.1F, -4.5F, 0, 3, 10, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(0.4031F, 0.0233F, 0.9773F);
        this.rightwing4.addChild(righthand);
        this.setRotateAngle(righthand, 2.0464F, -0.1054F, -0.0432F);
        this.righthand.cubeList.add(new ModelBox(righthand, 46, 8, -1.8781F, -1.3532F, -1.0048F, 2, 1, 2, 0.0F, true));

        this.rightwinghidable2 = new AdvancedModelRenderer(this);
        this.rightwinghidable2.setRotationPoint(0.0799F, -0.5164F, 4.346F);
        this.rightwing4.addChild(rightwinghidable2);
        this.rightwinghidable2.cubeList.add(new ModelBox(rightwinghidable2, 28, 15, -0.5F, -4.5F, -4.0F, 1, 4, 8, -0.01F, true));

        this.rightwinghideable3 = new AdvancedModelRenderer(this);
        this.rightwinghideable3.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.rightwinghidable2.addChild(rightwinghideable3);


        this.bone_r6 = new AdvancedModelRenderer(this);
        this.bone_r6.setRotationPoint(-0.1F, -4.0F, 0.0F);
        this.rightwinghideable3.addChild(bone_r6);
        this.setRotateAngle(bone_r6, 0.0F, 0.0F, 0.1396F);
        this.bone_r6.cubeList.add(new ModelBox(bone_r6, 9, 37, 0.2F, -1.5F, -4.0F, 0, 3, 8, -0.01F, true));

        this.rightwingmembrane6 = new AdvancedModelRenderer(this);
        this.rightwingmembrane6.setRotationPoint(0.0F, 3.0F, 1.0F);
        this.rightwing3.addChild(rightwingmembrane6);
        this.rightwingmembrane6.cubeList.add(new ModelBox(rightwingmembrane6, 0, 0, -0.5F, -3.0F, 1.0F, 1, 6, 4, 0.0F, true));

        this.rightwinghidable3 = new AdvancedModelRenderer(this);
        this.rightwinghidable3.setRotationPoint(-0.1F, 0.0F, 10.0F);
        this.rightwingmembrane6.addChild(rightwinghidable3);


        this.bone_r7 = new AdvancedModelRenderer(this);
        this.bone_r7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.rightwinghidable3.addChild(bone_r7);
        this.setRotateAngle(bone_r7, 0.0024F, 0.0698F, 0.035F);
        this.bone_r7.cubeList.add(new ModelBox(bone_r7, 9, 49, 0.3F, -3.0F, -2.1F, 0, 6, 4, 0.0F, true));

        this.rightwingmembrane7 = new AdvancedModelRenderer(this);
        this.rightwingmembrane7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightwing2.addChild(rightwingmembrane7);


        this.wing6_r1 = new AdvancedModelRenderer(this);
        this.wing6_r1.setRotationPoint(0.4745F, 2.3004F, 2.6773F);
        this.rightwingmembrane7.addChild(wing6_r1);
        this.setRotateAngle(wing6_r1, -0.0742F, 0.0218F, -0.0016F);
        this.wing6_r1.cubeList.add(new ModelBox(wing6_r1, 26, 40, -0.425F, -3.275F, -2.525F, 1, 7, 5, 0.0F, true));

        this.rightwinghidable4 = new AdvancedModelRenderer(this);
        this.rightwinghidable4.setRotationPoint(0.4745F, 2.3004F, 6.6773F);
        this.rightwingmembrane7.addChild(rightwinghidable4);


        this.bone_r8 = new AdvancedModelRenderer(this);
        this.bone_r8.setRotationPoint(-0.25F, 0.0F, -4.225F);
        this.rightwinghidable4.addChild(bone_r8);
        this.setRotateAngle(bone_r8, -0.2929F, 0.1204F, 0.0234F);
        this.bone_r8.cubeList.add(new ModelBox(bone_r8, 39, 34, -0.125F, -3.875F, 0.875F, 0, 6, 6, 0.0F, true));

        this.rightwingmembrane1 = new AdvancedModelRenderer(this);
        this.rightwingmembrane1.setRotationPoint(-1.025F, -0.3F, 1.675F);
        this.rightwing1.addChild(rightwingmembrane1);
        this.setRotateAngle(rightwingmembrane1, -0.6888F, 0.3005F, -0.2284F);


        this.upperwing5_r1 = new AdvancedModelRenderer(this);
        this.upperwing5_r1.setRotationPoint(-0.4405F, -1.2284F, 0.954F);
        this.rightwingmembrane1.addChild(upperwing5_r1);
        this.setRotateAngle(upperwing5_r1, -0.0218F, -0.5794F, 0.1017F);
        this.upperwing5_r1.cubeList.add(new ModelBox(upperwing5_r1, 12, 0, -2.2921F, 0.4759F, -1.4343F, 5, 1, 6, 0.0F, true));

        this.rightwingmembrane6.scaleChildren = true;
        this.rightwingmembrane7.scaleChildren = true;
        this.rightwinghidable2.scaleChildren = true;
        this.rightwingmembranehideable2.scaleChildren = true;
        this.rightwingmembranehidable1.scaleChildren = true;
        this.rightwinghideable3.scaleChildren = true;
        this.rightwinghidable3.scaleChildren = true;
        this.rightwinghidable4.scaleChildren = true;
        this.leftwingmembranehidable1.scaleChildren = true;
        this.leftwingmembranehideable2.scaleChildren = true;
        this.leftwingmembrane7.scaleChildren = true;
        this.leftwingmembrane6.scaleChildren = true;
        this.leftwinghidable2.scaleChildren = true;
        this.leftwinghidable4.scaleChildren = true;
        this.leftwinghidable3.scaleChildren = true;


        this.rightwingmembrane7.setScale((float)0,(float)0,(float)0);
        this.rightwingmembrane6.setScale((float)0,(float)0,(float)0);
        this.rightwinghidable2.setScale((float)0,(float)0,(float)0);
        this.rightwingmembranehidable1.setScale((float)0,(float)0,(float)0);
        this.rightwingmembranehideable2.setScale((float)0,(float)0,(float)0);
        this.rightwinghideable3.setScale((float)0,(float)0,(float)0);
        this.rightwinghidable3.setScale((float)0,(float)0,(float)0);
        this.rightwinghidable4.setScale((float)0,(float)0,(float)0);
        this.leftwingmembranehidable1.setScale((float)0,(float)0,(float)0);
        this.leftwingmembranehideable2.setScale((float)0,(float)0,(float)0);
        this.leftwinghidable3.setScale((float)0,(float)0,(float)0);
        this.leftwingmembrane7.setScale((float)0,(float)0,(float)0);
        this.leftwingmembrane6.setScale((float)0,(float)0,(float)0);
        this.leftwinghidable2.setScale((float)0,(float)0,(float)0);
        this.leftwinghidable4.setScale((float)0,(float)0,(float)0);
        this.leftwinghidable3.setScale((float)0,(float)0,(float)0);

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.root.offsetZ = -0.3F;
        this.jaw.rotateAngleX = (float) Math.toRadians(25);
        this.root.render(0.1F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.1F;
        this.root.rotateAngleY = (float)Math.toRadians(125);
        this.root.rotateAngleX = (float)Math.toRadians(-10);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 1.2F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.2F, 3.8F, -0.2F);

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }
    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {

        EntityPrehistoricFloraLandClimbingFlyingWalkingBase flier = (EntityPrehistoricFloraLandClimbingFlyingWalkingBase) e;

        AdvancedModelRenderer[] tailFull = {this.tail1};

        float speed = 0.76F;

        //Animations:

        if (flier.isReallyFlying()) { //flying
            this.faceTarget(f3, f4, 14, neck1);
            this.faceTarget(f3, f4, 14, neck2);
            this.faceTarget(f3, f4, 14, neck3);
            this.faceTarget(f3, f4, 7, head);

        }
        else { //not flying
            if (flier.getIsFast()) {
                speed = speed;
            }
            else {
                speed = speed / 1.5F;
            }
            this.faceTarget(f3, f4, 12, neck1);
            this.faceTarget(f3, f4, 12, neck2);
            this.faceTarget(f3, f4, 12, neck3);
            this.faceTarget(f3, f4, 8, head2);

            this.chainWave(tailFull, speed * 0.5F, 0.02F, 0.2F, f2, 1F);
            this.chainSwing(tailFull, speed * 0.5F, 0.05F, 0.5F, f2, 1F);

        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraEuropejara ee = (EntityPrehistoricFloraEuropejara) entitylivingbaseIn;

        if (ee.isReallyFlying() || ee.getAnimation() == ee.UNFLY_ANIMATION) {
            //flight pose
            //The pose itself is given by the animation, which plays constantly
            //also within the flight anim itself is the rescaling of the wings
            //so we don't need to do them here either, but I will for consistency!
            this.rightwingmembrane7.setScale((float)1,(float)1,(float)1);
            this.rightwingmembrane6.setScale((float)1,(float)1,(float)1);
            this.rightwinghidable2.setScale((float)1,(float)1,(float)1);
            this.rightwingmembranehidable1.setScale((float)1,(float)1,(float)1);
            this.rightwingmembranehideable2.setScale((float)1,(float)1,(float)1);
            this.rightwinghideable3.setScale((float)1,(float)1,(float)1);
            this.rightwinghidable3.setScale((float)1,(float)1,(float)1);
            this.rightwinghidable4.setScale((float)1,(float)1,(float)1);
            this.leftwingmembranehidable1.setScale((float)1,(float)1,(float)1);
            this.leftwingmembranehideable2.setScale((float)1,(float)1,(float)1);
            this.leftwinghidable3.setScale((float)1,(float)1,(float)1);
            this.leftwingmembrane7.setScale((float)1,(float)1,(float)1);
            this.leftwingmembrane6.setScale((float)1,(float)1,(float)1);
            this.leftwinghidable2.setScale((float)1,(float)1,(float)1);
            this.leftwinghidable4.setScale((float)1,(float)1,(float)1);
            this.leftwinghidable3.setScale((float)1,(float)1,(float)1);

            //And now the pose:
            this.setRotateAngle(body1, -0.1367F, 0.0F, 0.0F);
            this.setRotateAngle(body2_r1, 0.4363F, 0.0F, 0.0F);
            this.setRotateAngle(bone_r1, 0.0F, 0.0F, -0.1222F);
            this.setRotateAngle(bone_r2, 0.0F, 0.0F, -0.1396F);
            this.setRotateAngle(bone_r3, 0.0024F, -0.0698F, -0.035F);
            this.setRotateAngle(bone_r4, -0.2929F, -0.1204F, -0.0234F);
            this.setRotateAngle(bone_r5, 0.0F, 0.0F, 0.1222F);
            this.setRotateAngle(bone_r6, 0.0F, 0.0F, 0.1396F);
            this.setRotateAngle(bone_r7, 0.0024F, 0.0698F, 0.035F);
            this.setRotateAngle(bone_r8, -0.2929F, 0.1204F, 0.0234F);
            this.setRotateAngle(chest1, -0.0133F, 0.0F, 0.0F);
            this.setRotateAngle(crest1_r1, -0.4451F, 0.0F, 0.0F);
            this.setRotateAngle(crest1, -0.0911F, 0.0F, 0.0F);
            this.setRotateAngle(crest2_r1, -1.0472F, 0.0F, 0.0F);
            this.setRotateAngle(crest2_r2, -0.4974F, 0.0F, 0.0F);
            this.setRotateAngle(crest2, 0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(crest3_r1, -1.309F, 0.0F, 0.0F);
            this.setRotateAngle(gums1, -0.055F, 0.0F, 0.0F);
            this.setRotateAngle(head, 1.1345F, 0.0F, 0.0F);
            this.setRotateAngle(head1_r1, 0.0611F, 0.0F, 0.0F);
            this.setRotateAngle(head2_r1, -1.4748F, 0.0F, 0.0F);
            this.setRotateAngle(head2_r2, -0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(head2, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(head3_r1, -0.1309F, 0.0F, 0.0F);
            this.setRotateAngle(head3_r2, -1.0821F, 0.0F, 0.0F);
            this.setRotateAngle(head3, -0.1367F, 0.0F, 0.0F);
            this.setRotateAngle(head4_r1, -0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(head4, 0.1559F, 0.0F, 0.0F);
            this.setRotateAngle(head5_r1, 0.2094F, 0.0F, 0.0F);
            this.setRotateAngle(head5_r2, -0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(head5, 0.0948F, 0.0F, 0.0F);
            this.setRotateAngle(head6_r1, 0.3927F, 0.0F, 0.0F);
            this.setRotateAngle(head6_r2, 1.1257F, 0.0F, 0.0F);
            this.setRotateAngle(head6_r3, 0.2094F, 0.0F, 0.0F);
            this.setRotateAngle(head7_r1, 0.5236F, 0.0F, 0.0F);
            this.setRotateAngle(jaw, 0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2_r1, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(jaw2, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(jaw3, 0.2353F, 0.0F, 0.0F);
            this.setRotateAngle(jaw4_r1, 0.0524F, 0.0F, 0.0F);
            this.setRotateAngle(jaw4, -0.0456F, 0.0F, 0.0F);
            this.setRotateAngle(jaw5_r1, -0.0175F, 0.0F, 0.0F);
            this.setRotateAngle(jaw5, 0.0454F, 0.0F, 0.0F);
            this.setRotateAngle(jaw6_r1, 1.1694F, 0.0F, 0.0F);
            this.setRotateAngle(jaw7_r1, 1.8239F, 0.0F, 0.0F);
            this.setRotateAngle(jaw7_r2, 0.7505F, 0.0F, 0.0F);
            this.setRotateAngle(jaw8_r1, 0.5585F, 0.0F, 0.0F);
            this.setRotateAngle(leftfoot, 1.1254F, 0.0804F, -0.024F);
            this.setRotateAngle(lefthand, 0.15F, -0.6621F, 1.8377F);
            this.setRotateAngle(leftleg1, 0.2787F, 0.1138F, -1.5681F);
            this.setRotateAngle(leftleg2, 1.0026F, -0.0258F, 0.0676F);
            this.setRotateAngle(leftlegwing1, 0.1361F, -0.0119F, 0.0865F);
            this.setRotateAngle(leftlegwing2, -0.0141F, 0.0F, 0.0F);
            this.setRotateAngle(leftwing1, -0.1073F, -0.048F, -0.094F);
            this.setRotateAngle(leftwing2, -0.1984F, -0.0155F, -1.5881F);
            this.setRotateAngle(leftwing3, 0.0403F, -0.0078F, 0.0826F);
            this.setRotateAngle(leftwing4, -1.1904F, -0.0248F, 0.0527F);
            this.setRotateAngle(leftwing5, 0.1948F, -0.1006F, -0.0197F);
            this.setRotateAngle(leftwingmembrane1, 0.0022F, -0.3752F, -0.0093F);
            this.setRotateAngle(lips1, 0.0025F, -0.0138F, 0.2731F);
            this.setRotateAngle(lips2, 0.0025F, 0.0138F, -0.2731F);
            this.setRotateAngle(neck1_r1, 0.0436F, 0.0F, 0.0F);
            this.setRotateAngle(neck1, -0.2618F, 0.0F, 0.0F);
            this.setRotateAngle(neck2, -0.1461F, 0.0F, 0.0F);
            this.setRotateAngle(neck3_r1, 0.1745F, 0.0F, 0.0F);
            this.setRotateAngle(neck3, -0.2402F, 0.0F, 0.0F);
            this.setRotateAngle(rightfoot, 1.1254F, -0.0804F, 0.024F);
            this.setRotateAngle(righthand, -0.15F, 0.6621F, -1.8377F);
            this.setRotateAngle(rightleg1, 0.2787F, -0.1138F, 1.5681F);
            this.setRotateAngle(rightleg2, 1.0026F, 0.0258F, -0.0676F);
            this.setRotateAngle(rightlegwing1, 0.1361F, 0.0119F, -0.0865F);
            this.setRotateAngle(rightlegwing2, -0.0141F, 0.0F, 0.0F);
            this.setRotateAngle(rightwing1, -0.1073F, 0.048F, 0.094F);
            this.setRotateAngle(rightwing2, -0.1984F, 0.0155F, 1.5881F);
            this.setRotateAngle(rightwing3, 0.0403F, 0.0078F, -0.0826F);
            this.setRotateAngle(rightwing4, -1.1904F, 0.0248F, -0.0527F);
            this.setRotateAngle(rightwing5, 0.1948F, 0.1006F, 0.0197F);
            this.setRotateAngle(rightwingmembrane1, 0.0022F, 0.3752F, 0.0093F);
            this.setRotateAngle(root, 0.0F, 0.0F, 0.0F);
            this.setRotateAngle(shape64, -1.4114F, 0.0F, 0.0F);
            this.setRotateAngle(tail1, -0.2731F, 0.0F, 0.0F);
            this.setRotateAngle(underneck3, -0.2246F, 0.0F, 0.0F);
            this.setRotateAngle(underneck4_r1, -0.0873F, 0.0F, 0.0F);
            this.setRotateAngle(upperwing4_r1, -0.0218F, 0.5794F, -0.1017F);
            this.setRotateAngle(upperwing5_r1, -0.0218F, -0.5794F, 0.1017F);
            this.setRotateAngle(wing5_r1, -0.0742F, -0.0218F, 0.0016F);
            this.setRotateAngle(wing6_r1, -0.0742F, 0.0218F, -0.0016F);


        } else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is walking:
                //The pose is reset here, and I have hard coded these into the default
                //pose as BB won't have done that
                this.rightwingmembrane7.setScale((float)0,(float)0,(float)0);
                this.rightwingmembrane6.setScale((float)0,(float)0,(float)0);
                this.rightwinghidable2.setScale((float)0,(float)0,(float)0);
                this.rightwingmembranehidable1.setScale((float)0,(float)0,(float)0);
                this.rightwingmembranehideable2.setScale((float)0,(float)0,(float)0);
                this.rightwinghideable3.setScale((float)0,(float)0,(float)0);
                this.rightwinghidable3.setScale((float)0,(float)0,(float)0);
                this.rightwinghidable4.setScale((float)0,(float)0,(float)0);
                this.leftwingmembranehidable1.setScale((float)0,(float)0,(float)0);
                 this.leftwingmembranehideable2.setScale((float)0,(float)0,(float)0);
                this.leftwinghidable3.setScale((float)0,(float)0,(float)0);
                this.leftwingmembrane7.setScale((float)0,(float)0,(float)0);
                this.leftwingmembrane6.setScale((float)0,(float)0,(float)0);
                this.leftwinghidable2.setScale((float)0,(float)0,(float)0);
                this.leftwinghidable4.setScale((float)0,(float)0,(float)0);
                this.leftwinghidable3.setScale((float)0,(float)0,(float)0);



            }
            else {
                //Climb pose

            }
        }

        if (ee.getAttachmentPos() == null) {

        } else {

        }

        if (ee.getAttachmentPos() == null ) {
            if (ee.getIsMoving()) {
                animFly(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }

        }
        else if (ee.getAttachmentPos() != null) {
            if (ee.getAttachmentFacing() == EnumFacing.UP) {
                //Is Walking:
                if (ee.getIsMoving()) {

                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                }

            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
//            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) {
//            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) {
//            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }
    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropejara entity = (EntityPrehistoricFloraEuropejara) entitylivingbaseIn;
        int animCycle = 115;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.50042-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.99886-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.04781-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 70) {
            xx = 3.50042 + (((tickAnim - 10) / 60) * (3.50042-(3.50042)));
            yy = 0.99886 + (((tickAnim - 10) / 60) * (0.99886-(0.99886)));
            zz = 0.04781 + (((tickAnim - 10) / 60) * (0.04781-(0.04781)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 3.50042 + (((tickAnim - 70) / 15) * (7.6254+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10-(3.50042)));
            yy = 0.99886 + (((tickAnim - 70) / 15) * (0.99886-(0.99886)));
            zz = 0.04781 + (((tickAnim - 70) / 15) * (0.04781-(0.04781)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = 7.6254+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10 + (((tickAnim - 85) / 17) * (0-(7.6254+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10)));
            yy = 0.99886 + (((tickAnim - 85) / 17) * (0-(0.99886)));
            zz = 0.04781 + (((tickAnim - 85) / 17) * (0-(0.04781)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(xx), chest1.rotateAngleY + (float) Math.toRadians(yy), chest1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (-0.8-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 85) / 17) * (0-(0)));
            yy = -0.8 + (((tickAnim - 85) / 17) * (0-(-0.8)));
            zz = 0 + (((tickAnim - 85) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest1.rotationPointX = this.chest1.rotationPointX + (float)(xx);
        this.chest1.rotationPointY = this.chest1.rotationPointY - (float)(yy);
        this.chest1.rotationPointZ = this.chest1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 70) {
            xx = -4.25 + (((tickAnim - 10) / 60) * (-4.25-(-4.25)));
            yy = -1.25 + (((tickAnim - 10) / 60) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 10) / 60) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -4.25 + (((tickAnim - 70) / 15) * (-0.25-(-4.25)));
            yy = -1.25 + (((tickAnim - 70) / 15) * (-1.25-(-1.25)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -0.25 + (((tickAnim - 85) / 17) * (0-(-0.25)));
            yy = -1.25 + (((tickAnim - 85) / 17) * (0-(-1.25)));
            zz = 0 + (((tickAnim - 85) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-2.2443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (6.93982-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0.9182+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 40) {
            xx = -2.2443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20 + (((tickAnim - 18) / 22) * (24.2782+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5-(-2.2443+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*20)));
            yy = 6.93982 + (((tickAnim - 18) / 22) * (4.68263-(6.93982)));
            zz = 0.9182+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.5 + (((tickAnim - 18) / 22) * (-1.75495-(0.9182+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 24.2782+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5 + (((tickAnim - 40) / 15) * (28.903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170-90))*-15-(24.2782+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-60))*-5)));
            yy = 4.68263 + (((tickAnim - 40) / 15) * (2.67678-(4.68263)));
            zz = -1.75495 + (((tickAnim - 40) / 15) * (-2.097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.5-(-1.75495)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 28.903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170-90))*-15 + (((tickAnim - 55) / 15) * (71.4654+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*50-(28.903+Math.sin((Math.PI/180)*(((double)tickAnim/20)*170-90))*-15)));
            yy = 2.67678 + (((tickAnim - 55) / 15) * (-6.81684-(2.67678)));
            zz = -2.097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.5 + (((tickAnim - 55) / 15) * (-1.74851-(-2.097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1.5)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 71.4654+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*50 + (((tickAnim - 70) / 15) * (37.30407-(71.4654+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*50)));
            yy = -6.81684 + (((tickAnim - 70) / 15) * (-1.18825-(-6.81684)));
            zz = -1.74851 + (((tickAnim - 70) / 15) * (-0.6344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3-(-1.74851)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = 37.30407 + (((tickAnim - 85) / 17) * (15.8-(37.30407)));
            yy = -1.18825 + (((tickAnim - 85) / 17) * (0-(-1.18825)));
            zz = -0.6344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3 + (((tickAnim - 85) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3-(-0.6344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = 15.8 + (((tickAnim - 102) / 13) * (0-(15.8)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3 + (((tickAnim - 102) / 13) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.7692+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5.97095-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.59076-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -3.7692+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15 + (((tickAnim - 10) / 8) * (6.60581-(-3.7692+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*15)));
            yy = 5.97095 + (((tickAnim - 10) / 8) * (5.97095-(5.97095)));
            zz = 0.59076 + (((tickAnim - 10) / 8) * (0.59076-(0.59076)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 6.60581 + (((tickAnim - 18) / 12) * (-2.24172-(6.60581)));
            yy = 5.97095 + (((tickAnim - 18) / 12) * (12.42264-(5.97095)));
            zz = 0.59076 + (((tickAnim - 18) / 12) * (5.20564-(0.59076)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2.24172 + (((tickAnim - 30) / 10) * (-6.24172-(-2.24172)));
            yy = 12.42264 + (((tickAnim - 30) / 10) * (18.9226+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(12.42264)));
            zz = 5.20564 + (((tickAnim - 30) / 10) * (5.20564-(5.20564)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -6.24172 + (((tickAnim - 40) / 15) * (14.06586-(-6.24172)));
            yy = 18.9226+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 40) / 15) * (-8.70746-(18.9226+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            zz = 5.20564 + (((tickAnim - 40) / 15) * (-0.86508-(5.20564)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 14.06586 + (((tickAnim - 55) / 15) * (-2.98573-(14.06586)));
            yy = -8.70746 + (((tickAnim - 55) / 15) * (-13.87375-(-8.70746)));
            zz = -0.86508 + (((tickAnim - 55) / 15) * (-3.67609-(-0.86508)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -2.98573 + (((tickAnim - 70) / 15) * (2.5-(-2.98573)));
            yy = -13.87375 + (((tickAnim - 70) / 15) * (0-(-13.87375)));
            zz = -3.67609 + (((tickAnim - 70) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-30))*2-(-3.67609)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = 2.5 + (((tickAnim - 85) / 17) * (-7-(2.5)));
            yy = 0 + (((tickAnim - 85) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-30))*2 + (((tickAnim - 85) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-30))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-30))*2)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = -7 + (((tickAnim - 102) / 13) * (0-(-7)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-30))*2 + (((tickAnim - 102) / 13) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-30))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-12.615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (7.02609-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.7924+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 30) {
            xx = -12.615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-15 + (((tickAnim - 10) / 20) * (-13.50046-(-12.615+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-100))*-15)));
            yy = 7.02609 + (((tickAnim - 10) / 20) * (10.70938-(7.02609)));
            zz = 1.7924+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3 + (((tickAnim - 10) / 20) * (4.99089-(1.7924+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -13.50046 + (((tickAnim - 30) / 10) * (-2.55046-(-13.50046)));
            yy = 10.70938 + (((tickAnim - 30) / 10) * (0.2344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-15-(10.70938)));
            zz = 4.99089 + (((tickAnim - 30) / 10) * (4.99089-(4.99089)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -2.55046 + (((tickAnim - 40) / 15) * (7.097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-12-(-2.55046)));
            yy = 0.2344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-15 + (((tickAnim - 40) / 15) * (-3.15004-(0.2344+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+20))*-15)));
            zz = 4.99089 + (((tickAnim - 40) / 15) * (-0.8003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3-(4.99089)));
        }
        else if (tickAnim >= 55 && tickAnim < 70) {
            xx = 7.097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-12 + (((tickAnim - 55) / 15) * (-19.47689-(7.097+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-12)));
            yy = -3.15004 + (((tickAnim - 55) / 15) * (-1.59559-(-3.15004)));
            zz = -0.8003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3 + (((tickAnim - 55) / 15) * (-6.85925-(-0.8003+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*3)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = -19.47689 + (((tickAnim - 70) / 15) * (-10.94889-(-19.47689)));
            yy = -1.59559 + (((tickAnim - 70) / 15) * (-8.32121-(-1.59559)));
            zz = -6.85925 + (((tickAnim - 70) / 15) * (-6.7406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-60))*2-(-6.85925)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -10.94889 + (((tickAnim - 85) / 17) * (-19.19889-(-10.94889)));
            yy = -8.32121 + (((tickAnim - 85) / 17) * (-8.32121-(-8.32121)));
            zz = -6.7406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-60))*2 + (((tickAnim - 85) / 17) * (-6.7406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-60))*2-(-6.7406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-60))*2)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = -19.19889 + (((tickAnim - 102) / 13) * (0-(-19.19889)));
            yy = -8.32121 + (((tickAnim - 102) / 13) * (0-(-8.32121)));
            zz = -6.7406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-60))*2 + (((tickAnim - 102) / 13) * (0-(-6.7406+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-60))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-35.6193-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (3.58701-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (4.17206-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -35.6193 + (((tickAnim - 18) / 12) * (-39.68237-(-35.6193)));
            yy = 3.58701 + (((tickAnim - 18) / 12) * (1.66848-(3.58701)));
            zz = 4.17206 + (((tickAnim - 18) / 12) * (8.24707-(4.17206)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -39.68237 + (((tickAnim - 30) / 10) * (-42.7824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(-39.68237)));
            yy = 1.66848 + (((tickAnim - 30) / 10) * (-7.03152-(1.66848)));
            zz = 8.24707 + (((tickAnim - 30) / 10) * (8.24707-(8.24707)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = -42.7824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 40) / 15) * (-41.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20-(-42.7824+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = -7.03152 + (((tickAnim - 40) / 15) * (-6.11226-(-7.03152)));
            zz = 8.24707 + (((tickAnim - 40) / 15) * (2.50493-(8.24707)));
        }
        else if (tickAnim >= 55 && tickAnim < 77) {
            xx = -41.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20 + (((tickAnim - 55) / 22) * (-30.7502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-45-(-41.6598+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-20)));
            yy = -6.11226 + (((tickAnim - 55) / 22) * (-3.65858-(-6.11226)));
            zz = 2.50493 + (((tickAnim - 55) / 22) * (-5.93944-(2.50493)));
        }
        else if (tickAnim >= 77 && tickAnim < 85) {
            xx = -30.7502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-45 + (((tickAnim - 77) / 8) * (-38.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10-(-30.7502+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-45)));
            yy = -3.65858 + (((tickAnim - 77) / 8) * (0-(-3.65858)));
            zz = -5.93944 + (((tickAnim - 77) / 8) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*3-(-5.93944)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -38.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10 + (((tickAnim - 85) / 17) * (-26.75-(-38.45+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*10)));
            yy = 0 + (((tickAnim - 85) / 17) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*3 + (((tickAnim - 85) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*3)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = -26.75 + (((tickAnim - 102) / 13) * (0-(-26.75)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*3 + (((tickAnim - 102) / 13) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 18.25 + (((tickAnim - 20) / 3) * (0-(18.25)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 23) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 18.25 + (((tickAnim - 25) / 3) * (0-(18.25)));
            yy = 0 + (((tickAnim - 25) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 3) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 57) {
            xx = 0 + (((tickAnim - 28) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 29) * (0-(0)));
        }
        else if (tickAnim >= 57 && tickAnim < 59) {
            xx = 0 + (((tickAnim - 57) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 57) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 57) / 2) * (0-(0)));
        }
        else if (tickAnim >= 59 && tickAnim < 62) {
            xx = 18.25 + (((tickAnim - 59) / 3) * (0-(18.25)));
            yy = 0 + (((tickAnim - 59) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 59) / 3) * (0-(0)));
        }
        else if (tickAnim >= 62 && tickAnim < 64) {
            xx = 0 + (((tickAnim - 62) / 2) * (18.25-(0)));
            yy = 0 + (((tickAnim - 62) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 62) / 2) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 67) {
            xx = 18.25 + (((tickAnim - 64) / 3) * (0-(18.25)));
            yy = 0 + (((tickAnim - 64) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 3) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 67) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 67) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 18) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 85) / 2) * (12-(0)));
            yy = 0 + (((tickAnim - 85) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 2) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 88) {
            xx = 12 + (((tickAnim - 87) / 1) * (0-(12)));
            yy = 0 + (((tickAnim - 87) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 1) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 88) / 2) * (12-(0)));
            yy = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 92) {
            xx = 12 + (((tickAnim - 90) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 90) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 2) * (0-(0)));
        }
        else if (tickAnim >= 92 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 92) / 1) * (12-(0)));
            yy = 0 + (((tickAnim - 92) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 92) / 1) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 95) {
            xx = 12 + (((tickAnim - 93) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 93) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 2) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 97) {
            xx = 0 + (((tickAnim - 95) / 2) * (12-(0)));
            yy = 0 + (((tickAnim - 95) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 2) * (0-(0)));
        }
        else if (tickAnim >= 97 && tickAnim < 98) {
            xx = 12 + (((tickAnim - 97) / 1) * (0-(12)));
            yy = 0 + (((tickAnim - 97) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 97) / 1) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 98) / 2) * (12-(0)));
            yy = 0 + (((tickAnim - 98) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 2) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 102) {
            xx = 12 + (((tickAnim - 100) / 2) * (0-(12)));
            yy = 0 + (((tickAnim - 100) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 103) {
            xx = 12.25 + (((tickAnim - 18) / 85) * (12.25-(12.25)));
            yy = 0 + (((tickAnim - 18) / 85) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 85) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 115) {
            xx = 12.25 + (((tickAnim - 103) / 12) * (0-(12.25)));
            yy = 0 + (((tickAnim - 103) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(underneck3, underneck3.rotateAngleX + (float) Math.toRadians(xx), underneck3.rotateAngleY + (float) Math.toRadians(yy), underneck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (-15.61334-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (0.44956-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (1.9824-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -15.61334 + (((tickAnim - 85) / 17) * (0-(-15.61334)));
            yy = 0.44956 + (((tickAnim - 85) / 17) * (0-(0.44956)));
            zz = 1.9824 + (((tickAnim - 85) / 17) * (0-(1.9824)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(0), leftleg2.rotateAngleY + (float) Math.toRadians(0), leftleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(0), leftfoot.rotateAngleY + (float) Math.toRadians(0), leftfoot.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 70) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -15.25 + (((tickAnim - 85) / 17) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 85) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 85) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(0), rightfoot.rotateAngleY + (float) Math.toRadians(0), rightfoot.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 10) / 32) * (0-(0)));
            yy = 3.75 + (((tickAnim - 10) / 32) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 10) / 32) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 42) / 10) * (-5.8066-(0)));
            yy = 3.75 + (((tickAnim - 42) / 10) * (8.92349-(3.75)));
            zz = 0 + (((tickAnim - 42) / 10) * (-30.61113-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = -5.8066 + (((tickAnim - 52) / 9) * (0-(-5.8066)));
            yy = 8.92349 + (((tickAnim - 52) / 9) * (3.75-(8.92349)));
            zz = -30.61113 + (((tickAnim - 52) / 9) * (0-(-30.61113)));
        }
        else if (tickAnim >= 61 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 61) / 9) * (0-(0)));
            yy = 3.75 + (((tickAnim - 61) / 9) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 61) / 9) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (-5.00214-(0)));
            yy = 3.75 + (((tickAnim - 70) / 15) * (12.67567-(3.75)));
            zz = 0 + (((tickAnim - 70) / 15) * (-18.65146-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -5.00214 + (((tickAnim - 85) / 17) * (0-(-5.00214)));
            yy = 12.67567 + (((tickAnim - 85) / 17) * (0-(12.67567)));
            zz = -18.65146 + (((tickAnim - 85) / 17) * (4-(-18.65146)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 4 + (((tickAnim - 102) / 13) * (0-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 10) * (21.25-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 21.25 + (((tickAnim - 52) / 9) * (0-(21.25)));
        }
        else if (tickAnim >= 61 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 61) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 9) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (-14.08513-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (-6.5438-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (16.86076-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -14.08513 + (((tickAnim - 85) / 17) * (2.25-(-14.08513)));
            yy = -6.5438 + (((tickAnim - 85) / 17) * (0-(-6.5438)));
            zz = 16.86076 + (((tickAnim - 85) / 17) * (-5.75-(16.86076)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = 2.25 + (((tickAnim - 102) / 13) * (0-(2.25)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = -5.75 + (((tickAnim - 102) / 13) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(0), leftwing3.rotateAngleY + (float) Math.toRadians(0), leftwing3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(0), leftwing4.rotateAngleY + (float) Math.toRadians(0), leftwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(0), leftwing5.rotateAngleY + (float) Math.toRadians(0), leftwing5.rotateAngleZ + (float) Math.toRadians(0));


        this.leftwingmembranehidable1.setScale((float)1,(float)0,(float)1);


        this.leftwinghidable2.setScale((float)1,(float)0,(float)1);


        this.leftwinghidable4.setScale((float)0,(float)1,(float)0);


        this.setRotateAngle(leftwingmembrane1, leftwingmembrane1.rotateAngleX + (float) Math.toRadians(0), leftwingmembrane1.rotateAngleY + (float) Math.toRadians(0), leftwingmembrane1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (3.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 10) / 32) * (0-(0)));
            yy = 3.75 + (((tickAnim - 10) / 32) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 10) / 32) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 42) / 10) * (-5.8066-(0)));
            yy = 3.75 + (((tickAnim - 42) / 10) * (8.92349-(3.75)));
            zz = 0 + (((tickAnim - 42) / 10) * (-30.61113-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = -5.8066 + (((tickAnim - 52) / 9) * (0-(-5.8066)));
            yy = 8.92349 + (((tickAnim - 52) / 9) * (3.75-(8.92349)));
            zz = -30.61113 + (((tickAnim - 52) / 9) * (0-(-30.61113)));
        }
        else if (tickAnim >= 61 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 61) / 9) * (0-(0)));
            yy = 3.75 + (((tickAnim - 61) / 9) * (3.75-(3.75)));
            zz = 0 + (((tickAnim - 61) / 9) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (-5.00214-(0)));
            yy = 3.75 + (((tickAnim - 70) / 15) * (12.67567-(3.75)));
            zz = 0 + (((tickAnim - 70) / 15) * (-18.65146-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -5.00214 + (((tickAnim - 85) / 17) * (0-(-5.00214)));
            yy = 12.67567 + (((tickAnim - 85) / 17) * (0-(12.67567)));
            zz = -18.65146 + (((tickAnim - 85) / 17) * (4-(-18.65146)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = 4 + (((tickAnim - 102) / 13) * (0-(4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 10) * (21.25-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 61) {
            xx = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 9) * (0-(0)));
            zz = 21.25 + (((tickAnim - 52) / 9) * (0-(21.25)));
        }
        else if (tickAnim >= 61 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 61) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 61) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 61) / 9) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 70) / 15) * (-14.08513-(0)));
            yy = 0 + (((tickAnim - 70) / 15) * (-6.5438-(0)));
            zz = 0 + (((tickAnim - 70) / 15) * (16.86076-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 102) {
            xx = -14.08513 + (((tickAnim - 85) / 17) * (2.25-(-14.08513)));
            yy = -6.5438 + (((tickAnim - 85) / 17) * (0-(-6.5438)));
            zz = 16.86076 + (((tickAnim - 85) / 17) * (-5.75-(16.86076)));
        }
        else if (tickAnim >= 102 && tickAnim < 115) {
            xx = 2.25 + (((tickAnim - 102) / 13) * (0-(2.25)));
            yy = 0 + (((tickAnim - 102) / 13) * (0-(0)));
            zz = -5.75 + (((tickAnim - 102) / 13) * (0-(-5.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(0), rightwing3.rotateAngleY + (float) Math.toRadians(0), rightwing3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(0), rightwing4.rotateAngleY + (float) Math.toRadians(0), rightwing4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(0), rightwing5.rotateAngleY + (float) Math.toRadians(0), rightwing5.rotateAngleZ + (float) Math.toRadians(0));


        this.rightwingmembranehidable1.setScale((float)1,(float)0,(float)1);


        this.rightwinghidable2.setScale((float)1,(float)0,(float)1);


        this.rightwinghidable4.setScale((float)0,(float)1,(float)0);


        this.setRotateAngle(rightwingmembrane1, rightwingmembrane1.rotateAngleX + (float) Math.toRadians(0), rightwingmembrane1.rotateAngleY + (float) Math.toRadians(0), rightwingmembrane1.rotateAngleZ + (float) Math.toRadians(0));


        this.leftwingmembrane6.setScale((float)1,(float)1,(float)0);


        this.leftwinghidable3.setScale((float)1,(float)0,(float)0);


        this.leftwingmembrane7.setScale((float)1,(float)1,(float)0);


        this.rightwingmembrane6.setScale((float)1,(float)1,(float)0);


        this.rightwinghidable3.setScale((float)1,(float)0,(float)0);


        this.rightwingmembrane7.setScale((float)1,(float)1,(float)0);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropejara entity = (EntityPrehistoricFloraEuropejara) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 10) / 5) * (4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9 + (((tickAnim - 15) / 5) * (5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(4.375+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-9)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 20) / 3) * (-3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9-(5.175+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9 + (((tickAnim - 23) / 4) * (-2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(-3.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*9)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 27) / 8) * (-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3-(-2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3 + (((tickAnim - 35) / 6) * (0-(-2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-3)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4 + (((tickAnim - 10) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-4)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825 + (((tickAnim - 15) / 7) * (-5.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-6.825)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -5.5 + (((tickAnim - 22) / 5) * (-9.25-(-5.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -9.25 + (((tickAnim - 27) / 8) * (-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15-(-9.25)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15 + (((tickAnim - 35) / 6) * (0-(-7.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-40))*-15)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25 + (((tickAnim - 10) / 5) * (-6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*14-(-4.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*14 + (((tickAnim - 15) / 7) * (-10.25-(-6.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*14)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -10.25 + (((tickAnim - 22) / 5) * (-22.62-(-10.25)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -22.62 + (((tickAnim - 27) / 8) * (-36.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35-(-22.62)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -36.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35 + (((tickAnim - 35) / 6) * (0-(-36.65+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-35)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25 + (((tickAnim - 10) / 5) * (15.5-(20.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-120))*25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 15.5 + (((tickAnim - 15) / 7) * (14.75-(15.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 14.75 + (((tickAnim - 22) / 5) * (7.75-(14.75)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 7.75 + (((tickAnim - 27) / 3) * (1.75-(7.75)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 41) {
            xx = 1.75 + (((tickAnim - 30) / 11) * (0-(1.75)));
            yy = 0 + (((tickAnim - 30) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (19.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 19.5 + (((tickAnim - 3) / 4) * (0-(19.5)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (24-(0)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 24 + (((tickAnim - 10) / 5) * (0-(24)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0.75-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0.75 + (((tickAnim - 20) / 7) * (3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5-(0.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5 + (((tickAnim - 27) / 8) * (-0.75-(3.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220/0.6))*-5)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = -0.75 + (((tickAnim - 35) / 6) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraEuropejara entity = (EntityPrehistoricFloraEuropejara) entitylivingbaseIn;
        int animCycle = 35;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (35.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 35.5 + (((tickAnim - 11) / 12) * (-2-(35.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 29) {
            xx = -2 + (((tickAnim - 23) / 6) * (-2-(-2)));
            yy = 0 + (((tickAnim - 23) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 6) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -2 + (((tickAnim - 29) / 6) * (0-(-2)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (21.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 21.5 + (((tickAnim - 11) / 12) * (-6.5-(21.5)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -6.5 + (((tickAnim - 23) / 4) * (-13.75-(-6.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -13.75 + (((tickAnim - 27) / 2) * (-6.5-(-13.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -6.5 + (((tickAnim - 29) / 6) * (0-(-6.5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 23) {
            xx = 15.25 + (((tickAnim - 11) / 12) * (-8-(15.25)));
            yy = 0 + (((tickAnim - 11) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 12) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -8 + (((tickAnim - 23) / 4) * (-2.75-(-8)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -2.75 + (((tickAnim - 27) / 2) * (-8-(-2.75)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -8 + (((tickAnim - 29) / 6) * (0-(-8)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 14.25 + (((tickAnim - 7) / 4) * (0-(14.25)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (23.79-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 23.79 + (((tickAnim - 15) / 7) * (-25.25-(23.79)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = -25.25 + (((tickAnim - 22) / 1) * (-2.5-(-25.25)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -2.5 + (((tickAnim - 23) / 4) * (-9.25-(-2.5)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = -9.25 + (((tickAnim - 27) / 2) * (-2.5-(-9.25)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = -2.5 + (((tickAnim - 29) / 6) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 11) {
            xx = 24.75 + (((tickAnim - 7) / 4) * (0-(24.75)));
            yy = 0 + (((tickAnim - 7) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 4) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (27-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 23) {
            xx = 27 + (((tickAnim - 22) / 1) * (0-(27)));
            yy = 0 + (((tickAnim - 22) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 1) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 23) / 4) * (11-(0)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 11 + (((tickAnim - 27) / 2) * (0-(11)));
            yy = 0 + (((tickAnim - 27) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 2) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



    }
    public void animFly(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEuropejara entity = (EntityPrehistoricFloraEuropejara) entitylivingbaseIn;
        int animCycle = 160;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-25 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-25)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-30))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(xx), chest1.rotateAngleY + (float) Math.toRadians(yy), chest1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1 + (((tickAnim - 0) / 50) * (-3.25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1 + (((tickAnim - 0) / 50) * (-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = -3.25 + (((tickAnim - 50) / 70) * (-3.25-(-3.25)));
            zz = -3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1 + (((tickAnim - 50) / 70) * (-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1-(-3.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*140-210))*-0.1)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = -3.25 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-50))*1-(-3.25)));
            zz = -1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+20))*1-(-1.7+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest1.rotationPointX = this.chest1.rotationPointX + (float)(xx);
        this.chest1.rotationPointY = this.chest1.rotationPointY - (float)(yy);
        this.chest1.rotationPointZ = this.chest1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+170))*-25 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+170))*-25)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-40))*-2 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-40))*-2-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-40))*-2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-40))*-2 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+170))*-25-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-40))*-2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*20 + (((tickAnim - 0) / 50) * (11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-220))*2-(14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*20)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-220))*2 + (((tickAnim - 50) / 70) * (11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-220))*2-(11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-220))*2)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-220))*2 + (((tickAnim - 120) / 40) * (14.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-80))*20-(11.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180-220))*2)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10 + (((tickAnim - 0) / 50) * (-1.5-(-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -1.5 + (((tickAnim - 50) / 70) * (-1.5-(-1.5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -1.5 + (((tickAnim - 120) / 40) * (-1.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-10-(-1.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = -4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-10 + (((tickAnim - 0) / 50) * (-9.47324-(-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-10)));
            yy = 0 + (((tickAnim - 0) / 50) * (2.80186-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (-3.41868-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = -9.47324 + (((tickAnim - 50) / 70) * (-9.47324-(-9.47324)));
            yy = 2.80186 + (((tickAnim - 50) / 70) * (2.80186-(2.80186)));
            zz = -3.41868 + (((tickAnim - 50) / 70) * (-3.41868-(-3.41868)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = -9.47324 + (((tickAnim - 120) / 40) * (-4.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-220))*-10-(-9.47324)));
            yy = 2.80186 + (((tickAnim - 120) / 40) * (0-(2.80186)));
            zz = -3.41868 + (((tickAnim - 120) / 40) * (0-(-3.41868)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-10.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0.2);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0.4);


        this.setRotateAngle(underneck3, underneck3.rotateAngleX + (float) Math.toRadians(6.75), underneck3.rotateAngleY + (float) Math.toRadians(0), underneck3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-25 + (((tickAnim - 0) / 50) * (12.75-(4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-25)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 12.75 + (((tickAnim - 50) / 70) * (12.75-(12.75)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 12.75 + (((tickAnim - 120) / 40) * (4.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+220))*-25-(12.75)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-8 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-15-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*40 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*40)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3 + (((tickAnim - 50) / 70) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*3)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-15-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*40-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-20-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwingmembranehidable1.rotationPointX = this.leftwingmembranehidable1.rotationPointX + (float)(0);
        this.leftwingmembranehidable1.rotationPointY = this.leftwingmembranehidable1.rotationPointY - (float)(0);
        this.leftwingmembranehidable1.rotationPointZ = this.leftwingmembranehidable1.rotationPointZ + (float)(0);



        this.leftwinghidable2.rotationPointX = this.leftwinghidable2.rotationPointX + (float)(0);
        this.leftwinghidable2.rotationPointY = this.leftwinghidable2.rotationPointY - (float)(0);
        this.leftwinghidable2.rotationPointZ = this.leftwinghidable2.rotationPointZ + (float)(0);



        this.setRotateAngle(leftwinghidable3, leftwinghidable3.rotateAngleX + (float) Math.toRadians(0), leftwinghidable3.rotateAngleY + (float) Math.toRadians(0), leftwinghidable3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftwinghidable3.rotationPointX = this.leftwinghidable3.rotationPointX + (float)(0);
        this.leftwinghidable3.rotationPointY = this.leftwinghidable3.rotationPointY - (float)(0);
        this.leftwinghidable3.rotationPointZ = this.leftwinghidable3.rotationPointZ + (float)(0);


        this.setRotateAngle(leftwinghidable4, leftwinghidable4.rotateAngleX + (float) Math.toRadians(0), leftwinghidable4.rotateAngleY + (float) Math.toRadians(0), leftwinghidable4.rotateAngleZ + (float) Math.toRadians(0));
        this.leftwinghidable4.rotationPointX = this.leftwinghidable4.rotationPointX + (float)(0);
        this.leftwinghidable4.rotationPointY = this.leftwinghidable4.rotationPointY - (float)(0);
        this.leftwinghidable4.rotationPointZ = this.leftwinghidable4.rotationPointZ + (float)(0);


        this.setRotateAngle(leftwingmembrane1, leftwingmembrane1.rotateAngleX + (float) Math.toRadians(0), leftwingmembrane1.rotateAngleY + (float) Math.toRadians(0), leftwingmembrane1.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-15-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
            yy = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-20))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*8 + (((tickAnim - 0) / 50) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*8)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1 + (((tickAnim - 50) / 70) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*8-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*1)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-70))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-30 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-30)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*15-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*-30-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-40 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-40)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*15-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-130))*-40-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-150))*20-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+100))*15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+100))*15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*25)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+100))*15-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(-0.47529), leftleg2.rotateAngleY + (float) Math.toRadians(-10.66198), leftleg2.rotateAngleZ + (float) Math.toRadians(-18.51797));


        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(0), leftfoot.rotateAngleY + (float) Math.toRadians(0), leftfoot.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+100))*-15 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+100))*-15)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-25 + (((tickAnim - 0) / 50) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-25)));
        }
        else if (tickAnim >= 50 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 70) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 70) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 160) {
            xx = 0 + (((tickAnim - 120) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720+100))*-15-(0)));
            zz = 0 + (((tickAnim - 120) / 40) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*720-40))*-25-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(-0.47529), rightleg2.rotateAngleY + (float) Math.toRadians(10.662), rightleg2.rotateAngleZ + (float) Math.toRadians(18.518));


        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(0), rightfoot.rotateAngleY + (float) Math.toRadians(0), rightfoot.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraEuropejara entity = (EntityPrehistoricFloraEuropejara) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(chest1, chest1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+40))*2), chest1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*-2), chest1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*3));
        this.chest1.rotationPointX = this.chest1.rotationPointX + (float)(0);
        this.chest1.rotationPointY = this.chest1.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25))*-0.2);
        this.chest1.rotationPointZ = this.chest1.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25-60))*-0.5);


        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+80))*-4), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5))*2), body1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*-3));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))*8), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5-40))*4), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+30))*-5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+150))*2), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+90))*3));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+220))*2), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+180))*3));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.25+320))*4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/0.5+340))*3));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.29951-(0)));
            yy = 25.5 + (((tickAnim - 0) / 13) * (-11.58094-(25.5)));
            zz = 0 + (((tickAnim - 0) / 13) * (-6.11317-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0.29951 + (((tickAnim - 13) / 5) * (-2.23134-(0.29951)));
            yy = -11.58094 + (((tickAnim - 13) / 5) * (18.39225-(-11.58094)));
            zz = -6.11317 + (((tickAnim - 13) / 5) * (-7.44594-(-6.11317)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.23134 + (((tickAnim - 18) / 2) * (0-(-2.23134)));
            yy = 18.39225 + (((tickAnim - 18) / 2) * (25.5-(18.39225)));
            zz = -7.44594 + (((tickAnim - 18) / 2) * (0-(-7.44594)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing1, leftwing1.rotateAngleX + (float) Math.toRadians(xx), leftwing1.rotateAngleY + (float) Math.toRadians(yy), leftwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 12.73796 + (((tickAnim - 0) / 13) * (11.5-(12.73796)));
            yy = -22.66842 + (((tickAnim - 0) / 13) * (0-(-22.66842)));
            zz = -6.2359 + (((tickAnim - 0) / 13) * (-10.75-(-6.2359)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 11.5 + (((tickAnim - 13) / 3) * (-20.94979-(11.5)));
            yy = 0 + (((tickAnim - 13) / 3) * (-10.07485-(0)));
            zz = -10.75 + (((tickAnim - 13) / 3) * (-8.74374-(-10.75)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -20.94979 + (((tickAnim - 16) / 2) * (-13.98714-(-20.94979)));
            yy = -10.07485 + (((tickAnim - 16) / 2) * (-17.631-(-10.07485)));
            zz = -8.74374 + (((tickAnim - 16) / 2) * (-7.23904-(-8.74374)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -13.98714 + (((tickAnim - 18) / 2) * (12.73796-(-13.98714)));
            yy = -17.631 + (((tickAnim - 18) / 2) * (-22.66842-(-17.631)));
            zz = -7.23904 + (((tickAnim - 18) / 2) * (-6.2359-(-7.23904)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing2, leftwing2.rotateAngleX + (float) Math.toRadians(xx), leftwing2.rotateAngleY + (float) Math.toRadians(yy), leftwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -18 + (((tickAnim - 0) / 13) * (0-(-18)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (26.14883-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-2.35107-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-5.24985-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 26.14883 + (((tickAnim - 16) / 2) * (13.90953-(26.14883)));
            yy = -2.35107 + (((tickAnim - 16) / 2) * (-0.94043-(-2.35107)));
            zz = -5.24985 + (((tickAnim - 16) / 2) * (-2.09994-(-5.24985)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 13.90953 + (((tickAnim - 18) / 2) * (-18-(13.90953)));
            yy = -0.94043 + (((tickAnim - 18) / 2) * (0-(-0.94043)));
            zz = -2.09994 + (((tickAnim - 18) / 2) * (0-(-2.09994)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing3, leftwing3.rotateAngleX + (float) Math.toRadians(xx), leftwing3.rotateAngleY + (float) Math.toRadians(yy), leftwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = -0.15 + (((tickAnim - 16) / 2) * (-0.425-(-0.15)));
            zz = -0.15 + (((tickAnim - 16) / 2) * (0-(-0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = -0.425 + (((tickAnim - 18) / 2) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing3.rotationPointX = this.leftwing3.rotationPointX + (float)(xx);
        this.leftwing3.rotationPointY = this.leftwing3.rotationPointY - (float)(yy);
        this.leftwing3.rotationPointZ = this.leftwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 17.26833 + (((tickAnim - 0) / 13) * (0-(17.26833)));
            yy = 1.69619 + (((tickAnim - 0) / 13) * (0-(1.69619)));
            zz = 3.90622 + (((tickAnim - 0) / 13) * (0-(3.90622)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-9.9972-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (3.29202-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (2.69753-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -9.9972 + (((tickAnim - 16) / 4) * (17.26833-(-9.9972)));
            yy = 3.29202 + (((tickAnim - 16) / 4) * (1.69619-(3.29202)));
            zz = 2.69753 + (((tickAnim - 16) / 4) * (3.90622-(2.69753)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing4, leftwing4.rotateAngleX + (float) Math.toRadians(xx), leftwing4.rotateAngleY + (float) Math.toRadians(yy), leftwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = -1.625 + (((tickAnim - 0) / 13) * (0-(-1.625)));
            zz = 0.75 + (((tickAnim - 0) / 13) * (0-(0.75)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (-1.625-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwing4.rotationPointX = this.leftwing4.rotationPointX + (float)(xx);
        this.leftwing4.rotationPointY = this.leftwing4.rotationPointY - (float)(yy);
        this.leftwing4.rotationPointZ = this.leftwing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (-1.52496-(0)));
            yy = 0 + (((tickAnim - 13) / 3) * (-0.68628-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (2.47441-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -1.52496 + (((tickAnim - 16) / 4) * (0-(-1.52496)));
            yy = -0.68628 + (((tickAnim - 16) / 4) * (0-(-0.68628)));
            zz = 2.47441 + (((tickAnim - 16) / 4) * (0-(2.47441)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwing5, leftwing5.rotateAngleX + (float) Math.toRadians(xx), leftwing5.rotateAngleY + (float) Math.toRadians(yy), leftwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.leftwingmembranehidable1.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 13 + (((tickAnim - 0) / 6) * (4.31032-(13)));
            yy = 0 + (((tickAnim - 0) / 6) * (-4.08966-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (9.86169-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 4.31032 + (((tickAnim - 6) / 7) * (50.81066-(4.31032)));
            yy = -4.08966 + (((tickAnim - 6) / 7) * (27.85447-(-4.08966)));
            zz = 9.86169 + (((tickAnim - 6) / 7) * (60.77049-(9.86169)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 50.81066 + (((tickAnim - 13) / 3) * (57.73338-(50.81066)));
            yy = 27.85447 + (((tickAnim - 13) / 3) * (26.52539-(27.85447)));
            zz = 60.77049 + (((tickAnim - 13) / 3) * (76.97272-(60.77049)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 57.73338 + (((tickAnim - 16) / 2) * (31.1193-(57.73338)));
            yy = 26.52539 + (((tickAnim - 16) / 2) * (-9.63051-(26.52539)));
            zz = 76.97272 + (((tickAnim - 16) / 2) * (-3.84142-(76.97272)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 31.1193 + (((tickAnim - 18) / 2) * (13-(31.1193)));
            yy = -9.63051 + (((tickAnim - 18) / 2) * (0-(-9.63051)));
            zz = -3.84142 + (((tickAnim - 18) / 2) * (0-(-3.84142)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefthand, lefthand.rotateAngleX + (float) Math.toRadians(xx), lefthand.rotateAngleY + (float) Math.toRadians(yy), lefthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0.7 + (((tickAnim - 0) / 6) * (0.7-(0.7)));
            zz = 0.05 + (((tickAnim - 0) / 6) * (0.05-(0.05)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0.7 + (((tickAnim - 6) / 7) * (0-(0.7)));
            zz = 0.05 + (((tickAnim - 6) / 7) * (0-(0.05)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 7) * (0.7-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0.05-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefthand.rotationPointX = this.lefthand.rotationPointX + (float)(xx);
        this.lefthand.rotationPointY = this.lefthand.rotationPointY - (float)(yy);
        this.lefthand.rotationPointZ = this.lefthand.rotationPointZ + (float)(zz);



        this.leftwinghidable2.setScale((float)1,(float)0,(float)1);


        this.leftwingmembrane6.setScale((float)1,(float)1,(float)0);


        this.leftwingmembrane7.setScale((float)1,(float)1,(float)0);



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -4.71198 + (((tickAnim - 0) / 13) * (2.03564-(-4.71198)));
            yy = -21.40776 + (((tickAnim - 0) / 13) * (14.53936-(-21.40776)));
            zz = 7.16372 + (((tickAnim - 0) / 13) * (-5.89878-(7.16372)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 2.03564 + (((tickAnim - 13) / 7) * (-4.71198-(2.03564)));
            yy = 14.53936 + (((tickAnim - 13) / 7) * (-21.40776-(14.53936)));
            zz = -5.89878 + (((tickAnim - 13) / 7) * (7.16372-(-5.89878)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftwingmembrane1, leftwingmembrane1.rotateAngleX + (float) Math.toRadians(xx), leftwingmembrane1.rotateAngleY + (float) Math.toRadians(yy), leftwingmembrane1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.175-(0)));
            zz = 0.25 + (((tickAnim - 0) / 13) * (-0.5-(0.25)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0.25 + (((tickAnim - 13) / 7) * (0-(0.25)));
            yy = -0.175 + (((tickAnim - 13) / 7) * (0-(-0.175)));
            zz = -0.5 + (((tickAnim - 13) / 7) * (0.25-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftwingmembrane1.rotationPointX = this.leftwingmembrane1.rotationPointX + (float)(xx);
        this.leftwingmembrane1.rotationPointY = this.leftwingmembrane1.rotationPointY - (float)(yy);
        this.leftwingmembrane1.rotationPointZ = this.leftwingmembrane1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 22.25 + (((tickAnim - 0) / 3) * (17.3374-(22.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.15662-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-17.41279-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 17.3374 + (((tickAnim - 3) / 7) * (-7.70348-(17.3374)));
            yy = 5.15662 + (((tickAnim - 3) / 7) * (0.71324-(5.15662)));
            zz = -17.41279 + (((tickAnim - 3) / 7) * (1.45464-(-17.41279)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -7.70348 + (((tickAnim - 10) / 1) * (-5.20859-(-7.70348)));
            yy = 0.71324 + (((tickAnim - 10) / 1) * (0.15782-(0.71324)));
            zz = 1.45464 + (((tickAnim - 10) / 1) * (3.81307-(1.45464)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -5.20859 + (((tickAnim - 11) / 9) * (22.25-(-5.20859)));
            yy = 0.15782 + (((tickAnim - 11) / 9) * (0-(0.15782)));
            zz = 3.81307 + (((tickAnim - 11) / 9) * (0-(3.81307)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg1, leftleg1.rotateAngleX + (float) Math.toRadians(xx), leftleg1.rotateAngleY + (float) Math.toRadians(yy), leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 54 + (((tickAnim - 0) / 3) * (17.94954-(54)));
            yy = 0 + (((tickAnim - 0) / 3) * (5.28956-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (26.97803-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 17.94954 + (((tickAnim - 3) / 5) * (-21.52151-(17.94954)));
            yy = 5.28956 + (((tickAnim - 3) / 5) * (-0.50057-(5.28956)));
            zz = 26.97803 + (((tickAnim - 3) / 5) * (-4.49626-(26.97803)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -21.52151 + (((tickAnim - 8) / 3) * (-5.75-(-21.52151)));
            yy = -0.50057 + (((tickAnim - 8) / 3) * (0-(-0.50057)));
            zz = -4.49626 + (((tickAnim - 8) / 3) * (0-(-4.49626)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = -5.75 + (((tickAnim - 11) / 9) * (54-(-5.75)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.085-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.1-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.085 + (((tickAnim - 3) / 5) * (1.525-(1.085)));
            zz = -0.1 + (((tickAnim - 3) / 5) * (0-(-0.1)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 1.525 + (((tickAnim - 8) / 3) * (0-(1.525)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 26.5 + (((tickAnim - 0) / 3) * (22.29-(26.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 22.29 + (((tickAnim - 3) / 5) * (35.1-(22.29)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 35.1 + (((tickAnim - 8) / 3) * (8.5-(35.1)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 8.5 + (((tickAnim - 11) / 2) * (-19.82-(8.5)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -19.82 + (((tickAnim - 13) / 3) * (-6.27-(-19.82)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -6.27 + (((tickAnim - 16) / 4) * (26.5-(-6.27)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (1.275-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.975-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 1.275 + (((tickAnim - 3) / 5) * (0.8-(1.275)));
            zz = 0.975 + (((tickAnim - 3) / 5) * (0.98-(0.975)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0.8 + (((tickAnim - 8) / 3) * (0-(0.8)));
            zz = 0.98 + (((tickAnim - 8) / 3) * (0-(0.98)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.5-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.5 + (((tickAnim - 13) / 7) * (0-(-0.5)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.20859 + (((tickAnim - 0) / 10) * (22.25-(-5.20859)));
            yy = 0.15782 + (((tickAnim - 0) / 10) * (0-(0.15782)));
            zz = -3.8131 + (((tickAnim - 0) / 10) * (0-(-3.8131)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 22.25 + (((tickAnim - 10) / 3) * (17.3374-(22.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (5.15662-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (17.4128-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 17.3374 + (((tickAnim - 13) / 7) * (-5.20859-(17.3374)));
            yy = 5.15662 + (((tickAnim - 13) / 7) * (0.15782-(5.15662)));
            zz = 17.4128 + (((tickAnim - 13) / 7) * (-3.8131-(17.4128)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg1, rightleg1.rotateAngleX + (float) Math.toRadians(xx), rightleg1.rotateAngleY + (float) Math.toRadians(yy), rightleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.75 + (((tickAnim - 0) / 10) * (59.75-(-5.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 59.75 + (((tickAnim - 10) / 8) * (-21.52151-(59.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0.5006-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-4.4963-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -21.52151 + (((tickAnim - 18) / 2) * (-5.75-(-21.52151)));
            yy = 0.5006 + (((tickAnim - 18) / 2) * (0-(0.5006)));
            zz = -4.4963 + (((tickAnim - 18) / 2) * (0-(-4.4963)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (1.525-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 1.525 + (((tickAnim - 18) / 2) * (0-(1.525)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 8.5 + (((tickAnim - 0) / 3) * (-13.78-(8.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -13.78 + (((tickAnim - 3) / 3) * (1.85-(-13.78)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 1.85 + (((tickAnim - 6) / 4) * (28.5-(1.85)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 28.5 + (((tickAnim - 10) / 3) * (22.29-(28.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.29 + (((tickAnim - 13) / 5) * (35.1-(22.29)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35.1 + (((tickAnim - 18) / 2) * (8.5-(35.1)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.225 + (((tickAnim - 3) / 3) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (1.275-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.975-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.275 + (((tickAnim - 13) / 5) * (0.8-(1.275)));
            zz = 0.975 + (((tickAnim - 13) / 5) * (0.98-(0.975)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.8 + (((tickAnim - 18) / 2) * (0-(0.8)));
            zz = 0.98 + (((tickAnim - 18) / 2) * (0-(0.98)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.29951 + (((tickAnim - 0) / 8) * (-2.23134-(0.29951)));
            yy = 11.5809 + (((tickAnim - 0) / 8) * (-18.3923-(11.5809)));
            zz = 6.1132 + (((tickAnim - 0) / 8) * (7.4459-(6.1132)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -2.23134 + (((tickAnim - 8) / 1) * (0-(-2.23134)));
            yy = -18.3923 + (((tickAnim - 8) / 1) * (-25.5-(-18.3923)));
            zz = 7.4459 + (((tickAnim - 8) / 1) * (0-(7.4459)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0.29951-(0)));
            yy = -25.5 + (((tickAnim - 9) / 11) * (11.5809-(-25.5)));
            zz = 0 + (((tickAnim - 9) / 11) * (6.1132-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing1, rightwing1.rotateAngleX + (float) Math.toRadians(xx), rightwing1.rotateAngleY + (float) Math.toRadians(yy), rightwing1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.5 + (((tickAnim - 0) / 5) * (-20.94979-(11.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (10.0749-(0)));
            zz = 10.75 + (((tickAnim - 0) / 5) * (8.7437-(10.75)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20.94979 + (((tickAnim - 5) / 3) * (-13.98714-(-20.94979)));
            yy = 10.0749 + (((tickAnim - 5) / 3) * (17.631-(10.0749)));
            zz = 8.7437 + (((tickAnim - 5) / 3) * (7.239-(8.7437)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -13.98714 + (((tickAnim - 8) / 1) * (12.73796-(-13.98714)));
            yy = 17.631 + (((tickAnim - 8) / 1) * (22.6684-(17.631)));
            zz = 7.239 + (((tickAnim - 8) / 1) * (6.2359-(7.239)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 12.73796 + (((tickAnim - 9) / 11) * (11.5-(12.73796)));
            yy = 22.6684 + (((tickAnim - 9) / 11) * (0-(22.6684)));
            zz = 6.2359 + (((tickAnim - 9) / 11) * (10.75-(6.2359)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing2, rightwing2.rotateAngleX + (float) Math.toRadians(xx), rightwing2.rotateAngleY + (float) Math.toRadians(yy), rightwing2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (26.14883-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.35107-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-5.24985-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 26.14883 + (((tickAnim - 5) / 3) * (13.90953-(26.14883)));
            yy = -2.35107 + (((tickAnim - 5) / 3) * (-0.94043-(-2.35107)));
            zz = -5.24985 + (((tickAnim - 5) / 3) * (-2.09994-(-5.24985)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 13.90953 + (((tickAnim - 8) / 1) * (-18-(13.90953)));
            yy = -0.94043 + (((tickAnim - 8) / 1) * (0-(-0.94043)));
            zz = -2.09994 + (((tickAnim - 8) / 1) * (0-(-2.09994)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -18 + (((tickAnim - 9) / 11) * (0-(-18)));
            yy = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing3, rightwing3.rotateAngleX + (float) Math.toRadians(xx), rightwing3.rotateAngleY + (float) Math.toRadians(yy), rightwing3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-0.15-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.15-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = -0.15 + (((tickAnim - 5) / 3) * (-0.425-(-0.15)));
            zz = -0.15 + (((tickAnim - 5) / 3) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = -0.425 + (((tickAnim - 8) / 1) * (0-(-0.425)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
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
        this.rightwing3.rotationPointX = this.rightwing3.rotationPointX + (float)(xx);
        this.rightwing3.rotationPointY = this.rightwing3.rotationPointY - (float)(yy);
        this.rightwing3.rotationPointZ = this.rightwing3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 1.32225 + (((tickAnim - 0) / 5) * (-10.22-(1.32225)));
            yy = -0.95133 + (((tickAnim - 0) / 5) * (0-(-0.95133)));
            zz = -1.16199 + (((tickAnim - 0) / 5) * (0-(-1.16199)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -10.22 + (((tickAnim - 5) / 4) * (17.89016-(-10.22)));
            yy = 0 + (((tickAnim - 5) / 4) * (-2.24384-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (-5.3088-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 17.89016 + (((tickAnim - 9) / 11) * (1.32225-(17.89016)));
            yy = -2.24384 + (((tickAnim - 9) / 11) * (-0.95133-(-2.24384)));
            zz = -5.3088 + (((tickAnim - 9) / 11) * (-1.16199-(-5.3088)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing4, rightwing4.rotateAngleX + (float) Math.toRadians(xx), rightwing4.rotateAngleY + (float) Math.toRadians(yy), rightwing4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (-1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0.75-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (0-(0)));
            yy = -1.625 + (((tickAnim - 9) / 11) * (0-(-1.625)));
            zz = 0.75 + (((tickAnim - 9) / 11) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwing4.rotationPointX = this.rightwing4.rotationPointX + (float)(xx);
        this.rightwing4.rotationPointY = this.rightwing4.rotationPointY - (float)(yy);
        this.rightwing4.rotationPointZ = this.rightwing4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwing5, rightwing5.rotateAngleX + (float) Math.toRadians(xx), rightwing5.rotateAngleY + (float) Math.toRadians(yy), rightwing5.rotateAngleZ + (float) Math.toRadians(zz));



        this.rightwingmembranehidable1.setScale((float)1,(float)0,(float)1);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 22.53174 + (((tickAnim - 0) / 5) * (80.02816-(22.53174)));
            yy = -46.23991 + (((tickAnim - 0) / 5) * (-54.66813-(-46.23991)));
            zz = -51.07108 + (((tickAnim - 0) / 5) * (-117.61177-(-51.07108)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 80.02816 + (((tickAnim - 5) / 5) * (0-(80.02816)));
            yy = -54.66813 + (((tickAnim - 5) / 5) * (0-(-54.66813)));
            zz = -117.61177 + (((tickAnim - 5) / 5) * (0-(-117.61177)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (22.53174-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (-46.23991-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (-51.07108-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righthand, righthand.rotateAngleX + (float) Math.toRadians(xx), righthand.rotateAngleY + (float) Math.toRadians(yy), righthand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -0.95 + (((tickAnim - 0) / 5) * (-1.45-(-0.95)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -1.45 + (((tickAnim - 5) / 5) * (0-(-1.45)));
            yy = 0 + (((tickAnim - 5) / 5) * (0.95-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0.075-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0.95 + (((tickAnim - 10) / 5) * (0.675-(0.95)));
            zz = 0.075 + (((tickAnim - 10) / 5) * (0.225-(0.075)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (-0.95-(0)));
            yy = 0.675 + (((tickAnim - 15) / 5) * (0-(0.675)));
            zz = 0.225 + (((tickAnim - 15) / 5) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righthand.rotationPointX = this.righthand.rotationPointX + (float)(xx);
        this.righthand.rotationPointY = this.righthand.rotationPointY - (float)(yy);
        this.righthand.rotationPointZ = this.righthand.rotationPointZ + (float)(zz);



        this.rightwinghidable2.setScale((float)1,(float)0,(float)1);


        this.rightwingmembrane6.setScale((float)1,(float)0,(float)0.1);


        this.rightwingmembrane7.setScale((float)1,(float)0,(float)0);



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -2.08617 + (((tickAnim - 0) / 9) * (-4.71198-(-2.08617)));
            yy = 8.32564 + (((tickAnim - 0) / 9) * (21.4078-(8.32564)));
            zz = -14.47039 + (((tickAnim - 0) / 9) * (-7.1637-(-14.47039)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = -4.71198 + (((tickAnim - 9) / 11) * (-2.08617-(-4.71198)));
            yy = 21.4078 + (((tickAnim - 9) / 11) * (8.32564-(21.4078)));
            zz = -7.1637 + (((tickAnim - 9) / 11) * (-14.47039-(-7.1637)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightwingmembrane1, rightwingmembrane1.rotateAngleX + (float) Math.toRadians(xx), rightwingmembrane1.rotateAngleY + (float) Math.toRadians(yy), rightwingmembrane1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -1.275 + (((tickAnim - 0) / 9) * (0-(-1.275)));
            yy = -0.075 + (((tickAnim - 0) / 9) * (0-(-0.075)));
            zz = -0.5 + (((tickAnim - 0) / 9) * (-0.25-(-0.5)));
        }
        else if (tickAnim >= 9 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 9) / 11) * (-1.275-(0)));
            yy = 0 + (((tickAnim - 9) / 11) * (-0.075-(0)));
            zz = -0.25 + (((tickAnim - 9) / 11) * (-0.5-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightwingmembrane1.rotationPointX = this.rightwingmembrane1.rotationPointX + (float)(xx);
        this.rightwingmembrane1.rotationPointY = this.rightwingmembrane1.rotationPointY - (float)(yy);
        this.rightwingmembrane1.rotationPointZ = this.rightwingmembrane1.rotationPointZ + (float)(zz);



        this.leftwingmembranehideable2.setScale((float)1,(float)0,(float)1);


        this.leftwinghideable3.setScale((float)1,(float)0,(float)1);


        this.leftwinghidable3.setScale((float)1,(float)0,(float)1);


        this.leftwinghidable4.setScale((float)1,(float)0,(float)1);




    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraEuropejara e = (EntityPrehistoricFloraEuropejara) entity;
        animator.update(entity);

        animator.setAnimation(e.FLY_ANIMATION);
        animator.startKeyframe(e.flyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, ((-0.1367F)-(-0.1367F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(body2_r1, ((0.4363F)-(0.4363F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(bone_r1, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1222F)-(-0.1222F)));
        animator.rotate(bone_r2, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((-0.1396F)-(-0.1396F)));
        animator.rotate(bone_r3, ((0.0024F)-(0.0024F)), ((-0.0698F)-(-0.0698F)),((-0.035F)-(-0.035F)));
        animator.rotate(bone_r4, ((-0.2929F)-(-0.2929F)), ((-0.1204F)-(-0.1204F)),((-0.0234F)-(-0.0234F)));
        animator.rotate(bone_r5, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1222F)-(0.1222F)));
        animator.rotate(bone_r6, ((0.0F)-(0.0F)), ((0.0F)-(0.0F)),((0.1396F)-(0.1396F)));
        animator.rotate(bone_r7, ((0.0024F)-(0.0024F)), ((0.0698F)-(0.0698F)),((0.035F)-(0.035F)));
        animator.rotate(bone_r8, ((-0.2929F)-(-0.2929F)), ((0.1204F)-(0.1204F)),((0.0234F)-(0.0234F)));
        animator.rotate(chest1, ((-0.0133F)-(-0.0133F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(crest1_r1, ((-0.4451F)-(-0.4451F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(crest1, ((-0.0911F)-(-0.0911F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(crest2_r1, ((-1.0472F)-(-1.0472F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(crest2_r2, ((-0.4974F)-(-0.4974F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(crest2, ((0.0456F)-(0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(crest3_r1, ((-1.309F)-(-1.309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(gums1, ((-0.055F)-(-0.055F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head, ((1.1345F)-(1.1345F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head1_r1, ((0.0611F)-(0.0611F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head2_r1, ((-1.4748F)-(-1.4748F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head2_r2, ((-0.0436F)-(-0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head2, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head3_r1, ((-0.1309F)-(-0.1309F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head3_r2, ((-1.0821F)-(-1.0821F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head3, ((-0.1367F)-(-0.1367F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head4_r1, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head4, ((0.1559F)-(0.1559F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head5_r1, ((0.2094F)-(0.2094F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head5_r2, ((-0.0524F)-(-0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head5, ((0.0948F)-(0.0948F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head6_r1, ((0.3927F)-(0.3927F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head6_r2, ((1.1257F)-(1.1257F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head6_r3, ((0.2094F)-(0.2094F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(head7_r1, ((0.5236F)-(0.5236F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw, ((0.0175F)-(0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw2_r1, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw2, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw3, ((0.2353F)-(0.2353F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw4_r1, ((0.0524F)-(0.0524F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw4, ((-0.0456F)-(-0.0456F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw5_r1, ((-0.0175F)-(-0.0175F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw5, ((0.0454F)-(0.0454F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw6_r1, ((1.1694F)-(1.1694F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw7_r1, ((1.8239F)-(1.8239F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw7_r2, ((0.7505F)-(0.7505F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(jaw8_r1, ((0.5585F)-(0.5585F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftfoot, ((1.1254F)-(-0.225F)), ((0.0804F)-(0.1026F)),((-0.024F)-(0.238F)));
        animator.rotate(lefthand, ((0.15F)-(2.0464F)), ((-0.6621F)-(0.1054F)),((1.8377F)-(0.0432F)));
        animator.rotate(leftleg1, ((0.2787F)-(0.2346F)), ((0.1138F)-(-0.1882F)),((-1.5681F)-(-0.6916F)));
        animator.rotate(leftleg2, ((1.0026F)-(0.5865F)), ((-0.0258F)-(0.1604F)),((0.0676F)-(0.3639F)));
        animator.rotate(leftlegwing1, ((0.1361F)-(0.1361F)), ((-0.0119F)-(-0.0119F)),((0.0865F)-(0.0865F)));
        animator.rotate(leftlegwing2, ((-0.0141F)-(-0.0141F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(leftwing1, ((-0.1073F)-(0.2169F)), ((-0.048F)-(0.0756F)),((-0.094F)-(0.9364F)));
        animator.rotate(leftwing2, ((-0.1984F)-(-0.3195F)), ((-0.0155F)-(0.2905F)),((-1.5881F)-(-0.9403F)));
        animator.rotate(leftwing3, ((0.0403F)-(0.6948F)), ((-0.0078F)-(-0.0078F)),((0.0826F)-(0.0826F)));
        animator.rotate(leftwing4, ((-1.1904F)-(0.8614F)), ((-0.0248F)-(0.0539F)),((0.0527F)-(-0.0263F)));
        animator.rotate(leftwing5, ((0.1948F)-(0.1076F)), ((-0.1006F)-(-0.1006F)),((-0.0197F)-(-0.0197F)));
        animator.rotate(leftwingmembrane1, ((0.0022F)-(-0.6888F)), ((-0.3752F)-(-0.3005F)),((-0.0093F)-(0.2284F)));
        animator.rotate(lips1, ((0.0025F)-(0.0025F)), ((-0.0138F)-(-0.0138F)),((0.2731F)-(0.2732F)));
        animator.rotate(lips2, ((0.0025F)-(0.0025F)), ((0.0138F)-(0.0138F)),((-0.2731F)-(-0.2732F)));
        animator.rotate(neck1_r1, ((0.0436F)-(0.0436F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck1, ((-0.2618F)-(-0.6109F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck2, ((-0.1461F)-(-0.1461F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3_r1, ((0.1745F)-(0.1745F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(neck3, ((-0.2402F)-(0.1089F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightfoot, ((1.1254F)-(-0.225F)), ((-0.0804F)-(-0.1026F)),((0.024F)-(-0.238F)));
        animator.rotate(righthand, ((-0.15F)-(2.0464F)), ((0.6621F)-(-0.1054F)),((-1.8377F)-(-0.0432F)));
        animator.rotate(rightleg1, ((0.2787F)-(0.2346F)), ((-0.1138F)-(0.1882F)),((1.5681F)-(0.6916F)));
        animator.rotate(rightleg2, ((1.0026F)-(0.5865F)), ((0.0258F)-(-0.1604F)),((-0.0676F)-(-0.3639F)));
        animator.rotate(rightlegwing1, ((0.1361F)-(0.1361F)), ((0.0119F)-(0.0119F)),((-0.0865F)-(-0.0865F)));
        animator.rotate(rightlegwing2, ((-0.0141F)-(-0.0141F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(rightwing1, ((-0.1073F)-(0.2169F)), ((0.048F)-(-0.0756F)),((0.094F)-(-0.9364F)));
        animator.rotate(rightwing2, ((-0.1984F)-(-0.3195F)), ((0.0155F)-(-0.2905F)),((1.5881F)-(0.9403F)));
        animator.rotate(rightwing3, ((0.0403F)-(0.6948F)), ((0.0078F)-(0.0078F)),((-0.0826F)-(-0.0826F)));
        animator.rotate(rightwing4, ((-1.1904F)-(0.8614F)), ((0.0248F)-(-0.0539F)),((-0.0527F)-(0.0263F)));
        animator.rotate(rightwing5, ((0.1948F)-(0.1076F)), ((0.1006F)-(0.1006F)),((0.0197F)-(0.0197F)));
        animator.rotate(rightwingmembrane1, ((0.0022F)-(-0.6888F)), ((0.3752F)-(0.3005F)),((0.0093F)-(-0.2284F)));
        animator.rotate(root, ((0.0F)-(-0.3054F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(shape64, ((-1.4114F)-(-1.4114F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(tail1, ((-0.2731F)-(-0.2731F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(underneck3, ((-0.2246F)-(-0.2246F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(underneck4_r1, ((-0.0873F)-(-0.0873F)), ((0.0F)-(0.0F)),((0.0F)-(0.0F)));
        animator.rotate(upperwing4_r1, ((-0.0218F)-(-0.0218F)), ((0.5794F)-(0.5794F)),((-0.1017F)-(-0.1017F)));
        animator.rotate(upperwing5_r1, ((-0.0218F)-(-0.0218F)), ((-0.5794F)-(-0.5794F)),((0.1017F)-(0.1017F)));
        animator.rotate(wing5_r1, ((-0.0742F)-(-0.0742F)), ((-0.0218F)-(-0.0218F)),((0.0016F)-(0.0016F)));
        animator.rotate(wing6_r1, ((-0.0742F)-(-0.0742F)), ((0.0218F)-(0.0218F)),((-0.0016F)-(-0.0016F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNFLY_ANIMATION);
        animator.startKeyframe(e.unflyTransitionLength()); //move to this keyframe over the right length
        animator.rotate(body1, -((-0.1367F)-(-0.1367F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(body2_r1, -((0.4363F)-(0.4363F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(bone_r1, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1222F)-(-0.1222F)));
        animator.rotate(bone_r2, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((-0.1396F)-(-0.1396F)));
        animator.rotate(bone_r3, -((0.0024F)-(0.0024F)), -((-0.0698F)-(-0.0698F)),-((-0.035F)-(-0.035F)));
        animator.rotate(bone_r4, -((-0.2929F)-(-0.2929F)), -((-0.1204F)-(-0.1204F)),-((-0.0234F)-(-0.0234F)));
        animator.rotate(bone_r5, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1222F)-(0.1222F)));
        animator.rotate(bone_r6, -((0.0F)-(0.0F)), -((0.0F)-(0.0F)),-((0.1396F)-(0.1396F)));
        animator.rotate(bone_r7, -((0.0024F)-(0.0024F)), -((0.0698F)-(0.0698F)),-((0.035F)-(0.035F)));
        animator.rotate(bone_r8, -((-0.2929F)-(-0.2929F)), -((0.1204F)-(0.1204F)),-((0.0234F)-(0.0234F)));
        animator.rotate(chest1, -((-0.0133F)-(-0.0133F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(crest1_r1, -((-0.4451F)-(-0.4451F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(crest1, -((-0.0911F)-(-0.0911F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(crest2_r1, -((-1.0472F)-(-1.0472F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(crest2_r2, -((-0.4974F)-(-0.4974F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(crest2, -((0.0456F)-(0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(crest3_r1, -((-1.309F)-(-1.309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(gums1, -((-0.055F)-(-0.055F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head, -((1.1345F)-(1.1345F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head1_r1, -((0.0611F)-(0.0611F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head2_r1, -((-1.4748F)-(-1.4748F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head2_r2, -((-0.0436F)-(-0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head2, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head3_r1, -((-0.1309F)-(-0.1309F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head3_r2, -((-1.0821F)-(-1.0821F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head3, -((-0.1367F)-(-0.1367F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head4_r1, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head4, -((0.1559F)-(0.1559F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head5_r1, -((0.2094F)-(0.2094F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head5_r2, -((-0.0524F)-(-0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head5, -((0.0948F)-(0.0948F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head6_r1, -((0.3927F)-(0.3927F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head6_r2, -((1.1257F)-(1.1257F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head6_r3, -((0.2094F)-(0.2094F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(head7_r1, -((0.5236F)-(0.5236F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw, -((0.0175F)-(0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw2_r1, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw2, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw3, -((0.2353F)-(0.2353F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw4_r1, -((0.0524F)-(0.0524F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw4, -((-0.0456F)-(-0.0456F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw5_r1, -((-0.0175F)-(-0.0175F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw5, -((0.0454F)-(0.0454F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw6_r1, -((1.1694F)-(1.1694F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw7_r1, -((1.8239F)-(1.8239F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw7_r2, -((0.7505F)-(0.7505F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(jaw8_r1, -((0.5585F)-(0.5585F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftfoot, -((1.1254F)-(-0.225F)), -((0.0804F)-(0.1026F)),-((-0.024F)-(0.238F)));
        animator.rotate(lefthand, -((0.15F)-(2.0464F)), -((-0.6621F)-(0.1054F)),-((1.8377F)-(0.0432F)));
        animator.rotate(leftleg1, -((0.2787F)-(0.2346F)), -((0.1138F)-(-0.1882F)),-((-1.5681F)-(-0.6916F)));
        animator.rotate(leftleg2, -((1.0026F)-(0.5865F)), -((-0.0258F)-(0.1604F)),-((0.0676F)-(0.3639F)));
        animator.rotate(leftlegwing1, -((0.1361F)-(0.1361F)), -((-0.0119F)-(-0.0119F)),-((0.0865F)-(0.0865F)));
        animator.rotate(leftlegwing2, -((-0.0141F)-(-0.0141F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(leftwing1, -((-0.1073F)-(0.2169F)), -((-0.048F)-(0.0756F)),-((-0.094F)-(0.9364F)));
        animator.rotate(leftwing2, -((-0.1984F)-(-0.3195F)), -((-0.0155F)-(0.2905F)),-((-1.5881F)-(-0.9403F)));
        animator.rotate(leftwing3, -((0.0403F)-(0.6948F)), -((-0.0078F)-(-0.0078F)),-((0.0826F)-(0.0826F)));
        animator.rotate(leftwing4, -((-1.1904F)-(0.8614F)), -((-0.0248F)-(0.0539F)),-((0.0527F)-(-0.0263F)));
        animator.rotate(leftwing5, -((0.1948F)-(0.1076F)), -((-0.1006F)-(-0.1006F)),-((-0.0197F)-(-0.0197F)));
        animator.rotate(leftwingmembrane1, -((0.0022F)-(-0.6888F)), -((-0.3752F)-(-0.3005F)),-((-0.0093F)-(0.2284F)));
        animator.rotate(lips1, -((0.0025F)-(0.0025F)), -((-0.0138F)-(-0.0138F)),-((0.2731F)-(0.2732F)));
        animator.rotate(lips2, -((0.0025F)-(0.0025F)), -((0.0138F)-(0.0138F)),-((-0.2731F)-(-0.2732F)));
        animator.rotate(neck1_r1, -((0.0436F)-(0.0436F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck1, -((-0.2618F)-(-0.6109F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck2, -((-0.1461F)-(-0.1461F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3_r1, -((0.1745F)-(0.1745F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(neck3, -((-0.2402F)-(0.1089F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightfoot, -((1.1254F)-(-0.225F)), -((-0.0804F)-(-0.1026F)),-((0.024F)-(-0.238F)));
        animator.rotate(righthand, -((-0.15F)-(2.0464F)), -((0.6621F)-(-0.1054F)),-((-1.8377F)-(-0.0432F)));
        animator.rotate(rightleg1, -((0.2787F)-(0.2346F)), -((-0.1138F)-(0.1882F)),-((1.5681F)-(0.6916F)));
        animator.rotate(rightleg2, -((1.0026F)-(0.5865F)), -((0.0258F)-(-0.1604F)),-((-0.0676F)-(-0.3639F)));
        animator.rotate(rightlegwing1, -((0.1361F)-(0.1361F)), -((0.0119F)-(0.0119F)),-((-0.0865F)-(-0.0865F)));
        animator.rotate(rightlegwing2, -((-0.0141F)-(-0.0141F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(rightwing1, -((-0.1073F)-(0.2169F)), -((0.048F)-(-0.0756F)),-((0.094F)-(-0.9364F)));
        animator.rotate(rightwing2, -((-0.1984F)-(-0.3195F)), -((0.0155F)-(-0.2905F)),-((1.5881F)-(0.9403F)));
        animator.rotate(rightwing3, -((0.0403F)-(0.6948F)), -((0.0078F)-(0.0078F)),-((-0.0826F)-(-0.0826F)));
        animator.rotate(rightwing4, -((-1.1904F)-(0.8614F)), -((0.0248F)-(-0.0539F)),-((-0.0527F)-(0.0263F)));
        animator.rotate(rightwing5, -((0.1948F)-(0.1076F)), -((0.1006F)-(0.1006F)),-((0.0197F)-(0.0197F)));
        animator.rotate(rightwingmembrane1, -((0.0022F)-(-0.6888F)), -((0.3752F)-(0.3005F)),-((0.0093F)-(-0.2284F)));
        animator.rotate(root, -((0.0F)-(-0.3054F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(shape64, -((-1.4114F)-(-1.4114F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(tail1, -((-0.2731F)-(-0.2731F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(underneck3, -((-0.2246F)-(-0.2246F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(underneck4_r1, -((-0.0873F)-(-0.0873F)), -((0.0F)-(0.0F)),-((0.0F)-(0.0F)));
        animator.rotate(upperwing4_r1, -((-0.0218F)-(-0.0218F)), -((0.5794F)-(0.5794F)),-((-0.1017F)-(-0.1017F)));
        animator.rotate(upperwing5_r1, -((-0.0218F)-(-0.0218F)), -((-0.5794F)-(-0.5794F)),-((0.1017F)-(0.1017F)));
        animator.rotate(wing5_r1, -((-0.0742F)-(-0.0742F)), -((-0.0218F)-(-0.0218F)),-((0.0016F)-(0.0016F)));
        animator.rotate(wing6_r1, -((-0.0742F)-(-0.0742F)), -((0.0218F)-(0.0218F)),-((-0.0016F)-(-0.0016F)));
        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

    }
}
