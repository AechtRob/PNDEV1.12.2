package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPlateosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPlateosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer basin;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer upperleg3;
    private final AdvancedModelRenderer lowerleg3;
    private final AdvancedModelRenderer feet3;
    private final AdvancedModelRenderer toes3;
    private final AdvancedModelRenderer upperleg2;
    private final AdvancedModelRenderer lowerleg2;
    private final AdvancedModelRenderer feet2;
    private final AdvancedModelRenderer toes2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer chest_r1;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer head1;
    private final AdvancedModelRenderer gums5_r1;
    private final AdvancedModelRenderer gums4_r1;
    private final AdvancedModelRenderer head2;
    private final AdvancedModelRenderer head3_r1;
    private final AdvancedModelRenderer head4;
    private final AdvancedModelRenderer head3;
    private final AdvancedModelRenderer head7_r1;
    private final AdvancedModelRenderer head6_r1;
    private final AdvancedModelRenderer head8_r1;
    private final AdvancedModelRenderer head6_r2;
    private final AdvancedModelRenderer head5_r1;
    private final AdvancedModelRenderer head4_r1;
    private final AdvancedModelRenderer head5;
    private final AdvancedModelRenderer jaw1;
    private final AdvancedModelRenderer jaw2_r1;
    private final AdvancedModelRenderer jaw2_r2;
    private final AdvancedModelRenderer gums1;
    private final AdvancedModelRenderer gums4_r2;
    private final AdvancedModelRenderer gums3_r1;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer jaw4_r1;
    private final AdvancedModelRenderer jaw3_r1;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer jaw4_r2;
    private final AdvancedModelRenderer jaw5_r1;
    private final AdvancedModelRenderer jaw4_r3;
    private final AdvancedModelRenderer jaw3_r2;
    private final AdvancedModelRenderer jaw4;
    private final AdvancedModelRenderer jaw4_r4;
    private final AdvancedModelRenderer upperarm2;
    private final AdvancedModelRenderer arms2;
    private final AdvancedModelRenderer hands2;
    private final AdvancedModelRenderer hands2_r1;
    private final AdvancedModelRenderer thumbclaw2;
    private final AdvancedModelRenderer upperarm3;
    private final AdvancedModelRenderer arms3;
    private final AdvancedModelRenderer hands3;
    private final AdvancedModelRenderer hands3_r1;
    private final AdvancedModelRenderer thumbclaw3;
    private ModelAnimator animator;

    public ModelPlateosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.basin = new AdvancedModelRenderer(this);
        this.basin.setRotationPoint(0.1F, -1.3F, 1.6F);
        this.root.addChild(basin);
        this.setRotateAngle(basin, -0.0456F, 0.0F, 0.0F);
        this.basin.cubeList.add(new ModelBox(basin, 0, 36, -5.6F, -5.4732F, -5.3062F, 11, 15, 12, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(-0.6F, -1.9732F, 6.7938F);
        this.basin.addChild(tail1);
        this.setRotateAngle(tail1, -0.0175F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 61, 0, -4.0F, -3.2701F, -1.0727F, 9, 12, 13, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.2F, -0.5701F, 12.3273F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0456F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 41, 64, -3.2F, -2.5F, -1.7F, 7, 10, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.4F, 8.7F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1367F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 64, -2.2F, -1.8F, -1.2F, 5, 7, 15, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.5F, 0.1F, 13.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0494F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 81, 26, -2.2F, -1.6F, -0.7F, 4, 5, 13, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.0F, 12.0F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0436F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 87, -1.7F, -1.4F, -1.0F, 3, 3, 12, 0.0F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, 0.0873F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 35, 36, -1.2F, -1.2F, -1.0F, 2, 2, 9, 0.0F, false));

        this.upperleg3 = new AdvancedModelRenderer(this);
        this.upperleg3.setRotationPoint(-6.6F, -0.1732F, -0.2062F);
        this.basin.addChild(upperleg3);
        this.setRotateAngle(upperleg3, -0.5009F, 0.0F, 0.0F);
        this.upperleg3.cubeList.add(new ModelBox(upperleg3, 33, 86, -1.7F, -1.6F, -2.6F, 6, 13, 8, 0.0F, true));

        this.lowerleg3 = new AdvancedModelRenderer(this);
        this.lowerleg3.setRotationPoint(0.2F, 10.0F, 0.6F);
        this.upperleg3.addChild(lowerleg3);
        this.setRotateAngle(lowerleg3, 0.9105F, 0.0F, 0.0F);
        this.lowerleg3.cubeList.add(new ModelBox(lowerleg3, 62, 95, -1.7F, -2.0F, -2.5F, 6, 12, 5, 0.0F, true));

        this.feet3 = new AdvancedModelRenderer(this);
        this.feet3.setRotationPoint(0.1F, 9.3F, 0.0F);
        this.lowerleg3.addChild(feet3);
        this.setRotateAngle(feet3, -0.5918F, 0.0F, 0.0F);
        this.feet3.cubeList.add(new ModelBox(feet3, 91, 71, -1.4F, -1.25F, -1.8F, 5, 9, 4, 0.0F, true));

        this.toes3 = new AdvancedModelRenderer(this);
        this.toes3.setRotationPoint(0.0F, 6.7F, 0.3F);
        this.feet3.addChild(toes3);
        this.setRotateAngle(toes3, 0.2276F, 0.0F, 0.0F);
        this.toes3.cubeList.add(new ModelBox(toes3, 43, 0, -1.9F, -1.3F, -5.8F, 6, 3, 8, 0.0F, true));

        this.upperleg2 = new AdvancedModelRenderer(this);
        this.upperleg2.setRotationPoint(6.4F, -0.1732F, -0.2062F);
        this.basin.addChild(upperleg2);
        this.setRotateAngle(upperleg2, -0.5009F, 0.0F, 0.0F);
        this.upperleg2.cubeList.add(new ModelBox(upperleg2, 33, 86, -4.3F, -1.6F, -2.6F, 6, 13, 8, 0.0F, false));

        this.lowerleg2 = new AdvancedModelRenderer(this);
        this.lowerleg2.setRotationPoint(-0.2F, 10.0F, 0.6F);
        this.upperleg2.addChild(lowerleg2);
        this.setRotateAngle(lowerleg2, 0.9105F, 0.0F, 0.0F);
        this.lowerleg2.cubeList.add(new ModelBox(lowerleg2, 62, 95, -4.3F, -2.0F, -2.5F, 6, 12, 5, 0.0F, false));

        this.feet2 = new AdvancedModelRenderer(this);
        this.feet2.setRotationPoint(-0.1F, 9.3F, 0.0F);
        this.lowerleg2.addChild(feet2);
        this.setRotateAngle(feet2, -0.5918F, 0.0F, 0.0F);
        this.feet2.cubeList.add(new ModelBox(feet2, 91, 71, -3.6F, -1.25F, -1.8F, 5, 9, 4, 0.0F, false));

        this.toes2 = new AdvancedModelRenderer(this);
        this.toes2.setRotationPoint(0.0F, 6.7F, 0.3F);
        this.feet2.addChild(toes2);
        this.setRotateAngle(toes2, 0.2276F, 0.0F, 0.0F);
        this.toes2.cubeList.add(new ModelBox(toes2, 43, 0, -4.1F, -1.3F, -5.8F, 6, 3, 8, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5732F, -3.1062F);
        this.basin.addChild(body);
        this.setRotateAngle(body, 0.0456F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -6.1F, -5.0179F, -18.0041F, 12, 17, 18, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -0.4179F, -17.7041F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1765F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 47, 36, -5.1F, -4.2971F, -11.4161F, 10, 14, 13, 0.0F, false));

        this.chest_r1 = new AdvancedModelRenderer(this);
        this.chest_r1.setRotationPoint(-0.1F, 9.7029F, -10.9161F);
        this.chest.addChild(chest_r1);
        this.setRotateAngle(chest_r1, -0.2356F, 0.0F, 0.0F);
        this.chest_r1.cubeList.add(new ModelBox(chest_r1, 47, 36, -5.0F, -13.777F, -0.2527F, 10, 14, 13, -0.02F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -0.6971F, -10.5161F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.2239F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 67, 75, -3.1F, -3.094F, -7.1193F, 6, 8, 11, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(-0.6F, -0.494F, -6.8193F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.2391F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 82, 52, -1.5F, -2.3108F, -9.9438F, 4, 6, 12, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -1.6108F, -9.9438F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.3054F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 26, 64, -1.0F, -0.6649F, -5.767F, 3, 4, 6, 0.0F, false));
        this.neck3.cubeList.add(new ModelBox(neck3, 61, 26, -1.0F, 3.2351F, -5.767F, 3, 1, 6, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -0.3649F, -0.567F);
        this.neck3.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -2.0F, -0.5F, 0, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, -0.3649F, -1.767F);
        this.neck3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2618F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 15, 4, 0.0F, -4.0F, -0.6F, 0, 4, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, -0.1649F, -3.167F);
        this.neck3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 12, 0.0F, -3.9F, -0.5F, 0, 4, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.6565F, -5.8496F);
        this.neck3.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 49, 36, 0.0F, -0.9977F, -0.4477F, 0, 2, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.3649F, -4.567F);
        this.neck3.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 71, 0.0F, -2.2F, -0.5F, 0, 2, 1, 0.0F, false));

        this.head1 = new AdvancedModelRenderer(this);
        this.head1.setRotationPoint(0.5F, 0.2351F, -5.867F);
        this.neck3.addChild(head1);
        this.setRotateAngle(head1, 0.425F, 0.0F, 0.0F);
        this.head1.cubeList.add(new ModelBox(head1, 67, 64, -1.5F, -0.6134F, -2.5904F, 3, 3, 3, 0.04F, false));
        this.head1.cubeList.add(new ModelBox(head1, 45, 69, 0.53F, -0.0134F, -2.4904F, 1, 1, 1, 0.03F, false));
        this.head1.cubeList.add(new ModelBox(head1, 45, 69, -1.53F, -0.0134F, -2.4904F, 1, 1, 1, 0.03F, true));

        this.gums5_r1 = new AdvancedModelRenderer(this);
        this.gums5_r1.setRotationPoint(-1.1F, 1.8866F, -1.4904F);
        this.head1.addChild(gums5_r1);
        this.setRotateAngle(gums5_r1, 0.0F, -0.0873F, 0.0F);
        this.gums5_r1.cubeList.add(new ModelBox(gums5_r1, 61, 26, -0.1704F, -0.2F, -2.5913F, 0, 1, 2, 0.0F, true));
        this.gums5_r1.cubeList.add(new ModelBox(gums5_r1, 8, 64, -0.1996F, -0.2F, -2.5913F, 0, 1, 2, 0.0F, true));

        this.gums4_r1 = new AdvancedModelRenderer(this);
        this.gums4_r1.setRotationPoint(1.1F, 1.8866F, -1.4904F);
        this.head1.addChild(gums4_r1);
        this.setRotateAngle(gums4_r1, 0.0F, 0.0873F, 0.0F);
        this.gums4_r1.cubeList.add(new ModelBox(gums4_r1, 61, 26, 0.1704F, -0.2F, -2.5913F, 0, 1, 2, 0.0F, false));
        this.gums4_r1.cubeList.add(new ModelBox(gums4_r1, 8, 64, 0.1996F, -0.2F, -2.5913F, 0, 1, 2, 0.0F, false));

        this.head2 = new AdvancedModelRenderer(this);
        this.head2.setRotationPoint(0.1F, 0.1866F, -3.5904F);
        this.head1.addChild(head2);
        this.setRotateAngle(head2, -0.182F, 0.0F, 0.0F);


        this.head3_r1 = new AdvancedModelRenderer(this);
        this.head3_r1.setRotationPoint(-0.1F, -0.7F, -0.2F);
        this.head2.addChild(head3_r1);
        this.setRotateAngle(head3_r1, 0.1571F, 0.0F, 0.0F);
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 26, 75, -1.0F, 0.6F, -2.3F, 2, 1, 2, -0.005F, false));
        this.head3_r1.cubeList.add(new ModelBox(head3_r1, 64, 0, -1.0F, -0.1F, -0.4F, 2, 2, 2, 0.0F, false));

        this.head4 = new AdvancedModelRenderer(this);
        this.head4.setRotationPoint(0.0F, -0.2F, -3.7F);
        this.head2.addChild(head4);
        this.setRotateAngle(head4, 0.7285F, 0.0F, 0.0F);


        this.head3 = new AdvancedModelRenderer(this);
        this.head3.setRotationPoint(0.0F, 1.6866F, -3.9904F);
        this.head1.addChild(head3);
        this.head3.cubeList.add(new ModelBox(head3, 78, 71, -1.0F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));

        this.head7_r1 = new AdvancedModelRenderer(this);
        this.head7_r1.setRotationPoint(-1.2F, -2.2F, -1.5F);
        this.head3.addChild(head7_r1);
        this.setRotateAngle(head7_r1, 0.2705F, 0.0F, 0.0F);
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 54, 42, 0.5F, 0.0389F, 0.0795F, 1, 1, 1, -0.003F, false));
        this.head7_r1.cubeList.add(new ModelBox(head7_r1, 69, 5, 0.9F, 0.0389F, 0.0795F, 1, 1, 1, -0.002F, false));

        this.head6_r1 = new AdvancedModelRenderer(this);
        this.head6_r1.setRotationPoint(-1.2F, -1.0F, -3.0F);
        this.head3.addChild(head6_r1);
        this.setRotateAngle(head6_r1, 0.6545F, 0.0F, 0.0F);
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 11, 0, 0.5F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));
        this.head6_r1.cubeList.add(new ModelBox(head6_r1, 43, 0, 0.9F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.head8_r1 = new AdvancedModelRenderer(this);
        this.head8_r1.setRotationPoint(-1.2F, -2.2F, -0.3F);
        this.head3.addChild(head8_r1);
        this.setRotateAngle(head8_r1, -0.2967F, 0.0F, 0.0F);
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 49, 42, 0.5F, -0.1818F, -0.1769F, 1, 1, 1, -0.002F, false));
        this.head8_r1.cubeList.add(new ModelBox(head8_r1, 64, 5, 0.9F, -0.1818F, -0.1769F, 1, 1, 1, 0.0F, false));

        this.head6_r2 = new AdvancedModelRenderer(this);
        this.head6_r2.setRotationPoint(-1.0F, -0.1881F, -0.0701F);
        this.head3.addChild(head6_r2);
        this.setRotateAngle(head6_r2, -0.1226F, -0.0866F, 0.0107F);
        this.head6_r2.cubeList.add(new ModelBox(head6_r2, 49, 36, 0.1F, -0.5F, -2.0F, 0, 1, 4, 0.0F, true));

        this.head5_r1 = new AdvancedModelRenderer(this);
        this.head5_r1.setRotationPoint(1.0F, -0.1881F, -0.0701F);
        this.head3.addChild(head5_r1);
        this.setRotateAngle(head5_r1, -0.1226F, 0.0866F, -0.0107F);
        this.head5_r1.cubeList.add(new ModelBox(head5_r1, 49, 36, -0.1F, -0.5F, -2.0F, 0, 1, 4, 0.0F, false));

        this.head4_r1 = new AdvancedModelRenderer(this);
        this.head4_r1.setRotationPoint(-0.1F, 0.0F, -1.0F);
        this.head3.addChild(head4_r1);
        this.setRotateAngle(head4_r1, -0.1222F, 0.0F, 0.0F);
        this.head4_r1.cubeList.add(new ModelBox(head4_r1, 39, 64, -1.4F, -1.0F, -0.1F, 3, 1, 3, 0.02F, false));

        this.head5 = new AdvancedModelRenderer(this);
        this.head5.setRotationPoint(0.0F, 0.4F, -4.0F);
        this.head3.addChild(head5);
        this.setRotateAngle(head5, 0.0911F, 0.0F, 0.0F);


        this.jaw1 = new AdvancedModelRenderer(this);
        this.jaw1.setRotationPoint(0.1F, 2.3866F, 0.0096F);
        this.head1.addChild(jaw1);
        this.setRotateAngle(jaw1, -0.2094F, 0.0F, 0.0F);
        this.jaw1.cubeList.add(new ModelBox(jaw1, 35, 42, -1.6F, 0.3F, -3.6F, 3, 1, 1, 0.02F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 0, 13, -1.6F, 0.0F, -2.6F, 3, 1, 3, 0.02F, false));
        this.jaw1.cubeList.add(new ModelBox(jaw1, 43, 12, -1.6F, 0.5F, -2.6F, 3, 1, 3, 0.03F, false));

        this.jaw2_r1 = new AdvancedModelRenderer(this);
        this.jaw2_r1.setRotationPoint(0.4F, 0.5F, -0.6F);
        this.jaw1.addChild(jaw2_r1);
        this.setRotateAngle(jaw2_r1, -0.3054F, 0.0F, 0.0F);
        this.jaw2_r1.cubeList.add(new ModelBox(jaw2_r1, 0, 74, -2.0F, -0.6F, -1.9F, 3, 1, 2, 0.01F, false));

        this.jaw2_r2 = new AdvancedModelRenderer(this);
        this.jaw2_r2.setRotationPoint(-0.1F, -0.1F, -3.6F);
        this.jaw1.addChild(jaw2_r2);
        this.setRotateAngle(jaw2_r2, 0.4712F, 0.0F, 0.0F);
        this.jaw2_r2.cubeList.add(new ModelBox(jaw2_r2, 67, 71, -1.5F, 0.2F, -0.5F, 3, 1, 2, -0.02F, false));

        this.gums1 = new AdvancedModelRenderer(this);
        this.gums1.setRotationPoint(-0.1F, -2.5F, -2.5F);
        this.jaw1.addChild(gums1);
        this.setRotateAngle(gums1, -0.2731F, 0.0F, 0.0F);


        this.gums4_r2 = new AdvancedModelRenderer(this);
        this.gums4_r2.setRotationPoint(-1.1F, 2.0F, 1.0F);
        this.gums1.addChild(gums4_r2);
        this.setRotateAngle(gums4_r2, 0.0F, -0.0873F, 0.0F);
        this.gums4_r2.cubeList.add(new ModelBox(gums4_r2, 0, 64, -0.1204F, 0.2F, -1.9913F, 0, 1, 2, 0.0F, true));
        this.gums4_r2.cubeList.add(new ModelBox(gums4_r2, 26, 64, -0.1504F, 0.2F, -1.9913F, 0, 1, 2, 0.0F, true));

        this.gums3_r1 = new AdvancedModelRenderer(this);
        this.gums3_r1.setRotationPoint(1.1F, 2.0F, 1.0F);
        this.gums1.addChild(gums3_r1);
        this.setRotateAngle(gums3_r1, 0.0F, 0.0873F, 0.0F);
        this.gums3_r1.cubeList.add(new ModelBox(gums3_r1, 0, 64, 0.1204F, 0.2F, -1.9913F, 0, 1, 2, 0.0F, false));
        this.gums3_r1.cubeList.add(new ModelBox(gums3_r1, 26, 64, 0.1504F, 0.2F, -1.9913F, 0, 1, 2, 0.0F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.1F, -3.6F);
        this.jaw1.addChild(jaw2);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 74, 26, -1.6F, -0.0408F, -1.4987F, 3, 1, 2, 0.0F, false));

        this.jaw4_r1 = new AdvancedModelRenderer(this);
        this.jaw4_r1.setRotationPoint(-1.0F, 0.2592F, -0.4987F);
        this.jaw2.addChild(jaw4_r1);
        this.setRotateAngle(jaw4_r1, 0.0F, -0.0873F, 0.0F);
        this.jaw4_r1.cubeList.add(new ModelBox(jaw4_r1, 56, 12, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, true));

        this.jaw3_r1 = new AdvancedModelRenderer(this);
        this.jaw3_r1.setRotationPoint(0.8F, 0.2592F, -0.4987F);
        this.jaw2.addChild(jaw3_r1);
        this.setRotateAngle(jaw3_r1, 0.0F, 0.0873F, 0.0F);
        this.jaw3_r1.cubeList.add(new ModelBox(jaw3_r1, 56, 12, 0.0F, -0.5F, -1.0F, 0, 1, 2, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(-0.1F, 0.3092F, -4.0987F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, 0.0911F, 0.0F, 0.0F);


        this.jaw4_r2 = new AdvancedModelRenderer(this);
        this.jaw4_r2.setRotationPoint(0.0F, 0.8566F, 1.0294F);
        this.jaw3.addChild(jaw4_r2);
        this.setRotateAngle(jaw4_r2, 0.0698F, 0.0F, 0.0F);
        this.jaw4_r2.cubeList.add(new ModelBox(jaw4_r2, 43, 4, -0.5F, -0.5395F, -0.136F, 1, 1, 2, 0.0F, false));

        this.jaw5_r1 = new AdvancedModelRenderer(this);
        this.jaw5_r1.setRotationPoint(-0.8F, 0.4228F, 1.7031F);
        this.jaw3.addChild(jaw5_r1);
        this.setRotateAngle(jaw5_r1, 0.1927F, -0.0857F, -0.0167F);
        this.jaw5_r1.cubeList.add(new ModelBox(jaw5_r1, 54, 36, 0.1F, -0.5F, -0.9F, 0, 1, 2, 0.0F, true));

        this.jaw4_r3 = new AdvancedModelRenderer(this);
        this.jaw4_r3.setRotationPoint(0.8F, 0.4228F, 1.7031F);
        this.jaw3.addChild(jaw4_r3);
        this.setRotateAngle(jaw4_r3, 0.1927F, 0.0857F, 0.0167F);
        this.jaw4_r3.cubeList.add(new ModelBox(jaw4_r3, 54, 36, -0.1F, -0.5F, -0.9F, 0, 1, 2, 0.0F, false));

        this.jaw3_r2 = new AdvancedModelRenderer(this);
        this.jaw3_r2.setRotationPoint(0.0F, -0.0434F, 2.5294F);
        this.jaw3.addChild(jaw3_r2);
        this.setRotateAngle(jaw3_r2, 0.192F, 0.0F, 0.0F);
        this.jaw3_r2.cubeList.add(new ModelBox(jaw3_r2, 78, 32, -1.0F, 0.0F, -1.9F, 2, 1, 2, -0.02F, false));

        this.jaw4 = new AdvancedModelRenderer(this);
        this.jaw4.setRotationPoint(-0.1F, 1.7592F, 0.1013F);
        this.jaw2.addChild(jaw4);
        this.setRotateAngle(jaw4, -0.0948F, 0.0F, 0.0F);


        this.jaw4_r4 = new AdvancedModelRenderer(this);
        this.jaw4_r4.setRotationPoint(0.0F, -0.4901F, -1.5086F);
        this.jaw4.addChild(jaw4_r4);
        this.setRotateAngle(jaw4_r4, 0.0175F, 0.0F, 0.0F);
        this.jaw4_r4.cubeList.add(new ModelBox(jaw4_r4, 0, 42, -1.0F, -0.9F, -0.3F, 2, 1, 3, -0.002F, false));

        this.upperarm2 = new AdvancedModelRenderer(this);
        this.upperarm2.setRotationPoint(5.1F, 5.5029F, -7.4161F);
        this.chest.addChild(upperarm2);
        this.setRotateAngle(upperarm2, 0.7162F, 0.2232F, -0.2103F);
        this.upperarm2.cubeList.add(new ModelBox(upperarm2, 0, 0, -1.6F, -0.9F, -2.2F, 3, 8, 4, 0.0F, false));

        this.arms2 = new AdvancedModelRenderer(this);
        this.arms2.setRotationPoint(0.1F, 5.4F, 0.8F);
        this.upperarm2.addChild(arms2);
        this.setRotateAngle(arms2, 0.4034F, 0.1655F, -0.038F);
        this.arms2.cubeList.add(new ModelBox(arms2, 93, 0, -0.9F, -2.3F, -7.5F, 2, 4, 7, 0.0F, false));

        this.hands2 = new AdvancedModelRenderer(this);
        this.hands2.setRotationPoint(0.0F, -0.5F, -8.0F);
        this.arms2.addChild(hands2);


        this.hands2_r1 = new AdvancedModelRenderer(this);
        this.hands2_r1.setRotationPoint(0.2F, 0.3F, 0.4F);
        this.hands2.addChild(hands2_r1);
        this.setRotateAngle(hands2_r1, 0.1618F, 0.0655F, 0.0114F);
        this.hands2_r1.cubeList.add(new ModelBox(hands2_r1, 0, 64, -0.5F, -2.0F, -4.3F, 1, 4, 5, 0.0F, false));

        this.thumbclaw2 = new AdvancedModelRenderer(this);
        this.thumbclaw2.setRotationPoint(0.0F, -1.6F, -0.9F);
        this.hands2.addChild(thumbclaw2);
        this.setRotateAngle(thumbclaw2, -0.7741F, 0.0F, 0.0F);
        this.thumbclaw2.cubeList.add(new ModelBox(thumbclaw2, 35, 36, -0.5456F, -1.0012F, -2.1132F, 1, 2, 3, 0.0F, false));

        this.upperarm3 = new AdvancedModelRenderer(this);
        this.upperarm3.setRotationPoint(-5.3F, 5.5029F, -7.4161F);
        this.chest.addChild(upperarm3);
        this.setRotateAngle(upperarm3, 0.7162F, -0.2232F, 0.2103F);
        this.upperarm3.cubeList.add(new ModelBox(upperarm3, 0, 0, -1.4F, -0.9F, -2.2F, 3, 8, 4, 0.0F, true));

        this.arms3 = new AdvancedModelRenderer(this);
        this.arms3.setRotationPoint(-0.1F, 5.4F, 0.8F);
        this.upperarm3.addChild(arms3);
        this.setRotateAngle(arms3, 0.4034F, -0.1655F, 0.038F);
        this.arms3.cubeList.add(new ModelBox(arms3, 93, 0, -1.1F, -2.3F, -7.5F, 2, 4, 7, 0.0F, true));

        this.hands3 = new AdvancedModelRenderer(this);
        this.hands3.setRotationPoint(0.0F, -0.5F, -8.0F);
        this.arms3.addChild(hands3);


        this.hands3_r1 = new AdvancedModelRenderer(this);
        this.hands3_r1.setRotationPoint(-0.2F, 0.3F, 0.4F);
        this.hands3.addChild(hands3_r1);
        this.setRotateAngle(hands3_r1, 0.1618F, -0.0655F, -0.0114F);
        this.hands3_r1.cubeList.add(new ModelBox(hands3_r1, 0, 64, -0.5F, -2.0F, -4.3F, 1, 4, 5, 0.0F, true));

        this.thumbclaw3 = new AdvancedModelRenderer(this);
        this.thumbclaw3.setRotationPoint(0.0F, -1.6F, -0.9F);
        this.hands3.addChild(thumbclaw3);
        this.setRotateAngle(thumbclaw3, -0.7741F, 0.0F, 0.0F);
        this.thumbclaw3.cubeList.add(new ModelBox(thumbclaw3, 35, 36, -0.4544F, -1.0012F, -2.1132F, 1, 2, 3, 0.0F, true));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStaticWall(float f) {
        this.setRotateAngle(chest, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(neck1, -0.3F, -0.3F, 0.05F);
        this.setRotateAngle(neck2, -0.5F, -0.08F, 0.05F);
        this.setRotateAngle(neck3, 0.9F, 0.2F, 0.05F);
        this.setRotateAngle(head1, 0.5F, 0.3F, 0.05F);
        this.setRotateAngle(jaw1, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(upperarm3, -0.5F, 0.3F, 0.3F);
        this.setRotateAngle(arms3, 0.3F, 0.3F, 0.3F);
        this.setRotateAngle(hands3, 0.0F, 0.3F, 0.0F);
        this.setRotateAngle(thumbclaw3, -0.6F, -0.3F, 0.0F);
        this.chest.offsetY = -0.02F;
        this.chest.offsetX = 0.0F;
        this.chest.offsetZ = 0.09F;
        this.chest.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(basin, -0.35F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.08F, 0.08F, 0.0F);
        this.setRotateAngle(chest, 0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neck1, -0.35F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.25F, 0.1F, 0.0F);
        this.setRotateAngle(neck3, 0.5F, 0.2F, 0.1F);
        this.setRotateAngle(head1, 0.7F, 0.2F, 0.1F);
        this.setRotateAngle(jaw1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(Tail6, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(upperleg2, 0.3F, -0.3F, -0.15F);
        this.setRotateAngle(lowerleg2, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(feet2, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(toes2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(upperleg3, -0.2F, 0.2F, 0.1F);
        this.setRotateAngle(lowerleg3, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(feet3, -0.5F, 0.0F, -0.05F);
        this.setRotateAngle(toes3, 0.38F, 0.0F, 0.0F);
        this.root.offsetY = -0.15F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.50F;
        this.root.offsetX = 0.0F;
        this.root.rotateAngleY = (float)Math.toRadians(130);
        this.root.rotateAngleX = (float)Math.toRadians(9);
        this.root.rotateAngleZ = (float)Math.toRadians(-2);
        this.root.scaleChildren = true;
        float scaler = 1.1F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(basin, -0.35F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.08F, 0.08F, 0.0F);
        this.setRotateAngle(chest, 0.3F, 0.1F, 0.0F);
        this.setRotateAngle(neck1, -0.35F, 0.1F, 0.0F);
        this.setRotateAngle(neck2, -0.25F, 0.1F, 0.0F);
        this.setRotateAngle(neck3, 0.5F, 0.2F, 0.1F);
        this.setRotateAngle(head1, 0.7F, 0.2F, 0.1F);
        this.setRotateAngle(jaw1, -0.2F, 0.0F, 0.0F);
        this.setRotateAngle(tail1, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.4F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(Tail6, 0.0F, -0.5F, 0.0F);
        this.setRotateAngle(upperleg2, 0.3F, -0.3F, -0.15F);
        this.setRotateAngle(lowerleg2, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(feet2, -0.7F, 0.0F, 0.0F);
        this.setRotateAngle(toes2, 0.1F, 0.0F, 0.0F);
        this.setRotateAngle(upperleg3, -0.2F, 0.2F, 0.1F);
        this.setRotateAngle(lowerleg3, 0.7F, 0.0F, 0.0F);
        this.setRotateAngle(feet3, -0.5F, 0.0F, -0.05F);
        this.setRotateAngle(toes3, 0.38F, 0.0F, 0.0F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
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

        EntityPrehistoricFloraPlateosaurus entityPlateosaurus = (EntityPrehistoricFloraPlateosaurus) e;

        this.faceTarget(f3, f4, 12, neck1);
        this.faceTarget(f3, f4, 12, neck2);
        this.faceTarget(f3, f4, 12, neck3);
        this.faceTarget(f3, f4, 12, head1);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.head1};
        AdvancedModelRenderer[] ArmL = {this.upperarm2, this.arms2};
        AdvancedModelRenderer[] ArmR = {this.upperarm3, this.arms3};

        entityPlateosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityPlateosaurus.getAnimation() == entityPlateosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!entityPlateosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entityPlateosaurus.getIsMoving()) {
                    if (entityPlateosaurus.getAnimation() != entityPlateosaurus.EAT_ANIMATION
                        && entityPlateosaurus.getAnimation() != entityPlateosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                        this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                        this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                        this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                        this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entityPlateosaurus.getIsFast()) { //Running


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


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraPlateosaurus ee = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

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
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE2_ANIMATION) { //The noise anim
            animNoise2(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ALERT_ANIMATION) { //The noise anim
            animAlert(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The noise anim
            animDrink(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 2 + (((tickAnim - 8) / 9) * (3.5-(2)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = 3.5 + (((tickAnim - 17) / 8) * (0-(3.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = -2 + (((tickAnim - 8) / 9) * (-3.5-(-2)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 17) / 8) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 17) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 8) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 8) / 11) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 11) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.31799-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.89559-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-7.19181-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 4.31799 + (((tickAnim - 8) / 10) * (-5.42139-(4.31799)));
            yy = 2.89559 + (((tickAnim - 8) / 10) * (0.89095-(2.89559)));
            zz = -7.19181 + (((tickAnim - 8) / 10) * (-2.21287-(-7.19181)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -5.42139 + (((tickAnim - 18) / 7) * (0-(-5.42139)));
            yy = 0.89095 + (((tickAnim - 18) / 7) * (0-(0.89095)));
            zz = -2.21287 + (((tickAnim - 18) / 7) * (0-(-2.21287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.58241-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.89184-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-2.73362-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0.58241 + (((tickAnim - 4) / 4) * (-6.33517-(0.58241)));
            yy = 0.89184 + (((tickAnim - 4) / 4) * (1.78368-(0.89184)));
            zz = -2.73362 + (((tickAnim - 4) / 4) * (-5.46723-(-2.73362)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -6.33517 + (((tickAnim - 8) / 10) * (-10.66759-(-6.33517)));
            yy = 1.78368 + (((tickAnim - 8) / 10) * (0.89184-(1.78368)));
            zz = -5.46723 + (((tickAnim - 8) / 10) * (-2.73362-(-5.46723)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -10.66759 + (((tickAnim - 18) / 7) * (0-(-10.66759)));
            yy = 0.89184 + (((tickAnim - 18) / 7) * (0-(0.89184)));
            zz = -2.73362 + (((tickAnim - 18) / 7) * (0-(-2.73362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.25 + (((tickAnim - 8) / 6) * (7.74-(12.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 7.74 + (((tickAnim - 14) / 5) * (0-(7.74)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 10) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.09-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw1.rotationPointX = this.jaw1.rotationPointX + (float)(xx);
        this.jaw1.rotationPointY = this.jaw1.rotationPointY - (float)(yy);
        this.jaw1.rotationPointZ = this.jaw1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -10.25 + (((tickAnim - 12) / 13) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.52111-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (11.24973-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.52111 + (((tickAnim - 12) / 13) * (0-(-23.52111)));
            yy = 11.24973 + (((tickAnim - 12) / 13) * (0-(11.24973)));
            zz = -0.0806 + (((tickAnim - 12) / 13) * (0-(-0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arms2.rotationPointX = this.arms2.rotationPointX + (float)(xx);
        this.arms2.rotationPointY = this.arms2.rotationPointY - (float)(yy);
        this.arms2.rotationPointZ = this.arms2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 21.25 + (((tickAnim - 15) / 10) * (0-(21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 10.25 + (((tickAnim - 12) / 13) * (0-(10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(xx), upperarm3.rotateAngleY + (float) Math.toRadians(yy), upperarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.5211-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.5211 + (((tickAnim - 12) / 13) * (0-(-23.5211)));
            yy = -11.2497 + (((tickAnim - 12) / 13) * (0-(-11.2497)));
            zz = 0.0806 + (((tickAnim - 12) / 13) * (0-(0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arms3.rotationPointX = this.arms3.rotationPointX + (float)(xx);
        this.arms3.rotationPointY = this.arms3.rotationPointY - (float)(yy);
        this.arms3.rotationPointZ = this.arms3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -21.25 + (((tickAnim - 15) / 10) * (0-(-21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(xx), hands3.rotateAngleY + (float) Math.toRadians(yy), hands3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animDrink(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 10) * (0-(0)));
            zz = -1.5 + (((tickAnim - 7) / 10) * (1.39-(-1.5)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 1.39 + (((tickAnim - 17) / 3) * (0-(1.39)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (-1.25-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 5) * (0-(0)));
            zz = -1.25 + (((tickAnim - 44) / 5) * (0-(-1.25)));
        }
        else if (tickAnim >= 49 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 49) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 4) * (1.74-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 1.74 + (((tickAnim - 53) / 7) * (0-(1.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            yy = -0.85 + (((tickAnim - 7) / 13) * (-1.95-(-0.85)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = -1.95 + (((tickAnim - 20) / 19) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            yy = -1.95 + (((tickAnim - 39) / 21) * (0-(-1.95)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 6) * (0-(-1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 11) * (0-(1)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -3 + (((tickAnim - 7) / 6) * (0-(-3)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 3 + (((tickAnim - 18) / 11) * (0-(3)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -2.75 + (((tickAnim - 48) / 12) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -2.25 + (((tickAnim - 7) / 6) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 18) / 11) * (0-(0)));
            yy = 2.25 + (((tickAnim - 18) / 11) * (0-(2.25)));
            zz = 0 + (((tickAnim - 18) / 11) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 29) / 19) * (1-(0)));
            yy = 0 + (((tickAnim - 29) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 19) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 1 + (((tickAnim - 48) / 12) * (0-(1)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4.75 + (((tickAnim - 7) / 6) * (0-(4.75)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (4.75-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.75-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 4.75 + (((tickAnim - 18) / 6) * (2.37508-(4.75)));
            yy = 2.75 + (((tickAnim - 18) / 6) * (-0.87493-(2.75)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.01787-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 2.37508 + (((tickAnim - 24) / 5) * (0-(2.37508)));
            yy = -0.87493 + (((tickAnim - 24) / 5) * (0-(-0.87493)));
            zz = 0.01787 + (((tickAnim - 24) / 5) * (0-(0.01787)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (-2.61181-(0)));
            yy = 0 + (((tickAnim - 29) / 10) * (-1.24437-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0.11853-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -2.61181 + (((tickAnim - 39) / 9) * (-6.2-(-2.61181)));
            yy = -1.24437 + (((tickAnim - 39) / 9) * (0-(-1.24437)));
            zz = 0.11853 + (((tickAnim - 39) / 9) * (0-(0.11853)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -6.2 + (((tickAnim - 48) / 12) * (0-(-6.2)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.75827-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.95519-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-5.73585-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.75827 + (((tickAnim - 4) / 3) * (3.25-(-0.75827)));
            yy = -0.95519 + (((tickAnim - 4) / 3) * (-2.75-(-0.95519)));
            zz = -5.73585 + (((tickAnim - 4) / 3) * (0-(-5.73585)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 7) / 6) * (-6.01615-(3.25)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (-5.48971-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.3368-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.01615 + (((tickAnim - 13) / 5) * (3.25-(-6.01615)));
            yy = -5.48971 + (((tickAnim - 13) / 5) * (2.75-(-5.48971)));
            zz = 0.3368 + (((tickAnim - 13) / 5) * (0-(0.3368)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 3.25 + (((tickAnim - 18) / 6) * (2.05384-(3.25)));
            yy = 2.75 + (((tickAnim - 18) / 6) * (5.95541-(2.75)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.33728-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 29) {
            xx = 2.05384 + (((tickAnim - 24) / 5) * (0-(2.05384)));
            yy = 5.95541 + (((tickAnim - 24) / 5) * (0-(5.95541)));
            zz = 0.33728 + (((tickAnim - 24) / 5) * (0-(0.33728)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (-5.8037-(0)));
            yy = 0 + (((tickAnim - 29) / 10) * (-3.24738-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (0.13057-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -5.8037 + (((tickAnim - 39) / 9) * (-11.4-(-5.8037)));
            yy = -3.24738 + (((tickAnim - 39) / 9) * (0-(-3.24738)));
            zz = 0.13057 + (((tickAnim - 39) / 9) * (0-(0.13057)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -11.4 + (((tickAnim - 48) / 12) * (0-(-11.4)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7 + (((tickAnim - 4) / 3) * (4-(-7)));
            yy = -2.25 + (((tickAnim - 4) / 3) * (-4.5-(-2.25)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 7) / 6) * (-11.78365-(4)));
            yy = -4.5 + (((tickAnim - 7) / 6) * (-9.0312-(-4.5)));
            zz = 0 + (((tickAnim - 7) / 6) * (1.17545-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -11.78365 + (((tickAnim - 13) / 5) * (4-(-11.78365)));
            yy = -9.0312 + (((tickAnim - 13) / 5) * (4.5-(-9.0312)));
            zz = 1.17545 + (((tickAnim - 13) / 5) * (0-(1.17545)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 4 + (((tickAnim - 18) / 6) * (2.56999-(4)));
            yy = 4.5 + (((tickAnim - 18) / 6) * (8.26508-(4.5)));
            zz = 0 + (((tickAnim - 18) / 6) * (0.72433-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 2.56999 + (((tickAnim - 24) / 3) * (1.1327-(2.56999)));
            yy = 8.26508 + (((tickAnim - 24) / 3) * (6.77368-(8.26508)));
            zz = 0.72433 + (((tickAnim - 24) / 3) * (0.65811-(0.72433)));
        }
        else if (tickAnim >= 27 && tickAnim < 29) {
            xx = 1.1327 + (((tickAnim - 27) / 2) * (0-(1.1327)));
            yy = 6.77368 + (((tickAnim - 27) / 2) * (0-(6.77368)));
            zz = 0.65811 + (((tickAnim - 27) / 2) * (0-(0.65811)));
        }
        else if (tickAnim >= 29 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 29) / 10) * (-9.1316-(0)));
            yy = 0 + (((tickAnim - 29) / 10) * (-6.05095-(0)));
            zz = 0 + (((tickAnim - 29) / 10) * (-1.25974-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 48) {
            xx = -9.1316 + (((tickAnim - 39) / 9) * (-12.30329-(-9.1316)));
            yy = -6.05095 + (((tickAnim - 39) / 9) * (2.83196-(-6.05095)));
            zz = -1.25974 + (((tickAnim - 39) / 9) * (-3.30051-(-1.25974)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = -12.30329 + (((tickAnim - 48) / 5) * (-7.02665-(-12.30329)));
            yy = 2.83196 + (((tickAnim - 48) / 5) * (1.41598-(2.83196)));
            zz = -3.30051 + (((tickAnim - 48) / 5) * (-1.65025-(-3.30051)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -7.02665 + (((tickAnim - 53) / 7) * (0-(-7.02665)));
            yy = 1.41598 + (((tickAnim - 53) / 7) * (0-(1.41598)));
            zz = -1.65025 + (((tickAnim - 53) / 7) * (0-(-1.65025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (15.25-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 15.25 + (((tickAnim - 15) / 5) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 15.25 + (((tickAnim - 20) / 19) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (4.5-(0)));
            yy = 15.25 + (((tickAnim - 39) / 11) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 4.5 + (((tickAnim - 50) / 4) * (0-(4.5)));
            yy = 15.25 + (((tickAnim - 50) / 4) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 15.25 + (((tickAnim - 54) / 6) * (0-(15.25)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 11) / 4) * (2.375-(1.45)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 2.375 + (((tickAnim - 15) / 5) * (2.375-(2.375)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 2.375 + (((tickAnim - 20) / 19) * (2.375-(2.375)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            yy = 2.375 + (((tickAnim - 39) / 11) * (1.3-(2.375)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 50) / 4) * (2.135-(1.3)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            yy = 2.135 + (((tickAnim - 54) / 6) * (0-(2.135)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (40-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 40 + (((tickAnim - 15) / 5) * (0-(40)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 39) / 11) * (1.5-(0)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 1.5 + (((tickAnim - 50) / 4) * (35-(1.5)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 35 + (((tickAnim - 54) / 6) * (0-(35)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (-43.5-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -43.5 + (((tickAnim - 15) / 5) * (14.5-(-43.5)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 14.5 + (((tickAnim - 20) / 19) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = 14.5 + (((tickAnim - 39) / 11) * (0-(14.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 50) / 4) * (-41.87-(0)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = -41.87 + (((tickAnim - 54) / 6) * (0-(-41.87)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 11) / 4) * (39.25-(0)));
            yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 39.25 + (((tickAnim - 15) / 5) * (-14.5-(39.25)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -14.5 + (((tickAnim - 20) / 19) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 50) {
            xx = -14.5 + (((tickAnim - 39) / 11) * (-5.25-(-14.5)));
            yy = 0 + (((tickAnim - 39) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 11) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 54) {
            xx = -5.25 + (((tickAnim - 50) / 4) * (27.62-(-5.25)));
            yy = 0 + (((tickAnim - 50) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 4) * (0-(0)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 27.62 + (((tickAnim - 54) / 6) * (0-(27.62)));
            yy = 0 + (((tickAnim - 54) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 54) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = -13 + (((tickAnim - 5) / 8) * (-13.25-(-13)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 13) / 26) * (0-(0)));
            yy = -13.25 + (((tickAnim - 13) / 26) * (-13.25-(-13.25)));
            zz = 0 + (((tickAnim - 13) / 26) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = -13.25 + (((tickAnim - 39) / 5) * (-16.33-(-13.25)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 44) / 7) * (0-(0)));
            yy = -16.33 + (((tickAnim - 44) / 7) * (0-(-16.33)));
            zz = 0 + (((tickAnim - 44) / 7) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            yy = 2.3 + (((tickAnim - 5) / 8) * (0-(2.3)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 13) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 26) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 39) / 5) * (2.025-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 44) / 7) * (0-(0)));
            yy = 2.025 + (((tickAnim - 44) / 7) * (1.2-(2.025)));
            zz = 0 + (((tickAnim - 44) / 7) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 51) / 9) * (0-(0)));
            yy = 1.2 + (((tickAnim - 51) / 9) * (0-(1.2)));
            zz = 0 + (((tickAnim - 51) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 29.75 + (((tickAnim - 5) / 8) * (14.25-(29.75)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 14.25 + (((tickAnim - 13) / 7) * (26.5-(14.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 26.5 + (((tickAnim - 20) / 19) * (26.5-(26.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = 26.5 + (((tickAnim - 39) / 5) * (37.67-(26.5)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 37.67 + (((tickAnim - 44) / 6) * (0-(37.67)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -40 + (((tickAnim - 5) / 8) * (-4.75-(-40)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -4.75 + (((tickAnim - 13) / 7) * (-14.75-(-4.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -14.75 + (((tickAnim - 20) / 19) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -14.75 + (((tickAnim - 39) / 5) * (-37.58-(-14.75)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -37.58 + (((tickAnim - 44) / 6) * (0-(-37.58)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (41-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 41 + (((tickAnim - 5) / 8) * (-7.5-(41)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7.5 + (((tickAnim - 13) / 7) * (-10.5-(-7.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -10.5 + (((tickAnim - 20) / 19) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 44) {
            xx = -10.5 + (((tickAnim - 39) / 5) * (18-(-10.5)));
            yy = 0 + (((tickAnim - 39) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 5) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 18 + (((tickAnim - 44) / 6) * (0-(18)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));

        this.toes2.rotationPointX = this.toes2.rotationPointX + (float)(0);
        this.toes2.rotationPointY = this.toes2.rotationPointY - (float)(0);
        this.toes2.rotationPointZ = this.toes2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 8.5 + (((tickAnim - 20) / 19) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 8.5 + (((tickAnim - 39) / 21) * (0-(8.5)));
            yy = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 42) {
            xx = 13.75 + (((tickAnim - 20) / 22) * (4.1-(13.75)));
            yy = 0 + (((tickAnim - 20) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 22) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = 4.1 + (((tickAnim - 42) / 18) * (0-(4.1)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = -0.5 + (((tickAnim - 20) / 7) * (5-(-0.5)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 5 + (((tickAnim - 27) / 15) * (-16.75-(5)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -16.75 + (((tickAnim - 42) / 18) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (8.61-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 8.61 + (((tickAnim - 12) / 8) * (9-(8.61)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 9 + (((tickAnim - 20) / 7) * (20.75-(9)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 20.75 + (((tickAnim - 27) / 15) * (-0.25002-(20.75)));
            yy = 0 + (((tickAnim - 27) / 15) * (-0.00131-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (1.5-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = -0.25002 + (((tickAnim - 42) / 10) * (9.5-(-0.25002)));
            yy = -0.00131 + (((tickAnim - 42) / 10) * (0-(-0.00131)));
            zz = 1.5 + (((tickAnim - 42) / 10) * (0-(1.5)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 9.5 + (((tickAnim - 52) / 8) * (0-(9.5)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 52) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 31.75 + (((tickAnim - 20) / 7) * (13.5-(31.75)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 13.5 + (((tickAnim - 27) / 15) * (-10.5-(13.5)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -10.5 + (((tickAnim - 42) / 18) * (0-(-10.5)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 20) {
            xx = 3.5 + (((tickAnim - 12) / 8) * (0-(3.5)));
            yy = 0 + (((tickAnim - 12) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 8) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 27) / 15) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 27) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 15) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -15.25 + (((tickAnim - 42) / 18) * (0-(-15.25)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 20) / 7) * (20.17-(0)));
            yy = 0 + (((tickAnim - 20) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 7) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 20.17 + (((tickAnim - 27) / 11) * (0-(20.17)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (2.72275-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (9.43619-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (16.25484-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 2.72275 + (((tickAnim - 20) / 19) * (2.72275-(2.72275)));
            yy = 9.43619 + (((tickAnim - 20) / 19) * (9.43619-(9.43619)));
            zz = 16.25484 + (((tickAnim - 20) / 19) * (16.25484-(16.25484)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 2.72275 + (((tickAnim - 39) / 21) * (0-(2.72275)));
            yy = 9.43619 + (((tickAnim - 39) / 21) * (0-(9.43619)));
            zz = 16.25484 + (((tickAnim - 39) / 21) * (0-(16.25484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = 20 + (((tickAnim - 20) / 19) * (20-(20)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            yy = 20 + (((tickAnim - 39) / 21) * (0-(20)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-18.28055-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-7.86834-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-3.36082-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = -18.28055 + (((tickAnim - 20) / 19) * (-18.28055-(-18.28055)));
            yy = -7.86834 + (((tickAnim - 20) / 19) * (-7.86834-(-7.86834)));
            zz = -3.36082 + (((tickAnim - 20) / 19) * (-3.36082-(-3.36082)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = -18.28055 + (((tickAnim - 39) / 21) * (0-(-18.28055)));
            yy = -7.86834 + (((tickAnim - 39) / 21) * (0-(-7.86834)));
            zz = -3.36082 + (((tickAnim - 39) / 21) * (0-(-3.36082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(xx), upperarm3.rotateAngleY + (float) Math.toRadians(yy), upperarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-16.5-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = -16.5 + (((tickAnim - 20) / 19) * (-16.5-(-16.5)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            yy = -16.5 + (((tickAnim - 39) / 21) * (0-(-16.5)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-17-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 39) {
            xx = 0 + (((tickAnim - 20) / 19) * (0-(0)));
            yy = -17 + (((tickAnim - 20) / 19) * (-17-(-17)));
            zz = 0 + (((tickAnim - 20) / 19) * (0-(0)));
        }
        else if (tickAnim >= 39 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 39) / 21) * (0-(0)));
            yy = -17 + (((tickAnim - 39) / 21) * (0-(-17)));
            zz = 0 + (((tickAnim - 39) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(xx), hands3.rotateAngleY + (float) Math.toRadians(yy), hands3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (-1.5-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = -1.5 + (((tickAnim - 7) / 8) * (1.39-(-1.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 4) * (0-(0)));
            zz = 1.39 + (((tickAnim - 15) / 4) * (0-(1.39)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (-1.25-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 4) * (0-(0)));
            zz = -1.25 + (((tickAnim - 40) / 4) * (0-(-1.25)));
        }
        else if (tickAnim >= 44 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 44) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 4) * (1.74-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 6) * (0-(0)));
            zz = 1.74 + (((tickAnim - 48) / 6) * (0-(1.74)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 7) / 12) * (0-(0)));
            yy = -0.85 + (((tickAnim - 7) / 12) * (-1.95-(-0.85)));
            zz = 0 + (((tickAnim - 7) / 12) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = -1.95 + (((tickAnim - 19) / 15) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = -1.95 + (((tickAnim - 34) / 20) * (0-(-1.95)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-1-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -1 + (((tickAnim - 7) / 6) * (0-(-1)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (1-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 9) * (0-(1)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 27) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-3-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -3 + (((tickAnim - 7) / 6) * (0-(-3)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (3-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 3 + (((tickAnim - 18) / 9) * (0-(3)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -2.75 + (((tickAnim - 43) / 11) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -2.25 + (((tickAnim - 7) / 6) * (0-(-2.25)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.25-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 18) / 9) * (0-(0)));
            yy = 2.25 + (((tickAnim - 18) / 9) * (0-(2.25)));
            zz = 0 + (((tickAnim - 18) / 9) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 27) / 16) * (1-(0)));
            yy = 0 + (((tickAnim - 27) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 16) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = 1 + (((tickAnim - 43) / 11) * (0-(1)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4.75 + (((tickAnim - 7) / 6) * (0-(4.75)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (4.75-(0)));
            yy = 0 + (((tickAnim - 13) / 5) * (2.75-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 4.75 + (((tickAnim - 18) / 4) * (2.37508-(4.75)));
            yy = 2.75 + (((tickAnim - 18) / 4) * (-0.87493-(2.75)));
            zz = 0 + (((tickAnim - 18) / 4) * (0.01787-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 2.37508 + (((tickAnim - 22) / 5) * (0-(2.37508)));
            yy = -0.87493 + (((tickAnim - 22) / 5) * (0-(-0.87493)));
            zz = 0.01787 + (((tickAnim - 22) / 5) * (0-(0.01787)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (-2.61181-(0)));
            yy = 0 + (((tickAnim - 27) / 7) * (-1.24437-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0.11853-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -2.61181 + (((tickAnim - 34) / 9) * (-6.2-(-2.61181)));
            yy = -1.24437 + (((tickAnim - 34) / 9) * (0-(-1.24437)));
            zz = 0.11853 + (((tickAnim - 34) / 9) * (0-(0.11853)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -6.2 + (((tickAnim - 43) / 11) * (0-(-6.2)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-0.75827-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.95519-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (-5.73585-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -0.75827 + (((tickAnim - 4) / 3) * (3.25-(-0.75827)));
            yy = -0.95519 + (((tickAnim - 4) / 3) * (-2.75-(-0.95519)));
            zz = -5.73585 + (((tickAnim - 4) / 3) * (0-(-5.73585)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 3.25 + (((tickAnim - 7) / 6) * (-6.01615-(3.25)));
            yy = -2.75 + (((tickAnim - 7) / 6) * (-5.48971-(-2.75)));
            zz = 0 + (((tickAnim - 7) / 6) * (0.3368-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.01615 + (((tickAnim - 13) / 5) * (3.25-(-6.01615)));
            yy = -5.48971 + (((tickAnim - 13) / 5) * (2.75-(-5.48971)));
            zz = 0.3368 + (((tickAnim - 13) / 5) * (0-(0.3368)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 3.25 + (((tickAnim - 18) / 4) * (2.05384-(3.25)));
            yy = 2.75 + (((tickAnim - 18) / 4) * (5.95541-(2.75)));
            zz = 0 + (((tickAnim - 18) / 4) * (0.33728-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 2.05384 + (((tickAnim - 22) / 5) * (0-(2.05384)));
            yy = 5.95541 + (((tickAnim - 22) / 5) * (0-(5.95541)));
            zz = 0.33728 + (((tickAnim - 22) / 5) * (0-(0.33728)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (-5.8037-(0)));
            yy = 0 + (((tickAnim - 27) / 7) * (-3.24738-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (0.13057-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -5.8037 + (((tickAnim - 34) / 9) * (-11.4-(-5.8037)));
            yy = -3.24738 + (((tickAnim - 34) / 9) * (0-(-3.24738)));
            zz = 0.13057 + (((tickAnim - 34) / 9) * (0-(0.13057)));
        }
        else if (tickAnim >= 43 && tickAnim < 54) {
            xx = -11.4 + (((tickAnim - 43) / 11) * (0-(-11.4)));
            yy = 0 + (((tickAnim - 43) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -7 + (((tickAnim - 4) / 3) * (4-(-7)));
            yy = -2.25 + (((tickAnim - 4) / 3) * (-4.5-(-2.25)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 4 + (((tickAnim - 7) / 6) * (-11.78365-(4)));
            yy = -4.5 + (((tickAnim - 7) / 6) * (-9.0312-(-4.5)));
            zz = 0 + (((tickAnim - 7) / 6) * (1.17545-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -11.78365 + (((tickAnim - 13) / 5) * (4-(-11.78365)));
            yy = -9.0312 + (((tickAnim - 13) / 5) * (4.5-(-9.0312)));
            zz = 1.17545 + (((tickAnim - 13) / 5) * (0-(1.17545)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 4 + (((tickAnim - 18) / 4) * (2.56999-(4)));
            yy = 4.5 + (((tickAnim - 18) / 4) * (8.26508-(4.5)));
            zz = 0 + (((tickAnim - 18) / 4) * (0.72433-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 2.56999 + (((tickAnim - 22) / 2) * (1.1327-(2.56999)));
            yy = 8.26508 + (((tickAnim - 22) / 2) * (6.77368-(8.26508)));
            zz = 0.72433 + (((tickAnim - 22) / 2) * (0.65811-(0.72433)));
        }
        else if (tickAnim >= 24 && tickAnim < 27) {
            xx = 1.1327 + (((tickAnim - 24) / 3) * (0-(1.1327)));
            yy = 6.77368 + (((tickAnim - 24) / 3) * (0-(6.77368)));
            zz = 0.65811 + (((tickAnim - 24) / 3) * (0-(0.65811)));
        }
        else if (tickAnim >= 27 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 27) / 7) * (-9.1316-(0)));
            yy = 0 + (((tickAnim - 27) / 7) * (-6.05095-(0)));
            zz = 0 + (((tickAnim - 27) / 7) * (-1.25974-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 43) {
            xx = -9.1316 + (((tickAnim - 34) / 9) * (-12.30329-(-9.1316)));
            yy = -6.05095 + (((tickAnim - 34) / 9) * (2.83196-(-6.05095)));
            zz = -1.25974 + (((tickAnim - 34) / 9) * (-3.30051-(-1.25974)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = -12.30329 + (((tickAnim - 43) / 5) * (-7.02665-(-12.30329)));
            yy = 2.83196 + (((tickAnim - 43) / 5) * (1.41598-(2.83196)));
            zz = -3.30051 + (((tickAnim - 43) / 5) * (-1.65025-(-3.30051)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = -7.02665 + (((tickAnim - 48) / 6) * (0-(-7.02665)));
            yy = 1.41598 + (((tickAnim - 48) / 6) * (0-(1.41598)));
            zz = -1.65025 + (((tickAnim - 48) / 6) * (0-(-1.65025)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (15.25-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 15.25 + (((tickAnim - 14) / 5) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 15.25 + (((tickAnim - 19) / 15) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (4.5-(0)));
            yy = 15.25 + (((tickAnim - 34) / 11) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 4.5 + (((tickAnim - 45) / 4) * (0-(4.5)));
            yy = 15.25 + (((tickAnim - 45) / 4) * (15.25-(15.25)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            yy = 15.25 + (((tickAnim - 49) / 5) * (0-(15.25)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (1.45-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 1.45 + (((tickAnim - 10) / 4) * (2.375-(1.45)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            yy = 2.375 + (((tickAnim - 14) / 5) * (2.375-(2.375)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 2.375 + (((tickAnim - 19) / 15) * (2.375-(2.375)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            yy = 2.375 + (((tickAnim - 34) / 11) * (1.3-(2.375)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            yy = 1.3 + (((tickAnim - 45) / 4) * (2.135-(1.3)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            yy = 2.135 + (((tickAnim - 49) / 5) * (0-(2.135)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (40-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 40 + (((tickAnim - 14) / 5) * (0-(40)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 34) / 11) * (1.5-(0)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 1.5 + (((tickAnim - 45) / 4) * (35-(1.5)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 35 + (((tickAnim - 49) / 5) * (0-(35)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (-43.5-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = -43.5 + (((tickAnim - 14) / 5) * (14.5-(-43.5)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 14.5 + (((tickAnim - 19) / 15) * (14.5-(14.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = 14.5 + (((tickAnim - 34) / 11) * (0-(14.5)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = 0 + (((tickAnim - 45) / 4) * (-41.87-(0)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = -41.87 + (((tickAnim - 49) / 5) * (0-(-41.87)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (39.25-(0)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 39.25 + (((tickAnim - 14) / 5) * (-14.5-(39.25)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = -14.5 + (((tickAnim - 19) / 15) * (-14.5-(-14.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 45) {
            xx = -14.5 + (((tickAnim - 34) / 11) * (-5.25-(-14.5)));
            yy = 0 + (((tickAnim - 34) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 11) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 49) {
            xx = -5.25 + (((tickAnim - 45) / 4) * (27.62-(-5.25)));
            yy = 0 + (((tickAnim - 45) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 4) * (0-(0)));
        }
        else if (tickAnim >= 49 && tickAnim < 54) {
            xx = 27.62 + (((tickAnim - 49) / 5) * (0-(27.62)));
            yy = 0 + (((tickAnim - 49) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 49) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-13-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = -13 + (((tickAnim - 5) / 7) * (-13.25-(-13)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            yy = -13.25 + (((tickAnim - 12) / 22) * (-13.25-(-13.25)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = -13.25 + (((tickAnim - 34) / 6) * (-16.33-(-13.25)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = -16.33 + (((tickAnim - 40) / 6) * (0-(-16.33)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (2.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            yy = 2.3 + (((tickAnim - 5) / 7) * (0-(2.3)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 22) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 6) * (2.025-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 40) / 6) * (0-(0)));
            yy = 2.025 + (((tickAnim - 40) / 6) * (1.2-(2.025)));
            zz = 0 + (((tickAnim - 40) / 6) * (0-(0)));
        }
        else if (tickAnim >= 46 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 46) / 8) * (0-(0)));
            yy = 1.2 + (((tickAnim - 46) / 8) * (0-(1.2)));
            zz = 0 + (((tickAnim - 46) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 29.75 + (((tickAnim - 5) / 7) * (14.25-(29.75)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = 14.25 + (((tickAnim - 12) / 7) * (26.5-(14.25)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 26.5 + (((tickAnim - 19) / 15) * (26.5-(26.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 26.5 + (((tickAnim - 34) / 6) * (37.67-(26.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 37.67 + (((tickAnim - 40) / 5) * (0-(37.67)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-40-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = -40 + (((tickAnim - 5) / 7) * (-4.75-(-40)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -4.75 + (((tickAnim - 12) / 7) * (-14.75-(-4.75)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = -14.75 + (((tickAnim - 19) / 15) * (-14.75-(-14.75)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -14.75 + (((tickAnim - 34) / 6) * (-37.58-(-14.75)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -37.58 + (((tickAnim - 40) / 5) * (0-(-37.58)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (41-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 12) {
            xx = 41 + (((tickAnim - 5) / 7) * (-7.5-(41)));
            yy = 0 + (((tickAnim - 5) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 7) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 19) {
            xx = -7.5 + (((tickAnim - 12) / 7) * (-10.5-(-7.5)));
            yy = 0 + (((tickAnim - 12) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 7) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = -10.5 + (((tickAnim - 19) / 15) * (-10.5-(-10.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -10.5 + (((tickAnim - 34) / 6) * (18-(-10.5)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 18 + (((tickAnim - 40) / 5) * (0-(18)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));

        this.toes2.rotationPointX = this.toes2.rotationPointX + (float)(0);
        this.toes2.rotationPointY = this.toes2.rotationPointY - (float)(0);
        this.toes2.rotationPointZ = this.toes2.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 8.5 + (((tickAnim - 19) / 15) * (8.5-(8.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 8.5 + (((tickAnim - 34) / 20) * (0-(8.5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 13.75 + (((tickAnim - 19) / 15) * (13.75-(13.75)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 13.75 + (((tickAnim - 34) / 20) * (0-(13.75)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = -0.5 + (((tickAnim - 19) / 15) * (-0.5-(-0.5)));
            yy = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = -0.5 + (((tickAnim - 34) / 20) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (8.61-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 8.61 + (((tickAnim - 11) / 8) * (9-(8.61)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 9 + (((tickAnim - 19) / 4) * (13.74999-(9)));
            yy = 0 + (((tickAnim - 19) / 4) * (0.00109-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-1.25-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 13.74999 + (((tickAnim - 23) / 4) * (9-(13.74999)));
            yy = 0.00109 + (((tickAnim - 23) / 4) * (0-(0.00109)));
            zz = -1.25 + (((tickAnim - 23) / 4) * (0-(-1.25)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 9 + (((tickAnim - 27) / 4) * (13.74998-(9)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0.00131-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (1.5-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 13.74998 + (((tickAnim - 31) / 3) * (9-(13.74998)));
            yy = -0.00131 + (((tickAnim - 31) / 3) * (0-(-0.00131)));
            zz = 1.5 + (((tickAnim - 31) / 3) * (0-(1.5)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 9 + (((tickAnim - 34) / 20) * (0-(9)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 31.75 + (((tickAnim - 19) / 4) * (22.59486-(31.75)));
            yy = 0 + (((tickAnim - 19) / 4) * (3.87261-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-4.58639-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 22.59486 + (((tickAnim - 23) / 4) * (31.75-(22.59486)));
            yy = 3.87261 + (((tickAnim - 23) / 4) * (0-(3.87261)));
            zz = -4.58639 + (((tickAnim - 23) / 4) * (0-(-4.58639)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 31.75 + (((tickAnim - 27) / 4) * (22.50741-(31.75)));
            yy = 0 + (((tickAnim - 27) / 4) * (-4.83785-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (5.7379-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 22.50741 + (((tickAnim - 31) / 3) * (31.75-(22.50741)));
            yy = -4.83785 + (((tickAnim - 31) / 3) * (0-(-4.83785)));
            zz = 5.7379 + (((tickAnim - 31) / 3) * (0-(5.7379)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 31.75 + (((tickAnim - 34) / 20) * (0-(31.75)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 19) {
            xx = 3.5 + (((tickAnim - 11) / 8) * (0-(3.5)));
            yy = 0 + (((tickAnim - 11) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 8) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (-6.30813-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (1.47419-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (-4.51595-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = -6.30813 + (((tickAnim - 23) / 4) * (0-(-6.30813)));
            yy = 1.47419 + (((tickAnim - 23) / 4) * (0-(1.47419)));
            zz = -4.51595 + (((tickAnim - 23) / 4) * (0-(-4.51595)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (-6.26949-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (-0.85406-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (2.61411-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = -6.26949 + (((tickAnim - 31) / 3) * (0-(-6.26949)));
            yy = -0.85406 + (((tickAnim - 31) / 3) * (0-(-0.85406)));
            zz = 2.61411 + (((tickAnim - 31) / 3) * (0-(2.61411)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 19) / 4) * (20.17-(0)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 20.17 + (((tickAnim - 23) / 4) * (0-(20.17)));
            yy = 0 + (((tickAnim - 23) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 4) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 27) / 4) * (20.17-(0)));
            yy = 0 + (((tickAnim - 27) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 4) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 34) {
            xx = 20.17 + (((tickAnim - 31) / 3) * (0-(20.17)));
            yy = 0 + (((tickAnim - 31) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 3) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (2.72275-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (9.43619-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (16.25484-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 2.72275 + (((tickAnim - 19) / 15) * (2.72275-(2.72275)));
            yy = 9.43619 + (((tickAnim - 19) / 15) * (9.43619-(9.43619)));
            zz = 16.25484 + (((tickAnim - 19) / 15) * (16.25484-(16.25484)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 2.72275 + (((tickAnim - 34) / 20) * (0-(2.72275)));
            yy = 9.43619 + (((tickAnim - 34) / 20) * (0-(9.43619)));
            zz = 16.25484 + (((tickAnim - 34) / 20) * (0-(16.25484)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 54) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 54) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (20-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = 20 + (((tickAnim - 19) / 15) * (20-(20)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = 20 + (((tickAnim - 34) / 20) * (0-(20)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-18.28055-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-7.86834-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-3.36082-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = -18.28055 + (((tickAnim - 19) / 15) * (-18.28055-(-18.28055)));
            yy = -7.86834 + (((tickAnim - 19) / 15) * (-7.86834-(-7.86834)));
            zz = -3.36082 + (((tickAnim - 19) / 15) * (-3.36082-(-3.36082)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = -18.28055 + (((tickAnim - 34) / 20) * (0-(-18.28055)));
            yy = -7.86834 + (((tickAnim - 34) / 20) * (0-(-7.86834)));
            zz = -3.36082 + (((tickAnim - 34) / 20) * (0-(-3.36082)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(xx), upperarm3.rotateAngleY + (float) Math.toRadians(yy), upperarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-16.5-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = -16.5 + (((tickAnim - 19) / 15) * (-16.5-(-16.5)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = -16.5 + (((tickAnim - 34) / 20) * (0-(-16.5)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-17-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 19) / 15) * (0-(0)));
            yy = -17 + (((tickAnim - 19) / 15) * (-17-(-17)));
            zz = 0 + (((tickAnim - 19) / 15) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 54) {
            xx = 0 + (((tickAnim - 34) / 20) * (0-(0)));
            yy = -17 + (((tickAnim - 34) / 20) * (0-(-17)));
            zz = 0 + (((tickAnim - 34) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(xx), hands3.rotateAngleY + (float) Math.toRadians(yy), hands3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 9 + (((tickAnim - 14) / 16) * (-2.5-(9)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -2.5 + (((tickAnim - 30) / 79) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = -2.5 + (((tickAnim - 109) / 16) * (-7.53-(-2.5)));
            yy = 0 + (((tickAnim - 109) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 16) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -7.53 + (((tickAnim - 125) / 15) * (0-(-7.53)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-11.225-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            yy = -11.225 + (((tickAnim - 30) / 79) * (-11.225-(-11.225)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 109) / 16) * (0-(0)));
            yy = -11.225 + (((tickAnim - 109) / 16) * (-5.76-(-11.225)));
            zz = 0 + (((tickAnim - 109) / 16) * (2.3-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = -5.76 + (((tickAnim - 125) / 15) * (0-(-5.76)));
            zz = 2.3 + (((tickAnim - 125) / 15) * (0-(2.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (-8.03368-(0)));
            yy = 0 + (((tickAnim - 11) / 10) * (4.31678-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (-0.37905-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = -8.03368 + (((tickAnim - 21) / 9) * (-4.0274-(-8.03368)));
            yy = 4.31678 + (((tickAnim - 21) / 9) * (5.97708-(4.31678)));
            zz = -0.37905 + (((tickAnim - 21) / 9) * (-0.52484-(-0.37905)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -4.0274 + (((tickAnim - 30) / 50) * (-4.0274-(-4.0274)));
            yy = 5.97708 + (((tickAnim - 30) / 50) * (5.97708-(5.97708)));
            zz = -0.52484 + (((tickAnim - 30) / 50) * (-0.52484-(-0.52484)));
        }
        else if (tickAnim >= 80 && tickAnim < 112) {
            xx = -4.0274 + (((tickAnim - 80) / 32) * (-7.25628-(-4.0274)));
            yy = 5.97708 + (((tickAnim - 80) / 32) * (-2.2267-(5.97708)));
            zz = -0.52484 + (((tickAnim - 80) / 32) * (0.32302-(-0.52484)));
        }
        else if (tickAnim >= 112 && tickAnim < 140) {
            xx = -7.25628 + (((tickAnim - 112) / 28) * (0-(-7.25628)));
            yy = -2.2267 + (((tickAnim - 112) / 28) * (0-(-2.2267)));
            zz = 0.32302 + (((tickAnim - 112) / 28) * (0-(0.32302)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-0.00571-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (4.78936-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.65314-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -0.00571 + (((tickAnim - 11) / 10) * (3.77198-(-0.00571)));
            yy = 4.78936 + (((tickAnim - 11) / 10) * (7.78271-(4.78936)));
            zz = 1.65314 + (((tickAnim - 11) / 10) * (2.68636-(1.65314)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 3.77198 + (((tickAnim - 21) / 9) * (-3.95034-(3.77198)));
            yy = 7.78271 + (((tickAnim - 21) / 9) * (10.77606-(7.78271)));
            zz = 2.68636 + (((tickAnim - 21) / 9) * (3.71958-(2.68636)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = -3.95034 + (((tickAnim - 30) / 50) * (-3.95034-(-3.95034)));
            yy = 10.77606 + (((tickAnim - 30) / 50) * (10.77606-(10.77606)));
            zz = 3.71958 + (((tickAnim - 30) / 50) * (3.71958-(3.71958)));
        }
        else if (tickAnim >= 80 && tickAnim < 112) {
            xx = -3.95034 + (((tickAnim - 80) / 32) * (0-(-3.95034)));
            yy = 10.77606 + (((tickAnim - 80) / 32) * (-6.25-(10.77606)));
            zz = 3.71958 + (((tickAnim - 80) / 32) * (0-(3.71958)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            yy = -6.25 + (((tickAnim - 112) / 8) * (-12.41-(-6.25)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = -12.41 + (((tickAnim - 120) / 20) * (0-(-12.41)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (9.91633-(0)));
            yy = 2.25 + (((tickAnim - 11) / 10) * (5.27997-(2.25)));
            zz = 0 + (((tickAnim - 11) / 10) * (3.47059-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 9.91633 + (((tickAnim - 21) / 9) * (3.64797-(9.91633)));
            yy = 5.27997 + (((tickAnim - 21) / 9) * (5.80797-(5.27997)));
            zz = 3.47059 + (((tickAnim - 21) / 9) * (3.81765-(3.47059)));
        }
        else if (tickAnim >= 30 && tickAnim < 80) {
            xx = 3.64797 + (((tickAnim - 30) / 50) * (3.64797-(3.64797)));
            yy = 5.80797 + (((tickAnim - 30) / 50) * (5.80797-(5.80797)));
            zz = 3.81765 + (((tickAnim - 30) / 50) * (3.81765-(3.81765)));
        }
        else if (tickAnim >= 80 && tickAnim < 112) {
            xx = 3.64797 + (((tickAnim - 80) / 32) * (0-(3.64797)));
            yy = 5.80797 + (((tickAnim - 80) / 32) * (-5-(5.80797)));
            zz = 3.81765 + (((tickAnim - 80) / 32) * (0-(3.81765)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 112) / 8) * (0-(0)));
            yy = -5 + (((tickAnim - 112) / 8) * (-5.49-(-5)));
            zz = 0 + (((tickAnim - 112) / 8) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = -5.49 + (((tickAnim - 120) / 20) * (0-(-5.49)));
            zz = 0 + (((tickAnim - 120) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-5.52539-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (4.45243-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.65325-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -5.52539 + (((tickAnim - 11) / 10) * (10.40177-(-5.52539)));
            yy = 4.45243 + (((tickAnim - 11) / 10) * (7.68384-(4.45243)));
            zz = -0.65325 + (((tickAnim - 11) / 10) * (1.03667-(-0.65325)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 10.40177 + (((tickAnim - 21) / 5) * (11.89511-(10.40177)));
            yy = 7.68384 + (((tickAnim - 21) / 5) * (8.52208-(7.68384)));
            zz = 1.03667 + (((tickAnim - 21) / 5) * (1.14977-(1.03667)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 11.89511 + (((tickAnim - 26) / 4) * (4.43122-(11.89511)));
            yy = 8.52208 + (((tickAnim - 26) / 4) * (9.22061-(8.52208)));
            zz = 1.14977 + (((tickAnim - 26) / 4) * (1.24401-(1.14977)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 4.43122 + (((tickAnim - 30) / 3) * (5.93122-(4.43122)));
            yy = 9.22061 + (((tickAnim - 30) / 3) * (9.22061-(9.22061)));
            zz = 1.24401 + (((tickAnim - 30) / 3) * (1.24401-(1.24401)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 5.93122 + (((tickAnim - 33) / 2) * (2.87859-(5.93122)));
            yy = 9.22061 + (((tickAnim - 33) / 2) * (9.22061-(9.22061)));
            zz = 1.24401 + (((tickAnim - 33) / 2) * (1.24401-(1.24401)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 2.87859 + (((tickAnim - 35) / 3) * (4.43122-(2.87859)));
            yy = 9.22061 + (((tickAnim - 35) / 3) * (9.22061-(9.22061)));
            zz = 1.24401 + (((tickAnim - 35) / 3) * (1.24401-(1.24401)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = 4.43122 + (((tickAnim - 38) / 42) * (4.43122-(4.43122)));
            yy = 9.22061 + (((tickAnim - 38) / 42) * (9.22061-(9.22061)));
            zz = 1.24401 + (((tickAnim - 38) / 42) * (1.24401-(1.24401)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 4.43122 + (((tickAnim - 80) / 11) * (6.56655-(4.43122)));
            yy = 9.22061 + (((tickAnim - 80) / 11) * (10.09483-(9.22061)));
            zz = 1.24401 + (((tickAnim - 80) / 11) * (2.6935-(1.24401)));
        }
        else if (tickAnim >= 91 && tickAnim < 112) {
            xx = 6.56655 + (((tickAnim - 91) / 21) * (8.97578-(6.56655)));
            yy = 10.09483 + (((tickAnim - 91) / 21) * (-3.67433-(10.09483)));
            zz = 2.6935 + (((tickAnim - 91) / 21) * (-0.3491-(2.6935)));
        }
        else if (tickAnim >= 112 && tickAnim < 120) {
            xx = 8.97578 + (((tickAnim - 112) / 8) * (-0.15461-(8.97578)));
            yy = -3.67433 + (((tickAnim - 112) / 8) * (-12.0827-(-3.67433)));
            zz = -0.3491 + (((tickAnim - 112) / 8) * (2.80216-(-0.3491)));
        }
        else if (tickAnim >= 120 && tickAnim < 129) {
            xx = -0.15461 + (((tickAnim - 120) / 9) * (-2.55547-(-0.15461)));
            yy = -12.0827 + (((tickAnim - 120) / 9) * (-0.5297-(-12.0827)));
            zz = 2.80216 + (((tickAnim - 120) / 9) * (1.38755-(2.80216)));
        }
        else if (tickAnim >= 129 && tickAnim < 140) {
            xx = -2.55547 + (((tickAnim - 129) / 11) * (0-(-2.55547)));
            yy = -0.5297 + (((tickAnim - 129) / 11) * (0-(-0.5297)));
            zz = 1.38755 + (((tickAnim - 129) / 11) * (0-(1.38755)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-9.00884-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (2.9807-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (-0.33992-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -9.00884 + (((tickAnim - 11) / 10) * (3.21283-(-9.00884)));
            yy = 2.9807 + (((tickAnim - 11) / 10) * (7.15049-(2.9807)));
            zz = -0.33992 + (((tickAnim - 11) / 10) * (1.43327-(-0.33992)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 3.21283 + (((tickAnim - 21) / 5) * (13.05349-(3.21283)));
            yy = 7.15049 + (((tickAnim - 21) / 5) * (7.93055-(7.15049)));
            zz = 1.43327 + (((tickAnim - 21) / 5) * (1.58962-(1.43327)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 13.05349 + (((tickAnim - 26) / 4) * (8.87904-(13.05349)));
            yy = 7.93055 + (((tickAnim - 26) / 4) * (8.58059-(7.93055)));
            zz = 1.58962 + (((tickAnim - 26) / 4) * (1.71992-(1.58962)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 8.87904 + (((tickAnim - 30) / 3) * (16.12904-(8.87904)));
            yy = 8.58059 + (((tickAnim - 30) / 3) * (8.58059-(8.58059)));
            zz = 1.71992 + (((tickAnim - 30) / 3) * (1.71992-(1.71992)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 16.12904 + (((tickAnim - 33) / 2) * (17.87465-(16.12904)));
            yy = 8.58059 + (((tickAnim - 33) / 2) * (8.58059-(8.58059)));
            zz = 1.71992 + (((tickAnim - 33) / 2) * (1.71992-(1.71992)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 17.87465 + (((tickAnim - 35) / 3) * (8.87904-(17.87465)));
            yy = 8.58059 + (((tickAnim - 35) / 3) * (8.58059-(8.58059)));
            zz = 1.71992 + (((tickAnim - 35) / 3) * (1.71992-(1.71992)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = 8.87904 + (((tickAnim - 38) / 42) * (8.87904-(8.87904)));
            yy = 8.58059 + (((tickAnim - 38) / 42) * (8.58059-(8.58059)));
            zz = 1.71992 + (((tickAnim - 38) / 42) * (1.71992-(1.71992)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 8.87904 + (((tickAnim - 80) / 11) * (9.13093-(8.87904)));
            yy = 8.58059 + (((tickAnim - 80) / 11) * (13.96898-(8.58059)));
            zz = 1.71992 + (((tickAnim - 80) / 11) * (2.84692-(1.71992)));
        }
        else if (tickAnim >= 91 && tickAnim < 102) {
            xx = 9.13093 + (((tickAnim - 91) / 11) * (9.04721-(9.13093)));
            yy = 13.96898 + (((tickAnim - 91) / 11) * (10.41435-(13.96898)));
            zz = 2.84692 + (((tickAnim - 91) / 11) * (2.12889-(2.84692)));
        }
        else if (tickAnim >= 102 && tickAnim < 120) {
            xx = 9.04721 + (((tickAnim - 102) / 18) * (6.5333-(9.04721)));
            yy = 10.41435 + (((tickAnim - 102) / 18) * (-7.03163-(10.41435)));
            zz = 2.12889 + (((tickAnim - 102) / 18) * (-2.55504-(2.12889)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 6.5333 + (((tickAnim - 120) / 5) * (10.05952-(6.5333)));
            yy = -7.03163 + (((tickAnim - 120) / 5) * (-5.3579-(-7.03163)));
            zz = -2.55504 + (((tickAnim - 120) / 5) * (-1.71723-(-2.55504)));
        }
        else if (tickAnim >= 125 && tickAnim < 131) {
            xx = 10.05952 + (((tickAnim - 125) / 6) * (-3.28948-(10.05952)));
            yy = -5.3579 + (((tickAnim - 125) / 6) * (-3.27427-(-5.3579)));
            zz = -1.71723 + (((tickAnim - 125) / 6) * (-1.04942-(-1.71723)));
        }
        else if (tickAnim >= 131 && tickAnim < 140) {
            xx = -3.28948 + (((tickAnim - 131) / 9) * (0-(-3.28948)));
            yy = -3.27427 + (((tickAnim - 131) / 9) * (0-(-3.27427)));
            zz = -1.04942 + (((tickAnim - 131) / 9) * (0-(-1.04942)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-17-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -17 + (((tickAnim - 11) / 10) * (8.70682-(-17)));
            yy = 0 + (((tickAnim - 11) / 10) * (3.75-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 26) {
            xx = 8.70682 + (((tickAnim - 21) / 5) * (13.95764-(8.70682)));
            yy = 3.75 + (((tickAnim - 21) / 5) * (4.15909-(3.75)));
            zz = 0 + (((tickAnim - 21) / 5) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 13.95764 + (((tickAnim - 26) / 4) * (0-(13.95764)));
            yy = 4.15909 + (((tickAnim - 26) / 4) * (4.5-(4.15909)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 30) / 3) * (-12.25-(0)));
            yy = 4.5 + (((tickAnim - 30) / 3) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = -12.25 + (((tickAnim - 33) / 2) * (8.92982-(-12.25)));
            yy = 4.5 + (((tickAnim - 33) / 2) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 33) / 2) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 8.92982 + (((tickAnim - 35) / 3) * (1.75-(8.92982)));
            yy = 4.5 + (((tickAnim - 35) / 3) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 35) / 3) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 80) {
            xx = 1.75 + (((tickAnim - 38) / 42) * (1.75-(1.75)));
            yy = 4.5 + (((tickAnim - 38) / 42) * (4.5-(4.5)));
            zz = 0 + (((tickAnim - 38) / 42) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 91) {
            xx = 1.75 + (((tickAnim - 80) / 11) * (0-(1.75)));
            yy = 4.5 + (((tickAnim - 80) / 11) * (9.31-(4.5)));
            zz = 0 + (((tickAnim - 80) / 11) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 102) {
            xx = 0 + (((tickAnim - 91) / 11) * (0-(0)));
            yy = 9.31 + (((tickAnim - 91) / 11) * (8.91-(9.31)));
            zz = 0 + (((tickAnim - 91) / 11) * (0-(0)));
        }
        else if (tickAnim >= 102 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 102) / 18) * (5.5-(0)));
            yy = 8.91 + (((tickAnim - 102) / 18) * (0-(8.91)));
            zz = 0 + (((tickAnim - 102) / 18) * (0-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 5.5 + (((tickAnim - 120) / 5) * (4.13-(5.5)));
            yy = 0 + (((tickAnim - 120) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 120) / 5) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 131) {
            xx = 4.13 + (((tickAnim - 125) / 6) * (-2.59-(4.13)));
            yy = 0 + (((tickAnim - 125) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 6) * (0-(0)));
        }
        else if (tickAnim >= 131 && tickAnim < 134) {
            xx = -2.59 + (((tickAnim - 131) / 3) * (-6.4-(-2.59)));
            yy = 0 + (((tickAnim - 131) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 131) / 3) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = -6.4 + (((tickAnim - 134) / 6) * (0-(-6.4)));
            yy = 0 + (((tickAnim - 134) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.8691-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (18.2009-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (1.4936-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -3.8691 + (((tickAnim - 14) / 16) * (2.32507-(-3.8691)));
            yy = 18.2009 + (((tickAnim - 14) / 16) * (24.35199-(18.2009)));
            zz = 1.4936 + (((tickAnim - 14) / 16) * (-1.2252-(1.4936)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 2.32507 + (((tickAnim - 30) / 79) * (2.32507-(2.32507)));
            yy = 24.35199 + (((tickAnim - 30) / 79) * (24.35199-(24.35199)));
            zz = -1.2252 + (((tickAnim - 30) / 79) * (-1.2252-(-1.2252)));
        }
        else if (tickAnim >= 109 && tickAnim < 118) {
            xx = 2.32507 + (((tickAnim - 109) / 9) * (-27.85918-(2.32507)));
            yy = 24.35199 + (((tickAnim - 109) / 9) * (11.53515-(24.35199)));
            zz = -1.2252 + (((tickAnim - 109) / 9) * (-0.58036-(-1.2252)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -27.85918 + (((tickAnim - 118) / 7) * (-24.75-(-27.85918)));
            yy = 11.53515 + (((tickAnim - 118) / 7) * (0-(11.53515)));
            zz = -0.58036 + (((tickAnim - 118) / 7) * (0-(-0.58036)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -24.75 + (((tickAnim - 125) / 15) * (0-(-24.75)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (2.26-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 2.26 + (((tickAnim - 14) / 16) * (2.5-(2.26)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            yy = 2.5 + (((tickAnim - 30) / 79) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 118) {
            xx = 0 + (((tickAnim - 109) / 9) * (0-(0)));
            yy = 2.5 + (((tickAnim - 109) / 9) * (2.225-(2.5)));
            zz = 0 + (((tickAnim - 109) / 9) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            yy = 2.225 + (((tickAnim - 118) / 7) * (1.075-(2.225)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 1.075 + (((tickAnim - 125) / 15) * (0-(1.075)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (53.07968-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-5.79019-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-1.57547-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 53.07968 + (((tickAnim - 30) / 79) * (53.07968-(53.07968)));
            yy = -5.79019 + (((tickAnim - 30) / 79) * (-5.79019-(-5.79019)));
            zz = -1.57547 + (((tickAnim - 30) / 79) * (-1.57547-(-1.57547)));
        }
        else if (tickAnim >= 109 && tickAnim < 118) {
            xx = 53.07968 + (((tickAnim - 109) / 9) * (60.87821-(53.07968)));
            yy = -5.79019 + (((tickAnim - 109) / 9) * (0.01761-(-5.79019)));
            zz = -1.57547 + (((tickAnim - 109) / 9) * (0.42913-(-1.57547)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 60.87821 + (((tickAnim - 118) / 7) * (38.5-(60.87821)));
            yy = 0.01761 + (((tickAnim - 118) / 7) * (0-(0.01761)));
            zz = 0.42913 + (((tickAnim - 118) / 7) * (0-(0.42913)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 38.5 + (((tickAnim - 125) / 15) * (0-(38.5)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-96.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -96.75 + (((tickAnim - 30) / 79) * (-96.75-(-96.75)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 118) {
            xx = -96.75 + (((tickAnim - 109) / 9) * (-68.58-(-96.75)));
            yy = 0 + (((tickAnim - 109) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 9) * (0-(0)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = -68.58 + (((tickAnim - 118) / 7) * (-4.75-(-68.58)));
            yy = 0 + (((tickAnim - 118) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 118) / 7) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -4.75 + (((tickAnim - 125) / 15) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (16.49498-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.34687-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-3.86095-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 16.49498 + (((tickAnim - 14) / 16) * (46.73726-(16.49498)));
            yy = 1.34687 + (((tickAnim - 14) / 16) * (-1.41192-(1.34687)));
            zz = -3.86095 + (((tickAnim - 14) / 16) * (1.03402-(-3.86095)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 46.73726 + (((tickAnim - 30) / 79) * (46.73726-(46.73726)));
            yy = -1.41192 + (((tickAnim - 30) / 79) * (-1.41192-(-1.41192)));
            zz = 1.03402 + (((tickAnim - 30) / 79) * (1.03402-(1.03402)));
        }
        else if (tickAnim >= 109 && tickAnim < 118) {
            xx = 46.73726 + (((tickAnim - 109) / 9) * (63.3887-(46.73726)));
            yy = -1.41192 + (((tickAnim - 109) / 9) * (-0.66881-(-1.41192)));
            zz = 1.03402 + (((tickAnim - 109) / 9) * (0.4898-(1.03402)));
        }
        else if (tickAnim >= 118 && tickAnim < 125) {
            xx = 63.3887 + (((tickAnim - 118) / 7) * (-2.25-(63.3887)));
            yy = -0.66881 + (((tickAnim - 118) / 7) * (0-(-0.66881)));
            zz = 0.4898 + (((tickAnim - 118) / 7) * (0-(0.4898)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -2.25 + (((tickAnim - 125) / 15) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.8691-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-18.2009-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-1.4936-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -3.8691 + (((tickAnim - 14) / 16) * (2.07936-(-3.8691)));
            yy = -18.2009 + (((tickAnim - 14) / 16) * (-19.55335-(-18.2009)));
            zz = -1.4936 + (((tickAnim - 14) / 16) * (-2.55964-(-1.4936)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 2.07936 + (((tickAnim - 30) / 79) * (2.07936-(2.07936)));
            yy = -19.55335 + (((tickAnim - 30) / 79) * (-19.55335-(-19.55335)));
            zz = -2.55964 + (((tickAnim - 30) / 79) * (-2.55964-(-2.55964)));
        }
        else if (tickAnim >= 109 && tickAnim < 122) {
            xx = 2.07936 + (((tickAnim - 109) / 13) * (2.07936-(2.07936)));
            yy = -19.55335 + (((tickAnim - 109) / 13) * (-19.55335-(-19.55335)));
            zz = -2.55964 + (((tickAnim - 109) / 13) * (-2.55964-(-2.55964)));
        }
        else if (tickAnim >= 122 && tickAnim < 129) {
            xx = 2.07936 + (((tickAnim - 122) / 7) * (-32.73842-(2.07936)));
            yy = -19.55335 + (((tickAnim - 122) / 7) * (-9.51244-(-19.55335)));
            zz = -2.55964 + (((tickAnim - 122) / 7) * (-1.24523-(-2.55964)));
        }
        else if (tickAnim >= 129 && tickAnim < 140) {
            xx = -32.73842 + (((tickAnim - 129) / 11) * (0-(-32.73842)));
            yy = -9.51244 + (((tickAnim - 129) / 11) * (0-(-9.51244)));
            zz = -1.24523 + (((tickAnim - 129) / 11) * (0-(-1.24523)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (2.26-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 2.26 + (((tickAnim - 14) / 16) * (2.5-(2.26)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            yy = 2.5 + (((tickAnim - 30) / 79) * (2.5-(2.5)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 122) {
            xx = 0 + (((tickAnim - 109) / 13) * (0-(0)));
            yy = 2.5 + (((tickAnim - 109) / 13) * (-2-(2.5)));
            zz = 0 + (((tickAnim - 109) / 13) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 129) {
            xx = 0 + (((tickAnim - 122) / 7) * (0-(0)));
            yy = -2 + (((tickAnim - 122) / 7) * (2.07-(-2)));
            zz = 0 + (((tickAnim - 122) / 7) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 129) / 11) * (0-(0)));
            yy = 2.07 + (((tickAnim - 129) / 11) * (0-(2.07)));
            zz = 0 + (((tickAnim - 129) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (53-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 53 + (((tickAnim - 30) / 79) * (53-(53)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 122) {
            xx = 53 + (((tickAnim - 109) / 13) * (53-(53)));
            yy = 0 + (((tickAnim - 109) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 13) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 129) {
            xx = 53 + (((tickAnim - 122) / 7) * (57.53-(53)));
            yy = 0 + (((tickAnim - 122) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 7) * (0-(0)));
        }
        else if (tickAnim >= 129 && tickAnim < 140) {
            xx = 57.53 + (((tickAnim - 129) / 11) * (0-(57.53)));
            yy = 0 + (((tickAnim - 129) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 129) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-96.75-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -96.75 + (((tickAnim - 30) / 79) * (-96.75-(-96.75)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 122) {
            xx = -96.75 + (((tickAnim - 109) / 13) * (-96.75-(-96.75)));
            yy = 0 + (((tickAnim - 109) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 13) * (0-(0)));
        }
        else if (tickAnim >= 122 && tickAnim < 140) {
            xx = -96.75 + (((tickAnim - 122) / 18) * (0-(-96.75)));
            yy = 0 + (((tickAnim - 122) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 122) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (16.49498-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1.34687-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (3.861-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 16.49498 + (((tickAnim - 14) / 16) * (46.73726-(16.49498)));
            yy = 1.34687 + (((tickAnim - 14) / 16) * (-1.41192-(1.34687)));
            zz = 3.861 + (((tickAnim - 14) / 16) * (1.03402-(3.861)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 46.73726 + (((tickAnim - 30) / 79) * (46.73726-(46.73726)));
            yy = -1.41192 + (((tickAnim - 30) / 79) * (-1.41192-(-1.41192)));
            zz = 1.03402 + (((tickAnim - 30) / 79) * (1.03402-(1.03402)));
        }
        else if (tickAnim >= 109 && tickAnim < 122) {
            xx = 46.73726 + (((tickAnim - 109) / 13) * (46.73726-(46.73726)));
            yy = -1.41192 + (((tickAnim - 109) / 13) * (-1.41192-(-1.41192)));
            zz = 1.03402 + (((tickAnim - 109) / 13) * (1.03402-(1.03402)));
        }
        else if (tickAnim >= 122 && tickAnim < 129) {
            xx = 46.73726 + (((tickAnim - 122) / 7) * (52.48704-(46.73726)));
            yy = -1.41192 + (((tickAnim - 122) / 7) * (-0.68688-(-1.41192)));
            zz = 1.03402 + (((tickAnim - 122) / 7) * (0.50303-(1.03402)));
        }
        else if (tickAnim >= 129 && tickAnim < 140) {
            xx = 52.48704 + (((tickAnim - 129) / 11) * (0-(52.48704)));
            yy = -0.68688 + (((tickAnim - 129) / 11) * (0-(-0.68688)));
            zz = 0.50303 + (((tickAnim - 129) / 11) * (0-(0.50303)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (4.42-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 4.42 + (((tickAnim - 14) / 16) * (3-(4.42)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 3 + (((tickAnim - 30) / 79) * (3-(3)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 3 + (((tickAnim - 109) / 16) * (9.04-(3)));
            yy = 0 + (((tickAnim - 109) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 16) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 9.04 + (((tickAnim - 125) / 15) * (0-(9.04)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-3.1-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -3.1 + (((tickAnim - 14) / 16) * (8.75-(-3.1)));
            yy = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 8.75 + (((tickAnim - 30) / 79) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 8.75 + (((tickAnim - 109) / 16) * (10.24-(8.75)));
            yy = 0 + (((tickAnim - 109) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 16) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 10.24 + (((tickAnim - 125) / 15) * (0-(10.24)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 0) / 42) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 42) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 42) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 80) {
            xx = 5.25 + (((tickAnim - 42) / 38) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 42) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 38) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 109) {
            xx = 5.25 + (((tickAnim - 80) / 29) * (0-(5.25)));
            yy = 0 + (((tickAnim - 80) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 29) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 123) {
            xx = 0 + (((tickAnim - 109) / 14) * (3.25-(0)));
            yy = 0 + (((tickAnim - 109) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 14) * (0-(0)));
        }
        else if (tickAnim >= 123 && tickAnim < 140) {
            xx = 3.25 + (((tickAnim - 123) / 17) * (0-(3.25)));
            yy = 0 + (((tickAnim - 123) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 123) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-35.69069-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.7694-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (-19.27723-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -35.69069 + (((tickAnim - 30) / 79) * (-35.69069-(-35.69069)));
            yy = -0.7694 + (((tickAnim - 30) / 79) * (-0.7694-(-0.7694)));
            zz = -19.27723 + (((tickAnim - 30) / 79) * (-19.27723-(-19.27723)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = -35.69069 + (((tickAnim - 109) / 16) * (-19.35473-(-35.69069)));
            yy = -0.7694 + (((tickAnim - 109) / 16) * (-4.11148-(-0.7694)));
            zz = -19.27723 + (((tickAnim - 109) / 16) * (-2.21122-(-19.27723)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -19.35473 + (((tickAnim - 125) / 15) * (0-(-19.35473)));
            yy = -4.11148 + (((tickAnim - 125) / 15) * (0-(-4.11148)));
            zz = -2.21122 + (((tickAnim - 125) / 15) * (0-(-2.21122)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (1-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = 1 + (((tickAnim - 14) / 16) * (0-(1)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 109) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 109) / 16) * (-0.775-(0)));
            zz = 0 + (((tickAnim - 109) / 16) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = -0.775 + (((tickAnim - 125) / 15) * (0-(-0.775)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarm2.rotationPointX = this.upperarm2.rotationPointX + (float)(xx);
        this.upperarm2.rotationPointY = this.upperarm2.rotationPointY - (float)(yy);
        this.upperarm2.rotationPointZ = this.upperarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (-12.80734-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (-14.16777-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (-12.7364-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -12.80734 + (((tickAnim - 22) / 8) * (-16.02062-(-12.80734)));
            yy = -14.16777 + (((tickAnim - 22) / 8) * (-18.25461-(-14.16777)));
            zz = -12.7364 + (((tickAnim - 22) / 8) * (-17.38679-(-12.7364)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -16.02062 + (((tickAnim - 30) / 79) * (-16.02062-(-16.02062)));
            yy = -18.25461 + (((tickAnim - 30) / 79) * (-18.25461-(-18.25461)));
            zz = -17.38679 + (((tickAnim - 30) / 79) * (-17.38679-(-17.38679)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = -16.02062 + (((tickAnim - 109) / 31) * (0-(-16.02062)));
            yy = -18.25461 + (((tickAnim - 109) / 31) * (0-(-18.25461)));
            zz = -17.38679 + (((tickAnim - 109) / 31) * (0-(-17.38679)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (23.03148-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-61.07095-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-38.94208-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 23.03148 + (((tickAnim - 14) / 16) * (6.27157-(23.03148)));
            yy = -61.07095 + (((tickAnim - 14) / 16) * (-26.22624-(-61.07095)));
            zz = -38.94208 + (((tickAnim - 14) / 16) * (-35.9462-(-38.94208)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 6.27157 + (((tickAnim - 30) / 79) * (6.27157-(6.27157)));
            yy = -26.22624 + (((tickAnim - 30) / 79) * (-26.22624-(-26.22624)));
            zz = -35.9462 + (((tickAnim - 30) / 79) * (-35.9462-(-35.9462)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 6.27157 + (((tickAnim - 109) / 16) * (3.95796-(6.27157)));
            yy = -26.22624 + (((tickAnim - 109) / 16) * (-37.67185-(-26.22624)));
            zz = -35.9462 + (((tickAnim - 109) / 16) * (-20.12934-(-35.9462)));
        }
        else if (tickAnim >= 125 && tickAnim < 134) {
            xx = 3.95796 + (((tickAnim - 125) / 9) * (0-(3.95796)));
            yy = -37.67185 + (((tickAnim - 125) / 9) * (0-(-37.67185)));
            zz = -20.12934 + (((tickAnim - 125) / 9) * (0-(-20.12934)));
        }
        else if (tickAnim >= 134 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 134) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-39.39917-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-8.41559-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (26.22855-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -39.39917 + (((tickAnim - 14) / 16) * (-42.25-(-39.39917)));
            yy = -8.41559 + (((tickAnim - 14) / 16) * (0-(-8.41559)));
            zz = 26.22855 + (((tickAnim - 14) / 16) * (0-(26.22855)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -42.25 + (((tickAnim - 30) / 79) * (-42.25-(-42.25)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = -42.25 + (((tickAnim - 109) / 16) * (-23.91418-(-42.25)));
            yy = 0 + (((tickAnim - 109) / 16) * (-4.28918-(0)));
            zz = 0 + (((tickAnim - 109) / 16) * (12.98015-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -23.91418 + (((tickAnim - 125) / 15) * (0-(-23.91418)));
            yy = -4.28918 + (((tickAnim - 125) / 15) * (0-(-4.28918)));
            zz = 12.98015 + (((tickAnim - 125) / 15) * (0-(12.98015)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(xx), upperarm3.rotateAngleY + (float) Math.toRadians(yy), upperarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 109) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 109) / 16) * (-2.425-(0)));
            zz = 0 + (((tickAnim - 109) / 16) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = -2.425 + (((tickAnim - 125) / 15) * (0-(-2.425)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperarm3.rotationPointX = this.upperarm3.rotationPointX + (float)(xx);
        this.upperarm3.rotationPointY = this.upperarm3.rotationPointY - (float)(yy);
        this.upperarm3.rotationPointZ = this.upperarm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (-15.97996-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (5.64722-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (-8.39735-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = -15.97996 + (((tickAnim - 14) / 16) * (-34.09646-(-15.97996)));
            yy = 5.64722 + (((tickAnim - 14) / 16) * (10.06063-(5.64722)));
            zz = -8.39735 + (((tickAnim - 14) / 16) * (-1.96969-(-8.39735)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -34.09646 + (((tickAnim - 30) / 79) * (-34.09646-(-34.09646)));
            yy = 10.06063 + (((tickAnim - 30) / 79) * (10.06063-(10.06063)));
            zz = -1.96969 + (((tickAnim - 30) / 79) * (-1.96969-(-1.96969)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = -34.09646 + (((tickAnim - 109) / 16) * (1.56036-(-34.09646)));
            yy = 10.06063 + (((tickAnim - 109) / 16) * (14.82404-(10.06063)));
            zz = -1.96969 + (((tickAnim - 109) / 16) * (33.57285-(-1.96969)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 1.56036 + (((tickAnim - 125) / 15) * (0-(1.56036)));
            yy = 14.82404 + (((tickAnim - 125) / 15) * (0-(14.82404)));
            zz = 33.57285 + (((tickAnim - 125) / 15) * (0-(33.57285)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 14) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 14) / 16) * (0-(0)));
            yy = -0.375 + (((tickAnim - 14) / 16) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 14) / 16) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 109) / 16) * (0.925-(0)));
            yy = 0 + (((tickAnim - 109) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 16) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0.925 + (((tickAnim - 125) / 15) * (0-(0.925)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arms3.rotationPointX = this.arms3.rotationPointX + (float)(xx);
        this.arms3.rotationPointY = this.arms3.rotationPointY - (float)(yy);
        this.arms3.rotationPointZ = this.arms3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-49.1587-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-3.95905-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (1.34258-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -49.1587 + (((tickAnim - 11) / 2) * (-52.38587-(-49.1587)));
            yy = -3.95905 + (((tickAnim - 11) / 2) * (-4.94881-(-3.95905)));
            zz = 1.34258 + (((tickAnim - 11) / 2) * (1.67823-(1.34258)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -52.38587 + (((tickAnim - 13) / 17) * (-18.86821-(-52.38587)));
            yy = -4.94881 + (((tickAnim - 13) / 17) * (-11.13482-(-4.94881)));
            zz = 1.67823 + (((tickAnim - 13) / 17) * (3.77601-(1.67823)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -18.86821 + (((tickAnim - 30) / 79) * (-18.86821-(-18.86821)));
            yy = -11.13482 + (((tickAnim - 30) / 79) * (-11.13482-(-11.13482)));
            zz = 3.77601 + (((tickAnim - 30) / 79) * (3.77601-(3.77601)));
        }
        else if (tickAnim >= 109 && tickAnim < 120) {
            xx = -18.86821 + (((tickAnim - 109) / 11) * (5.87097-(-18.86821)));
            yy = -11.13482 + (((tickAnim - 109) / 11) * (34.7185-(-11.13482)));
            zz = 3.77601 + (((tickAnim - 109) / 11) * (28.40477-(3.77601)));
        }
        else if (tickAnim >= 120 && tickAnim < 125) {
            xx = 5.87097 + (((tickAnim - 120) / 5) * (-0.53997-(5.87097)));
            yy = 34.7185 + (((tickAnim - 120) / 5) * (32.9615-(34.7185)));
            zz = 28.40477 + (((tickAnim - 120) / 5) * (2.24823-(28.40477)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = -0.53997 + (((tickAnim - 125) / 15) * (0-(-0.53997)));
            yy = 32.9615 + (((tickAnim - 125) / 15) * (0-(32.9615)));
            zz = 2.24823 + (((tickAnim - 125) / 15) * (0-(2.24823)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(xx), hands3.rotateAngleY + (float) Math.toRadians(yy), hands3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0.975-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0.4 + (((tickAnim - 13) / 17) * (0-(0.4)));
            zz = 0.975 + (((tickAnim - 13) / 17) * (0-(0.975)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 79) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 79) * (0-(0)));
        }
        else if (tickAnim >= 109 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 109) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 109) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 11) * (0.6-(0)));
        }
        else if (tickAnim >= 120 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 120) / 20) * (0-(0)));
            zz = 0.6 + (((tickAnim - 120) / 20) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hands3.rotationPointX = this.hands3.rotationPointX + (float)(xx);
        this.hands3.rotationPointY = this.hands3.rotationPointY - (float)(yy);
        this.hands3.rotationPointZ = this.hands3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-2.39319-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (4.19991-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (6.97384-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 109) {
            xx = -2.39319 + (((tickAnim - 30) / 79) * (-2.39319-(-2.39319)));
            yy = 4.19991 + (((tickAnim - 30) / 79) * (4.19991-(4.19991)));
            zz = 6.97384 + (((tickAnim - 30) / 79) * (6.97384-(6.97384)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thumbclaw3, thumbclaw3.rotateAngleX + (float) Math.toRadians(xx), thumbclaw3.rotateAngleY + (float) Math.toRadians(yy), thumbclaw3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 42) {
            xx = -4.25 + (((tickAnim - 17) / 25) * (-7.33151-(-4.25)));
            yy = 0 + (((tickAnim - 17) / 25) * (1.38784-(0)));
            zz = 0 + (((tickAnim - 17) / 25) * (0.31477-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 80) {
            xx = -7.33151 + (((tickAnim - 42) / 38) * (-2.67315-(-7.33151)));
            yy = 1.38784 + (((tickAnim - 42) / 38) * (3.51586-(1.38784)));
            zz = 0.31477 + (((tickAnim - 42) / 38) * (0.79742-(0.31477)));
        }
        else if (tickAnim >= 80 && tickAnim < 109) {
            xx = -2.67315 + (((tickAnim - 80) / 29) * (-11.5-(-2.67315)));
            yy = 3.51586 + (((tickAnim - 80) / 29) * (0-(3.51586)));
            zz = 0.79742 + (((tickAnim - 80) / 29) * (0-(0.79742)));
        }
        else if (tickAnim >= 109 && tickAnim < 128) {
            xx = -11.5 + (((tickAnim - 109) / 19) * (-9.25-(-11.5)));
            yy = 0 + (((tickAnim - 109) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 19) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = -9.25 + (((tickAnim - 128) / 12) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 42) {
            xx = 10.25 + (((tickAnim - 17) / 25) * (5.63926-(10.25)));
            yy = 0 + (((tickAnim - 17) / 25) * (3.35617-(0)));
            zz = 0 + (((tickAnim - 17) / 25) * (1.61475-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 80) {
            xx = 5.63926 + (((tickAnim - 42) / 38) * (-12.4334-(5.63926)));
            yy = 3.35617 + (((tickAnim - 42) / 38) * (6.81318-(3.35617)));
            zz = 1.61475 + (((tickAnim - 42) / 38) * (3.189-(1.61475)));
        }
        else if (tickAnim >= 80 && tickAnim < 109) {
            xx = -12.4334 + (((tickAnim - 80) / 29) * (-5.70305-(-12.4334)));
            yy = 6.81318 + (((tickAnim - 80) / 29) * (8.72852-(6.81318)));
            zz = 3.189 + (((tickAnim - 80) / 29) * (0.61514-(3.189)));
        }
        else if (tickAnim >= 109 && tickAnim < 127) {
            xx = -5.70305 + (((tickAnim - 109) / 18) * (9.75-(-5.70305)));
            yy = 8.72852 + (((tickAnim - 109) / 18) * (0-(8.72852)));
            zz = 0.61514 + (((tickAnim - 109) / 18) * (0-(0.61514)));
        }
        else if (tickAnim >= 127 && tickAnim < 140) {
            xx = 9.75 + (((tickAnim - 127) / 13) * (0-(9.75)));
            yy = 0 + (((tickAnim - 127) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 127) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 30 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 30) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 22) * (0-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 52) / 28) * (0.07294-(0)));
            yy = 0 + (((tickAnim - 52) / 28) * (5.94033-(0)));
            zz = 0 + (((tickAnim - 52) / 28) * (0.68697-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 109) {
            xx = 0.07294 + (((tickAnim - 80) / 29) * (10.25-(0.07294)));
            yy = 5.94033 + (((tickAnim - 80) / 29) * (0-(5.94033)));
            zz = 0.68697 + (((tickAnim - 80) / 29) * (0-(0.68697)));
        }
        else if (tickAnim >= 109 && tickAnim < 140) {
            xx = 10.25 + (((tickAnim - 109) / 31) * (0-(10.25)));
            yy = 0 + (((tickAnim - 109) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 109) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 60 && tickAnim < 70) {
            xx = 0 + (((tickAnim - 60) / 10) * (1.75-(0)));
            yy = 0 + (((tickAnim - 60) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 10) * (0-(0)));
        }
        else if (tickAnim >= 70 && tickAnim < 80) {
            xx = 1.75 + (((tickAnim - 70) / 10) * (0-(1.75)));
            yy = 0 + (((tickAnim - 70) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 70) / 10) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 87) {
            xx = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 7) * (0-(0)));
        }
        else if (tickAnim >= 87 && tickAnim < 98) {
            xx = 0 + (((tickAnim - 87) / 11) * (3.75-(0)));
            yy = 0 + (((tickAnim - 87) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 87) / 11) * (0-(0)));
        }
        else if (tickAnim >= 98 && tickAnim < 109) {
            xx = 3.75 + (((tickAnim - 98) / 11) * (0-(3.75)));
            yy = 0 + (((tickAnim - 98) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 98) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -6.75 + (((tickAnim - 8) / 7) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (-0.25-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.25 + (((tickAnim - 10) / 5) * (0-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 1.75 + (((tickAnim - 3) / 5) * (-0.75-(1.75)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.75 + (((tickAnim - 8) / 7) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 4 + (((tickAnim - 3) / 5) * (-1.75-(4)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -1.75 + (((tickAnim - 8) / 7) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (-8.75-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.75 + (((tickAnim - 8) / 7) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 8) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.5 + (((tickAnim - 8) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0.9789-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (3.49315-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0.21895-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0.9789 + (((tickAnim - 6) / 4) * (0-(0.9789)));
            yy = 3.49315 + (((tickAnim - 6) / 4) * (0-(3.49315)));
            zz = 0.21895 + (((tickAnim - 6) / 4) * (0-(0.21895)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.76796-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-7.21693-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.0465-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.76796 + (((tickAnim - 5) / 5) * (0-(5.76796)));
            yy = -7.21693 + (((tickAnim - 5) / 5) * (5.75-(-7.21693)));
            zz = -2.0465 + (((tickAnim - 5) / 5) * (0-(-2.0465)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 5.75 + (((tickAnim - 10) / 5) * (0-(5.75)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -8 + (((tickAnim - 5) / 5) * (6-(-8)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 6 + (((tickAnim - 10) / 5) * (0-(6)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -9.25 + (((tickAnim - 5) / 5) * (12.36217-(-9.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (-10.906-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (1.44375-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 12.36217 + (((tickAnim - 10) / 5) * (0-(12.36217)));
            yy = -10.906 + (((tickAnim - 10) / 5) * (0-(-10.906)));
            zz = 1.44375 + (((tickAnim - 10) / 5) * (0-(1.44375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 20.75 + (((tickAnim - 5) / 5) * (21.5-(20.75)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 21.5 + (((tickAnim - 10) / 5) * (0-(21.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.875-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-3.5-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 1.875 + (((tickAnim - 5) / 5) * (-23.25-(1.875)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -3.5 + (((tickAnim - 5) / 5) * (-7-(-3.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -23.25 + (((tickAnim - 10) / 5) * (0-(-23.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -7 + (((tickAnim - 10) / 5) * (0-(-7)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 16.75 + (((tickAnim - 8) / 1) * (0-(16.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-67.83672-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-20.14672-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (-14.97115-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = -67.83672 + (((tickAnim - 6) / 3) * (-50.56493-(-67.83672)));
            yy = -20.14672 + (((tickAnim - 6) / 3) * (1.07602-(-20.14672)));
            zz = -14.97115 + (((tickAnim - 6) / 3) * (-3.84029-(-14.97115)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -50.56493 + (((tickAnim - 9) / 6) * (0-(-50.56493)));
            yy = 1.07602 + (((tickAnim - 9) / 6) * (0-(1.07602)));
            zz = -3.84029 + (((tickAnim - 9) / 6) * (0-(-3.84029)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-25.75-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 14.25 + (((tickAnim - 6) / 3) * (-10.97462-(14.25)));
            yy = -25.75 + (((tickAnim - 6) / 3) * (-2.09278-(-25.75)));
            zz = 0 + (((tickAnim - 6) / 3) * (-1.20006-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = -10.97462 + (((tickAnim - 9) / 6) * (0-(-10.97462)));
            yy = -2.09278 + (((tickAnim - 9) / 6) * (0-(-2.09278)));
            zz = -1.20006 + (((tickAnim - 9) / 6) * (0-(-1.20006)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-20.25-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 6) / 3) * (0-(0)));
            yy = -20.25 + (((tickAnim - 6) / 3) * (27.25-(-20.25)));
            zz = 0 + (((tickAnim - 6) / 3) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 27.25 + (((tickAnim - 9) / 6) * (0-(27.25)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-34-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -34 + (((tickAnim - 6) / 4) * (0-(-34)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thumbclaw2, thumbclaw2.rotateAngleX + (float) Math.toRadians(xx), thumbclaw2.rotateAngleY + (float) Math.toRadians(yy), thumbclaw2.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = -12 + (((tickAnim - 19) / 62) * (-12-(-12)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = -12 + (((tickAnim - 81) / 19) * (0-(-12)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (7.175-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 7.175 + (((tickAnim - 19) / 62) * (7.175-(7.175)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 7.175 + (((tickAnim - 81) / 19) * (0-(7.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-9-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = -9 + (((tickAnim - 19) / 62) * (-9-(-9)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = -9 + (((tickAnim - 81) / 19) * (0-(-9)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = -5.5 + (((tickAnim - 19) / 62) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = -5.5 + (((tickAnim - 81) / 19) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.61764-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-2.73813-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0.41462-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 43) {
            xx = -0.61764 + (((tickAnim - 19) / 24) * (-0.79655-(-0.61764)));
            yy = -2.73813 + (((tickAnim - 19) / 24) * (-5.93261-(-2.73813)));
            zz = 0.41462 + (((tickAnim - 19) / 24) * (0.89835-(0.41462)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -0.79655 + (((tickAnim - 43) / 17) * (-0.79655-(-0.79655)));
            yy = -5.93261 + (((tickAnim - 43) / 17) * (-5.93261-(-5.93261)));
            zz = 0.89835 + (((tickAnim - 43) / 17) * (0.89835-(0.89835)));
        }
        else if (tickAnim >= 60 && tickAnim < 81) {
            xx = -0.79655 + (((tickAnim - 60) / 21) * (-0.75-(-0.79655)));
            yy = -5.93261 + (((tickAnim - 60) / 21) * (0-(-5.93261)));
            zz = 0.89835 + (((tickAnim - 60) / 21) * (0-(0.89835)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = -0.75 + (((tickAnim - 81) / 19) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (17.5177-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-4.68425-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-4.05724-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 43) {
            xx = 17.5177 + (((tickAnim - 19) / 24) * (17.91334-(17.5177)));
            yy = -4.68425 + (((tickAnim - 19) / 24) * (-10.14922-(-4.68425)));
            zz = -4.05724 + (((tickAnim - 19) / 24) * (-8.7907-(-4.05724)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 17.91334 + (((tickAnim - 43) / 17) * (17.91334-(17.91334)));
            yy = -10.14922 + (((tickAnim - 43) / 17) * (-10.14922-(-10.14922)));
            zz = -8.7907 + (((tickAnim - 43) / 17) * (-8.7907-(-8.7907)));
        }
        else if (tickAnim >= 60 && tickAnim < 77) {
            xx = 17.91334 + (((tickAnim - 60) / 17) * (17.75-(17.91334)));
            yy = -10.14922 + (((tickAnim - 60) / 17) * (0-(-10.14922)));
            zz = -8.7907 + (((tickAnim - 60) / 17) * (0-(-8.7907)));
        }
        else if (tickAnim >= 77 && tickAnim < 81) {
            xx = 17.75 + (((tickAnim - 77) / 4) * (16.5-(17.75)));
            yy = 0 + (((tickAnim - 77) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 77) / 4) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 16.5 + (((tickAnim - 81) / 2) * (11.17-(16.5)));
            yy = 0 + (((tickAnim - 81) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 2) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 84) {
            xx = 11.17 + (((tickAnim - 83) / 1) * (8.68-(11.17)));
            yy = 0 + (((tickAnim - 83) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 1) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 88) {
            xx = 8.68 + (((tickAnim - 84) / 4) * (5.78-(8.68)));
            yy = 0 + (((tickAnim - 84) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 4) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 5.78 + (((tickAnim - 88) / 2) * (4.98-(5.78)));
            yy = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 4.98 + (((tickAnim - 90) / 3) * (1.74-(4.98)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 1.74 + (((tickAnim - 93) / 7) * (0-(1.74)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (4.46-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 4.46 + (((tickAnim - 13) / 6) * (16.35266-(4.46)));
            yy = 0 + (((tickAnim - 13) / 6) * (-3.63083-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (-1.58042-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 43) {
            xx = 16.35266 + (((tickAnim - 19) / 24) * (16.35206-(16.35266)));
            yy = -3.63083 + (((tickAnim - 19) / 24) * (-14.92675-(-3.63083)));
            zz = -1.58042 + (((tickAnim - 19) / 24) * (-6.49729-(-1.58042)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 16.35206 + (((tickAnim - 43) / 17) * (16.35206-(16.35206)));
            yy = -14.92675 + (((tickAnim - 43) / 17) * (-14.92675-(-14.92675)));
            zz = -6.49729 + (((tickAnim - 43) / 17) * (-6.49729-(-6.49729)));
        }
        else if (tickAnim >= 60 && tickAnim < 77) {
            xx = 16.35206 + (((tickAnim - 60) / 17) * (18.36123-(16.35206)));
            yy = -14.92675 + (((tickAnim - 60) / 17) * (-6.63224-(-14.92675)));
            zz = -6.49729 + (((tickAnim - 60) / 17) * (-2.73735-(-6.49729)));
        }
        else if (tickAnim >= 77 && tickAnim < 81) {
            xx = 18.36123 + (((tickAnim - 77) / 4) * (20.5-(18.36123)));
            yy = -6.63224 + (((tickAnim - 77) / 4) * (0-(-6.63224)));
            zz = -2.73735 + (((tickAnim - 77) / 4) * (0-(-2.73735)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = 20.5 + (((tickAnim - 81) / 2) * (18.35-(20.5)));
            yy = 0 + (((tickAnim - 81) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 2) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 86) {
            xx = 18.35 + (((tickAnim - 83) / 3) * (4.41-(18.35)));
            yy = 0 + (((tickAnim - 83) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 3) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 4.41 + (((tickAnim - 86) / 2) * (0.05-(4.41)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 0.05 + (((tickAnim - 88) / 2) * (-5.89-(0.05)));
            yy = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = -5.89 + (((tickAnim - 90) / 3) * (-4.29-(-5.89)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = -4.29 + (((tickAnim - 93) / 7) * (0-(-4.29)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-1.03-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -1.03 + (((tickAnim - 13) / 6) * (-1.63627-(-1.03)));
            yy = 0 + (((tickAnim - 13) / 6) * (3.64564-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0.03558-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 32) {
            xx = -1.63627 + (((tickAnim - 19) / 13) * (-3.85713-(-1.63627)));
            yy = 3.64564 + (((tickAnim - 19) / 13) * (9.31664-(3.64564)));
            zz = 0.03558 + (((tickAnim - 19) / 13) * (0.09092-(0.03558)));
        }
        else if (tickAnim >= 32 && tickAnim < 36) {
            xx = -3.85713 + (((tickAnim - 32) / 4) * (-3.95443-(-3.85713)));
            yy = 9.31664 + (((tickAnim - 32) / 4) * (4.25446-(9.31664)));
            zz = 0.09092 + (((tickAnim - 32) / 4) * (0.51797-(0.09092)));
        }
        else if (tickAnim >= 36 && tickAnim < 39) {
            xx = -3.95443 + (((tickAnim - 36) / 3) * (-4.07528-(-3.95443)));
            yy = 4.25446 + (((tickAnim - 36) / 3) * (-1.91306-(4.25446)));
            zz = 0.51797 + (((tickAnim - 36) / 3) * (0.99023-(0.51797)));
        }
        else if (tickAnim >= 39 && tickAnim < 43) {
            xx = -4.07528 + (((tickAnim - 39) / 4) * (-4.13717-(-4.07528)));
            yy = -1.91306 + (((tickAnim - 39) / 4) * (-13.95597-(-1.91306)));
            zz = 0.99023 + (((tickAnim - 39) / 4) * (1.12068-(0.99023)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = -4.13717 + (((tickAnim - 43) / 17) * (-4.13717-(-4.13717)));
            yy = -13.95597 + (((tickAnim - 43) / 17) * (-13.95597-(-13.95597)));
            zz = 1.12068 + (((tickAnim - 43) / 17) * (1.12068-(1.12068)));
        }
        else if (tickAnim >= 60 && tickAnim < 73) {
            xx = -4.13717 + (((tickAnim - 60) / 13) * (-5.22441-(-4.13717)));
            yy = -13.95597 + (((tickAnim - 60) / 13) * (-11.76686-(-13.95597)));
            zz = 1.12068 + (((tickAnim - 60) / 13) * (0.70904-(1.12068)));
        }
        else if (tickAnim >= 73 && tickAnim < 77) {
            xx = -5.22441 + (((tickAnim - 73) / 4) * (-4.22289-(-5.22441)));
            yy = -11.76686 + (((tickAnim - 73) / 4) * (-4.76125-(-11.76686)));
            zz = 0.70904 + (((tickAnim - 73) / 4) * (0.21829-(0.70904)));
        }
        else if (tickAnim >= 77 && tickAnim < 81) {
            xx = -4.22289 + (((tickAnim - 77) / 4) * (-5-(-4.22289)));
            yy = -4.76125 + (((tickAnim - 77) / 4) * (0-(-4.76125)));
            zz = 0.21829 + (((tickAnim - 77) / 4) * (0-(0.21829)));
        }
        else if (tickAnim >= 81 && tickAnim < 83) {
            xx = -5 + (((tickAnim - 81) / 2) * (2.31-(-5)));
            yy = 0 + (((tickAnim - 81) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 2) * (0-(0)));
        }
        else if (tickAnim >= 83 && tickAnim < 84) {
            xx = 2.31 + (((tickAnim - 83) / 1) * (10.33-(2.31)));
            yy = 0 + (((tickAnim - 83) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 83) / 1) * (0-(0)));
        }
        else if (tickAnim >= 84 && tickAnim < 86) {
            xx = 10.33 + (((tickAnim - 84) / 2) * (12.6-(10.33)));
            yy = 0 + (((tickAnim - 84) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 84) / 2) * (0-(0)));
        }
        else if (tickAnim >= 86 && tickAnim < 88) {
            xx = 12.6 + (((tickAnim - 86) / 2) * (11.21-(12.6)));
            yy = 0 + (((tickAnim - 86) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 86) / 2) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 90) {
            xx = 11.21 + (((tickAnim - 88) / 2) * (1.9-(11.21)));
            yy = 0 + (((tickAnim - 88) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 2) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 93) {
            xx = 1.9 + (((tickAnim - 90) / 3) * (-6.91-(1.9)));
            yy = 0 + (((tickAnim - 90) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 3) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = -6.91 + (((tickAnim - 93) / 7) * (0-(-6.91)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = -3.5 + (((tickAnim - 19) / 62) * (-3.5-(-3.5)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = -3.5 + (((tickAnim - 81) / 19) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (-1.7-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (-0.825-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            yy = -1.7 + (((tickAnim - 19) / 62) * (-1.7-(-1.7)));
            zz = -0.825 + (((tickAnim - 19) / 62) * (-0.825-(-0.825)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            yy = -1.7 + (((tickAnim - 81) / 19) * (0-(-1.7)));
            zz = -0.825 + (((tickAnim - 81) / 19) * (0-(-0.825)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 0.75 + (((tickAnim - 19) / 62) * (0.75-(0.75)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 0.75 + (((tickAnim - 81) / 19) * (0-(0.75)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 4 + (((tickAnim - 19) / 62) * (4-(4)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 4 + (((tickAnim - 81) / 19) * (0-(4)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (11.5-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 11.5 + (((tickAnim - 19) / 62) * (11.5-(11.5)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 11.5 + (((tickAnim - 81) / 19) * (0-(11.5)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            yy = 0.45 + (((tickAnim - 19) / 62) * (0.45-(0.45)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            yy = 0.45 + (((tickAnim - 81) / 19) * (0-(0.45)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes3.rotationPointX = this.toes3.rotationPointX + (float)(xx);
        this.toes3.rotationPointY = this.toes3.rotationPointY - (float)(yy);
        this.toes3.rotationPointZ = this.toes3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (29.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 29.75 + (((tickAnim - 19) / 62) * (29.75-(29.75)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 29.75 + (((tickAnim - 81) / 10) * (3.73-(29.75)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = 3.73 + (((tickAnim - 91) / 9) * (0-(3.73)));
            yy = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (2.25-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            yy = 2.25 + (((tickAnim - 10) / 9) * (0-(2.25)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (2.25-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            yy = 2.25 + (((tickAnim - 91) / 9) * (0-(2.25)));
            zz = 0 + (((tickAnim - 91) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 26.25 + (((tickAnim - 10) / 9) * (0-(26.25)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (32.5-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = 32.5 + (((tickAnim - 91) / 9) * (0-(32.5)));
            yy = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = -28.25 + (((tickAnim - 10) / 9) * (-15.75-(-28.25)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = -15.75 + (((tickAnim - 19) / 62) * (-15.75-(-15.75)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = -15.75 + (((tickAnim - 81) / 10) * (-46.25-(-15.75)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = -46.25 + (((tickAnim - 91) / 9) * (0-(-46.25)));
            yy = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (33.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 19) {
            xx = 33.75 + (((tickAnim - 10) / 9) * (0-(33.75)));
            yy = 0 + (((tickAnim - 10) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 9) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 81) / 10) * (33.75-(0)));
            yy = 0 + (((tickAnim - 81) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 10) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 100) {
            xx = 33.75 + (((tickAnim - 91) / 9) * (0-(33.75)));
            yy = 0 + (((tickAnim - 91) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = -0.75 + (((tickAnim - 19) / 62) * (-0.75-(-0.75)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = -0.75 + (((tickAnim - 81) / 19) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 81) {
            xx = 9 + (((tickAnim - 19) / 62) * (9-(9)));
            yy = 0 + (((tickAnim - 19) / 62) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 62) * (0-(0)));
        }
        else if (tickAnim >= 81 && tickAnim < 100) {
            xx = 9 + (((tickAnim - 81) / 19) * (0-(9)));
            yy = 0 + (((tickAnim - 81) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 81) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-18.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = -18.25 + (((tickAnim - 13) / 14) * (-7.87705-(-18.25)));
            yy = 0 + (((tickAnim - 13) / 14) * (-13.83495-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (5.16503-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -7.87705 + (((tickAnim - 27) / 11) * (-8.01502-(-7.87705)));
            yy = -13.83495 + (((tickAnim - 27) / 11) * (-15.23742-(-13.83495)));
            zz = 5.16503 + (((tickAnim - 27) / 11) * (5.71468-(5.16503)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = -8.01502 + (((tickAnim - 38) / 15) * (-18.25-(-8.01502)));
            yy = -15.23742 + (((tickAnim - 38) / 15) * (0-(-15.23742)));
            zz = 5.71468 + (((tickAnim - 38) / 15) * (0-(5.71468)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = -18.25 + (((tickAnim - 53) / 5) * (-14-(-18.25)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = -14 + (((tickAnim - 58) / 6) * (-16.75-(-14)));
            yy = 0 + (((tickAnim - 58) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 6) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = -16.75 + (((tickAnim - 64) / 5) * (-14-(-16.75)));
            yy = 0 + (((tickAnim - 64) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 5) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = -14 + (((tickAnim - 69) / 5) * (-15.98941-(-14)));
            yy = 0 + (((tickAnim - 69) / 5) * (2.40982-(0)));
            zz = 0 + (((tickAnim - 69) / 5) * (-1.32525-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = -15.98941 + (((tickAnim - 74) / 6) * (-18.25-(-15.98941)));
            yy = 2.40982 + (((tickAnim - 74) / 6) * (0-(2.40982)));
            zz = -1.32525 + (((tickAnim - 74) / 6) * (0-(-1.32525)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -18.25 + (((tickAnim - 80) / 20) * (0-(-18.25)));
            yy = 0 + (((tickAnim - 80) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 13 + (((tickAnim - 13) / 14) * (-0.60083-(13)));
            yy = 0 + (((tickAnim - 13) / 14) * (-16.50228-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (-3.85852-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = -0.60083 + (((tickAnim - 27) / 11) * (-5.701-(-0.60083)));
            yy = -16.50228 + (((tickAnim - 27) / 11) * (-18.22928-(-16.50228)));
            zz = -3.85852 + (((tickAnim - 27) / 11) * (-3.51337-(-3.85852)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = -5.701 + (((tickAnim - 38) / 15) * (13-(-5.701)));
            yy = -18.22928 + (((tickAnim - 38) / 15) * (0-(-18.22928)));
            zz = -3.51337 + (((tickAnim - 38) / 15) * (0-(-3.51337)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 13 + (((tickAnim - 53) / 5) * (6.5-(13)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = 6.5 + (((tickAnim - 58) / 6) * (7.5-(6.5)));
            yy = 0 + (((tickAnim - 58) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 6) * (0-(0)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 7.5 + (((tickAnim - 64) / 5) * (6.5-(7.5)));
            yy = 0 + (((tickAnim - 64) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 64) / 5) * (0-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 6.5 + (((tickAnim - 69) / 5) * (9.49964-(6.5)));
            yy = 0 + (((tickAnim - 69) / 5) * (-0.74799-(0)));
            zz = 0 + (((tickAnim - 69) / 5) * (0.05493-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 9.49964 + (((tickAnim - 74) / 6) * (13-(9.49964)));
            yy = -0.74799 + (((tickAnim - 74) / 6) * (0-(-0.74799)));
            zz = 0.05493 + (((tickAnim - 74) / 6) * (0-(0.05493)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 13 + (((tickAnim - 80) / 8) * (7.04172-(13)));
            yy = 0 + (((tickAnim - 80) / 8) * (6.95325-(0)));
            zz = 0 + (((tickAnim - 80) / 8) * (-0.80964-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 7.04172 + (((tickAnim - 88) / 5) * (2.04172-(7.04172)));
            yy = 6.95325 + (((tickAnim - 88) / 5) * (6.95325-(6.95325)));
            zz = -0.80964 + (((tickAnim - 88) / 5) * (-0.80964-(-0.80964)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 2.04172 + (((tickAnim - 93) / 7) * (0-(2.04172)));
            yy = 6.95325 + (((tickAnim - 93) / 7) * (0-(6.95325)));
            zz = -0.80964 + (((tickAnim - 93) / 7) * (0-(-0.80964)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 17.25 + (((tickAnim - 13) / 14) * (3.76071-(17.25)));
            yy = 0 + (((tickAnim - 13) / 14) * (-15.91896-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (-12.14739-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 3.76071 + (((tickAnim - 27) / 11) * (10.51071-(3.76071)));
            yy = -15.91896 + (((tickAnim - 27) / 11) * (-15.91896-(-15.91896)));
            zz = -12.14739 + (((tickAnim - 27) / 11) * (-12.14739-(-12.14739)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 10.51071 + (((tickAnim - 38) / 15) * (17.25-(10.51071)));
            yy = -15.91896 + (((tickAnim - 38) / 15) * (0-(-15.91896)));
            zz = -12.14739 + (((tickAnim - 38) / 15) * (0-(-12.14739)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 17.25 + (((tickAnim - 53) / 5) * (17.00417-(17.25)));
            yy = 0 + (((tickAnim - 53) / 5) * (4.40836-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (-6.38038-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 64) {
            xx = 17.00417 + (((tickAnim - 58) / 6) * (26-(17.00417)));
            yy = 4.40836 + (((tickAnim - 58) / 6) * (0-(4.40836)));
            zz = -6.38038 + (((tickAnim - 58) / 6) * (0-(-6.38038)));
        }
        else if (tickAnim >= 64 && tickAnim < 69) {
            xx = 26 + (((tickAnim - 64) / 5) * (17.00417-(26)));
            yy = 0 + (((tickAnim - 64) / 5) * (4.40836-(0)));
            zz = 0 + (((tickAnim - 64) / 5) * (-6.38038-(0)));
        }
        else if (tickAnim >= 69 && tickAnim < 74) {
            xx = 17.00417 + (((tickAnim - 69) / 5) * (17.08894-(17.00417)));
            yy = 4.40836 + (((tickAnim - 69) / 5) * (0.93327-(4.40836)));
            zz = -6.38038 + (((tickAnim - 69) / 5) * (-4.42979-(-6.38038)));
        }
        else if (tickAnim >= 74 && tickAnim < 80) {
            xx = 17.08894 + (((tickAnim - 74) / 6) * (17.25-(17.08894)));
            yy = 0.93327 + (((tickAnim - 74) / 6) * (0-(0.93327)));
            zz = -4.42979 + (((tickAnim - 74) / 6) * (0-(-4.42979)));
        }
        else if (tickAnim >= 80 && tickAnim < 88) {
            xx = 17.25 + (((tickAnim - 80) / 8) * (9.71291-(17.25)));
            yy = 0 + (((tickAnim - 80) / 8) * (8.24106-(0)));
            zz = 0 + (((tickAnim - 80) / 8) * (4.21546-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 93) {
            xx = 9.71291 + (((tickAnim - 88) / 5) * (10.32063-(9.71291)));
            yy = 8.24106 + (((tickAnim - 88) / 5) * (9.57441-(8.24106)));
            zz = 4.21546 + (((tickAnim - 88) / 5) * (4.91104-(4.21546)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 10.32063 + (((tickAnim - 93) / 7) * (0-(10.32063)));
            yy = 9.57441 + (((tickAnim - 93) / 7) * (0-(9.57441)));
            zz = 4.91104 + (((tickAnim - 93) / 7) * (0-(4.91104)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 14) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 11) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 15) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 27) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 13) * (8.5-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            yy = 8.5 + (((tickAnim - 93) / 7) * (0-(8.5)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 16) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 22) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 38) / 17) * (-95.41042-(0)));
            yy = 0 + (((tickAnim - 38) / 17) * (-28.4573-(0)));
            zz = 0 + (((tickAnim - 38) / 17) * (-11.19845-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = -95.41042 + (((tickAnim - 55) / 4) * (-96.91042-(-95.41042)));
            yy = -28.4573 + (((tickAnim - 55) / 4) * (-28.4573-(-28.4573)));
            zz = -11.19845 + (((tickAnim - 55) / 4) * (-11.19845-(-11.19845)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = -96.91042 + (((tickAnim - 59) / 4) * (-95.41042-(-96.91042)));
            yy = -28.4573 + (((tickAnim - 59) / 4) * (-28.4573-(-28.4573)));
            zz = -11.19845 + (((tickAnim - 59) / 4) * (-11.19845-(-11.19845)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = -95.41042 + (((tickAnim - 63) / 5) * (-98.16042-(-95.41042)));
            yy = -28.4573 + (((tickAnim - 63) / 5) * (-28.4573-(-28.4573)));
            zz = -11.19845 + (((tickAnim - 63) / 5) * (-11.19845-(-11.19845)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = -98.16042 + (((tickAnim - 68) / 4) * (-96.91042-(-98.16042)));
            yy = -28.4573 + (((tickAnim - 68) / 4) * (-28.4573-(-28.4573)));
            zz = -11.19845 + (((tickAnim - 68) / 4) * (-11.19845-(-11.19845)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = -96.91042 + (((tickAnim - 72) / 4) * (-98.16042-(-96.91042)));
            yy = -28.4573 + (((tickAnim - 72) / 4) * (-28.4573-(-28.4573)));
            zz = -11.19845 + (((tickAnim - 72) / 4) * (-11.19845-(-11.19845)));
        }
        else if (tickAnim >= 76 && tickAnim < 80) {
            xx = -98.16042 + (((tickAnim - 76) / 4) * (-95.41042-(-98.16042)));
            yy = -28.4573 + (((tickAnim - 76) / 4) * (-28.4573-(-28.4573)));
            zz = -11.19845 + (((tickAnim - 76) / 4) * (-11.19845-(-11.19845)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = -95.41042 + (((tickAnim - 80) / 20) * (0-(-95.41042)));
            yy = -28.4573 + (((tickAnim - 80) / 20) * (0-(-28.4573)));
            zz = -11.19845 + (((tickAnim - 80) / 20) * (0-(-11.19845)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 18) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 24) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 42) / 13) * (17.68297-(0)));
            yy = 0 + (((tickAnim - 42) / 13) * (11.80618-(0)));
            zz = 0 + (((tickAnim - 42) / 13) * (10.03439-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 59) {
            xx = 17.68297 + (((tickAnim - 55) / 4) * (19.43297-(17.68297)));
            yy = 11.80618 + (((tickAnim - 55) / 4) * (11.80618-(11.80618)));
            zz = 10.03439 + (((tickAnim - 55) / 4) * (10.03439-(10.03439)));
        }
        else if (tickAnim >= 59 && tickAnim < 63) {
            xx = 19.43297 + (((tickAnim - 59) / 4) * (17.68297-(19.43297)));
            yy = 11.80618 + (((tickAnim - 59) / 4) * (11.80618-(11.80618)));
            zz = 10.03439 + (((tickAnim - 59) / 4) * (10.03439-(10.03439)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 17.68297 + (((tickAnim - 63) / 5) * (21.18297-(17.68297)));
            yy = 11.80618 + (((tickAnim - 63) / 5) * (11.80618-(11.80618)));
            zz = 10.03439 + (((tickAnim - 63) / 5) * (10.03439-(10.03439)));
        }
        else if (tickAnim >= 68 && tickAnim < 72) {
            xx = 21.18297 + (((tickAnim - 68) / 4) * (19.43297-(21.18297)));
            yy = 11.80618 + (((tickAnim - 68) / 4) * (11.80618-(11.80618)));
            zz = 10.03439 + (((tickAnim - 68) / 4) * (10.03439-(10.03439)));
        }
        else if (tickAnim >= 72 && tickAnim < 76) {
            xx = 19.43297 + (((tickAnim - 72) / 4) * (21.18297-(19.43297)));
            yy = 11.80618 + (((tickAnim - 72) / 4) * (11.80618-(11.80618)));
            zz = 10.03439 + (((tickAnim - 72) / 4) * (10.03439-(10.03439)));
        }
        else if (tickAnim >= 76 && tickAnim < 80) {
            xx = 21.18297 + (((tickAnim - 76) / 4) * (17.68297-(21.18297)));
            yy = 11.80618 + (((tickAnim - 76) / 4) * (11.80618-(11.80618)));
            zz = 10.03439 + (((tickAnim - 76) / 4) * (10.03439-(10.03439)));
        }
        else if (tickAnim >= 80 && tickAnim < 100) {
            xx = 17.68297 + (((tickAnim - 80) / 20) * (0-(17.68297)));
            yy = 11.80618 + (((tickAnim - 80) / 20) * (0-(11.80618)));
            zz = 10.03439 + (((tickAnim - 80) / 20) * (0-(10.03439)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 40 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 40) / 13) * (20-(0)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 58) {
            xx = 20 + (((tickAnim - 53) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 53) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 5) * (0-(0)));
        }
        else if (tickAnim >= 58 && tickAnim < 63) {
            xx = 0 + (((tickAnim - 58) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 58) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 58) / 5) * (0-(0)));
        }
        else if (tickAnim >= 63 && tickAnim < 68) {
            xx = 20 + (((tickAnim - 63) / 5) * (0-(20)));
            yy = 0 + (((tickAnim - 63) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 63) / 5) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 74) {
            xx = 0 + (((tickAnim - 68) / 6) * (21.07-(0)));
            yy = 0 + (((tickAnim - 68) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 6) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 79) {
            xx = 21.07 + (((tickAnim - 74) / 5) * (0-(21.07)));
            yy = 0 + (((tickAnim - 74) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 40) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 11) * (-15.5-(0)));
            zz = 0 + (((tickAnim - 40) / 11) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            yy = -15.5 + (((tickAnim - 51) / 4) * (11-(-15.5)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 55) / 25) * (0-(0)));
            yy = 11 + (((tickAnim - 55) / 25) * (11-(11)));
            zz = 0 + (((tickAnim - 55) / 25) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 80) / 10) * (-11.5-(0)));
            yy = 11 + (((tickAnim - 80) / 10) * (5.5-(11)));
            zz = 0 + (((tickAnim - 80) / 10) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 100) {
            xx = -11.5 + (((tickAnim - 90) / 10) * (0-(-11.5)));
            yy = 5.5 + (((tickAnim - 90) / 10) * (0-(5.5)));
            zz = 0 + (((tickAnim - 90) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 42 && tickAnim < 51) {
            xx = 0 + (((tickAnim - 42) / 9) * (-41-(0)));
            yy = 0 + (((tickAnim - 42) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 9) * (0-(0)));
        }
        else if (tickAnim >= 51 && tickAnim < 55) {
            xx = -41 + (((tickAnim - 51) / 4) * (0-(-41)));
            yy = 0 + (((tickAnim - 51) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 51) / 4) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 81) {
            xx = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 55) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 26) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(thumbclaw2, thumbclaw2.rotateAngleX + (float) Math.toRadians(xx), thumbclaw2.rotateAngleY + (float) Math.toRadians(yy), thumbclaw2.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animNoise2(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 2 + (((tickAnim - 8) / 10) * (3.5-(2)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 3.5 + (((tickAnim - 18) / 7) * (0-(3.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -2 + (((tickAnim - 8) / 10) * (-3.5-(-2)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3.5 + (((tickAnim - 18) / 7) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 25) {
            xx = -7 + (((tickAnim - 8) / 17) * (0-(-7)));
            yy = 0 + (((tickAnim - 8) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -0.75 + (((tickAnim - 8) / 10) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (4.31799-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-2.89559-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (7.19181-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 4.31799 + (((tickAnim - 8) / 10) * (-5.42139-(4.31799)));
            yy = -2.89559 + (((tickAnim - 8) / 10) * (-0.89095-(-2.89559)));
            zz = 7.19181 + (((tickAnim - 8) / 10) * (2.21287-(7.19181)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -5.42139 + (((tickAnim - 18) / 7) * (0-(-5.42139)));
            yy = -0.89095 + (((tickAnim - 18) / 7) * (0-(-0.89095)));
            zz = 2.21287 + (((tickAnim - 18) / 7) * (0-(2.21287)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.58241-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.89184-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (2.73362-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0.58241 + (((tickAnim - 4) / 6) * (-6.33517-(0.58241)));
            yy = -0.89184 + (((tickAnim - 4) / 6) * (-1.78368-(-0.89184)));
            zz = 2.73362 + (((tickAnim - 4) / 6) * (5.46723-(2.73362)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -6.33517 + (((tickAnim - 10) / 8) * (-10.66759-(-6.33517)));
            yy = -1.78368 + (((tickAnim - 10) / 8) * (-0.89184-(-1.78368)));
            zz = 5.46723 + (((tickAnim - 10) / 8) * (2.73362-(5.46723)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -10.66759 + (((tickAnim - 18) / 7) * (0-(-10.66759)));
            yy = -0.89184 + (((tickAnim - 18) / 7) * (0-(-0.89184)));
            zz = 2.73362 + (((tickAnim - 18) / 7) * (0-(2.73362)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 12.25 + (((tickAnim - 8) / 6) * (7.74-(12.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 19) {
            xx = 7.74 + (((tickAnim - 14) / 5) * (0-(7.74)));
            yy = 0 + (((tickAnim - 14) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 5) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 10) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.09-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw1.rotationPointX = this.jaw1.rotationPointX + (float)(xx);
        this.jaw1.rotationPointY = this.jaw1.rotationPointY - (float)(yy);
        this.jaw1.rotationPointZ = this.jaw1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -10.25 + (((tickAnim - 12) / 13) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.52111-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.52111 + (((tickAnim - 12) / 13) * (0-(-23.52111)));
            yy = 11.2497 + (((tickAnim - 12) / 13) * (0-(11.2497)));
            zz = 0.0806 + (((tickAnim - 12) / 13) * (0-(0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0.225 + (((tickAnim - 12) / 13) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arms2.rotationPointX = this.arms2.rotationPointX + (float)(xx);
        this.arms2.rotationPointY = this.arms2.rotationPointY - (float)(yy);
        this.arms2.rotationPointZ = this.arms2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 21.25 + (((tickAnim - 15) / 10) * (0-(21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 10.25 + (((tickAnim - 12) / 13) * (0-(10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(xx), upperarm3.rotateAngleY + (float) Math.toRadians(yy), upperarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-23.5211-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -23.5211 + (((tickAnim - 12) / 13) * (0-(-23.5211)));
            yy = -11.2497 + (((tickAnim - 12) / 13) * (0-(-11.2497)));
            zz = -0.0806 + (((tickAnim - 12) / 13) * (0-(-0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -0.225 + (((tickAnim - 12) / 13) * (0-(-0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arms3.rotationPointX = this.arms3.rotationPointX + (float)(xx);
        this.arms3.rotationPointY = this.arms3.rotationPointY - (float)(yy);
        this.arms3.rotationPointZ = this.arms3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -21.25 + (((tickAnim - 15) / 10) * (0-(-21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(xx), hands3.rotateAngleY + (float) Math.toRadians(yy), hands3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.5 + (((tickAnim - 8) / 10) * (1.15-(-1.5)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 1.15 + (((tickAnim - 18) / 7) * (0-(1.15)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -1.25 + (((tickAnim - 8) / 10) * (-3-(-1.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -3 + (((tickAnim - 18) / 7) * (0-(-3)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 13) / 12) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -5 + (((tickAnim - 13) / 12) * (0-(-5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 15.25 + (((tickAnim - 13) / 6) * (4.62-(15.25)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 4.62 + (((tickAnim - 19) / 6) * (0-(4.62)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 7.75 + (((tickAnim - 8) / 5) * (-0.75-(7.75)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -0.75 + (((tickAnim - 13) / 6) * (-8.1-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -8.1 + (((tickAnim - 19) / 6) * (0-(-8.1)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (15-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 15 + (((tickAnim - 8) / 7) * (12.74-(15)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 12.74 + (((tickAnim - 15) / 7) * (0-(12.74)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(xx), jaw1.rotateAngleY + (float) Math.toRadians(yy), jaw1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 2) * (0.09-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 10) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 1) * (0.09-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 0.09 + (((tickAnim - 13) / 2) * (0-(0.09)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jaw1.rotationPointX = this.jaw1.rotationPointX + (float)(xx);
        this.jaw1.rotationPointY = this.jaw1.rotationPointY - (float)(yy);
        this.jaw1.rotationPointZ = this.jaw1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = -10.25 + (((tickAnim - 12) / 13) * (0-(-10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-20.77111-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (11.24973-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (-0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -20.77111 + (((tickAnim - 12) / 13) * (0-(-20.77111)));
            yy = 11.24973 + (((tickAnim - 12) / 13) * (0-(11.24973)));
            zz = -0.0806 + (((tickAnim - 12) / 13) * (0-(-0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arms2.rotationPointX = this.arms2.rotationPointX + (float)(xx);
        this.arms2.rotationPointY = this.arms2.rotationPointY - (float)(yy);
        this.arms2.rotationPointZ = this.arms2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 21.25 + (((tickAnim - 15) / 10) * (0-(21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (10.25-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 10.25 + (((tickAnim - 12) / 13) * (0-(10.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(xx), upperarm3.rotateAngleY + (float) Math.toRadians(yy), upperarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-21.5211-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (-11.2497-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0.0806-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -21.5211 + (((tickAnim - 12) / 13) * (0-(-21.5211)));
            yy = -11.2497 + (((tickAnim - 12) / 13) * (0-(-11.2497)));
            zz = 0.0806 + (((tickAnim - 12) / 13) * (0-(0.0806)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0.225-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0.225 + (((tickAnim - 12) / 13) * (0-(0.225)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.arms3.rotationPointX = this.arms3.rotationPointX + (float)(xx);
        this.arms3.rotationPointY = this.arms3.rotationPointY - (float)(yy);
        this.arms3.rotationPointZ = this.arms3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-21.25-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -21.25 + (((tickAnim - 15) / 10) * (0-(-21.25)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(xx), hands3.rotateAngleY + (float) Math.toRadians(yy), hands3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -1.5 + (((tickAnim - 13) / 6) * (0-(-1.5)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -8.5 + (((tickAnim - 15) / 20) * (-8.5-(-8.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -8.5 + (((tickAnim - 35) / 15) * (0-(-8.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.3-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -5.3 + (((tickAnim - 15) / 20) * (-5.3-(-5.3)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -5.3 + (((tickAnim - 35) / 15) * (0-(-5.3)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.basin.rotationPointX = this.basin.rotationPointX + (float)(xx);
        this.basin.rotationPointY = this.basin.rotationPointY - (float)(yy);
        this.basin.rotationPointZ = this.basin.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.79289-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (6.9646-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.70479-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.79289 + (((tickAnim - 15) / 20) * (-4.79289-(-4.79289)));
            yy = 6.9646 + (((tickAnim - 15) / 20) * (6.9646-(6.9646)));
            zz = -0.70479 + (((tickAnim - 15) / 20) * (-0.70479-(-0.70479)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.79289 + (((tickAnim - 35) / 15) * (0-(-4.79289)));
            yy = 6.9646 + (((tickAnim - 35) / 15) * (0-(6.9646)));
            zz = -0.70479 + (((tickAnim - 35) / 15) * (0-(-0.70479)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 15) / 20) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6.75 + (((tickAnim - 35) / 15) * (0-(-6.75)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (-4.78766-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (4.39175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-0.98204-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -4.78766 + (((tickAnim - 15) / 20) * (-4.78766-(-4.78766)));
            yy = 4.39175 + (((tickAnim - 15) / 20) * (4.39175-(4.39175)));
            zz = -0.98204 + (((tickAnim - 15) / 20) * (-0.98204-(-0.98204)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -4.78766 + (((tickAnim - 35) / 15) * (0-(-4.78766)));
            yy = 4.39175 + (((tickAnim - 35) / 15) * (0-(4.39175)));
            zz = -0.98204 + (((tickAnim - 35) / 15) * (0-(-0.98204)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (26.10196-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.54127-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (4.87141-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 26.10196 + (((tickAnim - 15) / 20) * (26.10196-(26.10196)));
            yy = -1.54127 + (((tickAnim - 15) / 20) * (-1.54127-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 15) / 20) * (4.87141-(4.87141)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 26.10196 + (((tickAnim - 35) / 6) * (3.75041-(26.10196)));
            yy = -1.54127 + (((tickAnim - 35) / 6) * (-0.67354-(-1.54127)));
            zz = 4.87141 + (((tickAnim - 35) / 6) * (-0.51308-(4.87141)));
        }
        else if (tickAnim >= 41 && tickAnim < 50) {
            xx = 3.75041 + (((tickAnim - 41) / 9) * (0-(3.75041)));
            yy = -0.67354 + (((tickAnim - 41) / 9) * (0-(-0.67354)));
            zz = -0.51308 + (((tickAnim - 41) / 9) * (0-(-0.51308)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (7-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 7 + (((tickAnim - 15) / 20) * (7-(7)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 35) / 6) * (-4-(0)));
            yy = 7 + (((tickAnim - 35) / 6) * (4.27778-(7)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = -4 + (((tickAnim - 41) / 4) * (-5.93182-(-4)));
            yy = 4.27778 + (((tickAnim - 41) / 4) * (2.33333-(4.27778)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -5.93182 + (((tickAnim - 45) / 5) * (0-(-5.93182)));
            yy = 2.33333 + (((tickAnim - 45) / 5) * (0-(2.33333)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 15) / 20) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 41) {
            xx = 5.5 + (((tickAnim - 35) / 6) * (18.86-(5.5)));
            yy = 0 + (((tickAnim - 35) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 6) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 45) {
            xx = 18.86 + (((tickAnim - 41) / 4) * (-7.71-(18.86)));
            yy = 0 + (((tickAnim - 41) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 4) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -7.71 + (((tickAnim - 45) / 5) * (0-(-7.71)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-0.86204-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (21.67994-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (5.42653-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -0.86204 + (((tickAnim - 15) / 20) * (-0.86204-(-0.86204)));
            yy = 21.67994 + (((tickAnim - 15) / 20) * (21.67994-(21.67994)));
            zz = 5.42653 + (((tickAnim - 15) / 20) * (5.42653-(5.42653)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.86204 + (((tickAnim - 35) / 15) * (0-(-0.86204)));
            yy = 21.67994 + (((tickAnim - 35) / 15) * (0-(21.67994)));
            zz = 5.42653 + (((tickAnim - 35) / 15) * (0-(5.42653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2.65-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 2.65 + (((tickAnim - 8) / 7) * (1.5-(2.65)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 1.5 + (((tickAnim - 15) / 20) * (1.5-(1.5)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 1.5 + (((tickAnim - 35) / 8) * (2.65-(1.5)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 2.65 + (((tickAnim - 43) / 7) * (0-(2.65)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.38-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 38.38 + (((tickAnim - 8) / 7) * (43.25-(38.38)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 43.25 + (((tickAnim - 15) / 20) * (43.25-(43.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 43.25 + (((tickAnim - 35) / 8) * (38.38-(43.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 38.38 + (((tickAnim - 43) / 7) * (0-(38.38)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-49.75-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -49.75 + (((tickAnim - 8) / 7) * (-32.5-(-49.75)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -32.5 + (((tickAnim - 15) / 20) * (-32.5-(-32.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -32.5 + (((tickAnim - 35) / 8) * (-49.75-(-32.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -49.75 + (((tickAnim - 43) / 7) * (0-(-49.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (34.5-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 34.5 + (((tickAnim - 8) / 7) * (0-(34.5)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (34.5-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 34.5 + (((tickAnim - 43) / 7) * (0-(34.5)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (2.275-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 2.275 + (((tickAnim - 15) / 20) * (2.275-(2.275)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 2.275 + (((tickAnim - 35) / 15) * (0-(2.275)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 28.5 + (((tickAnim - 15) / 20) * (28.5-(28.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 28.5 + (((tickAnim - 35) / 15) * (0-(28.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -43.5 + (((tickAnim - 15) / 20) * (-43.5-(-43.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -43.5 + (((tickAnim - 35) / 15) * (0-(-43.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (24-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 24 + (((tickAnim - 15) / 20) * (24-(24)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 24 + (((tickAnim - 35) / 15) * (0-(24)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.5 + (((tickAnim - 15) / 20) * (6.5-(6.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.5 + (((tickAnim - 35) / 15) * (0-(6.5)));
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
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 6.75 + (((tickAnim - 15) / 20) * (6.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 6.75 + (((tickAnim - 35) / 15) * (0-(6.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.88507-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (8.41393-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-2.77338-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.88507 + (((tickAnim - 8) / 7) * (-6.63507-(-0.88507)));
            yy = 8.41393 + (((tickAnim - 8) / 7) * (8.41393-(8.41393)));
            zz = -2.77338 + (((tickAnim - 8) / 7) * (-2.77338-(-2.77338)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6.63507 + (((tickAnim - 15) / 20) * (-0.8579-(-6.63507)));
            yy = 8.41393 + (((tickAnim - 15) / 20) * (-7.62272-(8.41393)));
            zz = -2.77338 + (((tickAnim - 15) / 20) * (1.12221-(-2.77338)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -0.8579 + (((tickAnim - 35) / 15) * (0-(-0.8579)));
            yy = -7.62272 + (((tickAnim - 35) / 15) * (0-(-7.62272)));
            zz = 1.12221 + (((tickAnim - 35) / 15) * (0-(1.12221)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (2-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-5.25-(0)));
            yy = 2 + (((tickAnim - 8) / 7) * (2-(2)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.25 + (((tickAnim - 15) / 20) * (0-(-5.25)));
            yy = 2 + (((tickAnim - 15) / 20) * (-10.75-(2)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -10.75 + (((tickAnim - 35) / 15) * (0-(-10.75)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.55759-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (10.58377-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (2.91059-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.55759 + (((tickAnim - 8) / 7) * (8.80759-(0.55759)));
            yy = 10.58377 + (((tickAnim - 8) / 7) * (10.58377-(10.58377)));
            zz = 2.91059 + (((tickAnim - 8) / 7) * (2.91059-(2.91059)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.80759 + (((tickAnim - 15) / 20) * (1.37353-(8.80759)));
            yy = 10.58377 + (((tickAnim - 15) / 20) * (-13.20385-(10.58377)));
            zz = 2.91059 + (((tickAnim - 15) / 20) * (-5.6324-(2.91059)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.37353 + (((tickAnim - 35) / 15) * (0-(1.37353)));
            yy = -13.20385 + (((tickAnim - 35) / 15) * (0-(-13.20385)));
            zz = -5.6324 + (((tickAnim - 35) / 15) * (0-(-5.6324)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




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
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -32.25 + (((tickAnim - 15) / 20) * (-32.25-(-32.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -32.25 + (((tickAnim - 35) / 15) * (0-(-32.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 31.25 + (((tickAnim - 15) / 20) * (31.25-(31.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 31.25 + (((tickAnim - 35) / 15) * (0-(31.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-45-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -45 + (((tickAnim - 15) / 20) * (-45-(-45)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -45 + (((tickAnim - 35) / 15) * (0-(-45)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-19.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -19.75 + (((tickAnim - 15) / 20) * (-19.75-(-19.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -19.75 + (((tickAnim - 35) / 15) * (0-(-19.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*-2), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-130))*2), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-100))*-3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(0), Tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-230))*2), Tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*108/0.75-200))*-3));



        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (32.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 32.25 + (((tickAnim - 25) / 25) * (0-(32.25)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 0) / 38) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 38) * (1.075-(0)));
            zz = 0 + (((tickAnim - 0) / 38) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 1.075 + (((tickAnim - 38) / 12) * (0-(1.075)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12.22-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 12.22 + (((tickAnim - 15) / 10) * (23-(12.22)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 23 + (((tickAnim - 25) / 13) * (21.63-(23)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 21.63 + (((tickAnim - 38) / 12) * (0-(21.63)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 38) {
            xx = -5.25 + (((tickAnim - 15) / 23) * (-56.46-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 23) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -56.46 + (((tickAnim - 38) / 12) * (0-(-56.46)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 15) {
            xx = -9.5 + (((tickAnim - 6) / 9) * (-3-(-9.5)));
            yy = 0 + (((tickAnim - 6) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 9) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3 + (((tickAnim - 15) / 10) * (69.5-(-3)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 69.5 + (((tickAnim - 25) / 13) * (50.25-(69.5)));
            yy = 0 + (((tickAnim - 25) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 13) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 50.25 + (((tickAnim - 38) / 6) * (-1.3-(50.25)));
            yy = 0 + (((tickAnim - 38) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 6) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = -1.3 + (((tickAnim - 44) / 6) * (0-(-1.3)));
            yy = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (6.1209-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-1.37403-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-4.25547-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 6.1209 + (((tickAnim - 33) / 17) * (0-(6.1209)));
            yy = -1.37403 + (((tickAnim - 33) / 17) * (0-(-1.37403)));
            zz = -4.25547 + (((tickAnim - 33) / 17) * (0-(-4.25547)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (2.01464-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-6.40067-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-1.22778-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 2.01464 + (((tickAnim - 33) / 17) * (0-(2.01464)));
            yy = -6.40067 + (((tickAnim - 33) / 17) * (0-(-6.40067)));
            zz = -1.22778 + (((tickAnim - 33) / 17) * (0-(-1.22778)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-21.5-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -21.5 + (((tickAnim - 33) / 17) * (0-(-21.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-14.5-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 33) / 17) * (0-(14.25)));
            yy = -14.5 + (((tickAnim - 33) / 17) * (0-(-14.5)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (1.57213-(0)));
            yy = 0 + (((tickAnim - 0) / 33) * (-26.47993-(0)));
            zz = 0 + (((tickAnim - 0) / 33) * (-3.46312-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 1.57213 + (((tickAnim - 33) / 17) * (0-(1.57213)));
            yy = -26.47993 + (((tickAnim - 33) / 17) * (0-(-26.47993)));
            zz = -3.46312 + (((tickAnim - 33) / 17) * (0-(-3.46312)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animAlert(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-11-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -11 + (((tickAnim - 40) / 36) * (-11-(-11)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = -11 + (((tickAnim - 76) / 29) * (-5.721-(-11)));
            yy = 0 + (((tickAnim - 76) / 29) * (-2.72102-(0)));
            zz = 0 + (((tickAnim - 76) / 29) * (0.3983-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = -5.721 + (((tickAnim - 105) / 29) * (-5.721-(-5.721)));
            yy = -2.72102 + (((tickAnim - 105) / 29) * (-2.72102-(-2.72102)));
            zz = 0.3983 + (((tickAnim - 105) / 29) * (0.3983-(0.3983)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -5.721 + (((tickAnim - 134) / 29) * (0-(-5.721)));
            yy = -2.72102 + (((tickAnim - 134) / 29) * (0-(-2.72102)));
            zz = 0.3983 + (((tickAnim - 134) / 29) * (0-(0.3983)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(xx), basin.rotateAngleY + (float) Math.toRadians(yy), basin.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-4.21871-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (4.46861-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.53233-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -4.21871 + (((tickAnim - 23) / 9) * (-9.35411-(-4.21871)));
            yy = 4.46861 + (((tickAnim - 23) / 9) * (6.28915-(4.46861)));
            zz = -0.53233 + (((tickAnim - 23) / 9) * (-0.74921-(-0.53233)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -9.35411 + (((tickAnim - 32) / 8) * (-5.81572-(-9.35411)));
            yy = 6.28915 + (((tickAnim - 32) / 8) * (7.94419-(6.28915)));
            zz = -0.74921 + (((tickAnim - 32) / 8) * (-0.94637-(-0.74921)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -5.81572 + (((tickAnim - 40) / 36) * (-5.81572-(-5.81572)));
            yy = 7.94419 + (((tickAnim - 40) / 36) * (7.94419-(7.94419)));
            zz = -0.94637 + (((tickAnim - 40) / 36) * (-0.94637-(-0.94637)));
        }
        else if (tickAnim >= 76 && tickAnim < 108) {
            xx = -5.81572 + (((tickAnim - 76) / 32) * (-11.47668-(-5.81572)));
            yy = 7.94419 + (((tickAnim - 76) / 32) * (-6.05647-(7.94419)));
            zz = -0.94637 + (((tickAnim - 76) / 32) * (-2.31763-(-0.94637)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = -11.47668 + (((tickAnim - 108) / 26) * (-11.47668-(-11.47668)));
            yy = -6.05647 + (((tickAnim - 108) / 26) * (-6.05647-(-6.05647)));
            zz = -2.31763 + (((tickAnim - 108) / 26) * (-2.31763-(-2.31763)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -11.47668 + (((tickAnim - 134) / 29) * (0-(-11.47668)));
            yy = -6.05647 + (((tickAnim - 134) / 29) * (0-(-6.05647)));
            zz = -2.31763 + (((tickAnim - 134) / 29) * (0-(-2.31763)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-2.57-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = -2.57 + (((tickAnim - 23) / 9) * (-3.75-(-2.57)));
            yy = 0 + (((tickAnim - 23) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 9) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -3.75 + (((tickAnim - 32) / 8) * (-6-(-3.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 8) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -6 + (((tickAnim - 40) / 36) * (-6-(-6)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 108) {
            xx = -6 + (((tickAnim - 76) / 32) * (-3.36-(-6)));
            yy = 0 + (((tickAnim - 76) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 32) * (0-(0)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = -3.36 + (((tickAnim - 108) / 26) * (-3.36-(-3.36)));
            yy = 0 + (((tickAnim - 108) / 26) * (0-(0)));
            zz = 0 + (((tickAnim - 108) / 26) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -3.36 + (((tickAnim - 134) / 29) * (0-(-3.36)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0.67421-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.42181-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.4883-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 0.67421 + (((tickAnim - 23) / 9) * (-0.56962-(0.67421)));
            yy = 0.42181 + (((tickAnim - 23) / 9) * (0.59366-(0.42181)));
            zz = 1.4883 + (((tickAnim - 23) / 9) * (2.09464-(1.4883)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -0.56962 + (((tickAnim - 32) / 8) * (-7.98268-(-0.56962)));
            yy = 0.59366 + (((tickAnim - 32) / 8) * (0.74989-(0.59366)));
            zz = 2.09464 + (((tickAnim - 32) / 8) * (2.64586-(2.09464)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -7.98268 + (((tickAnim - 40) / 36) * (-7.98268-(-7.98268)));
            yy = 0.74989 + (((tickAnim - 40) / 36) * (0.74989-(0.74989)));
            zz = 2.64586 + (((tickAnim - 40) / 36) * (2.64586-(2.64586)));
        }
        else if (tickAnim >= 76 && tickAnim < 92) {
            xx = -7.98268 + (((tickAnim - 76) / 16) * (-7.00546-(-7.98268)));
            yy = 0.74989 + (((tickAnim - 76) / 16) * (-3.72912-(0.74989)));
            zz = 2.64586 + (((tickAnim - 76) / 16) * (3.34344-(2.64586)));
        }
        else if (tickAnim >= 92 && tickAnim < 108) {
            xx = -7.00546 + (((tickAnim - 92) / 16) * (-5.95397-(-7.00546)));
            yy = -3.72912 + (((tickAnim - 92) / 16) * (-5.83209-(-3.72912)));
            zz = 3.34344 + (((tickAnim - 92) / 16) * (3.24653-(3.34344)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = -5.95397 + (((tickAnim - 108) / 26) * (-5.95397-(-5.95397)));
            yy = -5.83209 + (((tickAnim - 108) / 26) * (-5.83209-(-5.83209)));
            zz = 3.24653 + (((tickAnim - 108) / 26) * (3.24653-(3.24653)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -5.95397 + (((tickAnim - 134) / 29) * (0-(-5.95397)));
            yy = -5.83209 + (((tickAnim - 134) / 29) * (0-(-5.83209)));
            zz = 3.24653 + (((tickAnim - 134) / 29) * (0-(3.24653)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.70736-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (3.35476-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (2.29934-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 7.70736 + (((tickAnim - 23) / 9) * (18.20899-(7.70736)));
            yy = 3.35476 + (((tickAnim - 23) / 9) * (4.51158-(3.35476)));
            zz = 2.29934 + (((tickAnim - 23) / 9) * (3.09221-(2.29934)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 18.20899 + (((tickAnim - 32) / 8) * (9.86045-(18.20899)));
            yy = 4.51158 + (((tickAnim - 32) / 8) * (5.55271-(4.51158)));
            zz = 3.09221 + (((tickAnim - 32) / 8) * (3.8058-(3.09221)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 9.86045 + (((tickAnim - 40) / 36) * (9.86045-(9.86045)));
            yy = 5.55271 + (((tickAnim - 40) / 36) * (5.55271-(5.55271)));
            zz = 3.8058 + (((tickAnim - 40) / 36) * (3.8058-(3.8058)));
        }
        else if (tickAnim >= 76 && tickAnim < 92) {
            xx = 9.86045 + (((tickAnim - 76) / 16) * (6.72104-(9.86045)));
            yy = 5.55271 + (((tickAnim - 76) / 16) * (4.34151-(5.55271)));
            zz = 3.8058 + (((tickAnim - 76) / 16) * (0.74685-(3.8058)));
        }
        else if (tickAnim >= 92 && tickAnim < 108) {
            xx = 6.72104 + (((tickAnim - 92) / 16) * (3.42755-(6.72104)));
            yy = 4.34151 + (((tickAnim - 92) / 16) * (-4.81674-(4.34151)));
            zz = 0.74685 + (((tickAnim - 92) / 16) * (-3.79394-(0.74685)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = 3.42755 + (((tickAnim - 108) / 26) * (3.42755-(3.42755)));
            yy = -4.81674 + (((tickAnim - 108) / 26) * (-4.81674-(-4.81674)));
            zz = -3.79394 + (((tickAnim - 108) / 26) * (-3.79394-(-3.79394)));
        }
        else if (tickAnim >= 134 && tickAnim < 152) {
            xx = 3.42755 + (((tickAnim - 134) / 18) * (-2.79028-(3.42755)));
            yy = -4.81674 + (((tickAnim - 134) / 18) * (-1.70002-(-4.81674)));
            zz = -3.79394 + (((tickAnim - 134) / 18) * (-1.33904-(-3.79394)));
        }
        else if (tickAnim >= 152 && tickAnim < 163) {
            xx = -2.79028 + (((tickAnim - 152) / 11) * (0-(-2.79028)));
            yy = -1.70002 + (((tickAnim - 152) / 11) * (0-(-1.70002)));
            zz = -1.33904 + (((tickAnim - 152) / 11) * (0-(-1.33904)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (9.56848-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (2.31746-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.42267-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 9.56848 + (((tickAnim - 23) / 9) * (23.79763-(9.56848)));
            yy = 2.31746 + (((tickAnim - 23) / 9) * (3.11659-(2.31746)));
            zz = 1.42267 + (((tickAnim - 23) / 9) * (1.91325-(1.42267)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 23.79763 + (((tickAnim - 32) / 8) * (29.07886-(23.79763)));
            yy = 3.11659 + (((tickAnim - 32) / 8) * (3.8358-(3.11659)));
            zz = 1.91325 + (((tickAnim - 32) / 8) * (2.35476-(1.91325)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 29.07886 + (((tickAnim - 40) / 3) * (35.82886-(29.07886)));
            yy = 3.8358 + (((tickAnim - 40) / 3) * (3.8358-(3.8358)));
            zz = 2.35476 + (((tickAnim - 40) / 3) * (2.35476-(2.35476)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 35.82886 + (((tickAnim - 43) / 7) * (29.07886-(35.82886)));
            yy = 3.8358 + (((tickAnim - 43) / 7) * (3.8358-(3.8358)));
            zz = 2.35476 + (((tickAnim - 43) / 7) * (2.35476-(2.35476)));
        }
        else if (tickAnim >= 50 && tickAnim < 76) {
            xx = 29.07886 + (((tickAnim - 50) / 26) * (29.07886-(29.07886)));
            yy = 3.8358 + (((tickAnim - 50) / 26) * (3.8358-(3.8358)));
            zz = 2.35476 + (((tickAnim - 50) / 26) * (2.35476-(2.35476)));
        }
        else if (tickAnim >= 76 && tickAnim < 108) {
            xx = 29.07886 + (((tickAnim - 76) / 32) * (25.60501-(29.07886)));
            yy = 3.8358 + (((tickAnim - 76) / 32) * (-1.58039-(3.8358)));
            zz = 2.35476 + (((tickAnim - 76) / 32) * (-7.43264-(2.35476)));
        }
        else if (tickAnim >= 108 && tickAnim < 134) {
            xx = 25.60501 + (((tickAnim - 108) / 26) * (25.60501-(25.60501)));
            yy = -1.58039 + (((tickAnim - 108) / 26) * (-1.58039-(-1.58039)));
            zz = -7.43264 + (((tickAnim - 108) / 26) * (-7.43264-(-7.43264)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = 25.60501 + (((tickAnim - 134) / 7) * (-2.29263-(25.60501)));
            yy = -1.58039 + (((tickAnim - 134) / 7) * (-0.66553-(-1.58039)));
            zz = -7.43264 + (((tickAnim - 134) / 7) * (2.83009-(-7.43264)));
        }
        else if (tickAnim >= 141 && tickAnim < 152) {
            xx = -2.29263 + (((tickAnim - 141) / 11) * (-12.58648-(-2.29263)));
            yy = -0.66553 + (((tickAnim - 141) / 11) * (-0.37436-(-0.66553)));
            zz = 2.83009 + (((tickAnim - 141) / 11) * (1.59192-(2.83009)));
        }
        else if (tickAnim >= 152 && tickAnim < 163) {
            xx = -12.58648 + (((tickAnim - 152) / 11) * (0-(-12.58648)));
            yy = -0.37436 + (((tickAnim - 152) / 11) * (0-(-0.37436)));
            zz = 1.59192 + (((tickAnim - 152) / 11) * (0-(1.59192)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (6.05917-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (2.25518-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.21746-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 32) {
            xx = 6.05917 + (((tickAnim - 23) / 9) * (9.84999-(6.05917)));
            yy = 2.25518 + (((tickAnim - 23) / 9) * (3.03283-(2.25518)));
            zz = 0.21746 + (((tickAnim - 23) / 9) * (0.29244-(0.21746)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 9.84999 + (((tickAnim - 32) / 8) * (0.51173-(9.84999)));
            yy = 3.03283 + (((tickAnim - 32) / 8) * (3.73271-(3.03283)));
            zz = 0.29244 + (((tickAnim - 32) / 8) * (0.35993-(0.29244)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = 0.51173 + (((tickAnim - 40) / 3) * (-9.73827-(0.51173)));
            yy = 3.73271 + (((tickAnim - 40) / 3) * (3.73271-(3.73271)));
            zz = 0.35993 + (((tickAnim - 40) / 3) * (0.35993-(0.35993)));
        }
        else if (tickAnim >= 43 && tickAnim < 47) {
            xx = -9.73827 + (((tickAnim - 43) / 4) * (12.34506-(-9.73827)));
            yy = 3.73271 + (((tickAnim - 43) / 4) * (3.73271-(3.73271)));
            zz = 0.35993 + (((tickAnim - 43) / 4) * (0.35993-(0.35993)));
        }
        else if (tickAnim >= 47 && tickAnim < 50) {
            xx = 12.34506 + (((tickAnim - 47) / 3) * (0.51173-(12.34506)));
            yy = 3.73271 + (((tickAnim - 47) / 3) * (3.73271-(3.73271)));
            zz = 0.35993 + (((tickAnim - 47) / 3) * (0.35993-(0.35993)));
        }
        else if (tickAnim >= 50 && tickAnim < 76) {
            xx = 0.51173 + (((tickAnim - 50) / 26) * (0.51173-(0.51173)));
            yy = 3.73271 + (((tickAnim - 50) / 26) * (3.73271-(3.73271)));
            zz = 0.35993 + (((tickAnim - 50) / 26) * (0.35993-(0.35993)));
        }
        else if (tickAnim >= 76 && tickAnim < 91) {
            xx = 0.51173 + (((tickAnim - 76) / 15) * (-3.1275-(0.51173)));
            yy = 3.73271 + (((tickAnim - 76) / 15) * (11.52519-(3.73271)));
            zz = 0.35993 + (((tickAnim - 76) / 15) * (-0.25286-(0.35993)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = -3.1275 + (((tickAnim - 91) / 14) * (3.58879-(-3.1275)));
            yy = 11.52519 + (((tickAnim - 91) / 14) * (-5.1296-(11.52519)));
            zz = -0.25286 + (((tickAnim - 91) / 14) * (0.55376-(-0.25286)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = 3.58879 + (((tickAnim - 105) / 29) * (3.58879-(3.58879)));
            yy = -5.1296 + (((tickAnim - 105) / 29) * (-5.1296-(-5.1296)));
            zz = 0.55376 + (((tickAnim - 105) / 29) * (0.55376-(0.55376)));
        }
        else if (tickAnim >= 134 && tickAnim < 141) {
            xx = 3.58879 + (((tickAnim - 134) / 7) * (26.69938-(3.58879)));
            yy = -5.1296 + (((tickAnim - 134) / 7) * (-9.36742-(-5.1296)));
            zz = 0.55376 + (((tickAnim - 134) / 7) * (-0.92307-(0.55376)));
        }
        else if (tickAnim >= 141 && tickAnim < 152) {
            xx = 26.69938 + (((tickAnim - 141) / 11) * (-6.99722-(26.69938)));
            yy = -9.36742 + (((tickAnim - 141) / 11) * (-5.26918-(-9.36742)));
            zz = -0.92307 + (((tickAnim - 141) / 11) * (-0.51922-(-0.92307)));
        }
        else if (tickAnim >= 152 && tickAnim < 159) {
            xx = -6.99722 + (((tickAnim - 152) / 7) * (-13.74861-(-6.99722)));
            yy = -5.26918 + (((tickAnim - 152) / 7) * (-2.63459-(-5.26918)));
            zz = -0.51922 + (((tickAnim - 152) / 7) * (-0.25961-(-0.51922)));
        }
        else if (tickAnim >= 159 && tickAnim < 163) {
            xx = -13.74861 + (((tickAnim - 159) / 4) * (0-(-13.74861)));
            yy = -2.63459 + (((tickAnim - 159) / 4) * (0-(-2.63459)));
            zz = -0.25961 + (((tickAnim - 159) / 4) * (0-(-0.25961)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-8.60382-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (14.81686-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (3.54272-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -8.60382 + (((tickAnim - 12) / 13) * (8.98593-(-8.60382)));
            yy = 14.81686 + (((tickAnim - 12) / 13) * (14.772-(14.81686)));
            zz = 3.54272 + (((tickAnim - 12) / 13) * (3.02916-(3.54272)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 8.98593 + (((tickAnim - 25) / 15) * (13.49261-(8.98593)));
            yy = 14.772 + (((tickAnim - 25) / 15) * (15.03649-(14.772)));
            zz = 3.02916 + (((tickAnim - 25) / 15) * (4.02712-(3.02916)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 13.49261 + (((tickAnim - 40) / 36) * (13.49261-(13.49261)));
            yy = 15.03649 + (((tickAnim - 40) / 36) * (15.03649-(15.03649)));
            zz = 4.02712 + (((tickAnim - 40) / 36) * (4.02712-(4.02712)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 13.49261 + (((tickAnim - 76) / 14) * (10.25-(13.49261)));
            yy = 15.03649 + (((tickAnim - 76) / 14) * (0-(15.03649)));
            zz = 4.02712 + (((tickAnim - 76) / 14) * (0-(4.02712)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 10.25 + (((tickAnim - 90) / 13) * (0-(10.25)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (1.975-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            yy = 1.975 + (((tickAnim - 12) / 13) * (0-(1.975)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 14) * (2.6-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            yy = 2.6 + (((tickAnim - 90) / 13) * (-1.85-(2.6)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            yy = -1.85 + (((tickAnim - 103) / 31) * (-1.85-(-1.85)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            yy = -1.85 + (((tickAnim - 134) / 15) * (1.555-(-1.85)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            yy = 1.555 + (((tickAnim - 149) / 14) * (0-(1.555)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (46.75-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 46.75 + (((tickAnim - 12) / 13) * (0-(46.75)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (17-(0)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 17 + (((tickAnim - 90) / 13) * (13.36-(17)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 13.36 + (((tickAnim - 103) / 31) * (13.36-(13.36)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = 13.36 + (((tickAnim - 134) / 15) * (24.37-(13.36)));
            yy = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 24.37 + (((tickAnim - 149) / 14) * (0-(24.37)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.lowerleg3.rotationPointX = this.lowerleg3.rotationPointX + (float)(0);
        this.lowerleg3.rotationPointY = this.lowerleg3.rotationPointY - (float)(0);
        this.lowerleg3.rotationPointZ = this.lowerleg3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (-40.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = -40.25 + (((tickAnim - 12) / 13) * (0-(-40.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (-54.25-(0)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = -54.25 + (((tickAnim - 90) / 13) * (-28.25-(-54.25)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = -28.25 + (((tickAnim - 103) / 31) * (-28.25-(-28.25)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = -28.25 + (((tickAnim - 134) / 15) * (-38.17-(-28.25)));
            yy = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = -38.17 + (((tickAnim - 149) / 14) * (0-(-38.17)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 0) / 12) * (31.25-(0)));
            yy = 0 + (((tickAnim - 0) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 12) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 25) {
            xx = 31.25 + (((tickAnim - 12) / 13) * (0-(31.25)));
            yy = 0 + (((tickAnim - 12) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 13) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 90) {
            xx = 0 + (((tickAnim - 76) / 14) * (56.25-(0)));
            yy = 0 + (((tickAnim - 76) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 14) * (0-(0)));
        }
        else if (tickAnim >= 90 && tickAnim < 103) {
            xx = 56.25 + (((tickAnim - 90) / 13) * (20.73-(56.25)));
            yy = 0 + (((tickAnim - 90) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 90) / 13) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 134) {
            xx = 20.73 + (((tickAnim - 103) / 31) * (20.73-(20.73)));
            yy = 0 + (((tickAnim - 103) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 31) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 149) {
            xx = 20.73 + (((tickAnim - 134) / 15) * (31.6-(20.73)));
            yy = 0 + (((tickAnim - 134) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 15) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 163) {
            xx = 31.6 + (((tickAnim - 149) / 14) * (0-(31.6)));
            yy = 0 + (((tickAnim - 149) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 40) {
            xx = 6.5 + (((tickAnim - 24) / 16) * (11.542-(6.5)));
            yy = 0 + (((tickAnim - 24) / 16) * (-10.2407-(0)));
            zz = 0 + (((tickAnim - 24) / 16) * (-1.75775-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 11.542 + (((tickAnim - 40) / 36) * (11.542-(11.542)));
            yy = -10.2407 + (((tickAnim - 40) / 36) * (-10.2407-(-10.2407)));
            zz = -1.75775 + (((tickAnim - 40) / 36) * (-1.75775-(-1.75775)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 11.542 + (((tickAnim - 76) / 27) * (5.35553-(11.542)));
            yy = -10.2407 + (((tickAnim - 76) / 27) * (-7.38415-(-10.2407)));
            zz = -1.75775 + (((tickAnim - 76) / 27) * (-0.7973-(-1.75775)));
        }
        else if (tickAnim >= 103 && tickAnim < 124) {
            xx = 5.35553 + (((tickAnim - 103) / 21) * (2.75-(5.35553)));
            yy = -7.38415 + (((tickAnim - 103) / 21) * (0-(-7.38415)));
            zz = -0.7973 + (((tickAnim - 103) / 21) * (0-(-0.7973)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 2.75 + (((tickAnim - 124) / 10) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 2.75 + (((tickAnim - 134) / 29) * (0-(2.75)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (2.625-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 2.625 + (((tickAnim - 33) / 7) * (0-(2.625)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (2.2-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            yy = 2.2 + (((tickAnim - 113) / 11) * (0-(2.2)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (12-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 12 + (((tickAnim - 33) / 7) * (0-(12)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (13.5-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 13.5 + (((tickAnim - 113) / 11) * (3-(13.5)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 3 + (((tickAnim - 124) / 10) * (3-(3)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 3 + (((tickAnim - 134) / 29) * (0-(3)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (-28.25-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -28.25 + (((tickAnim - 33) / 7) * (0-(-28.25)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = -34.25 + (((tickAnim - 113) / 11) * (0-(-34.25)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 24) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 24) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 24) / 9) * (39-(0)));
            yy = 0 + (((tickAnim - 24) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 9) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 39 + (((tickAnim - 33) / 7) * (0-(39)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 103) {
            xx = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 27) * (0-(0)));
        }
        else if (tickAnim >= 103 && tickAnim < 113) {
            xx = 0 + (((tickAnim - 103) / 10) * (31.5-(0)));
            yy = 0 + (((tickAnim - 103) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 103) / 10) * (0-(0)));
        }
        else if (tickAnim >= 113 && tickAnim < 124) {
            xx = 31.5 + (((tickAnim - 113) / 11) * (0-(31.5)));
            yy = 0 + (((tickAnim - 113) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 113) / 11) * (0-(0)));
        }
        else if (tickAnim >= 124 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 124) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 124) / 10) * (0-(0)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 134) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 134) / 29) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.80572-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (8.21368-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.77598-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 2.80572 + (((tickAnim - 40) / 36) * (2.80572-(2.80572)));
            yy = 8.21368 + (((tickAnim - 40) / 36) * (8.21368-(8.21368)));
            zz = 0.77598 + (((tickAnim - 40) / 36) * (0.77598-(0.77598)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = 2.80572 + (((tickAnim - 76) / 29) * (1.44946-(2.80572)));
            yy = 8.21368 + (((tickAnim - 76) / 29) * (2.51919-(8.21368)));
            zz = 0.77598 + (((tickAnim - 76) / 29) * (0.2787-(0.77598)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = 1.44946 + (((tickAnim - 105) / 29) * (1.44946-(1.44946)));
            yy = 2.51919 + (((tickAnim - 105) / 29) * (2.51919-(2.51919)));
            zz = 0.2787 + (((tickAnim - 105) / 29) * (0.2787-(0.2787)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 1.44946 + (((tickAnim - 134) / 29) * (0-(1.44946)));
            yy = 2.51919 + (((tickAnim - 134) / 29) * (0-(2.51919)));
            zz = 0.2787 + (((tickAnim - 134) / 29) * (0-(0.2787)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 2.75 + (((tickAnim - 40) / 36) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = 2.75 + (((tickAnim - 76) / 29) * (-2.76599-(2.75)));
            yy = 0 + (((tickAnim - 76) / 29) * (-16.59933-(0)));
            zz = 0 + (((tickAnim - 76) / 29) * (-1.89411-(0)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = -2.76599 + (((tickAnim - 105) / 29) * (-2.76599-(-2.76599)));
            yy = -16.59933 + (((tickAnim - 105) / 29) * (-16.59933-(-16.59933)));
            zz = -1.89411 + (((tickAnim - 105) / 29) * (-1.89411-(-1.89411)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -2.76599 + (((tickAnim - 134) / 29) * (0-(-2.76599)));
            yy = -16.59933 + (((tickAnim - 134) / 29) * (0-(-16.59933)));
            zz = -1.89411 + (((tickAnim - 134) / 29) * (0-(-1.89411)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.12186-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (7.79901-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (1.21247-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -0.12186 + (((tickAnim - 40) / 36) * (13.62814-(-0.12186)));
            yy = 7.79901 + (((tickAnim - 40) / 36) * (7.79901-(7.79901)));
            zz = 1.21247 + (((tickAnim - 40) / 36) * (1.21247-(1.21247)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = 13.62814 + (((tickAnim - 76) / 29) * (2.37136-(13.62814)));
            yy = 7.79901 + (((tickAnim - 76) / 29) * (-3.52808-(7.79901)));
            zz = 1.21247 + (((tickAnim - 76) / 29) * (-5.87371-(1.21247)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = 2.37136 + (((tickAnim - 105) / 29) * (-3.12864-(2.37136)));
            yy = -3.52808 + (((tickAnim - 105) / 29) * (-3.52808-(-3.52808)));
            zz = -5.87371 + (((tickAnim - 105) / 29) * (-5.87371-(-5.87371)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = -3.12864 + (((tickAnim - 134) / 29) * (0-(-3.12864)));
            yy = -3.52808 + (((tickAnim - 134) / 29) * (0-(-3.52808)));
            zz = -5.87371 + (((tickAnim - 134) / 29) * (0-(-5.87371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-12.92968-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (7.95423-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (3.53311-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -12.92968 + (((tickAnim - 40) / 36) * (-5.17968-(-12.92968)));
            yy = 7.95423 + (((tickAnim - 40) / 36) * (7.95423-(7.95423)));
            zz = 3.53311 + (((tickAnim - 40) / 36) * (3.53311-(3.53311)));
        }
        else if (tickAnim >= 76 && tickAnim < 105) {
            xx = -5.17968 + (((tickAnim - 76) / 29) * (-9.46088-(-5.17968)));
            yy = 7.95423 + (((tickAnim - 76) / 29) * (-16.28172-(7.95423)));
            zz = 3.53311 + (((tickAnim - 76) / 29) * (-2.50807-(3.53311)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = -9.46088 + (((tickAnim - 105) / 29) * (-14.71088-(-9.46088)));
            yy = -16.28172 + (((tickAnim - 105) / 29) * (-16.28172-(-16.28172)));
            zz = -2.50807 + (((tickAnim - 105) / 29) * (-2.50807-(-2.50807)));
        }
        else if (tickAnim >= 134 && tickAnim < 146) {
            xx = -14.71088 + (((tickAnim - 134) / 12) * (-2.96122-(-14.71088)));
            yy = -16.28172 + (((tickAnim - 134) / 12) * (-7.98124-(-16.28172)));
            zz = -2.50807 + (((tickAnim - 134) / 12) * (-1.22944-(-2.50807)));
        }
        else if (tickAnim >= 146 && tickAnim < 163) {
            xx = -2.96122 + (((tickAnim - 146) / 17) * (0-(-2.96122)));
            yy = -7.98124 + (((tickAnim - 146) / 17) * (0-(-7.98124)));
            zz = -1.22944 + (((tickAnim - 146) / 17) * (0-(-1.22944)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (18.31555-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (2.42357-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.54843-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 18.31555 + (((tickAnim - 20) / 20) * (15.13111-(18.31555)));
            yy = 2.42357 + (((tickAnim - 20) / 20) * (4.84714-(2.42357)));
            zz = 1.54843 + (((tickAnim - 20) / 20) * (3.09687-(1.54843)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 15.13111 + (((tickAnim - 40) / 36) * (-1.36889-(15.13111)));
            yy = 4.84714 + (((tickAnim - 40) / 36) * (4.84714-(4.84714)));
            zz = 3.09687 + (((tickAnim - 40) / 36) * (3.09687-(3.09687)));
        }
        else if (tickAnim >= 76 && tickAnim < 91) {
            xx = -1.36889 + (((tickAnim - 76) / 15) * (5.1588-(-1.36889)));
            yy = 4.84714 + (((tickAnim - 76) / 15) * (-5.73172-(4.84714)));
            zz = 3.09687 + (((tickAnim - 76) / 15) * (2.99538-(3.09687)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = 5.1588 + (((tickAnim - 91) / 14) * (17.26572-(5.1588)));
            yy = -5.73172 + (((tickAnim - 91) / 14) * (-2.76013-(-5.73172)));
            zz = 2.99538 + (((tickAnim - 91) / 14) * (5.09038-(2.99538)));
        }
        else if (tickAnim >= 105 && tickAnim < 134) {
            xx = 17.26572 + (((tickAnim - 105) / 29) * (29.76572-(17.26572)));
            yy = -2.76013 + (((tickAnim - 105) / 29) * (-2.76013-(-2.76013)));
            zz = 5.09038 + (((tickAnim - 105) / 29) * (5.09038-(5.09038)));
        }
        else if (tickAnim >= 134 && tickAnim < 163) {
            xx = 29.76572 + (((tickAnim - 134) / 29) * (0-(29.76572)));
            yy = -2.76013 + (((tickAnim - 134) / 29) * (0-(-2.76013)));
            zz = 5.09038 + (((tickAnim - 134) / 29) * (0-(5.09038)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (-0.43887-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (9.07896-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-2.99822-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = -0.43887 + (((tickAnim - 40) / 36) * (-0.43887-(-0.43887)));
            yy = 9.07896 + (((tickAnim - 40) / 36) * (9.07896-(9.07896)));
            zz = -2.99822 + (((tickAnim - 40) / 36) * (-2.99822-(-2.99822)));
        }
        else if (tickAnim >= 76 && tickAnim < 91) {
            xx = -0.43887 + (((tickAnim - 76) / 15) * (-0.27102-(-0.43887)));
            yy = 9.07896 + (((tickAnim - 76) / 15) * (-8.52783-(9.07896)));
            zz = -2.99822 + (((tickAnim - 76) / 15) * (-9.39813-(-2.99822)));
        }
        else if (tickAnim >= 91 && tickAnim < 105) {
            xx = -0.27102 + (((tickAnim - 91) / 14) * (0-(-0.27102)));
            yy = -8.52783 + (((tickAnim - 91) / 14) * (0-(-8.52783)));
            zz = -9.39813 + (((tickAnim - 91) / 14) * (0-(-9.39813)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 105) / 20) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 125) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 9) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(xx), head1.rotateAngleY + (float) Math.toRadians(yy), head1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (9-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = 9 + (((tickAnim - 40) / 36) * (9-(9)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            zz = 9 + (((tickAnim - 76) / 58) * (0-(9)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(xx), upperarm2.rotateAngleY + (float) Math.toRadians(yy), upperarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (11-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 11 + (((tickAnim - 40) / 36) * (11-(11)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 11 + (((tickAnim - 76) / 58) * (0-(11)));
            zz = 0 + (((tickAnim - 76) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(xx), arms2.rotateAngleY + (float) Math.toRadians(yy), arms2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (20.5-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 20.5 + (((tickAnim - 40) / 36) * (20.5-(20.5)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 20.5 + (((tickAnim - 76) / 58) * (0-(20.5)));
            zz = 0 + (((tickAnim - 76) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(xx), hands2.rotateAngleY + (float) Math.toRadians(yy), hands2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (-9.5-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            zz = -9.5 + (((tickAnim - 40) / 36) * (-9.5-(-9.5)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            zz = -9.5 + (((tickAnim - 76) / 58) * (0-(-9.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(xx), upperarm3.rotateAngleY + (float) Math.toRadians(yy), upperarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 0) / 134) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 134) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 134) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(xx), arms3.rotateAngleY + (float) Math.toRadians(yy), arms3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (-25.75-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 40) / 36) * (0-(0)));
            yy = -25.75 + (((tickAnim - 40) / 36) * (-25.75-(-25.75)));
            zz = 0 + (((tickAnim - 40) / 36) * (0-(0)));
        }
        else if (tickAnim >= 76 && tickAnim < 134) {
            xx = 0 + (((tickAnim - 76) / 58) * (0-(0)));
            yy = -25.75 + (((tickAnim - 76) / 58) * (0-(-25.75)));
            zz = 0 + (((tickAnim - 76) / 58) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(xx), hands3.rotateAngleY + (float) Math.toRadians(yy), hands3.rotateAngleZ + (float) Math.toRadians(zz));
    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = 37.5 + (((tickAnim - 22) / 6) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 24.59 + (((tickAnim - 28) / 8) * (7.29-(24.59)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 7.29 + (((tickAnim - 36) / 4) * (0-(7.29)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0.575-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            yy = 0.575 + (((tickAnim - 28) / 8) * (2.02-(0.575)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 2.02 + (((tickAnim - 36) / 4) * (0-(2.02)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -17.5 + (((tickAnim - 0) / 10) * (-4.03-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -4.03 + (((tickAnim - 10) / 12) * (-20.25-(-4.03)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 28) {
            xx = -20.25 + (((tickAnim - 22) / 6) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 23.3 + (((tickAnim - 28) / 12) * (-17.5-(23.3)));
            yy = 0 + (((tickAnim - 28) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 22) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 6) * (0.55-(0)));
            zz = 0 + (((tickAnim - 22) / 6) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 28) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 28) / 5) * (0.8-(0.55)));
            zz = 0 + (((tickAnim - 28) / 5) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            yy = 0.8 + (((tickAnim - 33) / 7) * (0-(0.8)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerleg3.rotationPointX = this.lowerleg3.rotationPointX + (float)(xx);
        this.lowerleg3.rotationPointY = this.lowerleg3.rotationPointY - (float)(yy);
        this.lowerleg3.rotationPointZ = this.lowerleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -5.25 + (((tickAnim - 0) / 10) * (-25.24-(-5.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = -25.24 + (((tickAnim - 10) / 12) * (6.5-(-25.24)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 6.5 + (((tickAnim - 22) / 5) * (9.16-(6.5)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 9.16 + (((tickAnim - 27) / 8) * (-24.53-(9.16)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -24.53 + (((tickAnim - 35) / 5) * (-5.25-(-24.53)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 22) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 27) / 3) * (0.55-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0.55 + (((tickAnim - 30) / 10) * (0-(0.55)));
            zz = 0.225 + (((tickAnim - 30) / 10) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feet3.rotationPointX = this.feet3.rotationPointX + (float)(xx);
        this.feet3.rotationPointY = this.feet3.rotationPointY - (float)(yy);
        this.feet3.rotationPointZ = this.feet3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 23 + (((tickAnim - 0) / 10) * (12.01-(23)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 12.01 + (((tickAnim - 10) / 12) * (-23.75-(12.01)));
            yy = 0 + (((tickAnim - 10) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 12) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = -23.75 + (((tickAnim - 22) / 2) * (-1.28-(-23.75)));
            yy = 0 + (((tickAnim - 22) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 2) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = -1.28 + (((tickAnim - 24) / 4) * (40.94-(-1.28)));
            yy = 0 + (((tickAnim - 24) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 4) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 36) {
            xx = 40.94 + (((tickAnim - 28) / 8) * (13.54-(40.94)));
            yy = 0 + (((tickAnim - 28) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 8) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 38) {
            xx = 13.54 + (((tickAnim - 36) / 2) * (7.07-(13.54)));
            yy = 0 + (((tickAnim - 36) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 2) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 7.07 + (((tickAnim - 38) / 2) * (23-(7.07)));
            yy = 0 + (((tickAnim - 38) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0.3 + (((tickAnim - 5) / 5) * (0-(0.3)));
            zz = -0.3 + (((tickAnim - 5) / 5) * (0-(-0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 6) * (0.4-(0)));
            zz = 0 + (((tickAnim - 10) / 6) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            yy = 0.4 + (((tickAnim - 16) / 6) * (0-(0.4)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes3.rotationPointX = this.toes3.rotationPointX + (float)(xx);
        this.toes3.rotationPointY = this.toes3.rotationPointY - (float)(yy);
        this.toes3.rotationPointZ = this.toes3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 37.5 + (((tickAnim - 0) / 8) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 24.59 + (((tickAnim - 8) / 9) * (7.29-(24.59)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 7.29 + (((tickAnim - 17) / 5) * (-1.5-(7.29)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = -1.5 + (((tickAnim - 22) / 18) * (37.5-(-1.5)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.575-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 0.575 + (((tickAnim - 8) / 9) * (2.02-(0.575)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 2.02 + (((tickAnim - 17) / 5) * (0-(2.02)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = -20.25 + (((tickAnim - 0) / 9) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 22) {
            xx = 23.3 + (((tickAnim - 9) / 13) * (-17.5-(23.3)));
            yy = 0 + (((tickAnim - 9) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 13) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -17.5 + (((tickAnim - 22) / 3) * (-6.19-(-17.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -6.19 + (((tickAnim - 25) / 8) * (-4.59-(-6.19)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -4.59 + (((tickAnim - 33) / 7) * (-20.25-(-4.59)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0.55 + (((tickAnim - 9) / 5) * (0.8-(0.55)));
            zz = 0 + (((tickAnim - 9) / 5) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 14) / 8) * (0-(0)));
            yy = 0.8 + (((tickAnim - 14) / 8) * (0-(0.8)));
            zz = 0 + (((tickAnim - 14) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerleg2.rotationPointX = this.lowerleg2.rotationPointX + (float)(xx);
        this.lowerleg2.rotationPointY = this.lowerleg2.rotationPointY - (float)(yy);
        this.lowerleg2.rotationPointZ = this.lowerleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 6.5 + (((tickAnim - 0) / 9) * (9.16-(6.5)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 18) {
            xx = 9.16 + (((tickAnim - 9) / 9) * (-24.53-(9.16)));
            yy = 0 + (((tickAnim - 9) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 9) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -24.53 + (((tickAnim - 18) / 4) * (-1.5-(-24.53)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -1.5 + (((tickAnim - 22) / 3) * (-23.06-(-1.5)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = -23.06 + (((tickAnim - 25) / 8) * (-16.91-(-23.06)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -16.91 + (((tickAnim - 33) / 7) * (6.5-(-16.91)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 13) / 9) * (0-(0)));
            yy = 0.55 + (((tickAnim - 13) / 9) * (0-(0.55)));
            zz = 0.225 + (((tickAnim - 13) / 9) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feet2.rotationPointX = this.feet2.rotationPointX + (float)(xx);
        this.feet2.rotationPointY = this.feet2.rotationPointY - (float)(yy);
        this.feet2.rotationPointZ = this.feet2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -23.75 + (((tickAnim - 0) / 4) * (-1.28-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 9) {
            xx = -1.28 + (((tickAnim - 4) / 5) * (40.94-(-1.28)));
            yy = 0 + (((tickAnim - 4) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 5) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 17) {
            xx = 40.94 + (((tickAnim - 9) / 8) * (13.54-(40.94)));
            yy = 0 + (((tickAnim - 9) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 8) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 13.54 + (((tickAnim - 17) / 2) * (7.07-(13.54)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 7.07 + (((tickAnim - 19) / 3) * (20.25-(7.07)));
            yy = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 3) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 20.25 + (((tickAnim - 22) / 3) * (24.31-(20.25)));
            yy = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 24.31 + (((tickAnim - 25) / 8) * (-1.34-(24.31)));
            yy = 0 + (((tickAnim - 25) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -1.34 + (((tickAnim - 33) / 7) * (-23.75-(-1.34)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 22) / 3) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 22) / 3) * (0.05-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = -0.275 + (((tickAnim - 25) / 4) * (0.2-(-0.275)));
            zz = 0.05 + (((tickAnim - 25) / 4) * (-0.225-(0.05)));
        }
        else if (tickAnim >= 29 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 29) / 4) * (0-(0)));
            yy = 0.2 + (((tickAnim - 29) / 4) * (0-(0.2)));
            zz = -0.225 + (((tickAnim - 29) / 4) * (0-(-0.225)));
        }
        else if (tickAnim >= 33 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 33) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 3) * (0.125-(0)));
            zz = 0 + (((tickAnim - 33) / 3) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0.125 + (((tickAnim - 36) / 4) * (0-(0.125)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes2.rotationPointX = this.toes2.rotationPointX + (float)(xx);
        this.toes2.rotationPointY = this.toes2.rotationPointY - (float)(yy);
        this.toes2.rotationPointZ = this.toes2.rotationPointZ + (float)(zz);



        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-0.35), basin.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), basin.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+80))*0.48), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+120))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.3), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*1.2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*0.45), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*0.35), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.2), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*0.25), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-50))*1.5), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*0.85), head1.rotateAngleY + (float) Math.toRadians(0), head1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), upperarm2.rotateAngleY + (float) Math.toRadians(0), upperarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*3.5), arms2.rotateAngleY + (float) Math.toRadians(0), arms2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), hands2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.5), hands2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*-3), upperarm3.rotateAngleY + (float) Math.toRadians(0), upperarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*3.5), arms3.rotateAngleY + (float) Math.toRadians(0), arms3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2), hands3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*-0.5), hands3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.2), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.4), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1.4), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.6), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-1.6), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*1.8), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.2));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*-2.5), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*2), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-150))*1.2));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(0), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPlateosaurus entity = (EntityPrehistoricFloraPlateosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (37.5-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 37.5 + (((tickAnim - 9) / 4) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 24.59 + (((tickAnim - 13) / 3) * (-0.21-(24.59)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -0.21 + (((tickAnim - 16) / 4) * (0-(-0.21)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg3, upperleg3.rotateAngleX + (float) Math.toRadians(xx), upperleg3.rotateAngleY + (float) Math.toRadians(yy), upperleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.75-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.75 + (((tickAnim - 13) / 3) * (2.645-(0.75)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            yy = 2.645 + (((tickAnim - 16) / 4) * (0-(2.645)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperleg3.rotationPointX = this.upperleg3.rotationPointX + (float)(xx);
        this.upperleg3.rotationPointY = this.upperleg3.rotationPointY - (float)(yy);
        this.upperleg3.rotationPointZ = this.upperleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -17.5 + (((tickAnim - 0) / 5) * (-11.28-(-17.5)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -11.28 + (((tickAnim - 5) / 4) * (-20.25-(-11.28)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -20.25 + (((tickAnim - 9) / 4) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 23.3 + (((tickAnim - 13) / 3) * (19.24-(23.3)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = 19.24 + (((tickAnim - 16) / 4) * (-17.5-(19.24)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg3, lowerleg3.rotateAngleX + (float) Math.toRadians(xx), lowerleg3.rotateAngleY + (float) Math.toRadians(yy), lowerleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 0.55 + (((tickAnim - 13) / 3) * (0.8-(0.55)));
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
        this.lowerleg3.rotationPointX = this.lowerleg3.rotationPointX + (float)(xx);
        this.lowerleg3.rotationPointY = this.lowerleg3.rotationPointY - (float)(yy);
        this.lowerleg3.rotationPointZ = this.lowerleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -5.25 + (((tickAnim - 0) / 5) * (-25.24-(-5.25)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = -25.24 + (((tickAnim - 5) / 4) * (6.5-(-25.24)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 6.5 + (((tickAnim - 9) / 4) * (9.16-(6.5)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 9.16 + (((tickAnim - 13) / 4) * (-24.53-(9.16)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -24.53 + (((tickAnim - 17) / 3) * (-5.25-(-24.53)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet3, feet3.rotateAngleX + (float) Math.toRadians(xx), feet3.rotateAngleY + (float) Math.toRadians(yy), feet3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 4) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 1) * (0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0.225-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.55 + (((tickAnim - 14) / 6) * (0-(0.55)));
            zz = 0.225 + (((tickAnim - 14) / 6) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feet3.rotationPointX = this.feet3.rotationPointX + (float)(xx);
        this.feet3.rotationPointY = this.feet3.rotationPointY - (float)(yy);
        this.feet3.rotationPointZ = this.feet3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 23 + (((tickAnim - 0) / 3) * (17.26-(23)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 17.26 + (((tickAnim - 3) / 2) * (15.26-(17.26)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 15.26 + (((tickAnim - 5) / 4) * (-22.75-(15.26)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 4) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -22.75 + (((tickAnim - 9) / 2) * (-1.28-(-22.75)));
            yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 2) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -1.28 + (((tickAnim - 11) / 2) * (40.94-(-1.28)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 40.94 + (((tickAnim - 13) / 4) * (13.54-(40.94)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 13.54 + (((tickAnim - 17) / 1) * (7.07-(13.54)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 7.07 + (((tickAnim - 18) / 2) * (23-(7.07)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes3, toes3.rotateAngleX + (float) Math.toRadians(xx), toes3.rotateAngleY + (float) Math.toRadians(yy), toes3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.3-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0.3 + (((tickAnim - 3) / 2) * (0-(0.3)));
            zz = -0.3 + (((tickAnim - 3) / 2) * (0-(-0.3)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 3) * (0.4-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0.4 + (((tickAnim - 8) / 1) * (0-(0.4)));
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
        this.toes3.rotationPointX = this.toes3.rotationPointX + (float)(xx);
        this.toes3.rotationPointY = this.toes3.rotationPointY - (float)(yy);
        this.toes3.rotationPointZ = this.toes3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 37.5 + (((tickAnim - 0) / 3) * (24.59-(37.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 24.59 + (((tickAnim - 3) / 4) * (7.29-(24.59)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 7.29 + (((tickAnim - 7) / 3) * (-1.5-(7.29)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -1.5 + (((tickAnim - 10) / 10) * (37.5-(-1.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperleg2, upperleg2.rotateAngleX + (float) Math.toRadians(xx), upperleg2.rotateAngleY + (float) Math.toRadians(yy), upperleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0.975-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0.975 + (((tickAnim - 3) / 4) * (2.495-(0.975)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = 2.495 + (((tickAnim - 7) / 3) * (0-(2.495)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
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
        this.upperleg2.rotationPointX = this.upperleg2.rotationPointX + (float)(xx);
        this.upperleg2.rotationPointY = this.upperleg2.rotationPointY - (float)(yy);
        this.upperleg2.rotationPointZ = this.upperleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -20.25 + (((tickAnim - 0) / 4) * (23.3-(-20.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 23.3 + (((tickAnim - 4) / 6) * (-17.5-(23.3)));
            yy = 0 + (((tickAnim - 4) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 6) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -17.5 + (((tickAnim - 10) / 3) * (-6.19-(-17.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -6.19 + (((tickAnim - 13) / 3) * (-4.59-(-6.19)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -4.59 + (((tickAnim - 16) / 4) * (-20.25-(-4.59)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lowerleg2, lowerleg2.rotateAngleX + (float) Math.toRadians(xx), lowerleg2.rotateAngleY + (float) Math.toRadians(yy), lowerleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0.55 + (((tickAnim - 4) / 2) * (0.8-(0.55)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.8 + (((tickAnim - 6) / 4) * (0-(0.8)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lowerleg2.rotationPointX = this.lowerleg2.rotationPointX + (float)(xx);
        this.lowerleg2.rotationPointY = this.lowerleg2.rotationPointY - (float)(yy);
        this.lowerleg2.rotationPointZ = this.lowerleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 6.5 + (((tickAnim - 0) / 4) * (9.16-(6.5)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 9.16 + (((tickAnim - 4) / 4) * (-24.53-(9.16)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -24.53 + (((tickAnim - 8) / 2) * (-1.5-(-24.53)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -1.5 + (((tickAnim - 10) / 3) * (-23.06-(-1.5)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -23.06 + (((tickAnim - 13) / 3) * (-16.91-(-23.06)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -16.91 + (((tickAnim - 16) / 4) * (6.5-(-16.91)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(feet2, feet2.rotateAngleX + (float) Math.toRadians(xx), feet2.rotateAngleY + (float) Math.toRadians(yy), feet2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 2) * (0.55-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.55 + (((tickAnim - 6) / 4) * (0-(0.55)));
            zz = 0.225 + (((tickAnim - 6) / 4) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.feet2.rotationPointX = this.feet2.rotationPointX + (float)(xx);
        this.feet2.rotationPointY = this.feet2.rotationPointY - (float)(yy);
        this.feet2.rotationPointZ = this.feet2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -23.75 + (((tickAnim - 0) / 2) * (-1.28-(-23.75)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -1.28 + (((tickAnim - 2) / 2) * (40.94-(-1.28)));
            yy = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 2) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = 40.94 + (((tickAnim - 4) / 3) * (13.54-(40.94)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13.54 + (((tickAnim - 7) / 1) * (7.07-(13.54)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 7.07 + (((tickAnim - 8) / 2) * (20.25-(7.07)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 20.25 + (((tickAnim - 10) / 3) * (20.06-(20.25)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 20.06 + (((tickAnim - 13) / 3) * (-1.34-(20.06)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 20) {
            xx = -1.34 + (((tickAnim - 16) / 4) * (-23.75-(-1.34)));
            yy = 0 + (((tickAnim - 16) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(toes2, toes2.rotateAngleX + (float) Math.toRadians(xx), toes2.rotateAngleY + (float) Math.toRadians(yy), toes2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0.05-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = -0.275 + (((tickAnim - 13) / 2) * (0.2-(-0.275)));
            zz = 0.05 + (((tickAnim - 13) / 2) * (-0.225-(0.05)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            yy = 0.2 + (((tickAnim - 15) / 1) * (0-(0.2)));
            zz = -0.225 + (((tickAnim - 15) / 1) * (0-(-0.225)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 2) * (0.125-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0.125 + (((tickAnim - 18) / 2) * (0-(0.125)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.toes2.rotationPointX = this.toes2.rotationPointX + (float)(xx);
        this.toes2.rotationPointY = this.toes2.rotationPointY - (float)(yy);
        this.toes2.rotationPointZ = this.toes2.rotationPointZ + (float)(zz);



        this.setRotateAngle(basin, basin.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-180))*-2.2), basin.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*2.5), basin.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1.85));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+100))*2), body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1.8), body.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*3.5), chest.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+100))*2), chest.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*1.2));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+180))*0.85), neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-170))*1.5), neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*1.2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+560))*0.85), neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1.5), neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+180))*1.8));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+560))*1.85), neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+50))*1.8), neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-180))*1.2));


        this.setRotateAngle(head1, head1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+560))*0.85), head1.rotateAngleY + (float) Math.toRadians(0), head1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+150))*1.5));


        this.setRotateAngle(upperarm2, upperarm2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), upperarm2.rotateAngleY + (float) Math.toRadians(0), upperarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arms2, arms2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*5.8), arms2.rotateAngleY + (float) Math.toRadians(0), arms2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hands2, hands2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), hands2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-2.5), hands2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(upperarm3, upperarm3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), upperarm3.rotateAngleY + (float) Math.toRadians(0), upperarm3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(arms3, arms3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+150))*5.8), arms3.rotateAngleY + (float) Math.toRadians(0), arms3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(hands3, hands3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-150))*-5), hands3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*-2.5), hands3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0), tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.2), tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5), tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-2.5), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.7), tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-2.5), tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.9), tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+250))*1.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-250))*-2.4), tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*2), tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.5));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-260))*-2.8), Tail6.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*2.5), Tail6.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-250))*1.5));


        this.setRotateAngle(jaw1, jaw1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+50))*2.5), jaw1.rotateAngleY + (float) Math.toRadians(0), jaw1.rotateAngleZ + (float) Math.toRadians(0));

    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPlateosaurus e = (EntityPrehistoricFloraPlateosaurus) entity;
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
